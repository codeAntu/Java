
class Outer {
  class Inner {
    public void music() {
      System.out.println("music");
    }
  }
  static int x = 10;
  public void m1() {
    System.out.println("Outer m1");
  }

  Inner i = new Inner();

}

public class Test6 {
  public static void main(String[] args) {

    Outer o = new Outer();
    o.m1();
    System.out.println(o.x);

    Outer.Inner i = o.new Inner();

  }
}
