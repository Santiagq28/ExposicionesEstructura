/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class Nodo {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private String nombre;
    private int edad;
    private String sexo;
    private Nodo nodoIzq;
    private Nodo nodoDerecho;

    public Nodo(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }
    public void insertar(String _nombre, int _edad, String _sexo) {
        
        if (_edad <= 17) {
            //Insertar en lado izquierdo
            if (this.nodoIzq == null) {
                this.nodoIzq = new Nodo(_nombre,_edad, _sexo);
            } else {
                this.nodoIzq.insertar(_nombre,_edad, _sexo);
            }
        } else {
            //Insertar en lado derecho
            if (this.nodoDerecho == null) {
                this.nodoDerecho = new Nodo(_nombre,_edad, _sexo);
            } else {
                this.nodoDerecho.insertar(_nombre,_edad, _sexo);
            }
        }
    }
}
