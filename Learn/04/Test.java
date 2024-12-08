
class Circle {
  public int radius;

  public void area() {
    System.out.println("This is area of circle");
  }
}

class Cylinder extends Circle {
  public int height;

  public void volume() {
    System.out.println("This is volume of cylinder");
  }
}

public class Test {

  public static void main(String[] args) {

    Circle c1 = new Circle();

    c1.radius = 10;
    c1.area();

    Cylinder cy1 = new Cylinder();
    cy1.radius = 10;
    cy1.height = 20;

    cy1.area();
    // cy1.volume();

    // System.out.println(cy1);

  }

}
