package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados MySQL.
 * Oferece métodos para obter e fechar conexões com o banco.
 * 
 * <p>Autores:
 * <ul>
 *   <li>@author Breno
 *   <li>@author Beatriz
 * </ul>
 */
public class Conexao {

    /** Driver JDBC para conexão com o MySQL */
    private static final String DRIVE_MYSQL = "com.mysql.jdbc.Driver";
    
    /** Endereço do banco de dados */
    private static final String ENDERECO = "jdbc:mysql://127.0.0.1/trabalhoLp2_1504";
    
    /** Nome de usuário do banco de dados */
    private static final String USUARIO = "root";
    
    /** Senha do banco de dados */
    private static final String SENHA = "root_1234";

    /** Objeto de conexão reutilizável */
    private static Connection conn = null;

    /**
     * Retorna uma conexão com o banco de dados.
     * 
     * @return {@link Connection} Objeto de conexão com o banco ou {@code null} se falhar
     * @throws RuntimeException se não for possível estabelecer a conexão
     */
    public static Connection getConexao() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName(DRIVE_MYSQL);
                conn = DriverManager.getConnection(ENDERECO, USUARIO, SENHA);
                return conn;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Erro ao estabelecer uma conexão com o banco: " + ex.getMessage());
            throw new RuntimeException("Erro ao estabelecer uma conexao com o banco");
        }

        return null;
    }

    /**
     * Fecha uma conexão com o banco de dados.
     * 
     * @param con Objeto {@link Connection} a ser fechado
     */
    public static void fecharConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }
    }

    /**
     * Fecha uma conexão e um {@link PreparedStatement}.
     * 
     * @param con Objeto {@link Connection} a ser fechado
     * @param stmt Objeto {@link PreparedStatement} a ser fechado
     */
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

    /**
     * Fecha uma conexão, um {@link PreparedStatement} e um {@link ResultSet}.
     * 
     * @param con Objeto {@link Connection} a ser fechado
     * @param stmt Objeto {@link PreparedStatement} a ser fechado
     * @param rs Objeto {@link ResultSet} a ser fechado
     */
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
