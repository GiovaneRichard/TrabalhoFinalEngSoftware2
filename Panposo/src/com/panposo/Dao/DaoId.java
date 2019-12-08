/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Giovane Richard
 */
public class DaoId {

    /**
     * Recupera o código do último registro inserido, segundo o tipo de banco de
     * dados que está sendo utilizado.
     *
     * @return Código do último registro inserido.
     */
    public static int getUltimoId() {
        int ultimoId = 0;

        try {
            Connection con = ConectaBanco.getConexao();
            PreparedStatement pstmt;

            switch (ConectaBanco.getBanco()) {
//                case ConectaBanco.POSTGRESQL:
//                    pstmt = con.prepareStatement("select lastval();");
//                    break;
//
//                case ConectaBanco.SQLSERVEREXPRESS:
//                    pstmt = con.prepareStatement("select scope_identity();");
//                    break;

                // case ConectaBanco.MYSQL:
                default:
                    pstmt = con.prepareStatement("select last_insert_id();");
                    break;
            }

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }

            // Introduzia falhas em múltiplas operações consecutivas no banco de dados
//            con.close();
            pstmt.close();

        } catch (Exception ex) {
            System.out.println("Exception");
        }

        return ultimoId;
    }

}
