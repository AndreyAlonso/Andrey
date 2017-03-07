import java.util.ArrayList;

public class CuentaBancaria implements Medible
{
    private int saldo;
    
    public  CuentaBancaria(int s){
        saldo = s;
    
    }   
    public int obtenerMedida(){
        
        return saldo;
    }
    
}
