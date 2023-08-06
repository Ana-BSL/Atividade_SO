package Questão_1;

public class AchandoSenha extends Thread {
    private Senha dados;

    public AchandoSenha(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            while (true) {
                sleep(2100);
                synchronized (dados) {
                    int value = dados.pegarValor();
                    System.out.println("senha encontrada: " + value);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

