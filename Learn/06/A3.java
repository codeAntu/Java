
class Outer {
  static int x = 10;

  static class Inner {
    int y = 5;

    void display() {
      System.out.println("x = " + x + " y = " + y);
    }
  }

  void test() {
    Inner inner = new Inner();
    inner.display();

  }

}

public class A3 {

  public static void main(String[] args) {

    // Outer outer = new Outer();
    // outer.test();

    // Outer.Inner inner = new Outer().new Inner();

    // inner.display();

    Outer.Inner inner = new Outer.Inner();

    inner.display();

  }

}
