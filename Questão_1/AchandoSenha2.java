package Questão_1;

public class AchandoSenha2 extends Thread {
    private final Senha dados;

    public AchandoSenha2(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            int valorAtual =0;
            while (!dados.isSenhaEncontrada()) {
                sleep(2000);
                valorAtual = dados.pegarValor();
                if(valorAtual!=0){
                    dados.setSenhaEncontrada(true);
                }

            }
                System.out.println("Thread 2 - Senha encontrada: " + valorAtual);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}