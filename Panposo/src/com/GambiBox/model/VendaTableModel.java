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
public class VendaTableModel extends AbstractTableModel{

    private List<Produto> produtos = new ArrayList<>();
   //private String[] colunas = {"Código","Nome","Descrição","Qtd Estoque","Unidade","Tipo Unidade","Preço"};
    private String[] colunas = {"Código","Produto","Estoque","Unidade","Tipo Unidade","Preço"};

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
                return "00" + produtos.get(rowIndex).getCodProduto();
            case 1:
                //return produtos.get(rowIndex).getNome();
                return produtos.get(rowIndex).getNome() + "   ---   " + produtos.get(rowIndex).getDescricao();
           // case 2:
                //return produtos.get(rowIndex).getDescricao();
            case 2:
                return produtos.get(rowIndex).getQtd_estoque();
            case 3:
                return produtos.get(rowIndex).getValorUnidade();
            case 4:
                return produtos.get(rowIndex).getUnidade();
            case 5:
                return "R$ " + produtos.get(rowIndex).getPreco();
//            case 7:
//                return produtos.get(rowIndex).getNomeMarca();
//            case 8:
//                return produtos.get(rowIndex).isStatus();
                
//                quantidade, código,unidade, produto(nome + descricao), preco unitário, subtotal;
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
       
        switch(coluna){
            case 0:
                produtos.get(linha).setCodProduto(Integer.parseInt((String)valor));
                break;
            case 1:
                produtos.get(linha).setNome((String)valor);
                break;
            case 2:
                produtos.get(linha).setDescricao((String)valor);
                break;
            case 3:
                produtos.get(linha).setQtd_estoque(Integer.parseInt((String)valor));
                break;
            case 4:
                produtos.get(linha).setValorUnidade(Integer.parseInt((String)valor));
                break;
            case 5:
                produtos.get(linha).setUnidade((String)valor);
                break;
            case 6:
                produtos.get(linha).setPreco(Double.parseDouble((String)valor));
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Produto p){
        this.produtos.add(p);
        this.fireTableDataChanged();
    }
    
    
    
}// Fim