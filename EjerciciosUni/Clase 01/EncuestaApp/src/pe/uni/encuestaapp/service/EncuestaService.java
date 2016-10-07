
package pe.uni.encuestaapp.service;


public class EncuestaService {
    
    private int N1;
    private int N2;
    private int N3;

    public EncuestaService(int N1, int N2, int N3) {
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }
        
          
    public double calcularAprobacion() {
    
        double aprobacion;
        int a;
        int b;
        int c;
        int d;
        int e;
        
        
        if (N1 > 0 && N1 <=5){
            
            for (int i = 0; i < 3; i++) {
                
                if (N1 == 1)
                    N1 = N1;
            
            
            }
        }
        else 
            aprobacion = 0;
        
        return aprobacion;
    }
    
}
