
class Parent {

  public void meth1() {
    System.out.println("Parent Meth1");
  }

  public  void meth2() {
    System.out.println("Parent Meth2");
  }
}

class Child extends Parent {

  public void meth2() {
    System.out.println("Child Meth2");
  }

  public void meth3() {
    System.out.println("Child Meth3");
  }

}

class Child1 extends Parent {

  public void meth2() {
    System.out.println("Child1 Meth2");
  }

  public void meth3() {
    System.out.println("Child1 Meth3");
  }

}

class GrandChild extends Child {

  public void meth2() {
    System.out.println("GrandChild Meth2");
  }

  public void meth3() {
    System.out.println("GrandChild Meth3");
  }

}

public class Test2 {
  public static void main(String[] args) {
    // Parent p = new Parent();
    // Child c = new Child();
    // p.display();
    // c.display();

    // Parent p = new Parent();

    // p.meth1();
    // p.meth2();

    // Child c = new Child();

    // c.meth1();
    // c.meth2();
    // c.meth3();

    // Parent p = new Child();

    // p.meth1();
    // p.meth2();
    // p.meth3();

    // Child c = new Parent();

  }

}
