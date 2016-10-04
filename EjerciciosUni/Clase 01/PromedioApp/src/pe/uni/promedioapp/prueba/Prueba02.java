
package pe.uni.promedioapp.prueba;

import pe.uni.promedioapp.service.PromedioService2;


public class Prueba02 {
    
    public static void main(String[] args) {
        
        double nota01 = 11;
        double nota02 = 0.5;
        double nota03 = 12;
        
        PromedioService2 service = new PromedioService2(nota01, nota02, nota03);
        
            
         System.out.println("Primera Nota: "+ nota01);
         System.out.println("Segunda Nota: "+ nota02);
         System.out.println("Tercera Nota: "+ nota03);
        
        System.out.println("La Nota Mayor es: "+ service.calcularNotaMayor());
        System.out.println("El Promedio es: "+ service.calcularPromedio());
        System.out.println("El Porcentaje de Aprobación es: "+ (service.calcularPorcentajeAprobación()) +"%");
        
    }
        
       
}