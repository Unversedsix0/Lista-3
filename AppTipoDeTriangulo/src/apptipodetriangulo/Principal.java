package apptipodetriangulo;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Triangulo Triangulo = new Triangulo();

        float l1 = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o 1ºlado", "App Triangulo", 3));
        Triangulo.setLadoA(l1);
        float l2 = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o 1ºlado", "App Triangulo", 3));
        Triangulo.setLadoB(l2);
        float l3 = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o 1ºlado", "App Triangulo", 3));
        Triangulo.setLadoC(l3);

        JOptionPane.showMessageDialog(null, Triangulo.tipoTriangulo(), "AppTriangulo", 1);
        
        System.exit(0);
    }

}
