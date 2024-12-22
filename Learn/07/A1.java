
public class A1 {

  public static void main(String[] args) {

    int a = 10;
    int b = 0;

    int arr[] = { 1, 2, 3, 4, 5 };

    try {
      System.out.println(arr[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bounds");
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    } finally {

      System.out.println("Finally block");

    }

  }

}
