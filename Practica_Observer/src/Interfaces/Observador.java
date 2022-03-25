/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jorge malaver
 */
public interface Observador {
 
    public void actualizador(String Tipo , String sitio);//tipo de accion que realiza
    // sitio donde realiza esa accion
    // se ejecuta en cada observador para saber que el sujeto realizo una accion
}
