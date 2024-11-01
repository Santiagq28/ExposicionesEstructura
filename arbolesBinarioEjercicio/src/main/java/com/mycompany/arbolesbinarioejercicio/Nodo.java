/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesbinarioejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class Nodo {

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ventas
     */
    public int getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the dimensiones
     */
    public int getDimensiones() {
        return dimensiones;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String codigo;
    private int valor;
    private Nodo nodoIzq;
    private Nodo nodoDerecho;
    private String name;
    private String color;
    private int dimensiones;
    private String marca;
    private int ventas;
    

    public Nodo(String codigo,int valor, String name, String color, int dimensiones, String marca, int ventas) {
        this.codigo = codigo;
        this.valor = valor;
        this.name = name;
        this.color = color;
        this.dimensiones = dimensiones;
        this.marca = marca;
        this.ventas = ventas;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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

    //Funcion para agregar un nodo a la derecha si es mayor y a la izquierda si es menor
    public void insertar(String _codigo,int _valor, String _name, String _color, int _dimensiones, String _marca, int _ventas) {
        //if para comprobar que el valor no se repita
        if (_codigo.equals(this.codigo)) {
            JOptionPane.showMessageDialog(null, "Ese producto ya esta en el arbol");
            return;
        }

        if (_ventas > this.ventas) {
            //Insertar en lado izquierdo
            if (this.nodoIzq == null) {
                this.nodoIzq = new Nodo(_codigo,_valor, _name, _color, _dimensiones, _marca, _ventas);
            } else {
                this.nodoIzq.insertar(_codigo,_valor, _name, _color, _dimensiones, _marca, _ventas);
            }
        } else {
            //Insertar en lado derecho
            if (this.nodoDerecho == null) {
                this.nodoDerecho = new Nodo(_codigo,_valor, _name, _color, _dimensiones, _marca, _ventas);
            } else {
                this.nodoDerecho.insertar(_codigo,_valor, _name, _color, _dimensiones, _marca, _ventas);
            }
        }
    }
}
