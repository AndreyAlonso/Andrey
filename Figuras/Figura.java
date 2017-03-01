import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura{
   //protected float area;
   private int posx;
   private int posy;
   public Figura(int x, int y){
       posx = x;
       posy = y;
   }
   
   public void dibuja(Graphics g){
        
   }
   
 
   /*@Override 
   public String toString(){
       return "" + area;
   }
   
   public Figura()
   {
       area = 0;
    }
   
   public void calculaArea(){
      
       
   }
   public float accederArea(){
   
       return area;
   }
   
   public String dimeInfo(){
       return "" +area;
   }
   
   
   @Override 
   public boolean equals(Object obj){
       return this.area == ((Figura)obj).area;
   }

   */
}