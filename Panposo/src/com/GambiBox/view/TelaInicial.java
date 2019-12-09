/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.view;

import com.GambiBox.controller.ControllerProduto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author geova
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    // Instanciando de controllerProto
    ControllerProduto controlProd = new ControllerProduto();
    
    public TelaInicial() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoTelaInicial = new javax.swing.JPanel();
        fundoBarraTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        destaqueTitulo = new javax.swing.JPanel();
        labelTelaInicial = new javax.swing.JLabel();
        cardGerenciarProduto = new javax.swing.JPanel();
        labelIconeGerenciarProduto = new javax.swing.JLabel();
        destaqueCardGerenciarProduto = new javax.swing.JPanel();
        labelGerenciarProduto = new javax.swing.JLabel();
        divisaoTop = new javax.swing.JPanel();
        divisaoFundo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        fundoTelaInicial.setBackground(new java.awt.Color(255, 255, 255));
        fundoTelaInicial.setMinimumSize(new java.awt.Dimension(800, 600));
        fundoTelaInicial.setPreferredSize(new java.awt.Dimension(800, 600));

        fundoBarraTitulo.setBackground(new java.awt.Color(23, 35, 51));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(204, 204, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("GambiBox");

        destaqueTitulo.setPreferredSize(new java.awt.Dimension(294, 4));

        javax.swing.GroupLayout destaqueTituloLayout = new javax.swing.GroupLayout(destaqueTitulo);
        destaqueTitulo.setLayout(destaqueTituloLayout);
        destaqueTituloLayout.setHorizontalGroup(
            destaqueTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        destaqueTituloLayout.setVerticalGroup(
            destaqueTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoBarraTituloLayout = new javax.swing.GroupLayout(fundoBarraTitulo);
        fundoBarraTitulo.setLayout(fundoBarraTituloLayout);
        fundoBarraTituloLayout.setHorizontalGroup(
            fundoBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoBarraTituloLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(fundoBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destaqueTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        fundoBarraTituloLayout.setVerticalGroup(
            fundoBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoBarraTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destaqueTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        labelTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTelaInicial.setForeground(new java.awt.Color(23, 35, 51));
        labelTelaInicial.setText("Tela inicial");

        cardGerenciarProduto.setBackground(new java.awt.Color(255, 255, 255));
        cardGerenciarProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));

        labelIconeGerenciarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconeGerenciarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/panposo/view/imagens/package.png"))); // NOI18N
        labelIconeGerenciarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelIconeGerenciarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIconeGerenciarProdutoMouseClicked(evt);
            }
        });

        destaqueCardGerenciarProduto.setBackground(new java.awt.Color(23, 35, 51));

        labelGerenciarProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGerenciarProduto.setForeground(new java.awt.Color(204, 204, 255));
        labelGerenciarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGerenciarProduto.setText("Gerenciar Produto");
        labelGerenciarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGerenciarProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout destaqueCardGerenciarProdutoLayout = new javax.swing.GroupLayout(destaqueCardGerenciarProduto);
        destaqueCardGerenciarProduto.setLayout(destaqueCardGerenciarProdutoLayout);
        destaqueCardGerenciarProdutoLayout.setHorizontalGroup(
            destaqueCardGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        destaqueCardGerenciarProdutoLayout.setVerticalGroup(
            destaqueCardGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cardGerenciarProdutoLayout = new javax.swing.GroupLayout(cardGerenciarProduto);
        cardGerenciarProduto.setLayout(cardGerenciarProdutoLayout);
        cardGerenciarProdutoLayout.setHorizontalGroup(
            cardGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGerenciarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIconeGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(destaqueCardGerenciarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cardGerenciarProdutoLayout.setVerticalGroup(
            cardGerenciarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGerenciarProdutoLayout.createSequentialGroup()
                .addComponent(labelIconeGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destaqueCardGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        divisaoTop.setBackground(new java.awt.Color(23, 35, 51));
        divisaoTop.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout divisaoTopLayout = new javax.swing.GroupLayout(divisaoTop);
        divisaoTop.setLayout(divisaoTopLayout);
        divisaoTopLayout.setHorizontalGroup(
            divisaoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        divisaoTopLayout.setVerticalGroup(
            divisaoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        divisaoFundo.setBackground(new java.awt.Color(23, 35, 51));
        divisaoFundo.setMinimumSize(new java.awt.Dimension(800, 600));
        divisaoFundo.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout divisaoFundoLayout = new javax.swing.GroupLayout(divisaoFundo);
        divisaoFundo.setLayout(divisaoFundoLayout);
        divisaoFundoLayout.setHorizontalGroup(
            divisaoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        divisaoFundoLayout.setVerticalGroup(
            divisaoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoTelaInicialLayout = new javax.swing.GroupLayout(fundoTelaInicial);
        fundoTelaInicial.setLayout(fundoTelaInicialLayout);
        fundoTelaInicialLayout.setHorizontalGroup(
            fundoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundoBarraTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cardGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                        .addComponent(labelTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisaoTop, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                    .addComponent(divisaoFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addContainerGap())
        );
        fundoTelaInicialLayout.setVerticalGroup(
            fundoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                .addComponent(fundoBarraTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fundoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(fundoTelaInicialLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(divisaoTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(cardGerenciarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(divisaoFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelGerenciarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGerenciarProdutoMouseClicked

        new TelaGerenciarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelGerenciarProdutoMouseClicked

    private void labelIconeGerenciarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIconeGerenciarProdutoMouseClicked
        // criação da Tela Gerenciar Produto
        controlProd.newProduto();
        dispose();
    }//GEN-LAST:event_labelIconeGerenciarProdutoMouseClicked

    private void setColor(JPanel panel)
    {
        panel.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(23,35,51));
    }
    
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardGerenciarProduto;
    private javax.swing.JPanel destaqueCardGerenciarProduto;
    private javax.swing.JPanel destaqueTitulo;
    private javax.swing.JPanel divisaoFundo;
    private javax.swing.JPanel divisaoTop;
    private javax.swing.JPanel fundoBarraTitulo;
    private javax.swing.JPanel fundoTelaInicial;
    private javax.swing.JLabel labelGerenciarProduto;
    private javax.swing.JLabel labelIconeGerenciarProduto;
    private javax.swing.JLabel labelTelaInicial;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}