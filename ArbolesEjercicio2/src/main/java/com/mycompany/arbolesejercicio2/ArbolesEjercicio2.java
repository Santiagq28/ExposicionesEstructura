/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolesejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class ArbolesEjercicio2 {

    Nodo inicial;

    public ArbolesEjercicio2() {
        this.inicial = null;
    }
    
    
    public void insertar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        
        int edad = 0;
        try{
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sólo números");
            return;
        }
        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo Masculino(m) Femenino(f)");
        if(sexo.equals("m")||sexo.equals("f")){
            try {
                if (this.inicial == null) {
                    this.inicial = new Nodo(nombre,edad,sexo);
                } else {
                    this.inicial.insertar(nombre,edad,sexo);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El dato que ingresó no es válido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Solo puede ingresar (m) o (f)");
            return;
        }
        
        
    }
    
    public String dispararPreorden() {
        return preorden(this.inicial).trim();
    }

    public String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = "";
            
            if(nodo.getEdad()<=17){
                resultado = nodo.getNombre()+": "+nodo.getEdad() + ",";
            }else{
                resultado = nodo.getNombre()+": "+nodo.getEdad() + ",";
            }
            resultado += preorden(nodo.getNodoIzq());
            
            resultado += preorden(nodo.getNodoDerecho());
            resultado += "\n";
            return (resultado);
        }
    }
    
}
