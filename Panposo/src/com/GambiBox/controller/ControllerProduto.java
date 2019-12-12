/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.controller;

import com.GambiBox.Dao.ProdutoDao;
import com.GambiBox.model.Produto;
import com.GambiBox.model.ProdutoTableModel;
import com.GambiBox.view.TelaGerenciarEstoque;
import com.GambiBox.view.TelaGerenciarProduto;
import com.GambiBox.view.TelaInicial;
import java.util.ArrayList;

/**
 *
 * @author Giovane Richard
 */
public class ControllerProduto {

    // Instância de prodDao
    ProdutoDao prodDao = new ProdutoDao();
    Produto prod = new Produto();

    
    
    // Cria uma nova instância da tela Gerênciar Produto
    public void newTelaInicial() {
        new TelaInicial().setVisible(true);
    }
    
    // Cria uma nova instância da tela Gerênciar Produto
    public void newProduto() {
        new TelaGerenciarProduto().setVisible(true);
    }
    
    // Cria uma nova instância da tela Gerênciar Produto
    public void newEstoque() {
        new TelaGerenciarEstoque().setVisible(true);
    }

    public boolean cadastrarProduto(String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca, boolean status) {

        try {
            prod.setNome(nome);
            prod.setDescricao(descricao);
            prod.setQtd_estoque(qtd_estoque);
            prod.setValorUnidade(valor_unidade);
            prod.setUnidade(unidade);
            prod.setPreco(preco);
            prod.setNomeMarca(nome_marca);
            prod.setStatus(status);

            prodDao.salvar(prod);

        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }

        return true;
    }

    /**
     * preenche a jTable com todos os dados vindo do banco
     *
     * @param tabelaProdutos
     * @param index
     * @param nome
     * @return
     */
    //public boolean preencheTabela(JTable tabelaProdutos, int index, String nome) {
    public Boolean buscaProduto(ProdutoTableModel tableModelProduto, Integer codProduto, String nome, String descricao) {
        try {
            tableModelProduto.setProdutos((ArrayList<Produto>) prodDao.buscaProduto(codProduto, nome, descricao));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    // Método Atualizar Prodto
    public boolean atualizarProduto(int codigo, String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca, boolean status) {
        try {

            // Seta o código recuperado da tabela!
            prod.setNome(nome);
            prod.setDescricao(descricao);
            prod.setQtd_estoque(qtd_estoque);
            prod.setValorUnidade(valor_unidade);
            prod.setUnidade(unidade);
            prod.setPreco(preco);
            prod.setNomeMarca(nome_marca);
            prod.setStatus(status);

            prod.setCodProduto(codigo);
            
            // Atualiza os dados no banco
            prodDao.editar(prod);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    
    // Método Atualizar Prodto
    public boolean atualizarEstoque(int qtd, int codigo, String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca, boolean status) {
        try {

            // Seta o código recuperado da tabela!
            prod.setNome(nome);
            prod.setDescricao(descricao);
            prod.setQtd_estoque(qtd_estoque);
            prod.setValorUnidade(valor_unidade);
            prod.setUnidade(unidade);
            prod.setPreco(preco);
            prod.setNomeMarca(nome_marca);
            prod.setStatus(status);

            prod.setCodProduto(codigo);
            
            // atualiza a qtd de produtos
            int novaQtd =  atualizaEstoque(qtd);
            
            // Atualiza os dados no banco
            prodDao.editar(prod, novaQtd);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    
    // atualiza a Qtd de produtos no estoque
    public int atualizaEstoque(int qtd) {
        
        int stqAtul = prod.atualizaQtd(qtd);
        
        return stqAtul;
    }

}//Fim
