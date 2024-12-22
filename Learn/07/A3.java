
public class A3 extends Thread {

  public void run() {

    int i = 0;
    while (true) {
      System.out.println("A" + i);
      i++;
    }

  }

  public static void main(String[] args) {

    A3 t = new A3();

    t.start();

    int i = 0;

    while (true) {
      System.out.println("B" + i);
      i++;
    }

  }
}

// class Test extends Thread {

//   public void run() {

//     int i = 0;
//     while (true) {
//       System.out.println("A" + i);
//       i++;
//     }

//   }

// }

// public class A3 {

//   public static void main(String[] args) {

    
//     Test t = new Test();

//     t.start();

//     int i = 0;

//     while (true) {
//       System.out.println("B" + i);
//       i++;
//     }

//   }
// }
