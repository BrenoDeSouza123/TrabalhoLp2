package DAO;

import Conexao.Conexao;
import com.mycompany.trabalholp2.Classes.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trabalholp2.Classes.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por implementar as operações de acesso ao banco de dados (DAO)
 * para a entidade {@link Produto}.
 * 
 * <p>Realiza as funções de cadastrar, alterar, excluir e listar produtos.</p>
 * 
 * <p>Utiliza a classe {@link Conexao} para gerenciamento da conexão com o banco de dados.</p>
 * 
 * @author manoel
 */
public class ProdutoDAO implements InterfaceProdDAO {

    /**
     * Cadastra um novo produto no banco de dados.
     *
     * @param produto Objeto {@link Produto} com os dados a serem inseridos
     * @throws SQLException caso ocorra erro ao executar a operação
     */
    @Override
    public void cadastrarProduto(Produto produto) throws SQLException  {
        String sql = "INSERT INTO PRODUTO (nome, qtde, categoria, fornecedor) VALUES (?, ?, ?, ?)";
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement(sql);

        try {
            stmt.setString(1, produto.getNome_prod());
            stmt.setInt(2, produto.getQtde());
            stmt.setString(3, produto.getCategoria());                        
            stmt.setString(4, produto.getFornecedor());
            stmt.executeUpdate();
            System.out.println("Produto: " + produto.getNome_prod() + " cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadastrar fornecedor: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Altera os dados de um produto existente no banco de dados.
     *
     * @param produto Objeto {@link Produto} com os dados atualizados
     * @throws SQLException caso ocorra erro ao executar a operação
     */
    @Override
    public void alterarProduto(Produto produto) throws SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET nome = ?, qtde = ?, categoria = ?, fornecedor = ? WHERE id = ?");
            stmt.setString(1, produto.getNome_prod());
            stmt.setInt(2, produto.getQtde());
            stmt.setString(3, produto.getCategoria());
            stmt.setString(4, produto.getFornecedor());
            stmt.setInt(5, produto.getId());
            stmt.executeUpdate();
            System.out.println("Produto " + produto.getNome_prod() + " alterado com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao alterar informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Exclui um produto do banco de dados com base no seu ID.
     *
     * @param produto Objeto {@link Produto} a ser excluído
     * @throws SQLException caso ocorra erro ao executar a operação
     */
    @Override
    public void excluirProduto(Produto produto) throws SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from PRODUTO WHERE id = ?");
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();
            System.out.println("Produto " + produto.getNome_prod() + " excluído com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao excluir informação do banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Retorna uma lista de todos os produtos cadastrados no banco de dados.
     *
     * @return Lista de objetos {@link Produto} com os dados recuperados do banco
     */
    @Override
    public List<Produto> exibirDadosProduto() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<Produto>();

        try {
            stmt = con.prepareStatement("SELECT id, nome, qtde, categoria, fornecedor FROM PRODUTO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome_prod(rs.getString("nome"));
                produto.setQtde(rs.getInt("qtde"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setFornecedor(rs.getString("fornecedor"));
                produtos.add(produto);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        } finally {
            Conexao.fecharConexao(con, stmt);
        }

        return produtos;
    }
}
