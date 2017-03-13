import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int incx;
    private int incy;
    
    public Pelota(int x, int y, int r)  
    {
        posx = x;
        posy = y;
        radio = r;
        int aleatorio = (int)(Math.random()*2)-1;
        if(aleatorio == 0){
            aleatorio = -1;
        }
        incx = aleatorio;
        incy = aleatorio;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        posx += incx;
        posy += incy;
        if (posx > r.getWidth()-radio*2 || posx < radio*2)    {
            incx = -incx;
        }
        if (posy > r.getHeight()-radio*2 || posy < radio*2) {
            incy = -incy;
        }
    }
}
