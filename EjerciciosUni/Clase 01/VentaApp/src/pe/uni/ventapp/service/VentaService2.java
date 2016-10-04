
package pe.uni.ventapp.service;


public class VentaService2 {
    
    private double precio;
    private int cantidad;
    private double igv;

    public VentaService2(double precio, int cantidad, double igv) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.igv = igv;
    }


    public double redondear (double resultado){
    
      //Variables
        int entero;
        int i;
        double res;
      //Convirtiendo a número con dos dígitos decimales. 
        entero = (int) (resultado*100);
        res = entero/100.0;
      //Extrayendo el tercer dígito decimal
        i = (int)((resultado - res)*1000);
      //Condición para incrementar el segundo dígito decimal 
        if (i >= 5)
            resultado = (res +0.01);
        else
            resultado = res;
        
    return resultado;  
    
    }
        
    
        
    public double calcularImporte(){
    
        double importe;
        importe = precio * cantidad/(1+igv);
        
    return redondear(importe);
    
    }
    
    public double calcularImpuesto(){
    
        double impuesto;
        impuesto = igv * calcularImporte();
        
    return redondear(impuesto);
        
    }
    
    public double calcularTotal(){
    
        double total;
        total = calcularImporte() + calcularImpuesto();
        
    return redondear(total);
    
    }
    

}
