
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
 
    
    public Circulo(float r)
    {
        radio = r;
    }
    
    public void calculaArea(){
        area = (float)PI * (radio * radio);
    }
    
  
}
