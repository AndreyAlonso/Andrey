public class Utileria
{
   public static float calculaPromedio(Medible [] med){
       float prom = 0;
       int tam =  med.size();
       
       for(Medible F: med)
       {
           prom = prom + F.dameSaldo();
       }

   }
}
