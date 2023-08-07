package Questão_1;

public class AchandoSenha extends Thread {
    private final Senha dados;

    public AchandoSenha(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            while (true) {
                sleep(2100);
                int valorAtual = dados.pegarValor();
                System.out.println("Thread 1 - Senha encontrada: " + valorAtual);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
