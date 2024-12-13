
class Phone {
  public void call() {
    System.out.println("Phone Call");
  }

  public void sms() {
    System.out.println("Phone SMS");
  }
}

interface Camera {
  static final int X = 10;
  void camera();
  static void record() {
    System.out.println("Camera Record");
  }
}

interface Music {
  public void music();
}

class SmartPhone extends Phone implements Camera, Music {
  public void camera() {
    System.out.println("SmartPhone Camera");
  }
  public void music() {
    System.out.println("SmartPhone Music");
  }

}

public class Test5 {
  public static void main(String[] args) {

    SmartPhone s = new SmartPhone();
    s.call();
    s.sms();
    s.camera();
    s.music();
    // s.x = 20;

    Camera.record();

    // m.call();

  }
}
