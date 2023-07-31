import java.util.ArrayList;
import java.util.Random;

public class Senha {
    ArrayList<Integer> lista = new ArrayList<>();

    public void adicionar() {
        Random senha = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(senha.nextInt(10));
        }
    }

    public void encontrarSenha() {
        for (int valor = 0; valor < 10; valor++) {
            for (int i = 0; i < lista.size(); i++) {
                if (valor == lista.get(i)) {
                    System.out.println(valor);
                }
            }
        }
    }
}
