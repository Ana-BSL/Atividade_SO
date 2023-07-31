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

    public int encontrarSenha() {
        for (int valor=0; valor<10; valor++) {
            if (valor == lista.get(0)) {
                return valor;
            } 
            for (int valor1=0; valor1<10; valor1++) {
                if (valor1 == lista.get(1)) {
                    return valor1;
                } 
    }
}
        return -1;

    }

}
