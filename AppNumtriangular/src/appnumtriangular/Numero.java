
package appnumtriangular;

 // @author Gabriel

public class Numero {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean verifica(){
        for(int i=1;i<=numero;i++){
            int result = i*(i+1)*(i+2);
            if(result == numero){
                return true;
            }
    
        }
        return false;
    }
    
}
