import javax.swing.JFrame;
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
   {private Lienzo lienzo;
    
    public Ventana(int ancho, int alto){
        super.setSize(ancho, alto);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Cierra la ventana 
        lienzo = new Lienzo();
        super.add(lienzo);
        
    }
    }
