//paquete
package Vistas_dados;

//librerias
import Final_Vista.Casinoi;
import Clases_dados.ImagenDados1;
import Clases_dados.ImagenDados2;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dados extends javax.swing.JFrame {

    ImagenDados1 p1;
    ImagenDados2 p2;
   
         
    boolean respuesta1 = false;
    boolean respuesta2 = false;
    
    
    public Dados() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPant1 = new javax.swing.JLabel();
        lblPant2 = new javax.swing.JLabel();
        Btn_Inicio = new javax.swing.JButton();
        Btn_detener = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Inicio.setBackground(new java.awt.Color(255, 204, 255));
        Btn_Inicio.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        Btn_Inicio.setText("Iniciar");
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });

        Btn_detener.setBackground(new java.awt.Color(255, 204, 255));
        Btn_detener.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        Btn_detener.setText("Detener");
        Btn_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_detenerActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jButton1.setText("Volver ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Btn_detener, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPant1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPant2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPant1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPant2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(Btn_detener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_detenerActionPerformed
        p1.stop();
        p2.stop();
        
        
        respuesta1 = true;
        respuesta2 = true;  
        
        comprobarResultado();
    }//GEN-LAST:event_Btn_detenerActionPerformed

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
        int tiempoMilisegundos = 100;
        
        p1 = new ImagenDados1(tiempoMilisegundos);
        p2 = new ImagenDados2(tiempoMilisegundos);
      
        
        respuesta1 =false;
        respuesta2 =false;
        
        
        Btn_Inicio.setEnabled(false);
        p1.start();
        p2.start();
       
        
        
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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JButton Btn_detener;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel lblPant1;
    public static javax.swing.JLabel lblPant2;
    // End of variables declaration//GEN-END:variables

private void comprobarResultado(){
if(respuesta1 && respuesta2 ){
try{
Thread.sleep(100);
}catch (InterruptedException ex){
Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
}
Btn_Inicio.setEnabled(true);
if(lblPant1.getIcon().toString().equals(lblPant2.getIcon().toString())){
    JOptionPane.showMessageDialog(null,"FELICITACION CACHON LO DOBLETIASTES");
}else{
    JOptionPane.showMessageDialog(null,"PERDIO, JUEGUE DE NUEVO CACHON ");
}
}



}



}
