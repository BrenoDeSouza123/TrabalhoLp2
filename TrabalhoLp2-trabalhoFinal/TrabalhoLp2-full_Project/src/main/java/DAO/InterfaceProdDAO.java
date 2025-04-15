/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import com.mycompany.trabalholp2.Classes.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Breno
 */
public interface InterfaceProdDAO {
    
    public void cadastrarProduto(Produto produto) throws SQLException;
    public void alterarProduto (Produto produto)throws SQLException;
    public void excluirProduto (Produto produto) throws SQLException;
    public List<Produto> exibirDadosProduto();
}
