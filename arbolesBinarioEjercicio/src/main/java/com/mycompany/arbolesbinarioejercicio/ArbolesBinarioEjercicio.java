/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolesbinarioejercicio;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author SCIS2-27
 */
public class ArbolesBinarioEjercicio {

    Nodo inicial;

    // Constructor correcto
    public ArbolesBinarioEjercicio() {
        this.inicial = null;
    }

    
    String[] colores = {"Amarillo", "Azul", "Rojo", "Verde", "Naranja", "Morado", "Negro", "Blanco"};
    String[] marcas = {"Adidas", "Nike", "Reebook", "Puma", "Matelsa", "Gucci"};
    String letras[] = {"a","b","c","d","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    
    public void crearProductos(){
        Random random = new Random();
        for(int x=0;x<10000;x++){
            String name = "";
            for(int i=0;i<5;i++){
                name+= letras[random.nextInt(25)];
            }
            String color = colores[random.nextInt(8)];
            String marca = marcas[random.nextInt(6)];
            int valor = random.nextInt(9901)+100;
            int ventas = random.nextInt(100);
            int dimensiones = random.nextInt(1000);
            try {
                if (this.inicial == null) {
                    this.inicial = new Nodo(valor, name, color, dimensiones, marca, ventas);
                } else {
                    this.inicial.insertar(valor, name, color, dimensiones, marca, ventas);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El dato que ingreso no es válido");
            }
        }
        JOptionPane.showMessageDialog(null, "Datos creados");
        
    }
    
    public void insertar() {
        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto que va a ingresar");
        String color = JOptionPane.showInputDialog(null, "Ingrese su color");
        int dimensiones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las dimensiones"));
        String marca = JOptionPane.showInputDialog(null, "Ingrese su marca");
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del producto"));
        int ventas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las ventas del producto"));
        try {
            if (this.inicial == null) {
                this.inicial = new Nodo(valor, name, color, dimensiones, marca, ventas);
            } else {
                this.inicial.insertar(valor, name, color, dimensiones, marca, ventas);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es válido");
        }
    }
    
    
    
    
    
    // Preorden: raíz -> izquierda -> derecha
    public String dispararPreorden() {
        return preorden(this.inicial).trim(); // Trim para evitar espacios o comas extra al final
    }

    public String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = nodo.getName()+": "+nodo.getVentas() + ", ";
            resultado += preorden(nodo.getNodoIzq());
            resultado += preorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    // Inorden: izquierda -> raíz -> derecha
    public String dispararInorden() {
        return inorden(this.inicial).trim();
    }

    public String inorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = inorden(nodo.getNodoIzq());
            resultado += nodo.getValor() + ", ";
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    public String dispararPostorden() {
        return postorden(this.inicial);
    }

    private String postorden(Nodo nodo) {
        if (nodo == null) {
            return ""; // Caso base
        } else {
            String resultado = postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            resultado += nodo.getValor() + ", ";
            return resultado;
        }
    }
}
