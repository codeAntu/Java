
// Overloading: Method name is same but the number of arguments is different. 
class Test {

  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public int max(int a, int b, int c) {
    return a > b ? (a > c ? a : c) : (b > c ? b : c);
  }

}


// Overriding: Method name is same and the number of arguments is same.

class Super {
  public void display() {
    System.out.println("Super Display");
  }
}

class Sub extends Super {
  public void display() {
    System.out.println("Sub Display");
  }
}

public class Test3 {
  public static void main(String[] args) {

    Test t = new Test();
    System.out.println(t.max(10, 20));

  }

}
