package Questão_1;
public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha();
        senha.adicionar();

        AchandoSenha thread = new AchandoSenha(senha);
        thread.start();

        /*System.out.println("Senhas encontradas:");
        senha.encontrarSenha();*/
    }
}
