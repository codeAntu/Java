public class Array {
  public static void main(String[] args) {

    // int arr[] = { 1, 2, 3, 4, 5 };

    // System.out.println(arr[2]);

    int arr1[][] = new int[3][4];

    int arr[][] = new int[3][];

    arr[0] = new int[4];
    arr[1] = new int[2];
    arr[2] = new int[3];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
