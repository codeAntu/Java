import java.security.PublicKey;

class Circle {
  private double radius;

  public void setRadius(double radius) {
    if (radius < 0) {
     this.radius = 0;
    } else {
      this.radius = radius;
      //  10 = 10 ;
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

  public Circle(double r) {
    radius = r;
  }

  public Circle() {
    radius = 1;
  }

  public Circle(double r, double x) {
    radius = r;
  }

}

public class OPP2 {
  public static void main(String[] args) {

    Circle c = new Circle(5);

    // 5 

    c.setRadius(10);

    // 

    System.out.println(c.getRadius());
  }
}
