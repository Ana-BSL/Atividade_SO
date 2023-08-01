package Questão_2;

import java.util.concurrent.TimeUnit;

public class TurmaThread extends Thread {
    private String nome;
    private Parque[] parques;

    public TurmaThread(String nome, Parque[] parques) {
        this.nome = nome;
        this.parques = parques;
    }

    @Override
    public void run() {
        try {
            for (Parque parque : parques) {
                // Simula a velocidade da turma percorrendo o parque
                TimeUnit.MILLISECONDS.sleep(100 + (int) (Math.random() * 200));

                // Turma chegou ao parque
                System.out.println(nome + " chegou ao " + parque.getNome());
                parque.turmaChegou();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}