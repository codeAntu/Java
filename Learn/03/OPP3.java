
class Circle {
  private double radius;

  public void setRadius(double radius) {
    if (radius < 0) {
      this.radius = 0;
    } else {
      this.radius = radius;
      // 10 = 10 ;
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

}

class Cylinder extends Circle {

  private double height;

  public void setHeight(double height) {
    if (height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getHeight() {
    return height;
  }

}

public class OPP3 {
  public static void main(String[] args) {

    Circle c = new Circle(10);
    // System.out.println(c.getRadius());

    Cylinder cy = new Cylinder();

    cy.setRadius(5);
    cy.setHeight(10);

    System.out.println(cy.getArea());


  }
}
