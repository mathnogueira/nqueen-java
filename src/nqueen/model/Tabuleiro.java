package nqueen.model;

/**
 * Created by matheus on 12/7/16.
 */
public class Tabuleiro
{
    /**
     * Casas do tabuleiro.
     */
    private Rainha[][] casas;
    private int tamanho;

    public Tabuleiro(int tamanho)
    {
        casas = new Rainha[tamanho][tamanho];
        this.tamanho = tamanho;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                casas[i][j] = null;
            }
        }
    }

    public Rainha get(int i, int j) {
        return casas[i][j];
    }

    public void set(Rainha rainha, int i, int j) {
        if (rainha != null) {
            casas[rainha.getX()][rainha.getY()] = null;
            rainha.setX(i);
            rainha.setY(j);
        }
        casas[i][j] =  rainha;
    }

    public int tamanho() {
        return this.tamanho;
    }
}
