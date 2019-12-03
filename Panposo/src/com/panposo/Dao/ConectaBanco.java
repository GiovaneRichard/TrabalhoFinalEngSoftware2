/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panposo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovane Richard
 */
public class ConectaBanco {
    
    private static Connection conexao;
    private static String url = "jdbc:mysql://127.0.0.1:3306/trabengenharia2";
    private static String usuario = "root";
    private static String senha = "Admin123";
    private static String banco = "trabengenharia2";
    
    
    public static Connection getConexao(){
        
        try {
            if( conexao == null)
                setUrl("jdbc:mysql://127.0.0.1:3306/trabEngenharia2"+"?useSSL=true");
            
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(getUrl(), usuario, senha);
                
        }  catch (ClassNotFoundException | SQLException e) {
              e.printStackTrace();
        }
        
        return conexao;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConectaBanco.url = url;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ConectaBanco.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ConectaBanco.senha = senha;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        ConectaBanco.banco = banco;
    }
          
    
}
