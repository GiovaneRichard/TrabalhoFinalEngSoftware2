/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.Dao;


import com.panposo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Representa a persistência dos produtos.
 * 
 * @author Giovane Richard
 * @version 1.0, 02 de Dezembro de 2019
 * @since 0.1
 * @see ProdutoDao
 * 
 */

public class ProdutoDao implements DaoInterface<Produto>{

    @Override
    public Integer salvar(Produto o) {
       
        int idResposta =0;
        
        try {
            Connection con = ConectaBanco.getConexao();
            PreparedStatement pstmt;
            
            pstmt = con.prepareStatement("INSERT INTO produto " 
                    + "(nome, descricao, preco, unidade, qtd_estoque, nomeMarca, valorUnidade) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?);");
            
            pstmt.setString(1, o.getNome());
            pstmt.setString(2, o.getDescricao());
            pstmt.setDouble(3, o.getPreco());
            pstmt.setString(4, o.getUnidade());
            pstmt.setInt(5, o.getQtd_estoque());
            pstmt.setString(6, o.getNomeMarca());
            pstmt.setInt(7, o.getValorUnidade());
           
            
            //idResposta = dao.getUltimoId();
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            return idResposta;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados");
            ex.printStackTrace();
            return idResposta;
        }
    }

    @Override
    public List<Produto> buscar(Produto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editar(Produto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
