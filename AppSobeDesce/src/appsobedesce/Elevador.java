package appsobedesce;

/**
 *
 * @author gabri
 */
public class Elevador {

    private int numAndares;
    private int capacidadePessoas;
    private int andarAtual = 0;
    private int pessoasDentro;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public Elevador(int numAndares, int capacidadePessoas) {
        this.numAndares = numAndares;
        this.capacidadePessoas = capacidadePessoas;
    }

    public int entra(int numPessoas) {
        pessoasDentro += numPessoas;
        if ( pessoasDentro<= capacidadePessoas) {
            return pessoasDentro;
        } else if(pessoasDentro >capacidadePessoas){
             pessoasDentro -= numPessoas;
        }
         return pessoasDentro;
    }

    public int sai(int numPessoas) {
        if (pessoasDentro > 0) {
            pessoasDentro -= numPessoas;
        }

        return pessoasDentro;
    }

    public int sobe(int numAndar) {
        andarAtual += numAndar;
        if ( andarAtual <= numAndares) {
            return pessoasDentro;
        } else if(andarAtual >numAndares){
             andarAtual -= numAndar;
        }
        return andarAtual;
    }

    public int desce(int numAndar) {
        if(andarAtual>0){
             andarAtual -= numAndar;
        }
        return andarAtual;
    }

}
