import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Figura
{
    private float horizontal;
    private float vertical;
    
    public Rombo(float hori, float verti){
        super(x,y);
        horizontal = hori;
        vertical = verti;
    }
    @Override
    public void dibuja(Graphics g);
}
