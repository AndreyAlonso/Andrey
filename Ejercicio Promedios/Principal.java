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
        

        Planeta  Pais = new Planeta();
        
        Pais X = new Pais(25);
        Pais Y = new Pais(32);
        Pais Z = new Pais(94);
        
        Pais.agregarPais(X);
        Pais.agregarPais(Y);
        Pais.agregarPais(Z);
        
        
        
        
        System.out.println("Promedio Cuentas: "+Sucursal.calculaSaldoPromedio());
        System.out.println("Promedio habitantes: " +Pais.promedio()+" millones de habitantes");
        
        
        
  }   
}
