package Questão_1;

public class AchandoSenha2 extends Thread {
    private Senha dados;

    public AchandoSenha2(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            while (true) {
                sleep(2000);
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



