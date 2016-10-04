
package pe.uni.promedioapp.service;


public class PromedioService2 {
    
    private double nota01;
    private double nota02;
    private double nota03;

    
    //copnstructor se encarga de inicializar las variables de la clase por primera vez.
    public PromedioService2(double nota01, double nota02, double nota03) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

   
        public double redondear (double resultado) {    
        int entero;
        entero = (int)(resultado*100);
        resultado = entero/100.0;
        return resultado;    
    }
    
    
    public double calcularNotaMayor () {
    
        double NotaMayor;
        
        if (nota01 >=nota02)
            if(nota01>=nota03)
                NotaMayor = nota01;
            else 
                NotaMayor = nota03;
        else 
            if (nota02>=nota03)
                NotaMayor = nota02;
            else
                NotaMayor = nota03;
        
        return redondear(NotaMayor);
        
    }
    
    public double calcularPromedio () {
    
    double Promedio;
    
    Promedio = (nota01 + nota02 + nota03)/3;
    
    return redondear(Promedio);
        
    }
    

    public double calcularPorcentajeAprobación (){
    
    double PorcentajeAprobacion;
    
    PorcentajeAprobacion = calcularPromedio()*100/20;
    
    return redondear(PorcentajeAprobacion);
        
    }
    
    
   
}
