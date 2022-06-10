package appmatematico;

import java.lang.Math;

public class Equacao2Grau {
    private int a;
    private int b;
    private int c;
    
    public double calculaDelta(){
        double delta =  Math.pow(b,2) - 4*a*c;
        return delta;
    }
}
