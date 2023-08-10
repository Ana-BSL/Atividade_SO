package Questão_3;

public class OJantar {

  public static void main(String[] args) {

    Garfos[] garfo = new Garfos[5];

    for (int i = 0; i < 5; i++) {
      garfo[i] = new Garfos();
    }

    ThreadFilosofo f1 = new ThreadFilosofo(1, garfo[0], garfo[1], 0, 1);
    ThreadFilosofo f2 = new ThreadFilosofo(2, garfo[1], garfo[2], 1, 2);
    ThreadFilosofo f3 = new ThreadFilosofo(3, garfo[2], garfo[3], 2, 3);
    ThreadFilosofo f4 = new ThreadFilosofo(4, garfo[3], garfo[4], 3, 4);
    ThreadFilosofo f5 = new ThreadFilosofo(5, garfo[4], garfo[0], 4, 0);

    f1.start();
    f2.start();
    f3.start();
    f4.start();
    f5.start();
  }
}
