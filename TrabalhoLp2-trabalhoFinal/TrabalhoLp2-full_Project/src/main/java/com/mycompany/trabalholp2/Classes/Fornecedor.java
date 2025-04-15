package com.mycompany.trabalholp2.Classes;

/**
 * Classe que representa um fornecedor no sistema.
 * <p>
 * Contém informações básicas como nome, CNPJ, telefone, e-mail e ID.
 * Pode ser utilizada para cadastro, exibição, alteração e exclusão de fornecedores
 * no banco de dados.
 * </p>
 * 
 * @author Kayky Bittencourt
 */
public class Fornecedor {

    private String nome;
    private String CNPJ;
    private String telefone;
    private String email;
    private Integer Id;

    /**
     * Construtor padrão da classe Fornecedor.
     */
    public Fornecedor() {
    }

    /**
     * Construtor que inicializa um objeto Fornecedor com os dados informados.
     *
     * @param nome     Nome do fornecedor
     * @param CNPJ     CNPJ do fornecedor
     * @param telefone Telefone de contato do fornecedor
     * @param email    E-mail do fornecedor
     */
    public Fornecedor(String nome, String CNPJ, String telefone, String email) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Retorna o nome do fornecedor.
     *
     * @return Nome do fornecedor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do fornecedor.
     *
     * @param nome Nome a ser atribuído
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CNPJ do fornecedor.
     *
     * @return CNPJ do fornecedor
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * Define o CNPJ do fornecedor.
     *
     * @param CNPJ CNPJ a ser atribuído
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Retorna o telefone do fornecedor.
     *
     * @return Telefone do fornecedor
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do fornecedor.
     *
     * @param telefone Telefone a ser atribuído
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Retorna o e-mail do fornecedor.
     *
     * @return E-mail do fornecedor
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail do fornecedor.
     *
     * @param email E-mail a ser atribuído
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna o ID do fornecedor.
     *
     * @return ID do fornecedor
     */
    public Integer getId() {
        return Id;
    }

    /**
     * Define o ID do fornecedor.
     *
     * @param Id ID a ser atribuído
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }
}
