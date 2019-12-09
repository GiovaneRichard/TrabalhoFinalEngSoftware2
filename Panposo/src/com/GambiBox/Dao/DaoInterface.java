/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GambiBox.Dao;

import java.util.List;

/**
 *
 * @author Giovane Richard
 * @param <T>
 */
public interface DaoInterface<T> {
    
    public Integer salvar(T o);
    public List<T> buscar(T o);
    public int editar(T o);
   // public int excluir(T o);
    
}
