package apptrabalho;

import javax.swing.JOptionPane;
/*
Gabriel Olivira Pires - Gabriel Pires de Aquino Santos - Nickolas Markus da Silva Costa
*/
public class Principal {

    public static void main(String[] args) {
        String sabores[] = {"Pizza de Bacon", "Pizza de Mussarela", "Pizza de Frango Catupiry", "Pizza de Quatro Queijos", "Pizza de Calabresa Catupiry"};
        String refri[] = {"Guarana Antarctica", "Coca-Cola", "Dolly", "Sukita"};
        String bairros[] = {"Gurilandia", "Estiva", "Jardim das Nações", "Parque Aeroporto", "Independencia", "Centro", "Agua Quente", "Bonfim"};
        String operacoes[] = {"Cadastrar Cliente", "Adicionar Pizza", "Adicionar Refrigerante", "Reiniciar Pedido","Informaçoes Pedido", "Visualizar Cardapio", "Tabela de Taxa de Frete","Finalizar Pedido"};
        String opUsr = "";
    
        int ctrl;

        Cliente cliente = null;
        Endereco end = null;

        while (!opUsr.equals("Finalizar Pedido")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Pizzaria", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Cadastrar Cliente":
                    String nome = JOptionPane.showInputDialog(null, "Informe seu nome ", "Pizzaria", 3);
                    String logradouro = JOptionPane.showInputDialog(null, "Informe o logradouro ", "Pizzaria", 3);
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da residencia ", "Pizzaria", 3));
                    String bairro = (String) JOptionPane.showInputDialog(null, "Selecione o seu bairro:", "Pizzaria", 3, null, bairros, bairros[0]);
                    ctrl = JOptionPane.showConfirmDialog(null, "Deseja informa complemento", "Pizzaria", JOptionPane.YES_NO_OPTION, 3);
                    if (ctrl == 0) {
                        String complemento = JOptionPane.showInputDialog(null, "Informe o complemento", "Pizzaria", 3);
                        end = new Endereco(logradouro, complemento, bairro, numero);
                    } else {
                        end = new Endereco(logradouro, bairro, numero);
                    }

                    cliente = new Cliente(nome, end);
                    cliente.calculaTaxaFrete();
                    break;

                case "Adicionar Pizza":
                    if (cliente != null) {
                        ctrl = 0;
                        while (ctrl == 0) {
                            String pizza = (String) JOptionPane.showInputDialog(null, "Selecione um sabor de pizza:", "Pizzaria", 3, null, sabores, sabores[0]);
                            cliente.getPedido().setSaborPizza(pizza);
                            cliente.getPedido().calculaValorPedidoPizza();
                            ctrl = JOptionPane.showConfirmDialog(null, "Deseja selecionar outra pizza", "Pizzaria", JOptionPane.YES_NO_OPTION, 3);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Informe os dados para abrir pedido", "Pizzaria", 0);
                    }
                    break;

                case "Adicionar Refrigerante":
                    if (cliente != null) {
                          ctrl = 0;
                        while (ctrl == 0) {
                            String refrigerante = (String) JOptionPane.showInputDialog(null, "Selecione um refrigerante:", "Pizzaria", 3, null, refri, refri[0]);
                            cliente.getPedido().setRefri(refrigerante);
                            cliente.getPedido().calculaValorPedidoRefri();
                            ctrl = JOptionPane.showConfirmDialog(null, "Deseja selecionar outra refrigerante", "Pizzaria", JOptionPane.YES_NO_OPTION, 3);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Informe os dados para abrir pedido", "Pizzaria", 0);
                    }
                    break;
                case "Tabela de Taxa de Frete":
                    JOptionPane.showMessageDialog(null, "Pizzaria do Zezenho" + "\n\n"
                            + "Gurilandia ------------------------------------------ R$ 4.75"
                            + "\nEstiva ------------------------------------- R$ 3.40"
                            + "\nJardim das Nações ------------------------------- R$3.50"
                            + "\nParque Aeroporto --------------------------------R$ 7.50"
                            +"\nCentro -------------------------------- Sem Taxa"
                            +"\nIndependencia --------------------------------R$ 8.50"
                            +"\nAgua Quente --------------------------------R$ 5.50"
                            + "\nBonfim ----------------------------R$ 9.50", "Pizzaria", -1);
                    
                    break;
                    
                case "Visualizar Cardapio":
                    JOptionPane.showMessageDialog(null, "Pizzaria do Zezenho" + "\n\n"
                            + "Pizza de Bacon ------------------------------------------ R$ 32.90"
                            + "\n(muçarela, bacon, tomate e azeitonas)"
                            + "\nPizza de Mussarela -------------------------------------R$ 30.90"
                            + "\n(muçarela, rodelas de tomate e azeitonas)"
                            + "\nPizza de Frango Catupiry ------------------------------- R$34.90"
                            + "\n(muçarela, frango desfiado, catupiry e azeitonas)"
                            + "\nPizza de Quatro Queijos --------------------------------R$ 35.90"
                            + "\n(muçarela, catupiry, parmesão, gorgonzola e azeitonas)"
                            + "\nPizza de Calabresa Catupiry ----------------------------R$ 33.90"
                            + "\n(calabresa, catupiry e azeitonas)"
                            + "\n\nBebeidas"
                            + "\nGuarana Antarctica 2L ------------- R$ 7.99"
                            + "\nCoca-Cola 2L ---------------------- R$ 9.99"
                            + "\nDolly 2L -------------------------- R$ 6.99"
                            + "\nSukita 2L ------------------------- R$ 7.50", "Pizzaria", -1);
                    break;
                case "Reiniciar Pedido":
                  if (cliente != null) {
                    cliente.getPedido().reiniciaPedido();
                      JOptionPane.showMessageDialog(null, "Pedido reiniciado", "Pizzaria", 0);
                  } else {
                        JOptionPane.showMessageDialog(null, "Nenhum pedido aberto", "Pizzaria", 0);
                    }
                    break;
                case "Informaçoes Pedido":
                     if (cliente != null) {
                    JOptionPane.showMessageDialog(null, cliente.getPedido().infoCompra(), "Pizzaria", 1);
                       } 
                     else {
                        JOptionPane.showMessageDialog(null, "Informe os dados para abrir pedido", "Pizzaria", 0);
                    }
                    break;
                case "Finalizar Pedido":
                    if (cliente != null && cliente.getPedido().getSaboresSelecionados()!= "") {
                    JOptionPane.showMessageDialog(null, cliente.imprimirDadosEntrega(), "Pizzaria", 1);
                    JOptionPane.showMessageDialog(null, "Obrigado pela preferencia volte sempre!", "Pizzaria", 1);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, " Pedido não realizado. Nenhum dado informado  :( ", "Pizzaria", 1);
                    }
                    break;
            }//fim switch

        }//fim while
    }
}
