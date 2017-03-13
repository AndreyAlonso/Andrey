
public class Alumno implements Comparable
{
    private int creditos;
    
    public Alumno(int c)
    {
        creditos = c;
    }
    
    @Override
    public String toString()    
    {
        return "Alumno con " + creditos + " creditos";
    }
    
    @Override
    public int compareTo(Object other)
    {
        Alumno tmp = (Alumno)other;
        if (this.creditos == tmp.creditos)
            return 0;
        else if (this.creditos < tmp.creditos)
            return -1;
        else 
            return 1;
            
        // version economica 
        // return creditos - ((Alumno)other).creditos
    }
}
