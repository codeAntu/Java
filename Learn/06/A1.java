class Test {
  int x;

  void meth() {
    System.out.println("Hello World");
  }

  Test() {
    x = 10;
  }

  Test(int x) {
    this.x = x;
  }

}

public class A1 {

  public static void main(String[] args) {

    Test t = new Test();

    int x = new Integer(0);

    System.out.println(x);

    t.meth();
  }

}
