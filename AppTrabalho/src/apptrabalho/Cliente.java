package apptrabalho;

public class Cliente {

    private String nome;
    private Endereco end;
    private Pedido pedido;
    private float taxaFrete;
    
    public Cliente(String nome, Endereco end) {
        this.nome = nome;
        this.end = end;
        this.pedido = new Pedido();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public float calculaTaxaFrete() {
        switch (end.getBairro()) {
            case "Gurilandia":
                taxaFrete = (float)4.75;
                break;
            case "Estiva":
                taxaFrete = (float)3.40;
                break;
            case "Jardim das Nações":
                taxaFrete = (float)3.50;
                break;
            case "Parque Aeroporto":
                taxaFrete = (float)7.50;
                break;
            case "Independencia":
                taxaFrete = (float)8.50;
                break;
            case "Centro":
                taxaFrete = 0;
                break;
            case "Agua Quente":
                taxaFrete = (float)5.50;
                break;
            case "Bonfim":
                taxaFrete = (float)9.50;
                break;       
        }
         return taxaFrete;
    }
    
    public float calculaValorTotal(){
        return pedido.getValorPedido()+ taxaFrete;
    }

     public String imprimirDadosEntrega(){
       String dadosEnd=end.getLogradouro()+", "+end.getBairro()+", "+"n°"+end.getNumero();
       if(end.getComplemento()!=null){
           dadosEnd +="\nComplemento: " + end.getComplemento();
       }
       String dados = "Nome do Cliente: " + nome + "\nLocal da Entrega: "+dadosEnd+ "\nTaxa de Frete: R$ "+taxaFrete+"\n"+pedido.infoCompra()+"\nTotal a Pagar: R$"+ calculaValorTotal();
                
                   return dados;
         
     }

}
