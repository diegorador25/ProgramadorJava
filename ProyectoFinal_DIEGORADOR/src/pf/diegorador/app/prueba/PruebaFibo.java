package pf.diegorador.app.prueba;

import pf.diegorador.app.service.MyMath;

public class PruebaFibo {
    
    public static void main(String[] args) {
        
        System.out.println("Los primeros 6 digitos de la serie son:"); 
        String repo="";
        for(int i=1; i<=6;i++){
        repo = repo + " "+MyMath.fibonacci(i); 
        }System.out.println(" "+repo);
    }  
}
