/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.view;

import com.panposo.controller.ControllerProduto;
import com.panposo.model.Produto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author geovani pereira dos santos
 */
public class TelaGerenciarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarProduto
     */
    // Instanciando de controllerProto
    ControllerProduto controlProd = new ControllerProduto();

    public TelaGerenciarProduto() {
        initComponents();

        // emeplo de como deixar um componente visivel ou nao
        labelMensagemCadastro.setVisible(Boolean.FALSE);

        // inializa a tabela preenchida
        controlProd.preencheTabela(tabelaProdutos, 0);

        // exemplo de mensagem de notificação
        //JOptionPane.showMessageDialog(new JFrame(), "Produto atualizado sucesso");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenu = new javax.swing.JPanel();
        botaoMenuGerenciarProduto = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        textoMenuGerenciarProduto = new javax.swing.JLabel();
        nomeLogo = new javax.swing.JLabel();
        destaqueLogo = new javax.swing.JPanel();
        tituloTela = new javax.swing.JPanel();
        textoTituloPagina = new javax.swing.JLabel();
        painelAdicionarProduto = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNomeProduto = new javax.swing.JLabel();
        textoNomeProduto = new javax.swing.JTextField();
        labelPreco = new javax.swing.JLabel();
        textUnidade2 = new javax.swing.JTextField();
        labelUnidade = new javax.swing.JLabel();
        selectBoxUnidadeProduto = new javax.swing.JComboBox<>();
        labeldescricaoProduto = new javax.swing.JLabel();
        textoDescricaoProduto = new javax.swing.JTextField();
        botaoAdicionarProduto = new javax.swing.JButton();
        labelCodigoProduto = new javax.swing.JLabel();
        textoCodigoProduto = new javax.swing.JTextField();
        labelNomeMarca = new javax.swing.JLabel();
        textoMarca = new javax.swing.JTextField();
        labelMensagemCadastro = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        textoQuantidade = new javax.swing.JTextField();
        textFormatPrecoProduto = new javax.swing.JFormattedTextField();
        jCheckBoxHabilitado = new javax.swing.JCheckBox();
        painelAtualizarProduto = new javax.swing.JPanel();
        campoBuscaProduto = new javax.swing.JTextField();
        botaoBuscaProduto = new javax.swing.JButton();
        scrollViewTabelaProdutos = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        selectBoxFiltroBuscaProduto = new javax.swing.JComboBox<>();
        labelBusca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        painelMenu.setBackground(new java.awt.Color(23, 35, 51));

        botaoMenuGerenciarProduto.setBackground(new java.awt.Color(41, 57, 80));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(4, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        textoMenuGerenciarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoMenuGerenciarProduto.setForeground(new java.awt.Color(204, 204, 255));
        textoMenuGerenciarProduto.setText("Gerenciar Produto");

        javax.swing.GroupLayout botaoMenuGerenciarProdutoLayout = new javax.swing.GroupLayout(botaoMenuGerenciarProduto);
        botaoMenuGerenciarProduto.setLayout(botaoMenuGerenciarProdutoLayout);
        botaoMenuGerenciarProdutoLayout.setHorizontalGroup(
            botaoMenuGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoMenuGerenciarProdutoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoMenuGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMenuGerenciarProdutoLayout.setVerticalGroup(
            botaoMenuGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoMenuGerenciarProdutoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMenuGerenciarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoMenuGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        nomeLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nomeLogo.setForeground(new java.awt.Color(204, 204, 255));
        nomeLogo.setText("GambiBox");

        destaqueLogo.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout destaqueLogoLayout = new javax.swing.GroupLayout(destaqueLogo);
        destaqueLogo.setLayout(destaqueLogoLayout);
        destaqueLogoLayout.setHorizontalGroup(
            destaqueLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        destaqueLogoLayout.setVerticalGroup(
            destaqueLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoMenuGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destaqueLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nomeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destaqueLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoMenuGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tituloTela.setBackground(new java.awt.Color(71, 120, 197));

        textoTituloPagina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoTituloPagina.setForeground(new java.awt.Color(204, 204, 255));
        textoTituloPagina.setText("Gerenciar produto");

        javax.swing.GroupLayout tituloTelaLayout = new javax.swing.GroupLayout(tituloTela);
        tituloTela.setLayout(tituloTelaLayout);
        tituloTelaLayout.setHorizontalGroup(
            tituloTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoTituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tituloTelaLayout.setVerticalGroup(
            tituloTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoTituloPagina, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAdicionarProduto.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Adicionar produto");

        labelNomeProduto.setText("Nome");

        labelPreco.setText("Preço");

        labelUnidade.setText("Unidade:");

        selectBoxUnidadeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "grama (g)", "metro (m)", "centimetro (cm)", "Litro (L)", "ml", "volume", "duzia", "unidade", " " }));
        selectBoxUnidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBoxUnidadeProdutoActionPerformed(evt);
            }
        });

        labeldescricaoProduto.setText("Descrição");

        botaoAdicionarProduto.setBackground(new java.awt.Color(153, 153, 255));
        botaoAdicionarProduto.setText("Adicionar produto");
        botaoAdicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProdutoActionPerformed(evt);
            }
        });

        labelCodigoProduto.setText("Código Produto");

        textoCodigoProduto.setEditable(false);

        labelNomeMarca.setText("Nome da marca");

        labelMensagemCadastro.setForeground(new java.awt.Color(0, 29, 0));
        labelMensagemCadastro.setText("Produto cadastrado com sucesso");

        labelQuantidade.setText("Quantidade");

        try {
            textFormatPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCheckBoxHabilitado.setSelected(true);
        jCheckBoxHabilitado.setText("Habilitado");
        jCheckBoxHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHabilitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAdicionarProdutoLayout = new javax.swing.GroupLayout(painelAdicionarProduto);
        painelAdicionarProduto.setLayout(painelAdicionarProdutoLayout);
        painelAdicionarProdutoLayout.setHorizontalGroup(
            painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelMensagemCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                        .addComponent(labelNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labeldescricaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDescricaoProduto))
                    .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                        .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                                .addComponent(labelCodigoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelUnidade))
                            .addComponent(labelTitulo)
                            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                                .addComponent(labelNomeMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                                .addComponent(jCheckBoxHabilitado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                                .addComponent(textUnidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectBoxUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(textFormatPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        painelAdicionarProdutoLayout.setVerticalGroup(
            painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProduto)
                    .addComponent(textoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldescricaoProduto)
                    .addComponent(textoDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoProduto)
                    .addComponent(textUnidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreco)
                    .addComponent(labelQuantidade)
                    .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUnidade)
                    .addComponent(selectBoxUnidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFormatPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeMarca)
                    .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHabilitado))
                .addGap(18, 18, 18)
                .addGroup(painelAdicionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarProduto)
                    .addComponent(labelMensagemCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizarProduto.setBackground(new java.awt.Color(255, 255, 255));

        botaoBuscaProduto.setText("Buscar Produto");
        botaoBuscaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaProdutoActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Descricãp", "Preço", "Unidade", "qtd_estoque", "NomeMarca"
            }
        ));
        scrollViewTabelaProdutos.setViewportView(tabelaProdutos);

        selectBoxFiltroBuscaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os produto", "Código do produto", "Nome do produto", "Descrição do produto" }));

        labelBusca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelBusca.setText("Buscar");

        javax.swing.GroupLayout painelAtualizarProdutoLayout = new javax.swing.GroupLayout(painelAtualizarProduto);
        painelAtualizarProduto.setLayout(painelAtualizarProdutoLayout);
        painelAtualizarProdutoLayout.setHorizontalGroup(
            painelAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollViewTabelaProdutos)
                    .addGroup(painelAtualizarProdutoLayout.createSequentialGroup()
                        .addComponent(labelBusca)
                        .addGap(18, 18, 18)
                        .addComponent(campoBuscaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectBoxFiltroBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAtualizarProdutoLayout.setVerticalGroup(
            painelAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectBoxFiltroBuscaProduto)
                        .addComponent(campoBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBusca)))
                .addGap(18, 18, 18)
                .addComponent(scrollViewTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelAtualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAtualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaProdutoActionPerformed

        //Clique do Botao buscar
        //controlProd.preencheTabela(tabelaProdutos);
        
        controlProd.buscarProdutos(tabelaProdutos, selectBoxFiltroBuscaProduto);
    }//GEN-LAST:event_botaoBuscaProdutoActionPerformed

    private void botaoAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarProdutoActionPerformed

        if (textoNomeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do produto não informado!");
        }
        else if(textFormatPrecoProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preço do produto não informado!");
        } else {
            // salvando os dados no banco
            boolean cadasProd = controlProd.cadastraProduto(textoNomeProduto.getText(),
                    textoDescricaoProduto.getText(),
                    Integer.parseInt(textoQuantidade.getText()),
                    Integer.parseInt(textUnidade2.getText()),
                    selectBoxUnidadeProduto.getSelectedItem().toString(),
                    Double.parseDouble(textFormatPrecoProduto.getText()),
                    textoMarca.getText());

            // Mensagem apresentada ao usuário sobre a persistência dos dados
            if (!cadasProd) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados");
            } else {
                // se persistência o correu corretamente
                labelMensagemCadastro.setVisible(Boolean.TRUE);
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");

                controlProd.limpaCampos(textoNomeProduto, textoDescricaoProduto, textoQuantidade, textUnidade2, textFormatPrecoProduto, textoMarca);
            }
        }


    }//GEN-LAST:event_botaoAdicionarProdutoActionPerformed


    private void selectBoxUnidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBoxUnidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBoxUnidadeProdutoActionPerformed

    private void jCheckBoxHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxHabilitadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarProduto;
    private javax.swing.JButton botaoBuscaProduto;
    private javax.swing.JPanel botaoMenuGerenciarProduto;
    private javax.swing.JTextField campoBuscaProduto;
    private javax.swing.JPanel destaqueLogo;
    private javax.swing.JCheckBox jCheckBoxHabilitado;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelBusca;
    private javax.swing.JLabel labelCodigoProduto;
    private javax.swing.JLabel labelMensagemCadastro;
    private javax.swing.JLabel labelNomeMarca;
    private javax.swing.JLabel labelNomeProduto;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUnidade;
    private javax.swing.JLabel labeldescricaoProduto;
    private javax.swing.JLabel nomeLogo;
    private javax.swing.JPanel painelAdicionarProduto;
    private javax.swing.JPanel painelAtualizarProduto;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JScrollPane scrollViewTabelaProdutos;
    private javax.swing.JComboBox<String> selectBoxFiltroBuscaProduto;
    private javax.swing.JComboBox<String> selectBoxUnidadeProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JFormattedTextField textFormatPrecoProduto;
    private javax.swing.JTextField textUnidade2;
    private javax.swing.JTextField textoCodigoProduto;
    private javax.swing.JTextField textoDescricaoProduto;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JLabel textoMenuGerenciarProduto;
    private javax.swing.JTextField textoNomeProduto;
    private javax.swing.JTextField textoQuantidade;
    private javax.swing.JLabel textoTituloPagina;
    private javax.swing.JPanel tituloTela;
    // End of variables declaration//GEN-END:variables
}