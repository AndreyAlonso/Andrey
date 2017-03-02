import java.util.ArrayList;

public class Principal
{
  public static void main(String [] args){
         
        Banco Sucursal = new Banco();
        
        CuentaBancaria A = new CuentaBancaria(100);
        CuentaBancaria B = new CuentaBancaria(200);
        CuentaBancaria C = new CuentaBancaria(300);
        
        Sucursal.nuevaCuenta(A);
        Sucursal.nuevaCuenta(B);
        Sucursal.nuevaCuenta(C);
        
        
        System.out.println(Sucursal.calculaSaldoPromedio());
        
        
  }   
}
