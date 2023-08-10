package Questão_3;

import java.util.Random;

public class ThreadFilosofo extends Thread {

  private int posicao;
  private Garfos garfoesq;
  private Garfos garfodir;
  private int p1;
  private int p2;
  private static int segundos = 100;
  public boolean[] garfosUsados = new boolean[5];

  public ThreadFilosofo(int posicao, Garfos garfodir, Garfos garfoesq, int p1, int p2) {
    this.posicao = posicao;
    this.garfodir = garfodir;
    this.garfoesq = garfoesq;
    this.p1 = p1;
    this.p2 = p2;
  }

  public void run() {
    Random time = new Random();
    int tempo = 0;
    while (true) {
      tempo = time.nextInt(25) * segundos;
      pensar(tempo);
      if (posicao == 1) {
        synchronized (garfodir) {
          garfodir.pegarGarfos(posicao, p1);
          synchronized (garfoesq) {
            garfoesq.pegarGarfos(posicao, p2);
            tempo = time.nextInt(25) * segundos;
            comer(tempo);
            garfoesq.largarGarfos(posicao, p2);
          }
          garfodir.largarGarfos(posicao, p1);
        }
      } else {
        synchronized (garfoesq) {
          garfoesq.pegarGarfos(posicao, p2);
          synchronized (garfodir) {
            garfodir.pegarGarfos(posicao, p1);
            tempo = time.nextInt(25) * segundos;
            comer(tempo);
            garfodir.largarGarfos(posicao, p1);
          }
          garfoesq.largarGarfos(posicao, p2);
        }
      }
    }
  }

  public void pensar(int tempo) {
    try {
      sleep(tempo);
      System.out.println("O filósofo " + posicao + " está pensando");
    } catch (Exception e) {
      System.out.println("O filósofo " + posicao + " pensou demais.");
    }
  }

  public void comer(int tempo) {
    try {
      sleep(tempo);
      System.out.println("O filósofo " + posicao + " está comendo");
    } catch (Exception e) {
      System.out.println("O filósofo " + posicao + " comeu demais.");
    }
  }

  public int getPosicao() {
    return posicao;
  }

}
