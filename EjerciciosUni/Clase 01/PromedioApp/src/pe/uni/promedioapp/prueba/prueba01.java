
package pe.uni.promedioapp.prueba;

import pe.uni.promedioapp.service.PromedioService;


public class prueba01 {
    
    public static void main(String[] args) {
        
        double Nota01 = 11;
        double Nota02 = 0.5;
        double Nota03 = 12;
        
        PromedioService service = new PromedioService();
        
        /*double NotaMayor = service.calcularNotaMayor(Nota01, Nota02, Nota03);
        double Promedio = service.calcularPromedio(Nota01, Nota02, Nota03);
        double PorcentajeAprobacion = service.calcularPorcentajeAprobación(Nota01, Nota02, Nota03);*/
        
       
        
         System.out.println("Primera Nota: "+ Nota01);
         System.out.println("Segunda Nota: "+ Nota02);
         System.out.println("Tercera Nota: "+ Nota03);
        
        System.out.println("La Nota Mayor es: "+ service.calcularNotaMayor(Nota01, Nota02, Nota03));
        System.out.println("El Promedio es: "+ service.redondear(service.calcularPromedio(Nota01, Nota02, Nota03)));
        System.out.println("El Porcentaje de Aprobación es: "+ service.redondear(service.calcularPorcentajeAprobación(Nota01, Nota02, Nota03)) +"%");
        
    }
    
    
}
