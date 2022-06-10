package appsorte;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Pires
 * 
 */

//construtor: conjunto de instrução identificada pelo mesmo nome da classe, nunca tera retorno so e utilizado no momento de criação do objeto.
public class Principal {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        
        int valorUsuario = 0;
        int continuar = 0;
        boolean resultado;
        
        while (continuar == 0) {
            
            valorUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Chute um numero entre[0-10]", "Jogo da Sorte", 3));
            resultado = jogo.acertou(valorUsuario);
            
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Voce acertou o numero " + jogo.getNumero() + " em " + jogo.getTentativa() + " tentativa(s)", "Jogo da Sorte", -1);
                System.exit(0);
            }//fim if
            else {
                JOptionPane.showMessageDialog(null, "Voce errou :(", "Jogo da Sorte", -1);
            }//fim else
            
            continuar = JOptionPane.showConfirmDialog(null, "Deseja jogar de novo?", "Jogo da Sorte", JOptionPane.YES_NO_OPTION, 3);
        }//fim while
        
           JOptionPane.showMessageDialog(null, "O numero sorteado era " + jogo.getNumero(), "Jogo da Sorte", -1);
           System.exit(0);
    }

}
