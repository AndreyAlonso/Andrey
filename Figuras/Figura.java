
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
   public float area;
   
   @Override 
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
}