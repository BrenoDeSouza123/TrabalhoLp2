package com.mycompany.trabalholp2.Classes;

/**
 * Classe que representa um produto no sistema de controle de estoque.
 * <p>
 * Cada produto possui informações como nome, quantidade, categoria,
 * fornecedor e um identificador único.
 * </p>
 * 
 * Esta classe é utilizada para operações de cadastro, consulta, atualização
 * e exclusão de produtos no banco de dados.
 * 
 * @author Daniel Souza
 */
public class Produto {

    private String nome_prod;
    private int qtde;
    private String categoria;
    private String fornecedor;
    private Integer Id;

    /**
     * Construtor padrão da classe Produto.
     */
    public Produto() {
    }

    /**
     * Construtor que inicializa um produto com os dados fornecidos.
     *
     * @param nome_prod  Nome do produto
     * @param qtde       Quantidade disponível em estoque
     * @param categoria  Categoria do produto
     * @param fornecedor Nome do fornecedor do produto
     */
    public Produto(String nome_prod, int qtde, String categoria, String fornecedor) {
        this.nome_prod = nome_prod;
        this.qtde = qtde;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return Nome do produto
     */
    public String getNome_prod() {
        return nome_prod;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome_prod Nome a ser atribuído
     */
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    /**
     * Retorna a categoria do produto.
     *
     * @return Categoria do produto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria Categoria a ser atribuída
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna a quantidade em estoque do produto.
     *
     * @return Quantidade disponível
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * Define a quantidade em estoque do produto.
     *
     * @param qtde Quantidade a ser atribuída
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * Retorna o ID do produto.
     *
     * @return Identificador único do produto
     */
    public Integer getId() {
        return Id;
    }

    /**
     * Define o ID do produto.
     *
     * @param Id Identificador a ser atribuído
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * Retorna o nome do fornecedor do produto.
     *
     * @return Nome do fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o nome do fornecedor do produto.
     *
     * @param fornecedor Nome do fornecedor a ser atribuído
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
