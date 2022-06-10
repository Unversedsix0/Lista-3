
package appnumtriangular;

import javax.swing.JOptionPane;


 // @author Gabriel
 
public class Principal {

   
    public static void main(String[] args) {
        Numero num = new Numero();
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n°", "AppNumTriangular", 3));
        num.setNumero(valor);
        
        
        if(num.verifica()!= true){
            JOptionPane.showMessageDialog(null, "Não é triangular", "AppNumTriangular", -1);
    }else{
            JOptionPane.showMessageDialog(null,"É triangular","AppNumTriangular",-1);
        }
          System.exit(0);
        
        
    }
    
}
