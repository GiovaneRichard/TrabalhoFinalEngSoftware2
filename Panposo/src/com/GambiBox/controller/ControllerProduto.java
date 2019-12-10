/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.controller;

import com.GambiBox.Dao.ProdutoDao;
import com.GambiBox.model.Produto;
import com.GambiBox.model.ProdutoTableModel;
import com.GambiBox.model.TextPrompt;
import com.GambiBox.view.TelaGerenciarProduto;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Giovane Richard
 */
public class ControllerProduto {

    // Instância de prodDao
    ProdutoDao prodDao = new ProdutoDao();
    Produto prod = new Produto();

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

    // Cria uma nova instância da tela Gerênciar Produto
    public void newProduto() {
        new TelaGerenciarProduto().setVisible(true);

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
            System.out.println(prod);
            // Atualiza os dados no banco
            prodDao.editar(prod);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

//    public void preencheCampos(String textoCodigoProduto ,String textoCodigoProduto, String textoNomeProduto, String textoDescricaoProduto, String textoQuantidade, String textUnidade2, String selectBoxUnidadeProduto, String textFormatPrecoProduto, String textoMarca){
//        
//        textoCodigoProduto.setText(textoCodigoProduto);
//        textoNomeProduto.setText(textoCodigoProduto);
//        textoDescricaoProduto.setText(textoNomeProduto);
//        textoQuantidade.setText(textoDescricaoProduto);
//        textUnidade2.setText(textoQuantidade);
//        selectBoxUnidadeProduto.addItem(textUnidade2);
//        textFormatPrecoProduto.setText(selectBoxUnidadeProduto);
//        textoMarca.setText(textFormatPrecoProduto);
//    }
    public boolean limpaCampos(JTextField campoBuscaProduto ,JTextField textoCodigoProduto, JTextField textoNomeProduto, JTextField textoDescricaoProduto, JFormattedTextField textoQuantidade, JFormattedTextField textUnidade2, JFormattedTextField textFormatPrecoProduto, JTextField textoMarca) {

        try {
            textoCodigoProduto.setText("");
            textoNomeProduto.setText("");
            textoDescricaoProduto.setText("");
            textoQuantidade.setText("");
            textUnidade2.setText("");
            textFormatPrecoProduto.setText("");
            textoMarca.setText("");
            campoBuscaProduto.setText("");

            // caixa de nome ganha o focu
            textoNomeProduto.requestFocus();

        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
//    
//    // teste de preenchimento do JComboBox
//    public void preencheComboBox(JComboBox selectBoxFiltroBuscaProduto) {
//
//        for (Produto p : prodDao.buscar(prod)) {
//            selectBoxFiltroBuscaProduto.addItem(p);
//        }
//
//        Produto produto = (Produto) selectBoxFiltroBuscaProduto.getSelectedItem();
//
//        JOptionPane.showMessageDialog(null, "codProd: " + produto.getCodProduto() + "  Descricao: " + produto.getDescricao());
//    }

    public boolean placeHolderCampos(JTextField Buscar, JTextField Nome, JTextField Descricao, JFormattedTextField Quantidade, JFormattedTextField Unidade2, JFormattedTextField Preco, JTextField Marca) {

        try {
             
             
            TextPrompt plNome = new TextPrompt("Nome do produto", Nome);
            
            TextPrompt pldDesc = new TextPrompt("Descrição do produto", Descricao);
            TextPrompt pldQTd = new TextPrompt("R$", Preco);
            TextPrompt pldMarca = new TextPrompt("Marca do produto", Marca);
            TextPrompt pldBusca = new TextPrompt("Busca por produtos", Buscar);
            
        } catch (Exception e) {
            return false;
        }
        
        return true;
    } 
    
    
    
}
