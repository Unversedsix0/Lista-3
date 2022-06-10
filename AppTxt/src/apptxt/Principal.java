package apptxt;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Principal {

 
    public static void main(String[] args) {
        Frase frase= new Frase();
        
        String text = JOptionPane.showInputDialog(null, "Escreva uma frase", "Frase", 3);
        frase.setTexto(text);
        
        JOptionPane.showMessageDialog(null, frase.caixaAlta(), "Frase", -1);
        JOptionPane.showMessageDialog(null, "Quantidade de caracteres = "+frase.qtdCaracteres(), "Frase", -1);
       
    }
    
}
