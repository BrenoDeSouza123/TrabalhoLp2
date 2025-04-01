/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Conexao.Conexao;
import com.mycompany.trabalholp2.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trabalholp2.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoel
 */
public class ProdutoDAO {
    public void cadastrarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (nome_prod, categoria, qtde, fornecedor) VALUES (?, ?, ?, ?)";
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement(sql);
        try {
            
            stmt.setString(1, produto.getNome_prod());
            stmt.setString(2, produto.getCategoria());
            stmt.setDouble(3, produto.getQtde());
            //stmt.setInt(4, produto.getFornecedor());

            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!");
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar produto: " + e.getMessage());
        }finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
    public void alterar(Produto produto) {
        
    Connection con = Conexao.getConexao();
    PreparedStatement stmt = null;

    try {
        stmt = con.prepareStatement("UPDATE produto SET nome = ? where id = ? ");

        stmt.setString(1, produto.getNome_prod());

        stmt.setInt(2, produto.getId());


        stmt.executeUpdate();

        System.out.println("Produto " + produto.getNome_prod() + " alterado com sucesso");


        } 
        catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } 
        finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    public void excluir(Produto produto) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from CURSO WHERE id = ?");
           
            stmt.setInt(1, produto.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + produto.getNome_prod() + " excluído com sucesso");


        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
            
        } 
        finally {
            Conexao.fecharConexao(con, stmt);

        }

    }
    public List<Produto> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Produto> produtos = new ArrayList<Produto>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from CURSO");
           rs = stmt.executeQuery();
           
           while (rs.next()){
              Produto produto = new Produto();
              
               produto.setId(rs.getInt("id"));
               produto.setNome_prod(rs.getString("nome"));
              
               
               produtos.add(produto);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return produtos;

       
   }
}
