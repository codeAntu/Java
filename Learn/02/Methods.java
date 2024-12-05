public class Methods {

  static int max(int a, int b) {
    return a > b ? a : b;
  }

  static float max(float a, float b) {
    return a > b ? a : b;
  }

  static int max(int a, int b, int c) {
    return max(max(a, b), c);
  }


  static void inc(int a[]) {
  a[0]++;

  }

  public static void main(String[] args) {

    int a = 10;
    int b = 20;

    float x = 10.5f;
    float y = 20.5f;

    int c = max(a, b);

    float z = max(x, y);

    


    int arr[] = { 10, 20, 30, 40, 50 };

    System.out.println(arr[0]);

    inc(arr);

    System.out.println(arr[0]);
  }
}
