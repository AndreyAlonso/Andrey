import java.util.ArrayList;
public class Planeta{
    private ArrayList<Pais> Pais;
    
    public Planeta(){
        Pais = new ArrayList<Pais>();
    }
    
    public void agregarPais(Pais P){
        Pais.add(P);
    }
    
    public float promedio(){
        float prom = 0;
        int tam = Pais.size();
        
        for(Pais F: Pais)
        {
            prom = prom + F.obtenerMedida();
        }
        prom = prom/tam;
        return prom;
    }
}