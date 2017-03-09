import javax.swing.JFrame;
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho,alto);
        dibujo = new Lienzo();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
