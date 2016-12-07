package nqueen;

import nqueen.model.Rainha;
import nqueen.model.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 12/7/16.
 */
public class Main {

    public static void main(String args[])
    {
        int tamanho = 8;
        Tabuleiro tabuleiro = new Tabuleiro(tamanho);
        List<Rainha> rainhas = new ArrayList<>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            Rainha r = new Rainha(tabuleiro);
            rainhas.add(r);
        }
        Solucao solucao = new Solucao();
        solucao.solucionar(tabuleiro, rainhas);
    }
}
