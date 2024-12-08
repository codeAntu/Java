
class Phone {
  public int sound;
  public int cam;

  public void IncSound() {
    sound++;
  }

  public void DecSound() {
    sound--;
  }
}

class Circle {
  private double radius;

  public void setRadius(double r) {
    if (r < 0) {
      radius = 0;
    } else {
      radius = r;
    }
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
}

class Account {
  private int accNo ;
  private int balance;

  public void getBalance() {
    System.out.println(balance);

  }

  public void setBalance(int b) {
    balance = b;
  }

  public void getAccountNo() {
    System.out.println(accNo);
  }

  public int Deposit(int amount) {
    balance += amount;
    return balance;
  }

  public int Withdraw(int amount) {
    balance -= amount;
    return balance;
  }
}

public class OOP {

  public static void main(String[] args) {

    // Phone p1 = new Phone();

    // System.out.println(p1.sound);

    // p1.sound = 10;

    // System.out.println(p1.sound);

    // p1.IncSound();

    // System.out.println(p1.sound);

    // Circle c1 = new Circle();

    // c1.radius = 10;

    // System.out.println(c1.getArea());
    // System.out.println(c1.getCircumference());

    // Account a1 = new Account();

    // // a1.balance = 1000;

    // a1.getBalance();

    // a1.setBalance(0);

    // a1.getBalance();

    // int newAmount = a1.Deposit(200);

    // System.out.println(newAmount);

    // System.out.println(a1.Withdraw(100));

    Circle c1 = new Circle();

    // c1.radius = -10;

    c1.setRadius(-10);

    System.out.println(c1.getRadius());




  }

}
