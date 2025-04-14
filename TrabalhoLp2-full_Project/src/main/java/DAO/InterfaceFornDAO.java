/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import com.mycompany.trabalholp2.Classes.Fornecedor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Breno
 */
public interface InterfaceFornDAO {
    
    public void cadastrarFornecedor(Fornecedor fornecedor) throws SQLException;
    public void alterar(Fornecedor fornecedor) throws SQLException;
    public void excluir(Fornecedor fornecedor) throws SQLException;
    public List<Fornecedor> exibirDadosFornecedor();
}
