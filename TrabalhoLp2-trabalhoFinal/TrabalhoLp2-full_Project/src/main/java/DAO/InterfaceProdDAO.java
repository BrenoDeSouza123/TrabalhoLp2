package DAO;

import com.mycompany.trabalholp2.Classes.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados (DAO) para a entidade {@link Produto}.
 * 
 * <p>Essa interface padroniza os métodos CRUD (Create, Read, Update, Delete) que devem ser
 * implementados por qualquer classe que manipule objetos do tipo Produto no banco de dados.</p>
 * 
 * <p>Implementações típicas incluem {@link ProdutoDAO}.</p>
 * 
 * @author Breno
 */
public interface InterfaceProdDAO {

    /**
     * Cadastra um novo produto no banco de dados.
     *
     * @param produto Objeto {@link Produto} contendo os dados do novo produto
     * @throws SQLException Caso ocorra algum erro durante a operação de inserção
     */
    public void cadastrarProduto(Produto produto) throws SQLException;

    /**
     * Altera os dados de um produto existente no banco de dados.
     *
     * @param produto Objeto {@link Produto} com os dados atualizados
     * @throws SQLException Caso ocorra algum erro durante a operação de atualização
     */
    public void alterarProduto(Produto produto) throws SQLException;

    /**
     * Exclui um produto existente no banco de dados.
     *
     * @param produto Objeto {@link Produto} a ser excluído
     * @throws SQLException Caso ocorra algum erro durante a operação de exclusão
     */
    public void excluirProduto(Produto produto) throws SQLException;

    /**
     * Retorna uma lista com todos os produtos cadastrados no banco de dados.
     *
     * @return Lista de objetos {@link Produto}
     */
    public List<Produto> exibirDadosProduto();
}
