package pf.diegorador.app.controller;

import pf.diegorador.app.service.MyMath;

public class AppController {

  public long factorial(int n){
    return MyMath.factorial(n);
  }
  
  public int mcd(int n1, int n2){
    return MyMath.mcd(n1, n2);
  }
  
  public int mcm(int n1, int n2){
    return MyMath.mcm(n1, n2);
  }
  
  public boolean esPrimo(int n){
    return MyMath.esPrimo(n);
  }
  
  public  int fibonacci(int n){
    return MyMath.fibonacci(n);
  }
}
