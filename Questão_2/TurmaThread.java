package Questão_2;


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
                sleep(2100);
                System.out.println(nome + " chegou ao " + parque.getNome());
                parque.turmaChegou();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}