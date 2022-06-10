
package appop3num;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Principal {

  
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1° numero: ", "Calculadora", 3));
        calculadora.setNum1(numero1);

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 2° numero: ", "Calculadora", 3));
        calculadora.setNum2(numero2);

        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 3° numero: ", "Calculadora", 3));
        calculadora.setNum3(numero3);
        
         JOptionPane.showMessageDialog(null,"Soma: " + calculadora.getNum1() + " + " + calculadora.getNum2() + " + " + calculadora.getNum3() + " = " + calculadora.soma() + "\nMedia:" + calculadora.media() + "\nMultiplicacao:" + calculadora.multiplicacao(),"Calculadora",-1);

    }
    
}
