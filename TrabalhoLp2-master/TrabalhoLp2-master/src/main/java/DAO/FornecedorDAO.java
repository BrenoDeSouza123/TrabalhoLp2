/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trabalholp2.Fornecedor;
import com.mycompany.trabalholp2.TelaCadastroFornecedor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author manoel
 */
public class FornecedorDAO {
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
            System.out.println("Fornecedor: " + fornecedor.getNome() 
                    + "cadastrado com sucesso!");            
        } catch (SQLException e) {
            e.printStackTrace();
             throw new RuntimeException("Erro ao cadastrar fornecedor: " 
                + e.getMessage());
        }finally {
            
            Conexao.fecharConexao(con, stmt);
        }
    }
    
    public void alterar(Fornecedor fornecedor) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE FORNECEDOR SET nome = ? where id = ? ");
           
            stmt.setString(1, fornecedor.getNome());

            stmt.setInt(2, fornecedor.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Fornecedor " + fornecedor.getNome() + " alterado com sucesso");


        } 
        catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } 
        finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    public void excluir(Fornecedor fornecedor) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from FORNECEDOR WHERE id = ?");
           
            stmt.setInt(1, fornecedor.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + fornecedor.getNome() + " excluído com sucesso");


        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
            
        } 
        finally {
            Conexao.fecharConexao(con, stmt);

        }

    }
    public List<Fornecedor> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from FORNECEDOR");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Fornecedor fornecedor =  new Fornecedor();
              
               fornecedor.setId(rs.getInt("id"));
               fornecedor.setNome(rs.getString("nome"));
              
               
               fornecedores.add(fornecedor);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return fornecedores;

       
   }
}
