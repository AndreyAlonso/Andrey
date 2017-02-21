
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args){
        Triangulo T1 = new Triangulo(4,3);
        T1.calculaArea();
        System.out.println("Area Triangulo: " +T1.calculaArea());
        
        Rectangulo R1 = new Rectangulo(2,3);
        R1.calculaArea();
        System.put.println("Area Rectangulo: " +R1.calculaArea()); 
        
        Circulo C1 = new Circulo(5);
        C1.calculaArea();
        System.out.println("Area Circulo: " +C1.calculaArea());
        
        Figura [] figuras = new Figura[3];
        figuras[0] = Triangulo;
        figuras[1] = Cuadrado;
        figuras[2] = Ciruculo;
       
       
    }
}
