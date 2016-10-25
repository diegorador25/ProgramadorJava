
package pf.diegorador.app.prueba;

import pf.diegorador.app.service.MyMath;

public class PruebaPrimo {
    
    public static void main(String[] args) {
        
       if(MyMath.esPrimo(8)==true)
            System.out.println("El Número 8 es Primo");
       else
            System.out.println("El número 8 no es primo");
    }
    
}
