
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
        System.out.println("Area Triangulo: " +  T1.accederArea());
        
        Rectangulo R1 = new Rectangulo(2,3);
        R1.calculaArea();
        System.out.println("Area Rectangulo: " + R1.accederArea()); 
        
        Circulo C1 = new Circulo(5);
        C1.calculaArea();
        System.out.println("Area Circulo: " + C1.accederArea());
        
        Figura [] figuras = new Figura[3];
        
        figuras[0] = T1;
        figuras[1] = R1;
        figuras[2] = C1;
        
      
         int i;
        for(i = 0; i < figuras.length; i++)
        {
            figuras[i].calculaArea();
            
        }
        
        
        for(i = 0; i < figuras.length; i++)
        {
            figuras[i].accederArea();
            System.out.println(figuras[i].accederArea());
        }
       
        
        
        
    }
}
