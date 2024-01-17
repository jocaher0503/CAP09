package Ejercicio4.matematicas.operaciones;

public class Operacion {
    public static int min(int v1, int v2){
        return Math.min(v1, v2);
    }
    private static int _mcd(int v1, int v2, int maxcomdiv){
        int minimo = min(Math.abs(v1), Math.abs(v2));
        int ret = maxcomdiv;
        for(int i = 2; i<=minimo; i++){
            if(v1%i==0 && v2%i==0)
            {
                v1/=i;
                v2/=i;
                ret*=i;
                ret = _mcd(v1,v2, ret);
                break;
            }    
        }
        return ret;
    }

    public static int mcd(int v1, int v2){
        
        
        return _mcd(v1, v2, 1);
    }
}
