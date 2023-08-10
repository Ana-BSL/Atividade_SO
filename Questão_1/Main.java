package Questão_1;


public class Main {
    public static void main(String[] args) {
        int numThreads = 3;
        Senha senha = new Senha();

        /*AchandoSenha thread1 = new AchandoSenha(senha);
        AchandoSenha thread2 = new AchandoSenha(senha);

        thread1.start();
        thread2.start();*/
        AchandoSenha[] senhas = new AchandoSenha[numThreads];
        for (int i = 0; i < numThreads; i++) {
            senhas[i] = new AchandoSenha(senha);
            System.out.println("Thread"+(i+1)+"- senha encntrada");
            senhas[i].start();
        }

    }
}



