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

    String[] nombres = {"Pantalla","Teclado", "Mouse", "LuzLed", "Ventilador", "Soporte", "Cargador", "CPU", "Tarjeta Gráfica", "Celular", "Tablet", "Computador","Reloj"};
    String[] colores = {"Amarillo", "Azul", "Rojo", "Verde", "Naranja", "Morado", "Negro", "Blanco"};
    String[] marcas = {"Apple", "HP", "Samsung", "Microsoft", "Intel", "Lenovo"};
    String letras[] = {"a","b","c","d","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int contador;
    
    public void crearProductos(){
        Random random = new Random();
        for(int x=0;x<1000;x++){
            String name = nombres[random.nextInt(13)];
            String codigo = "";
            for(int i=0;i<5;i++){
                codigo+= letras[random.nextInt(25)];
            }
            for(int i=0;i<3;i++){
                codigo+= random.nextInt(10);
            }
            String color = colores[random.nextInt(8)];
            String marca = marcas[random.nextInt(6)];
            int valor = random.nextInt(9901)+1000;
            int ventas = random.nextInt(100);
            int dimensiones = random.nextInt(1000);
            try {
                if (this.inicial == null) {
                    this.inicial = new Nodo(codigo,valor, name, color, dimensiones, marca, ventas);
                } else {
                    this.inicial.insertar(codigo,valor, name, color, dimensiones, marca, ventas);
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
        String codigo = JOptionPane.showInputDialog(null,"Ingrese el código del producto (5 letras y 3 numeros)");
        try {
            if (this.inicial == null) {
                this.inicial = new Nodo(codigo,valor, name, color, dimensiones, marca, ventas);
            } else {
                this.inicial.insertar(codigo,valor, name, color, dimensiones, marca, ventas);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es válido");
        }
    }
    
    
    
    
    
    // Preorden: raíz -> izquierda -> derecha
    public String dispararPreorden() {
        return preorden(this.inicial,0).trim(); // Trim para evitar espacios o comas extra al final
    }

    public String preorden(Nodo nodo, int i) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = "";
            if(i==10){
                resultado = nodo.getName()+": "+nodo.getVentas() + "\n";
                i=0;
                resultado += preorden(nodo.getNodoIzq(),i);
                resultado += preorden(nodo.getNodoDerecho(),i);
            }else{
                resultado = nodo.getName()+": "+nodo.getVentas() + ",";
                i++;
                resultado += preorden(nodo.getNodoIzq(),i);
                resultado += preorden(nodo.getNodoDerecho(),i);
            }
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
        contador = 0;
        return postorden(this.inicial);
    }

    private String postorden(Nodo nodo) {
        if (nodo == null || contador >= 50) {
            return ""; // Caso base
        } else {
            String resultado = "";

            resultado += postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            contador++;
            if (((contador + 1) % 10) == 0) {
                resultado += nodo.getName() + "("+nodo.getCodigo()+"): " + nodo.getVentas() + "\n";
            } else {
                resultado += nodo.getName() + "("+nodo.getCodigo()+"): " + nodo.getVentas() + ", ";
            }
            
            return resultado;
        }
    }
}
