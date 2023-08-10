package Questão_2;

public class Main {
    public static void main(String[] args) {
        int numParques = 4;
        int numTurmas = 3;

        Parque[] parques = new Parque[numParques];
        for (int i = 0; i < numParques; i++) {
            parques[i] = new Parque("Parque " + (i + 1), numTurmas);
        }

        TurmaThread[] turmas = new TurmaThread[numTurmas];
        for (int i = 0; i < numTurmas; i++) {
            turmas[i] = new TurmaThread("Turma " + (i + 1), parques);
            turmas[i].start();
        }
    }
}
