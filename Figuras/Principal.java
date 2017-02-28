
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args){
        Ventana vent = new Ventana(800, 600);
        vent.setVisible(true);
        
        
        
        Triangulo T1 = new Triangulo(4,3);
        
        //T1.calculaArea();
        //System.out.println("Area Triangulo: " +  T1.accederArea());
        
        Rectangulo R1 = new Rectangulo(2,3);
        R1.calculaArea();
        //System.out.println("Area Rectangulo: " + R1.accederArea()); 
        
        Circulo C1 = new Circulo(5);
        Circulo C2 = new Circulo(5);
        //C1.calculaArea();
        C2.calculaArea();
        
        
        System.out.println("Usando  ==");
        if(C1 == C2)
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");
        
        System.out.println("\nUsando equals()");
           if(C1.equals(T1))
           System.out.println("Iguales");
        else
            System.out.println("Diferentes");
        
            
        System.out.println("Area Circulo: " + C1.accederArea());
        
        Figura [] figuras = new Figura[3];
        
        figuras[0] = T1;
        figuras[1] = R1;
        figuras[2] = C1;
        
      
     
        for(Figura elemento: figuras)
        {
            elemento.calculaArea();
            
        }
     
        
        for(Figura elemento: figuras)
        {
            elemento.accederArea();
            System.out.println(elemento.accederArea());
        }
       
        
        
        
    }
}
