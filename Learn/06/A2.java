
interface x {
  static void meth1() {
    System.out.println("Hello World from x");
  }

}

interface y {

  static int x = 10;
  int y = 20;

  static void meth1() {
    System.out.println("Hello World from y" + x + y);
  }

  void meth2();
}

class B implements x, y {

  public void meth2() {
    System.out.println("Hello World from B");
  }

}

public class A2 {

  public static void main(String[] args) {

    B obj = new B();
    x.meth1();
    y.meth1();

    obj.meth2();

  }

}
