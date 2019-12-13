/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.model;

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
    private boolean status;

    /**
     * Construtro de objetos do tipo <b>Produto<\b>.
     * <pre>
     * Produto p = new Produto(1, "Produto X", "Elemento X", 10.00, kg), 10, A, marcaX);
     * <\pre>
     * @param codProduto
     * @param nome
     * @param descricao
     * @param preco
     * @param unidade
     * @param qtd_estoque
     * @param valorUnidade
     * @param status
     * @param nomeMarca
     */
    public Produto(Integer codProduto, String nome, String descricao, Double preco, String unidade, Integer qtd_estoque, String nomeMarca, Integer valorUnidade, boolean status) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
        this.qtd_estoque = qtd_estoque;
        this.nomeMarca = nomeMarca;
        this.valorUnidade = valorUnidade;
        this.status = status;
    }

    // Construtor padrão
    public Produto() {
    }

    public Produto(int codProduto, String nome, String descricao, double preco, String unidade, int qtd_estoque, String nomeMarca, int valorUnidade, boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public void atualizaQtd(int qtd) {
        int novoValor = getQtd_estoque() + qtd;

        setQtd_estoque(novoValor);
    }

}
