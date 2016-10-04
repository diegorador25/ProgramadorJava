
package pe.uni.promedioapp.service;

public class PromedioService {
    
    public double calcularNotaMayor (double Nota01, double Nota02, double Nota03) {
    
        double NotaMayor;
        
        if (Nota01 >=Nota02)
            if(Nota01>=Nota03)
                NotaMayor = Nota01;
            else 
                NotaMayor = Nota03;
        else 
            if (Nota02>=Nota03)
                NotaMayor = Nota02;
            else
                NotaMayor = Nota03;
        
        return NotaMayor;
        
    }
    
    public double calcularPromedio (double Nota01, double Nota02, double Nota03) {
    
    double Promedio;
    
    Promedio = (Nota01 + Nota02 + Nota03)/3;
    
    return Promedio;
        
    }
    
    public double redondear (double resultado) {    
        int entero;
        entero = (int)(resultado*100);
        resultado = entero/100.0;
        return resultado;    
    }
    
    public double calcularPorcentajeAprobación (double Nota01, double Nota02, double Nota03){
    
    double PorcentajeAprobacion;
    
    PorcentajeAprobacion = calcularPromedio(Nota01, Nota02, Nota03)*100/20;
    
    return PorcentajeAprobacion;
        
    }
    
    
    
    
}
