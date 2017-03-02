import java.util.ArrayList;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    ArrayList<CuentaBancaria> Cuenta;

    public Banco(){
        Cuenta = new ArrayList<CuentaBancaria>();
    }
     
    public void nuevaCuenta(CuentaBancaria C){
        Cuenta.add(C);
        
    }
    
    

    public float calculaSaldoPromedio(){
        float prom;
        
        int tam = Cuenta.size();
        
        for(CuentaBancaria F: Cuenta)
        {
             prom += Cuenta.saldo();
        }
        prom = prom/tam;
        return prom;
    }
}
