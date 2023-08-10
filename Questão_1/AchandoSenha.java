package Questão_1;

public class AchandoSenha extends Thread {
    private final Senha dados;

    public AchandoSenha(Senha param) {
        dados = param;
    }

    public void run() {
        try {
            int valorAtual =0;
            while (!dados.isSenhaEncontrada()) {
                sleep(2100);
                valorAtual = dados.pegarValor();
                if(valorAtual!=0){
                    dados.setSenhaEncontrada(true);
                }

            }
            System.out.println(dados.getNome() + " chegou ao " + dados.getNome());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}