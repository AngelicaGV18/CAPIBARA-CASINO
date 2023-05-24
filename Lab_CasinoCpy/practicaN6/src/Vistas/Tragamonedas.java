//paquete
package Vistas;

//librerias

import Final_Vista.Casinoi;
import Clases.Pantalla1;
import Clases.Pantalla2;
import Clases.Pantalla3;
import Clases.Pantalla4;
import Clases.Pantalla5;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tragamonedas extends javax.swing.JFrame {

    Pantalla1 p1;
    Pantalla2 p2;
    Pantalla3 p3;
    Pantalla4 p4;
    Pantalla5 p5;
    
         
    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;
    boolean respuesta4 = false;
    boolean respuesta5 = false;
    
    
    
    public Tragamonedas() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPantalla1 = new javax.swing.JLabel();
        lblPantalla2 = new javax.swing.JLabel();
        lblPantalla3 = new javax.swing.JLabel();
        Btn_Inicio = new javax.swing.JButton();
        Btn_detener = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPantalla4 = new javax.swing.JLabel();
        lblPantalla5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        lblPantalla1.setText("UNO");

        lblPantalla2.setText("DOS");

        lblPantalla3.setText("TRES");

        Btn_Inicio.setBackground(new java.awt.Color(204, 255, 255));
        Btn_Inicio.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        Btn_Inicio.setText("Iniciar");
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });

        Btn_detener.setBackground(new java.awt.Color(204, 255, 255));
        Btn_detener.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        Btn_detener.setText("Detener");
        Btn_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_detenerActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPantalla4.setText("CUATRO");

        lblPantalla5.setText("CINCO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Bar.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_detener, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPantalla3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPantalla4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPantalla5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Btn_detener, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(lblPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPantalla3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPantalla4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPantalla5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_detenerActionPerformed
        p1.stop();
        p2.stop();
        p3.stop();
        p4.stop();
        p5.stop();
        
        
        
        respuesta1 = true;
        respuesta2 = true;  
        respuesta3 = true;
        respuesta4 = true;
        respuesta5 = true;
        
        
        comprobarResultado();
    }//GEN-LAST:event_Btn_detenerActionPerformed

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
        int tiempoMilisegundos = 100;
        
        p1 = new Pantalla1(tiempoMilisegundos);
        p2 = new Pantalla2(tiempoMilisegundos);
        p3 = new Pantalla3(tiempoMilisegundos);
        p4 = new Pantalla4(tiempoMilisegundos);
        p5 = new Pantalla5(tiempoMilisegundos);
        
        
        respuesta1 =false;
        respuesta2 =false;
        respuesta3 =false;
        respuesta4 =false;
        respuesta5 =false;
        
        Btn_Inicio.setEnabled(false);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        
        
        
    }//GEN-LAST:event_Btn_InicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Casinoi newframe = new Casinoi();
     newframe.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_detener;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblPantalla1;
    public static javax.swing.JLabel lblPantalla2;
    public static javax.swing.JLabel lblPantalla3;
    public static javax.swing.JLabel lblPantalla4;
    public static javax.swing.JLabel lblPantalla5;
    // End of variables declaration//GEN-END:variables

private void comprobarResultado(){
        if(respuesta1 && respuesta2 && respuesta3){
            try{
                Thread.sleep(200);
        }catch (InterruptedException ex){
            Logger.getLogger(Tragamonedas.class.getName()).log(Level.SEVERE, null, ex);
                }
                Btn_Inicio.setEnabled(true);
            if(lblPantalla1.getIcon().toString().equals(lblPantalla2.getIcon().toString()) && lblPantalla1.getIcon().toString().equals(lblPantalla5.getIcon().toString())){
                JOptionPane.showMessageDialog(null,"FELICIDADES CACHON GANASTES");
            }else{
                JOptionPane.showMessageDialog(null,"LLORALO PERDISTES MI LOCO");
                 }
            }
        }
}
