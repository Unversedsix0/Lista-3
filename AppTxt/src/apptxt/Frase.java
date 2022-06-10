package apptxt;

public class Frase {
    String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String substiuicao(String letra){
        return texto.replace("letra", "x");
    }
    
    public String caixaAlta(){
        return (texto.toUpperCase());
      
      }

     public int qtdCaracteres(){
        int result = texto.replace(" " , "").length();
         return result;
     }
     
     public String qtdLetras(){
         return"";
     }
     
     public String qtdDigitos(){
         return"";
     }
}
     
      
