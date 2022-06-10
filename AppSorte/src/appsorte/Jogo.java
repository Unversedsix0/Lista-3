package appsorte;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class Jogo {

    private int numero;
    private byte tentativa;

    //construtor
    public Jogo() {
        valorAleatorio();
    }

    public int getNumero() {
        return numero;
    }

    public byte getTentativa() {
        return tentativa;
    }

    private void valorAleatorio() {
        Random random = new Random();
        numero = random.nextInt(11);
    }

    public boolean acertou(int valorUsuario) {
        tentativa++;
        return valorUsuario == numero;
    }

}
