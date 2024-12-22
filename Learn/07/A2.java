
class Temp {

  static void meth0() throws ArithmeticException {

    try {
      meth1();
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic exception");
    }

  }

  static void meth1() throws ArithmeticException {

    int y = 10 / 0;

  }

}

public class A2 {

  public static void main(String[] args) {

    Temp.meth0();

  }

}
