package Questão_1;

public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha();

        AchandoSenha thread1 = new AchandoSenha(senha);
        AchandoSenha2 thread2 = new AchandoSenha2(senha);

        thread1.start();
        thread2.start();

    }
}



