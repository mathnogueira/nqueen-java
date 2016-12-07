package nqueen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 12/7/16.
 */
public class Rainha {

    private Tabuleiro tabuleiro;
    private int x;
    private int y;

    public Rainha(Tabuleiro tabuleiro)
    {
        this.tabuleiro = tabuleiro;
        this.x = 0;
        this.y = 0;
        consultarPossiveisCasas();
    }

    public boolean verificarSePosicaoValida() {
        for (Coordenada coord : consultarPossiveisCasas()) {
            if (!verificarDisponibilidadeCasa(coord))
                return false;
        }
        return true;
    }

    private boolean verificarDisponibilidadeCasa(Coordenada coord) {
        return tabuleiro.get(coord.getX(), coord.getY()) == null;
    }

    private List<Coordenada> consultarPossiveisCasas() {
        List<Coordenada> possibilidades = new ArrayList<>();

        // Casas na horizontal
        for (int x = 0; x < tabuleiro.tamanho(); x++) {
            if (x == this.x) continue;
            possibilidades.add(new Coordenada(x, y));
        }

        // Casas na vertical
        for (int y = 0; y < tabuleiro.tamanho(); y++) {
            if (y == this.y) continue;
            possibilidades.add(new Coordenada(x, y));
        }

        int i = 0;
        // Diagonal secundaria (parte de cima)
        for (int x = this.x; x > 0; x--) {
            i++;
            possibilidades.add(new Coordenada(this.x - i, y - i));
        }

        // Parte de baixo
        i = 0;
        for (int y = this.y; y < tabuleiro.tamanho() - 1; y++) {
            i++;
            possibilidades.add(new Coordenada(this.x + i, this.y + i));
        }

        // Diagonal principal (parte de cima)
        i = 0;
        for (int y = this.y; y > 0; y--) {
            i++;
            possibilidades.add(new Coordenada(this.x + i, this.y - i));
        }

        i = 0;
        for (int x = 0; x < this.x; x++) {
            i++;
            possibilidades.add(new Coordenada(this.x - i, this.y + i));
        }

        return possibilidades;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
