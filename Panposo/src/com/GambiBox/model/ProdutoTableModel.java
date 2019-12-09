/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alvar
 */
public class ProdutoTableModel extends AbstractTableModel{

    private List<Produto> produtos = new ArrayList<>();
    private String[] colunas = {"Código","Nome","Descrição","Qtd Estoque","Unidade","Tipo Unidade","Preço","Marca"};

    public void setProdutos(ArrayList<Produto> ps){
        if (ps != null){
            produtos = (List<Produto>) ps;
            this.fireTableDataChanged();
        }
    }
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return produtos.get(rowIndex).getCodProduto();
            case 1:
                return produtos.get(rowIndex).getNome();
            case 2:
                return produtos.get(rowIndex).getDescricao();
            case 3:
                return produtos.get(rowIndex).getQtd_estoque();
            case 4:
                return produtos.get(rowIndex).getValorUnidade();
            case 5:
                return produtos.get(rowIndex).getUnidade();
            case 6:
                return produtos.get(rowIndex).getPreco();
            case 7:
                return produtos.get(rowIndex).getNomeMarca();
        }
        return null;
    }
}