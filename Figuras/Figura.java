
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
   
   protected int dameX(){
       return posx;
    }
   protected int dameY(){
       return posy;
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