//paquete
package Clases_dados;

//librerias
import Clases.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;



public class ImagenDados2 extends Thread{
  
    private int tiempo;
   
    public ImagenDados2(int miliseg){
    this.tiempo = miliseg;
     }
    
    public void run(){
    while(true){
    
        int numero = (int) (Math.random() * (6) + 1);
        String ruta = "src\\Imagenes_dados\\" + numero +".jpg";
        ImageIcon imageIcon = new ImageIcon(ruta);
        Vistas_dados.Dados.lblPant2.setIcon(imageIcon); 
        try{
            Thread.sleep(this.tiempo);    
        } catch (InterruptedException ex){
            Logger.getLogger(ImagenDados2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }
    
    } 
    
}
