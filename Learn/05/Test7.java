
class Phone {
  static int price = 10;

  static int x ;

  static void camera() {
    System.out.println("Camera " + price);
  }

  public void call() {
    x = 20;
    System.out.println("Phone Call");
  }

  void Phone() {
    System.out.println("Phone Constructor");
  }

  static {
    System.out.println("Static Block");
  }

  static {
    System.out.println("Static Block 2");
  }

}

public class Test7 {
  public static void main(String[] args) {

    System.out.println("Test7");

    Phone p1 = new Phone();
    // p1.call();

    // Phone p2 = new Phone();

    // System.out.println(Phone.price);

    // Phone.camera();

    // System.out.println(p1.price);
    // p1.price = 15;
    // System.out.println(p1.price);

    // System.out.println(p2.price);

  }

}
