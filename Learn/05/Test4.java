
interface SmartPhone {
  void call();

  void camera();

  void internet();
}

class Android implements SmartPhone {

  public void call() {
    System.out.println("Android Call");
  }

  public void camera() {
    System.out.println("Android Camera");
  }

  public void internet() {
    System.out.println("Android Internet");
  }

  public void music() {
    System.out.println("Android Music");
  }
}

public class Test4 {
  public static void main(String[] args) {

    SmartPhone s = new Android();
    s.call();
    s.camera();
    s.internet();
    // s.music();

  }
}
