public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha();
        senha.adicionar();
        System.out.println("Senhas encontradas:");
        senha.encontrarSenha();
    }
}
