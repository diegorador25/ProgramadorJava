package pf.diegorador.app.service;

public final class MyMath {

    private MyMath() {
    }
  
    public static long factorial(int n){

        if (n >=0){
            if (n==0)
                return 1;
            else
                return n * factorial(n-1);
        }else{
            return n = 0;
        }
    }
  
    public static int mcd(int n1, int n2){
    
        if(n2==0)
            return n1;
        else
            return mcd(n2, n1 % n2);
    }
  
    public static int mcm(int n1, int n2){

        int mcm = n1*n2/mcd(n1, n2);
        return mcm;
    }
  
    public static boolean esPrimo(int n){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=n)){
            if (n % contador == 0)
                primo = false;
                contador++;
        }
        return primo;
    }
  
    public static int fibonacci(int n){

        if (n <= 1) 
            return n; 
        else 
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
