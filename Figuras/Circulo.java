
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    private double PI = 3.1416;
    
    public Circulo(int posx,int posy, float r){
        x = posx;
        y = posy;
        radio = r;
    }
 
    /*
    public Circulo(float r)
    {
        radio = r;
    }
    
    public void calculaArea(){
        area = (float)PI * (radio * radio);
    }
    
    public String dimeInfo(){
        return "circulo" +super.dimeInfo();
    }
    
    
    @Override
    public boolean equals(Object obj)
    {
           if(obj instanceof Circulo)
           {
               return this.radio == ((Circulo)obj).radio;
           }
           else
                return false;
    }
    */
}
