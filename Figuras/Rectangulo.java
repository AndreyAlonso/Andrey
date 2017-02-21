
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Figura
{
    private float base;
    private float altura;
    
    public Rectangulo(float b, float a){
        base = b;
        altura  = a;
    }
    
    public void calculaArea(){
        area = base * altura;
    }
    
    
}
