/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.controller;

import com.panposo.Dao.ProdutoDao;
import com.panposo.model.Produto;
import com.sun.javafx.embed.AbstractEvents;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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

            return false;
        }

        return true;
    }

    /**
     * preenche a jTable com todos os dados vindo do banco
     */
    public boolean preencheTabela(JTable tabelaProdutos, int index) {

        try {
            //List<Produto> listaProduto = prodDao.buscar(prod);
            
            List<Produto> listaProduto = prodDao.buscar(null, 20);
            
            
            /*
            switch(index){
                case 0:
                    listaProduto = prodDao.buscar(null, 20);
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }*/
            
            

            DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();

            if (modelo.getRowCount() > 0) {
                modelo.setRowCount(0);
            }

            if (prod.getCodProduto() == null) {
                prod.setCodProduto(1);
            }

            for (Produto a : listaProduto) {
                Object[] objeto = new Object[9];

                objeto[0] = a.getCodProduto();
                objeto[1] = a.getNome();
                objeto[2] = a.getDescricao();
                objeto[3] = a.getPreco();
                objeto[4] = a.getUnidade();
                objeto[5] = a.getQtd_estoque();
                objeto[6] = a.getNomeMarca();
                objeto[7] = a.getValorUnidade();

                modelo.addRow(objeto);
            }

        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }

        return true;
    }
    
    // Busca personalizada dos produtos
    public boolean buscarProdutos(JTable tabelaProdutos, JComboBox selectBoxFiltroBuscaProduto)
    {
        try {
            
            switch(selectBoxFiltroBuscaProduto.getSelectedIndex()){
                case 0: // Buscar todos os produtos
                    preencheTabela(tabelaProdutos, 0);
                    break;
            }
                
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    
    public void limpaCampos(JTextField textoNomeProduto, JTextField textoDescricaoProduto, JTextField textoQuantidade, JTextField textUnidade2, JFormattedTextField textFormatPrecoProduto, JTextField textoMarca) {
        
        textoNomeProduto.setText("");
        textoDescricaoProduto.setText("");
        textoQuantidade.setText("");
        textUnidade2.setText("");
        textFormatPrecoProduto.setText("");
        textoMarca.setText("");
        
        // caixa de nome ganha o focu
        //textoNomeProduto;
    }
}
