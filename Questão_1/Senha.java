package Questão_1;

import java.util.ArrayList;
import java.util.Random;

public class Senha {
    private final int TAMANHO_MAXIMO = 9;
    private final ArrayList<Integer> dados = new ArrayList<>();
    private final int senhaCorreta;
    private boolean senhaEncontrada = false;
    private String nome;

    public Senha(String nome) {
        this.nome = nome;
        gerarNovaSenha();
        senhaCorreta = pegarValor();
    }

    public String getNome() {
        return nome;
    }

    public synchronized void gerarNovaSenha() {
        Random senha = new Random();
        for (int i = 0; i <= TAMANHO_MAXIMO; i++) {
            dados.add(senha.nextInt(10));
        }
        senhaEncontrada = false;
    }

    public synchronized int pegarValor() {
        int resultado = 0;
        for (int i = 0; i < dados.size(); i++) {
            resultado = resultado * 10 + dados.get(i);
        }
        return resultado;

    }

    public int getSenhaCorreta() {
        return senhaCorreta;
    }

    public boolean isSenhaEncontrada() {
        return senhaEncontrada;
    }

    public void setSenhaEncontrada(boolean senhaEncontrada) {
        this.senhaEncontrada = senhaEncontrada;
    }
}
