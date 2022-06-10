package apptrabalho;


public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;
    private int numero;

    public Endereco(String logradouro, String complemento, String bairro, int numero) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(String logradouro, String bairro, int numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
    }
   
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String cidade) {
        this.bairro = cidade;
    }
    
    
}
