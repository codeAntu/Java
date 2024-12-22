
class MinAgeException extends Exception {
  @Override
  public String toString() {
    return "Age cannot be negative";
  }

}

class Student {
  int age;
  String name;

  void setAge(int age) throws MinAgeException {

    if (age < 0) {
      throw new MinAgeException();
    }

    this.age = age;
  }

  void setName(String name) {
    this.name = name;
  }
}

public class A7 {
  public static void main(String[] args) {

    Student s1 = new Student();

    try {
      s1.setAge(10);
    } catch (MinAgeException e) {
      System.out.println(e);
    }
    

    System.out.println(s1.age);

  }
}
