/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.controller;

import com.panposo.Dao.DaoId;
import com.panposo.Dao.ProdutoDao;
import com.panposo.model.Produto;
import com.panposo.view.TelaGerenciarProduto;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
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

    public boolean cadastrarProduto(String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca) {

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
     *
     * @param tabelaProdutos
     * @param index
     * @param nome
     * @return
     */
    //public boolean preencheTabela(JTable tabelaProdutos, int index, String nome) {
    public boolean buscaProduto(JTable tabelaProdutos, String textoNomeProduto) {

        try {

            int limite = 50;

            // passa o nome a ser pesquisado
            prod.setNome(textoNomeProduto);

            List<Produto> listaProduto = prodDao.buscar(prod, limite);

            DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();

            for (Produto a : listaProduto) {
                Object[] objeto = new Object[8];

                objeto[0] = a.getCodProduto();
                objeto[1] = a.getNome();
                objeto[2] = a.getDescricao();
                objeto[3] = a.getQtd_estoque();
                objeto[4] = a.getValorUnidade();
                objeto[5] = a.getUnidade();
                objeto[6] = a.getPreco();
                objeto[7] = a.getNomeMarca();

                modelo.addRow(objeto);
            }

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
    public boolean atualizarProduto(int codigo, String nome, String descricao, Integer qtd_estoque, Integer valor_unidade, String unidade, Double preco, String nome_marca) {
        try {

            // Seta o código recuperado da tabela!
            prod.setNome(nome);
            prod.setDescricao(descricao);
            prod.setQtd_estoque(qtd_estoque);
            prod.setValorUnidade(valor_unidade);
            prod.setUnidade(unidade);
            prod.setPreco(preco);
            prod.setNomeMarca(nome_marca);

            prod.setCodProduto(codigo);

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
    public boolean limpaCampos(JTextField textoCodigoProduto, JTextField textoNomeProduto, JTextField textoDescricaoProduto, JFormattedTextField textoQuantidade, JFormattedTextField textUnidade2, JFormattedTextField textFormatPrecoProduto, JTextField textoMarca) {

        try {
            textoCodigoProduto.setText("");
            textoNomeProduto.setText("");
            textoDescricaoProduto.setText("");
            textoQuantidade.setText("");
            textUnidade2.setText("");
            textFormatPrecoProduto.setText("");
            textoMarca.setText("");

            // caixa de nome ganha o focu
            textoNomeProduto.requestFocus();

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // teste de preenchimento do JComboBox
    public void preencheComboBox(JComboBox selectBoxFiltroBuscaProduto) {

        for (Produto p : prodDao.buscar(prod)) {
            selectBoxFiltroBuscaProduto.addItem(p);
        }

        Produto produto = (Produto) selectBoxFiltroBuscaProduto.getSelectedItem();

        JOptionPane.showMessageDialog(null, "codProd: " + produto.getCodProduto() + "  Descricao: " + produto.getDescricao());
    }

}
