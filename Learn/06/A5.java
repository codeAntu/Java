
class Temp {

  // final int Z;
  private int y = 20;

  protected  int x = 10;

  final void Meth() {
    System.out.println("Hello World from Temp ");
  }

  // {
  // // Z = 30;
  // System.out.println("Instance block");
  // }

  // Temp() {

  // Z = 30;
  // System.out.println("Constructor");
  // }

}

class Temp2 extends Temp {

  // void Meth() {
  //   System.out.println("Hello World from Temp2 ");
  // }

  
}

public class A5 {

  public static void main(String[] args) {

    Temp2 obj = new Temp2();
    obj.Meth();

  }

}
