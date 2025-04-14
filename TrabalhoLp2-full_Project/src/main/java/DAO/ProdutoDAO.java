/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 *
 * @author manoel
 */

public class ProdutoDAO implements InterfaceProdDAO{
    
    @Override
    public void cadastrarProduto(Produto produto) throws SQLException  {
        
        String sql = "INSERT INTO PRODUTO (nome, qtde, categoria, nomeFornecedor) VALUES (?, ?, ?, ?)";
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement(sql);
        
        try {
            
            stmt.setString(1, produto.getNome_prod());
            stmt.setInt(2, produto.getQtde());
            stmt.setString(3, produto.getCategoria());                        
            stmt.setString(4, produto.getFornecedor());

            stmt.executeUpdate();
            System.out.println("Produto: " + produto.getNome_prod()
            + "cadastrado com sucesso!");
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadastrar fornecedor: " 
            + e.getMessage());
            
        }finally {
            
            Conexao.fecharConexao(con, stmt);
        
        }
    }
    
    @Override
    public void alterarProduto(Produto produto) throws SQLException {
        
    Connection con = Conexao.getConexao();
    PreparedStatement stmt = null;

    try {
        
        stmt = con.prepareStatement("UPDATE produto SET nome = ?, qtde = ?, categoria = ?, nomeFornecedor = ? WHERE id = ?");
        stmt.setString(1, produto.getNome_prod());
        stmt.setInt(2, produto.getQtde());
        stmt.setString(3, produto.getCategoria());
        stmt.setString(4, produto.getFornecedor());
        stmt.setInt(5, produto.getId());

        stmt.executeUpdate();

        System.out.println("Produto " + produto.getNome_prod() + " alterado com sucesso");

        } 
        catch (SQLException ex) {
            
            ex.printStackTrace();
            throw new RuntimeException("Erro ao alterar informação no banco de dados");
        
        } 
        finally {
           
            Conexao.fecharConexao(con, stmt);

        }

    }

    @Override
    public void excluirProduto(Produto produto) throws SQLException {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            
            stmt = con.prepareStatement("DELETE from PRODUTO WHERE id = ?");           
            stmt.setInt(1, produto.getId());

            stmt.executeUpdate();
            
            System.out.println("Curso " + produto.getNome_prod() + " excluído com sucesso");

        } 
        catch (SQLException ex) {
            
            ex.printStackTrace();
            throw new RuntimeException("Erro ao excluir informação do banco de dados");
            
        } 
        finally {
            
            Conexao.fecharConexao(con, stmt);

        }

    }

    @Override
    public List<Produto> exibirDadosProduto(){
       
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;       
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<Produto>();
              
        try{

            stmt = con.prepareStatement("select id, nome, qtde, categoria, nomeFornecedor from PRODUTO");
            rs = stmt.executeQuery();

            while (rs.next()){
                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome_prod(rs.getString("nome"));
                produto.setQtde(rs.getInt("qtde"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setFornecedor(rs.getString("nomeFornecedor"));

                produtos.add(produto);

            }
        }
        catch (SQLException s){
            
            s.printStackTrace();

        }

        finally {
            
            Conexao.fecharConexao(con, stmt);

        }

        return produtos;

   }


}
