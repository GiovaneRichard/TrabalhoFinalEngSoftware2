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
public class ItemProdutoTableModel extends AbstractTableModel{

    private List<ItemProduto> itemProduto = new ArrayList<>();
    private String[] colunas = {"Código","Produto","Quantidade","Unidade","Tipo Unidade","Preço","Subtotal"};

    public void setItems(ArrayList<ItemProduto> itemProd){
        if (itemProd != null){
            itemProduto= (List<ItemProduto>) itemProd;
            this.fireTableDataChanged();
        }
    }
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    
    @Override
    public int getRowCount() {
        return itemProduto.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return "00" + itemProduto.get(rowIndex).getProduto().getCodProduto();
            case 1:
                return itemProduto.get(rowIndex).getProduto().getNome() + "   ---   " + itemProduto.get(rowIndex).getProduto().getDescricao();
            case 2:
                return itemProduto.get(rowIndex).getQuantidade();
            case 3:
                return itemProduto.get(rowIndex).getProduto().getValorUnidade();
            case 4:
                return itemProduto.get(rowIndex).getProduto().getUnidade();
            case 5:
                String sf = itemProduto.get(rowIndex).getProduto().getPreco().toString();
                sf = sf.replace(".", ",");
                return "R$ " + sf;
                //return itemProduto.get(rowIndex).getProduto().getPreco();
            case 6:
                String sf2 = itemProduto.get(rowIndex).calcularSubtotal().toString();
                sf2 = sf2.replace(".", ",");
                return "R$ " + sf2;
                //return itemProduto.get(rowIndex).calcularSubtotal();
        }
        return null;
    }
    
    public void addRow(ItemProduto itemprod){
        this.itemProduto.add(itemprod);
        this.fireTableDataChanged();
    }
    
    public Double getTotal(){
        Double total = 0.0;
        for(ItemProduto it : itemProduto){
            total += it.calcularSubtotal();
        }
        return total;
    }
}