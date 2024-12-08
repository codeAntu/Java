
## 1. Create a Class and Object

Write a Java program to create a class `Car` with the following attributes:

- `brand` (String)
- `model` (String)
- `price` (double)

Add a method `displayDetails()` to print the car details. Create an object of the `Car` class, set its attributes, and call the `displayDetails()` method.

**Expected Output Example**:

```makefile
makefile
Copy code
Brand: Tesla
Model: Model S
Price: $79999.99
```

## 2. Encapsulation Example

Create a class `BankAccount` with the following private attributes:

- `accountNumber` (String)
- `balance` (double)

Provide public getter and setter methods for these attributes. Write a main method to demonstrate setting and getting these values securely.

## 3. Restrict Direct Access

Write a program to implement a class `Student` with the following private attributes:

- `name` (String)
- `rollNumber` (int)

Allow the user to set these values using a method `setDetails(String name, int rollNumber)` and display them using a method `getDetails()`.

## 4. Parameterized Constructor

Create a class `Employee` with the following attributes:

- `id` (int)
- `name` (String)
- `salary` (double)

Add a parameterized constructor to initialize these attributes. Write a program to create objects using the constructor and display the details of each employee.

## 5. Constructor Overloading

Create a class `Person` with three constructors:

- A default constructor that initializes a name to `"Unknown"` and age to `0`.
- A constructor that takes only the name as a parameter.
- A constructor that takes both name and age as parameters.

Write a main method to create objects using all three constructors and display the values.

## 6. Single Inheritance

Create two classes, `Person` and `Student`:

- `Person` has attributes `name` and `age` with a method `displayDetails()`.
- `Student` inherits `Person` and adds an attribute `rollNumber`.Write a program to create a `Student` object and display all its details.

## 7. Override a Method

Create a class `Shape` with a method `draw()` that prints "Drawing a shape". Create a subclass `Circle` that overrides the `draw()` method to print "Drawing a circle". Write a program to demonstrate method overriding.

## 8. Compile-Time and Run-Time Polymorphism

- **Compile-Time**: Create a class `Calculator` with overloaded methods `add(int a, int b)` and `add(double a, double b)`. Demonstrate method overloading.
- **Run-Time**: Create a parent class `Bank` with a method `getInterestRate()`. Create subclasses `SBI`, `HDFC`, and `ICICI` that override the method to return different interest rates. Demonstrate polymorphism by storing different subclass objects in a parent class reference.

## 9. Abstract Class with Multiple Methods

Create an abstract class `Shape` with two abstract methods:

- `calculateArea()`
- `calculatePerimeter()`

Create subclasses `Circle` and `Rectangle` that implement these methods. Write a program to calculate and display the area and perimeter for a circle and a rectangle.