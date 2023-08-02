package Questão_1;
import java.util.ArrayList;
import java.util.Random;

import Questão_2.Parque;

public class Senha {
    ArrayList<Integer> lista = new ArrayList<>();

    public void adicionar() {
        Random senha = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(senha.nextInt(10));
        }
    }

    public int encontrarSenha() {
        for (int valor = 0; valor < 10; valor++) {
            for (int i = 0; i < lista.size(); i++) {
                if (valor == lista.get(i)) {
                    return valor;
                }
            }
        }

        return -1; 
    }
}






