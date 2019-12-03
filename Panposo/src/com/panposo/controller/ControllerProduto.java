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
    ProdutoDao prodDao =  new ProdutoDao();
      
   
    public boolean cadastraProduto(Produto prod)
    {
        try {
            
            prodDao.salvar(prod);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
           
        return true;
    }
}
