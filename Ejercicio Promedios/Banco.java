import java.util.ArrayList;


public class Banco
{
    private ArrayList<CuentaBancaria> Cuenta;

    public Banco(){
        Cuenta = new ArrayList<CuentaBancaria>();
    }    
    public void nuevaCuenta(CuentaBancaria C){
        Cuenta.add(C);
        
    }
    public float calculaPromedio(){
        float prom = 0;
        
        int tam = Cuenta.size();
        
        for(CuentaBancaria F: Cuenta)
        {
             prom = prom + F.dameSaldo();
        }
        prom = prom/tam;
        return prom;
    }
}
