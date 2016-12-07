package nqueen;

import nqueen.model.Rainha;
import nqueen.model.Tabuleiro;

import java.util.List;

/**
 * Created by matheus on 12/7/16.
 */
public class Solucao {

    public Solucao() {

    }

    public void solucionar(Tabuleiro tabuleiro, List<Rainha> rainhas) {
        boolean solucao = solucionarRec(tabuleiro, rainhas, tabuleiro.tamanho(), 0);
        if (solucao) {
            System.out.println(tabuleiro);
        }
    }

    public boolean solucionarRec(Tabuleiro tabuleiro, List<Rainha> rainhas, int tamanho, int coluna) {
        if (coluna >= tamanho)
            return true;
        for (int i = 0; i < tamanho; i++) {
            Rainha r = new Rainha(tabuleiro);
            tabuleiro.set(r, i, coluna);
            if (r.verificarSePosicaoValida()) {
                if (solucionarRec(tabuleiro, rainhas, tamanho, coluna+1)) {
                    return true;
                }
            } else {
                tabuleiro.set(null, coluna, i);
            }
        }
        return false;
    }


}
