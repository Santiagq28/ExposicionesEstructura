/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pilasejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-19
 */
public class Vista extends javax.swing.JFrame {
    PilasEjercicio pila = new PilasEjercicio();
    int i = 0;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarPila = new javax.swing.JButton();
        imprimirPila = new javax.swing.JButton();
        recorrerAtras = new javax.swing.JButton();
        recorrerAdelante = new javax.swing.JButton();
        elementoActual = new javax.swing.JButton();
        textoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarPila.setText("Agregar a la Pila");
        agregarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPilaActionPerformed(evt);
            }
        });

        imprimirPila.setText("Imprimir Pila");
        imprimirPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirPilaActionPerformed(evt);
            }
        });

        recorrerAtras.setText("Atrás");
        recorrerAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerAtrasActionPerformed(evt);
            }
        });

        recorrerAdelante.setText("Adelante");
        recorrerAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerAdelanteActionPerformed(evt);
            }
        });

        elementoActual.setText("ElementoActual");
        elementoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoActualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(imprimirPila))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(textoPantalla))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(agregarPila)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(recorrerAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(elementoActual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(recorrerAdelante)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(agregarPila)
                .addGap(18, 18, 18)
                .addComponent(imprimirPila)
                .addGap(18, 18, 18)
                .addComponent(textoPantalla)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recorrerAtras)
                    .addComponent(elementoActual)
                    .addComponent(recorrerAdelante))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recorrerAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerAdelanteActionPerformed
        i = pila.recorrerAdelante(i);
        textoPantalla.setText(pila.recorrerPila(i));
    }//GEN-LAST:event_recorrerAdelanteActionPerformed

    private void recorrerAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerAtrasActionPerformed
        i = pila.recorrerAtras(i);
        textoPantalla.setText(pila.recorrerPila(i));
    }//GEN-LAST:event_recorrerAtrasActionPerformed

    private void agregarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPilaActionPerformed
        pila.agregarPaginas(JOptionPane.showInputDialog("Inserte la Página: "));
    }//GEN-LAST:event_agregarPilaActionPerformed

    private void imprimirPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirPilaActionPerformed
        pila.imprimir();
    }//GEN-LAST:event_imprimirPilaActionPerformed

    private void elementoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoActualActionPerformed
        textoPantalla.setText(pila.recorrerPila(i));
    }//GEN-LAST:event_elementoActualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPila;
    private javax.swing.JButton elementoActual;
    private javax.swing.JButton imprimirPila;
    private javax.swing.JButton recorrerAdelante;
    private javax.swing.JButton recorrerAtras;
    private javax.swing.JLabel textoPantalla;
    // End of variables declaration//GEN-END:variables
}
