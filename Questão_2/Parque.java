package Questão_2;

public class Parque {

    private String nome;
    private int numTurmas;
    private int turmasNaChegada;

    public Parque(String nome, int numTurmas) {
        this.nome = nome;
        this.numTurmas = numTurmas;
    }

    public String getNome() {
        return nome;
    }

    //sincronizar as turmas que cheram no parque, ou seja, uma thread por vez pode sincronizar
    public synchronized void turmaChegou() throws InterruptedException {
        turmasNaChegada++;

        if (turmasNaChegada == numTurmas) {
            System.out.println("Todas as turmas chegaram ao " + nome + ". Continuem!");
            turmasNaChegada = 0;
            notifyAll();
        } else {
            wait();
        }
    }
}

