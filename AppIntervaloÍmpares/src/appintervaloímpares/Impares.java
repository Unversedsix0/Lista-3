
package appintervaloímpares;


public class Impares {
    private int valorMinimo;
    private int valorMaximo;

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
    
    
    public int calProduto(){
       int resultado = 1;
        for(int i = valorMinimo;i<=valorMaximo;i++){
            if(i%2 != 0){
                resultado*=i;
            }
        }
        return resultado;
    }
}
