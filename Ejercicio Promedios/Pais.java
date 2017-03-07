import java.util.ArrayList;
public class Pais implements Medible{
    private int habitantes;
    
 
    
    public Pais(int h){
        habitantes = h;
    }
    public int obtenerMedida()
    {
        return habitantes;
    }
}