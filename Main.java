public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha();
        senha.adicionar();
        int resultado = senha.encontrarSenha();
        if (resultado != -1) {
            System.out.println("Senha encontrada: " + resultado);
        } else {
            System.out.println("Senha não encontrada.");
        }
    }
}
