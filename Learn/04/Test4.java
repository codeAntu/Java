
abstract class SmartPhone {
  abstract void call();

  abstract  void camera();

  abstract void internet();
}


class Android extends SmartPhone {
  void call() {
    System.out.println("Android Call");
  }

  void camera() {
    System.out.println("Android Camera");
  }

  void internet() {
    System.out.println("Android Internet");
  }
}

public class Test4 {
  public static void main(String[] args) {


    SmartPhone s = new SmartPhone() 
    s.call();
    s.camera();
    s.internet();

  }
}
