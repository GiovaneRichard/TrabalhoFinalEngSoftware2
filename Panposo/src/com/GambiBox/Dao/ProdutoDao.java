/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.Dao;

import com.GambiBox.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.GambiBox.Dao.DaoId;

/**
 * Representa a persistência dos produtos.
 *
 * @author Giovane Richard
 * @version 1.0, 02 de Dezembro de 2019
 * @since 0.1
 * @see ProdutoDao
 *
 */
public class ProdutoDao implements DaoInterface<Produto> {

    @Override
    public Integer salvar(Produto o) {

        int idResposta = 0;

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

            return idResposta;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return idResposta;
        }
    }

    
    public List<Produto> buscaProduto(Integer codProduto, String nome, String descricao) {
        
        Integer limite = 30;
        Connection con = ConectaBanco.getConexao();
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        ArrayList<Produto> todosProdutos = new ArrayList<Produto>();

        try {
            if(codProduto != null){
                pstmt = con.prepareStatement("SELECT * FROM Produto " + "WHERE codProduto = ?;");
                pstmt.setInt(1, codProduto);
            }
            if(nome != null){
                
                pstmt = con.prepareStatement("SELECT * FROM Produto " + "WHERE nome like ? " + "limit ?;");
                pstmt.setString(1, nome + "%");
                pstmt.setInt(2, limite);
            }
            if(descricao != null){
                pstmt = con.prepareStatement("SELECT * FROM Produto " + "WHERE descricao like ? " + "limit ?;");
                pstmt.setString(1,"%" + descricao + "%");
                pstmt.setInt(2, limite);
            }
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Produto prod = new Produto();
                
                prod.setCodProduto(rs.getInt("codProduto"));
                prod.setNome(rs.getString("nome"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setUnidade(rs.getString("unidade"));
                prod.setQtd_estoque(rs.getInt("qtd_estoque"));
                prod.setNomeMarca(rs.getString("nomeMarca"));
                prod.setValorUnidade(rs.getInt("valorUnidade"));
                
                todosProdutos.add(prod);
            }
            rs.close();
            pstmt.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }

        //if (todosProdutos.isEmpty()) {
        //    return null;
        //} else {
            return todosProdutos;
        //}
    }
    
    
    /**
     * Recupera conjunto de objetos segundo objeto exemplo passado.
     *
     * @param o Exemplo de Produto a ser buscada (id).
     * @return Lista de objetos recuperados do banco de dados.
     */
    @Override
    public List<Produto> buscar(Produto o) {

        Connection con = ConectaBanco.getConexao();
        PreparedStatement pstmt = null;

        try {
            pstmt = con.prepareStatement("select * from produto");

            if (o.getCodProduto() == null) {
                o.setCodProduto(0);
            }

            pstmt.setInt(1, o.getCodProduto());
            pstmt.setString(2, o.getNome());
            pstmt.setString(3, o.getDescricao());
            pstmt.setDouble(4, o.getPreco());
            pstmt.setString(5, o.getUnidade());
            pstmt.setInt(6, o.getQtd_estoque());
            pstmt.setString(7, o.getNomeMarca());
            pstmt.setInt(8, o.getValorUnidade());

        } catch (SQLException sqlex) {
            System.out.println("Erro ao tentar buscar no banco!\n" + sqlex);
        }

        return realizarConsulta(pstmt);
    }

    /**
     * Busca PorNomeInicial
     *
     * @param o
     * @return
     */
    public ArrayList<Produto> buscar(Produto o, int limite) {

        Connection con = ConectaBanco.getConexao();
        PreparedStatement pstmt = null;

        try {
            if (o == null) {
                if (limite == 0) {
                    pstmt = con.prepareStatement("SELECT * FROM Produto;");
                } else {
                    pstmt = con.prepareStatement("SELECT * FROM Produto limit ?;");
                    pstmt.setInt(1, limite);
                }
            } else {
                if (limite == 0) {
                    pstmt = con.prepareStatement("SELECT * FROM Produto " + "WHERE nome like ?;");
                } else {
                    pstmt = con.prepareStatement("SELECT * FROM Produto " + "WHERE nome like ? " + "limit ?;");
                    pstmt.setInt(2, limite);
                }
                pstmt.setString(1, o.getNome() + "%");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return realizarConsulta(pstmt);
    }

    
    
    @Override
    public int editar(Produto o) {
        
        int codResposta = 0;
        Connection con = ConectaBanco.getConexao();
        PreparedStatement pstmt = null;

        try {

            pstmt = con.prepareStatement("UPDATE produto SET nome = ?, descricao = ?,preco = ?,unidade = ?,qtd_estoque = ?,nomeMarca = ?,valorUnidade = ? where codProduto = ?;");
            
            //pstmt.setInt(8, o.getCodProduto());
            
            pstmt.setString(1, o.getNome());
            pstmt.setString(2, o.getDescricao());
            pstmt.setDouble(3, o.getPreco());
            pstmt.setString(4, o.getUnidade());
            pstmt.setInt(5, o.getQtd_estoque());
            pstmt.setString(6, o.getNomeMarca());
            pstmt.setInt(7, o.getValorUnidade());
            pstmt.setInt(8, o.getCodProduto());
            
            pstmt.execute();
            codResposta = (o.getCodProduto() == 0)? DaoId.getUltimoId(): o.getCodProduto();
            
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
            
            return codResposta;
        }
        return codResposta;
    }

    /**
     * Realiza a efetiva consulta no banco de dados.
     *
     * @param pstmt Consulta preparada
     * @return Clietes localizada
     */
    private ArrayList<Produto> realizarConsulta(PreparedStatement pstmt) {
        ArrayList<Produto> listaProd = new ArrayList<Produto>();

        try {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                Produto prod = new Produto();
                /*
                listaProd.add(new Produto(
                        rs.getInt("codProduto"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getDouble("preco"),
                        rs.getString("unidade"),
                        rs.getInt("qtd_estoque"),
                        rs.getString("nomeMarca"),
                        rs.getInt("valorUnidade")
                ));*/
                prod.setCodProduto(rs.getInt("codProduto"));
                prod.setNome(rs.getString("nome"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setUnidade(rs.getString("unidade"));
                prod.setQtd_estoque(rs.getInt("qtd_estoque"));
                prod.setNomeMarca(rs.getString("nomeMarca"));
                prod.setValorUnidade(rs.getInt("valorUnidade"));

                listaProd.add(prod);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no ResultSet!");
        }

        if (listaProd.isEmpty()) {
            return null;
        } else {
            return listaProd;
        }
    } 
    

}