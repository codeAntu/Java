public class PrePostIncrement {
   public static void main(String[] args) {
       int a = 5;
       System.out.println("Initial value of a: " + a);
       
       System.out.println("Using pre-increment (++a): " + (++a));
       System.out.println("Value of a after pre-increment: " + a);
       
       System.out.println("Using post-increment (a++): " + (a++));
       System.out.println("Value of a after post-increment: " + a);
   }
}
