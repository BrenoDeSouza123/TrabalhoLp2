/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

/**
 *
 * @author Breno
 * @author Beatriz
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/conexaomysql";
    private static final String USER = "root"; 
    private static final String PASSWORD = "1234"; 

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Testar a conexão
        Connection conexao = conectar();
        if (conexao != null) {
            try {
                conexao.close(); // Fechar a conexão após o teste
                System.out.println("Conexão fechada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}

