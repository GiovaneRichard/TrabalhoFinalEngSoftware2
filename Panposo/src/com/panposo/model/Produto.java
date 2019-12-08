/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.model;

/**
 *
 * @author Giovane Richard
 */


public class Produto {
    
    private Integer codProduto;
    private String nome;
    private String descricao;
    private Double preco; // Conferir o formato
    private String unidade;
    private Integer qtd_estoque;
    private String nomeMarca;
    private Integer valorUnidade;

    
    
    /**
     * Construtro de objetos do tipo <b>Produto<\b>.
     * <pre>
     * Produto p = new Produto(1, "Produto X", "Elemento X", 10.00, kg), 10, A, marcaX);
     * <\pre>
     
     * @param cod
     * @param nome
     * @param descricao
     * @param preco
     * @param unidade
     * @param qtd_estoque
     * @param status
     * @param nomeMarca
     */
    public Produto(Integer codProduto, String nome, String descricao, Double preco, String unidade, Integer qtd_estoque, String nomeMarca, Integer valorUnidade) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
        this.qtd_estoque = qtd_estoque;
        this.nomeMarca = nomeMarca;
        this.valorUnidade = valorUnidade;
    }
    
    // Construtor padrão
    public Produto() {
    }

    public Produto(int codProduto, String nome, String descricao, double preco, String unidade, int qtd_estoque, String nomeMarca, int valorUnidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(Integer qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Integer getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(Integer valorUnidade) {
        this.valorUnidade = valorUnidade;
    } 

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
    
    
}


