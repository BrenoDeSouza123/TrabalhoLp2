package com.mycompany.trabalholp2;
/*
  @author Daniel Souza
*/
public class Produto {
    private String nome_prod;
    private int qtde;
    private String categoria;
    private String fornecedor;
    private Integer Id;
    
    public Produto (){
        
    }

    public Produto(String nome_prod, int qtde,  String categoria, String fornecedor) {
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
        
}
