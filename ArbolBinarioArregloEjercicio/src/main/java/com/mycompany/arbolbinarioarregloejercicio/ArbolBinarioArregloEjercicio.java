/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinarioarregloejercicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class ArbolBinarioArregloEjercicio {

    Nodo raiz;

     
    public ArbolBinarioArregloEjercicio() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    public void recorrerInOrden() {
        ArrayList<Integer> arrPrint = new ArrayList();
        recorrerInOrdenRecursivo(raiz, arrPrint);
        JOptionPane.showMessageDialog(null, arrPrint.toString());
    }

    private void recorrerInOrdenRecursivo(Nodo nodo, ArrayList<Integer> arrPrint) {
        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.izquierdo, arrPrint);
            arrPrint.add(nodo.valor);
            recorrerInOrdenRecursivo(nodo.derecho, arrPrint);
        }
    }
}
