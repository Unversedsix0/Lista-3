package appsobedesce;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 *
 */
public class Principal {

    public static void main(String[] args) {
        Elevador elevador = null;
        int opUsr = 0;
        String opcoes = "1 - Entrar no elevador\n2 - Sair do elevador\n3 - Subir elevador\n4 - Descer elevador\n5 - Informações do Elevador\n6 - Fechar programa";

        while (opUsr != 6) {
            opUsr = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Elevador", 3));
            switch (opUsr) {
                case 1:
                    if (elevador != null) {
                        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas vão entrar?"+"\nCapacidade Max: "+ elevador.getCapacidadePessoas(), "Elevador", 3));
                        elevador.entra(numPessoas);

                        JOptionPane.showMessageDialog(null, "Pessoas dentro = " + elevador.getPessoasDentro(), "Elevador", -1);

                    } else {
                        JOptionPane.showMessageDialog(null, "Preencha as informações sobre o predio", "Elevador", -1);
                    }
                    break;
                case 2:
                    if (elevador != null) {
                        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas vão sair?", "Elevador", 3));
                        elevador.sai(numPessoas);

                        JOptionPane.showMessageDialog(null, "Pessoas dentro = " + elevador.getPessoasDentro(), "Elevador", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Preencha as informações sobre o predio", "Elevador", -1);
                    }
                    break;
                case 3:
                    if (elevador != null) {
                        int numAndar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos andares deseja subir?", "Elevador", 3));
                        elevador.sobe(numAndar);

                        JOptionPane.showMessageDialog(null, "Andar atual = " + elevador.getAndarAtual(), "Elevador", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Preencha as informações sobre o predio", "Elevador", -1);
                    }
                    break;
                case 4:
                    if (elevador != null) {
                        int numAndar = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos andares deseja descer?", "Elevador", 3));
                        elevador.desce(numAndar);

                        JOptionPane.showMessageDialog(null, "Andar atual = " + elevador.getAndarAtual(), "Elevador", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Preencha as informações sobre o predio", "Elevador", -1);
                    }
                    break;
                case 5:
                    int numAndares = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero de andares do predio", "Elevador", 3));
                    int capPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas pessoas podem entrar no elevador", "Elevador", 3));

                    elevador = new Elevador(numAndares, capPessoas);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fechando programa ...", "Elevador", -1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando invalido", "Elevador", 0);
                    break;

            }

        }
        System.exit(0);
    }

}
