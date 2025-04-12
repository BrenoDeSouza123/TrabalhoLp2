package com.mycompany.trabalholp2;
/**
 *
 * @author Kayky Bittencourt
 */
public class Fornecedor {
    
    private String nome;
    private String CNPJ;
    private String telefone;
    private String email;
    //private String endereco;
    private Integer Id;
    
    public Fornecedor (){
        
    }
    public Fornecedor(String nome, String CNPJ, String telefone, String email){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.email = email;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    */
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

 
    
    
    
}
