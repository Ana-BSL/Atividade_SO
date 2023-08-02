package Questão_2;

import java.util.concurrent.TimeUnit;

public class TurmaThread extends Thread {
    private String nome;
    private Parque[] parques;

    public TurmaThread(String nome, Parque[] parques) {
        this.nome = nome;
        this.parques = parques;
    }

    public void run() {
        try {
            for (Parque parque : parques) {
                TimeUnit.MILLISECONDS.sleep(100 + (int) (Math.random() * 200));
                System.out.println(nome + " chegou ao " + parque.getNome());
                parque.turmaChegou();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}