/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Breno
 * @author Beatriz
 */


public class Conexao {

    private static final String DRIVE_MYSQL = "com.mysql.jdbc.Driver";
    private static final String ENDERECO = "jdbc:mysql://localhost:3306/trabalhoLp2_1504";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234";
    private static Connection conn = null;
    
    public static Connection getConexao() {        
        try {
            if (conn == null || conn.isClosed()){
                Class.forName(DRIVE_MYSQL);
                conn = DriverManager.getConnection(ENDERECO, USUARIO, SENHA);                
                return conn;

            }
        }
        catch (ClassNotFoundException | SQLException ex) {
            
            System.err.println("Erro ao estabelecer uma conexão com o banco: " + ex.getMessage());
            throw new RuntimeException("Erro ao estabelecer uma conexao com o banco");
        }
        
    return null;
    }

    public static void fecharConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }

    }

    public static void fecharConexao(Connection con, PreparedStatement stmt) {
        fecharConexao(con);

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }

    }

    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs) {
        fecharConexao(con, stmt);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }

    }

}