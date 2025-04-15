package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trabalholp2.Classes.Fornecedor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por realizar operações de persistência (CRUD)
 * no banco de dados para objetos do tipo {@link Fornecedor}.
 * Implementa a interface {@link InterfaceFornDAO}.
 * 
 * <p>Métodos principais:
 * <ul>
 *   <li>{@link #cadastrarFornecedor(Fornecedor)}
 *   <li>{@link #alterar(Fornecedor)}
 *   <li>{@link #excluirFornecedor(Fornecedor)}
 *   <li>{@link #exibirDadosFornecedor()}
 * </ul>
 * </p>
 * 
 * @author manoel
 */
public class FornecedorDAO implements InterfaceFornDAO {

    /**
     * Cadastra um novo fornecedor no banco de dados.
     *
     * @param fornecedor Objeto {@link Fornecedor} com os dados a serem inseridos
     * @throws SQLException caso ocorra algum erro de SQL
     */
    @Override
    public void cadastrarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO FORNECEDOR (nome, CNPJ, tel, email) VALUES (?, ?, ?, ?)";
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement(sql);

        try {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCNPJ());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getEmail());

            stmt.executeUpdate();
            System.out.println("Fornecedor: " + fornecedor.getNome() + " cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar fornecedor: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Altera os dados de um fornecedor existente no banco de dados.
     *
     * @param fornecedor Objeto {@link Fornecedor} com os dados atualizados
     * @throws SQLException caso ocorra algum erro de SQL
     */
    @Override
    public void alterar(Fornecedor fornecedor) throws SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE FORNECEDOR SET nome = ?, CNPJ = ?, tel = ?, email = ? WHERE id = ?");
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCNPJ());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getEmail());
            stmt.setInt(5, fornecedor.getId());

            stmt.executeUpdate();
            System.out.println("Fornecedor " + fornecedor.getNome() + " alterado com sucesso");

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao alterar informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Exclui um fornecedor do banco de dados com base em seu ID.
     *
     * @param fornecedor Objeto {@link Fornecedor} a ser excluído
     * @throws SQLException caso ocorra algum erro de SQL
     */
    @Override
    public void excluirFornecedor(Fornecedor fornecedor) throws SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from FORNECEDOR WHERE id = ?");
            stmt.setInt(1, fornecedor.getId());

            stmt.executeUpdate();
            System.out.println("Fornecedor " + fornecedor.getNome() + " excluído com sucesso");

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir informação do banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    /**
     * Retorna uma lista com todos os fornecedores cadastrados no banco de dados.
     *
     * @return Lista de objetos {@link Fornecedor}
     */
    @Override
    public List<Fornecedor> exibirDadosFornecedor() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT id, nome, CNPJ, tel, email FROM FORNECEDOR");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCNPJ(rs.getString("CNPJ"));
                fornecedor.setTelefone(rs.getString("tel"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedores.add(fornecedor);
            }

        } catch (SQLException s) {
            s.printStackTrace();
        } finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return fornecedores;
    }
}
