package Questão_1;

import java.util.ArrayList;
import java.util.Random;

public class Senha {

    int TAMANHO_MAXIMO = 9;
    ArrayList<Integer> dados = new ArrayList<Integer>();

    public synchronized void inserir() throws InterruptedException {
        Random senha = new Random();
        for (int i = 0; i <= TAMANHO_MAXIMO; i++) {
            dados.add(senha.nextInt(10));
        }
    }

    public synchronized int pegarValor() {
        int resultado = 0;
        for (int i = 0; i < dados.size(); i++) {
            resultado += dados.get(i);
        }
        return resultado;
    }
}

