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

    public synchronized void turmaChegou() throws InterruptedException {
        turmasNaChegada++;

        // Se todas as turmas chegaram, avisa as outras turmas para continuarem
        if (turmasNaChegada == numTurmas) {
            System.out.println("Todas as turmas chegaram ao " + nome + ". Continuem!");
            turmasNaChegada = 0;
            notifyAll();
        } else {
            // Turma aguarda as demais
            wait();
        }
    }
}