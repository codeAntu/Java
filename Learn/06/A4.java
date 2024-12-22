
class Temp {

  int y = 20;
  static int x = 10;

  final int Z = 30;

  static void Meth() {
    x = 20;
    System.out.println("Hello World from Temp" + x);
  }

  static {
    System.out.println("Static block");
  }

  {
    System.out.println("Instance block");
  }

}

class Temp2 extends Temp {


  // void Meth() {
  //   System.out.println("Hello World from Temp2 ");
  // }
  
}


public class A4 {

  public static void main(String[] args) {

    System.out.println("Main method");

    Temp obj = new Temp();

    

  }

}
