/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.controller;

import com.GambiBox.Dao.ProdutoDao;
import com.GambiBox.model.ItemProduto;
import com.GambiBox.model.ItemProdutoTableModel;
import com.GambiBox.model.Produto;
import com.GambiBox.model.VendaTableModel;
import com.GambiBox.view.TelaGerenciarVenda;
import java.util.ArrayList;

/**
 *
 * @author Giovane Richard
 */
public class ControllerVenda {
    
    // Instância de prodDao
    ProdutoDao prodDao = new ProdutoDao();
    Produto prod = new Produto();
    
    // Cria uma nova instância da tela Gerênciar Produto
    public void newTelaVenda() {
        new TelaGerenciarVenda().setVisible(true);
    }
    
    public Boolean AdicionarProduto(ItemProdutoTableModel tableModelVenda, Integer codProduto, Integer quantidade) {
        try {
            ItemProduto itemprod = new ItemProduto();
            Produto prod = prodDao.buscaProduto(codProduto, null, null).get(0);
            itemprod.setProduto(prod);
            itemprod.setQuantidade(quantidade);
            tableModelVenda.addRow(itemprod);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    
}// Fim
