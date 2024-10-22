/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilasejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-19
 */
public class PilasEjercicio {
    Pila<String> pila = new Pila<>();
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public void agregarPaginas(String pag){
        pila.push(pag);
        JOptionPane.showMessageDialog(null, "Pagina agregada");
    }
    
    public int recorrerAdelante(int i){
        if((i+1) < pila.size()){
            i++;
        }else{
            JOptionPane.showMessageDialog(null,"No hay elementos adelante");
        }
        
        return i;
    }
    
    public int recorrerAtras(int i){
        if(i!=0){
            i--;
        }else{
            JOptionPane.showMessageDialog(null,"No hay elementos atrás");
        }
        
        return i;
    }
    
    public void imprimir(){
        pila.imprimir();
    }
    public String recorrerPila(int i){
        String text = pila.recorrerPila(i);
        return text;
    }
    public String actual(){
        return pila.peek();
    }
}
