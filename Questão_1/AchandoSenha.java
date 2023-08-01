package Questão_1;

public class AchandoSenha extends Thread {
    private Senha senha;

    public AchandoSenha(Senha param) {
        senha = param;
    }

    public void run() {
        try {

            while (true) {
                sleep(2100);
                int value = senha.encontrarSenha();
                
                System.out.println("senha encontrada: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



