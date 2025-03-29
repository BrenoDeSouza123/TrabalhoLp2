package com.mycompany.trabalholp2;
/*
  @author Daniel Souza
*/
public class Produto {
    private String nome_prod;
    private int qtde;
    private String categoria;
    private Fornecedor fornecedor;

    public Produto(String nome_prod, String categoria, int qtde, Fornecedor fornecedor) {
        this.nome_prod = nome_prod;
        this.categoria = categoria;
        this.qtde = qtde;
        this.fornecedor = fornecedor;
    }
    public String getNome_prod(){
        return nome_prod;
    }
    public void setNome_prod(String nome_prod){
        this.nome_prod = nome_prod;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public int getQtde(){
        return qtde;
    }
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
        
}
