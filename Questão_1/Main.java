package Questão_1;

public class Main {
    public static void main(String[] args) {
        // Criando a instância da classe Senha
        Senha senha = new Senha();

        // Gerando os números aleatórios e inserindo na classe Senha
        try {
            senha.inserir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Criando as threads
        AchandoSenha thread1 = new AchandoSenha(senha);
        AchandoSenha2 thread2 = new AchandoSenha2(senha);

        // Iniciando as threads
        thread1.start();
        thread2.start();

        try {
            // Esperando por 10 segundos (10000 milissegundos) antes de encerrar a execução
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Encerrando as threads
        thread1.interrupt();
        thread2.interrupt();
    }
}

