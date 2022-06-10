package apptipodetriangulo;

public class Triangulo {

    private float ladoA;
    private float ladoB;
    private float ladoC;

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }

    boolean ehTriangulo() {
        return ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB);
    }

    String tipoTriangulo() {
        if (ehTriangulo()) {
            if (ladoA == ladoB && ladoB == ladoC) {
                return "Triangulo Equilatero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                return "Triangulo Isóceles" ;    
            } else {
                return "Triangulo Escaleno";
            }
        } else {
            return "Não eh triangulo";
        }
    }
}
