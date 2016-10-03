
package pe.uni.ventapp.service;


public class VentaService {
    
   //declaramos la variable IGV y le asignamos el valor de 18% que equivale a 0.18
    

    private final double IGV = 0.18;    
    
    public double calcularTotal (double precio, int cantidad){

    double total;
    total = precio * cantidad;
    return total;
   }
    
    
    public double calcularImpuesto (double precio,int cantidad){

    double impuesto;
    impuesto = calcularTotal(precio, cantidad) * IGV;
    return impuesto;
   }
    
    
    public double calcularImporte (double precio, int cantidad){

    double importe;
    importe = calcularTotal(precio, cantidad) - calcularImpuesto(precio, cantidad);
    return importe;
   }
     

}
