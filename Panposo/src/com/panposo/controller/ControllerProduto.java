/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.controller;

import com.panposo.Dao.ProdutoDao;
import com.panposo.model.Produto;

/**
 *
 * @author Giovane Richard
 */
public class ControllerProduto {

    // Instância de prodDao
    ProdutoDao prodDao = new ProdutoDao();
    Produto prod = new Produto();

    /*
    // recebe a conecção com o banco
        //ConectaBanco con = 
        
         // Clique do botao Adicionar produto
        try {
            // Pegando os dados nos campos do form
            
            
           // salvando os dados no banco
           controlProd.cadastraProduto(prod);
           
            // se persistência o correu corretamente
            labelMensagemCadastro.setVisible(Boolean.TRUE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Erro ao cadastrar o produto!");
            e.printStackTrace();
        }
     */
    public boolean cadastraProduto(String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca) {

        try {
            prod.setNome(nome);
            prod.setDescricao(descricao);
            prod.setQtd_estoque(qtd_estoque);
            prod.setValorUnidade(valor_unidade);
            prod.setUnidade(unidade);
            prod.setPreco(preco);
            prod.setNomeMarca(nome_marca);
            prodDao.salvar(prod);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
