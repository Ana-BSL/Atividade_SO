package Questão_3;

public class Garfos {

  private boolean ocupado = false;

  public synchronized void pegarGarfos(int posicaoFilo, int posicaoGar) {
    while (ocupado == true) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println("O filosofo " + posicaoFilo + " está esperando o garfo ser liberado!");
      }
    }
    ocupado = true;
    System.out.println("O filófoso " + posicaoFilo + " pegou o garfo " + posicaoGar);
  }

  public synchronized void largarGarfos(int posicaoFilo, int posicaoGar) {
    ocupado = false;
    System.out.println("O filósofo " + posicaoFilo + " largou o garfo " + posicaoGar);
    notify();

  }

}
