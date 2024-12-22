


public class A6 {
  public static void main(String[] args) {

    int a = 10;
    int b = 2;

    int arr[] = { 1, 2, 3, 4, 5 };

    try {

      try {

        int c = a / b;
        System.out.println(c);
        // System.out.println(arr[10]);

      } catch (ArithmeticException e) {
        System.out.println("Division by zero");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bound");
    } finally {
      System.out.println("Finally block");
    }

    System.out.println("Hello World");

  }
}
