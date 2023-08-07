package Questão_1;

public class AchandoSenha2 extends Thread {
    private final Senha dados;

    public AchandoSenha2(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            while (true) {
                sleep(2000);
                int valorAtual = dados.pegarValor();
                System.out.println("Thread 2 - Senha encontrada: " + valorAtual);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
