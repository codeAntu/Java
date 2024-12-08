
class Parent {
  int a;
  int x;

  public Parent() {
    System.out.println("Parent Constructor");
  }

  public Parent(int a) {
    this.a = a;
    x = 7;
    System.out.println("Parent Constructor a : " + a);
  }

  public void display() {
    System.out.println("Parent Display");
  }

}

class Child extends Parent {
  int b;
  int x;

  public Child() {
    // Parent();
    System.out.println("Child Constructor");
  }

  public Child(int a, int b) {
    super(a);
    x = 5;

    this.b = b;
    System.out.println("Child Constructor b: " + b);
  }

  public void display() {
    System.out.println("Child Display " + x + " " + super.x);
  }

}

public class Test1 {
  public static void main(String[] args) {

    // Parent p = new Parent(10);

    Child c = new Child(20, 10);

    c.display();

  }
}
