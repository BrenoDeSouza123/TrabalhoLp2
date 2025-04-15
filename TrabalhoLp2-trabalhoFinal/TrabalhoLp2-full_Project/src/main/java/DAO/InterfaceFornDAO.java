package DAO;

import com.mycompany.trabalholp2.Classes.Fornecedor;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface que define as operações básicas de acesso a dados (DAO) para a entidade {@link Fornecedor}.
 * 
 * <p>As implementações dessa interface devem fornecer os métodos para:
 * <ul>
 *   <li>Cadastrar novos fornecedores</li>
 *   <li>Alterar dados de fornecedores existentes</li>
 *   <li>Excluir fornecedores</li>
 *   <li>Listar todos os fornecedores</li>
 * </ul>
 * </p>
 * 
 * @author Breno
 */
public interface InterfaceFornDAO {
    
    /**
     * Cadastra um novo fornecedor no banco de dados.
     *
     * @param fornecedor Objeto {@link Fornecedor} com os dados a serem cadastrados
     * @throws SQLException caso ocorra algum erro durante a operação
     */
    public void cadastrarFornecedor(Fornecedor fornecedor) throws SQLException;

    /**
     * Altera os dados de um fornecedor já existente no banco de dados.
     *
     * @param fornecedor Objeto {@link Fornecedor} com os dados atualizados
     * @throws SQLException caso ocorra algum erro durante a operação
     */
    public void alterar(Fornecedor fornecedor) throws SQLException;

    /**
     * Exclui um fornecedor do banco de dados com base no seu ID.
     *
     * @param fornecedor Objeto {@link Fornecedor} a ser excluído
     * @throws SQLException caso ocorra algum erro durante a operação
     */
    public void excluirFornecedor(Fornecedor fornecedor) throws SQLException;

    /**
     * Retorna uma lista contendo todos os fornecedores cadastrados no banco de dados.
     *
     * @return Lista de objetos {@link Fornecedor}
     */
    public List<Fornecedor> exibirDadosFornecedor();
}
