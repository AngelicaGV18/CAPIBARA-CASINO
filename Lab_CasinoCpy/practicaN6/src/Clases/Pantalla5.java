//paquete
package Clases;

//librerias
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;



public class Pantalla5 extends Thread{
  
    private int tiempo;
   
    public Pantalla5(int miliseg){
    this.tiempo = miliseg;
     }
    
    public void run(){
    while(true){
    
        int numero = (int) (Math.random() * (6) + 1);
        String ruta = "src\\Imagenes\\" + numero +".jpg";
        ImageIcon imageIcon = new ImageIcon(ruta);
        Vistas.Tragamonedas.lblPantalla5.setIcon(imageIcon); 
        try{
            Thread.sleep(this.tiempo);    
        } catch (InterruptedException ex){
            Logger.getLogger(Pantalla3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }
    
    } 
    
}
