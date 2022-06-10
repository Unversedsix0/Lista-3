package apptrabalho;


public class Pedido {

    private String saboresSelecionados="";
    private String refriSelecionados="";
    private String saborPizza;
    private String refri;
    private float valorPedido;

    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getRefri() {
        return refri;
    }

    public void setRefri(String refri) {
        this.refri = refri;
    }

    public String getSaboresSelecionados() {
        return saboresSelecionados;
    }

    public void setSaboresSelecionados(String saboresSelecionados) {
        this.saboresSelecionados = saboresSelecionados;
    }

    public String getRefriSelecionados() {
        return refriSelecionados;
    }

    public void setRefriSelecionados(String refriSelecionados) {
        this.refriSelecionados = refriSelecionados;
    }
    

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void calculaValorPedidoPizza() {
        switch (saborPizza) {
            case "Pizza de Bacon":
                valorPedido += 32.90;
                saboresSelecionados+= "Pizza de Bacon ";
                break;

            case "Pizza de Mussarela":
                valorPedido += 30.90;
                saboresSelecionados+= "Pizza de Mussarela";
                break;

            case "Pizza de Frango Catupiry":
                valorPedido += 34.90;
                saboresSelecionados+= "Pizza de Frango Catupiry";
                break;
                
            case "Pizza de Quatro Queijos":
                valorPedido += 35.90;
                saboresSelecionados+= "Pizza de Quatro Queijos";
                break;
                
            case "Pizza de Calabresa Catupiry":
                valorPedido += 33.90;
                saboresSelecionados+= "Pizza de Calabresa Catupiry";
                break;
        }
    }

    public void calculaValorPedidoRefri() {
        switch (refri) {
            case "Guarana Antarctica":
                valorPedido += 7.99;
                refriSelecionados+="Guarana Antarctica ";
                break;
            case "Coca-Cola":
                valorPedido += 9.99;
                refriSelecionados+="Coca-Cola ";
                break;
            case "Dolly":
                valorPedido += 6.99;
                refriSelecionados+="Dolly ";
                break;
            case "Sukita":
                valorPedido += 7.50;
                refriSelecionados+="Sukita ";
                break;
        }
    }public void reiniciaPedido(){
        valorPedido=0;
        refriSelecionados="";
        saboresSelecionados="";
    }
  
    public String infoCompra() {
        return "Valor da compra: R$" + valorPedido + "\nPizza: "+saboresSelecionados+ "\nRefrigerante: "+refriSelecionados ;

    }
}

/**
 * (muçarela, bacon, tomate e azeitonas) R$ 42,90 BACON FRANCO E CATUPINTO
 * Frango Catupiry (muçarela, frango desfiado, catupiry e azeitonas) R$ 42,90
 * Mussarela (muçarela, rodelas de tomate e azeitonas) R$ 42,90 Quatro Queijos
 * (muçarela, catupiry, parmesão, gorgonzola e azeitonas) R$ 42,90 Calabresa
 * Catupiry (calabresa, catupiry e azeitonas) R$ 48,90
 */
