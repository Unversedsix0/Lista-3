package appintervaloímpares;

import javax.swing.JOptionPane;


public class Principal {

  
    public static void main(String[] args) {
        Impares inter = new Impares();
        
        
         int vlMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor minimo do intervalo", "Impares", 3));
         int vlMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor maximo do intervalo", "Impares", 3));
         
         inter.setValorMinimo(vlMin);
         inter.setValorMaximo(vlMax);
         
         JOptionPane.showMessageDialog(null,"O produto dos numeros impares no intervalo de "+inter.getValorMinimo()+" a "+inter.getValorMaximo()+" = "+inter.calProduto(), "Impares", -1);
         System.exit(0);
    }
    
}
