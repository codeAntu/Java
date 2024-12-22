
class Test implements Runnable {
  public void run() {
    int i = 0;
    while (i < 10 ) {
      System.out.println("A" + i);
      i++;
    }

    // end 
  }
}



public class A4 {

  public static void main(String[] args) {
    Test test = new Test();
    Thread t = new Thread(test);
    t.start();

    int i = 0;

    while (true) {
      System.out.println("B" + i);
      i++;
    }

  }
}
