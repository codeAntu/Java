class Employee {
    String empCode;
    String empName;
    String empAdd;
    String phNo;
    double DA;
    double HRA;
    double basicPay;
    double totalSalary;

    void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Address: " + empAdd);
        System.out.println("Employee Phone: " + phNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Manager extends Employee {
    Manager(String code, String name, String address, String number) {
        empCode = code;
        empName = name;
        empAdd = address;
        phNo = number;
        basicPay = 60000;
        DA = 0.30 * basicPay;
        HRA = 0.20 * basicPay;
        totalSalary = DA + HRA + basicPay;
    }
}

class Typist extends Employee {
    Typist(String code, String name, String address, String number) {
        empCode = code;
        empName = name;
        empAdd = address;
        phNo = number;
        basicPay = 20000;
        DA = 0.30 * basicPay;
        HRA = 0.20 * basicPay;
        totalSalary = DA + HRA + basicPay;
    }
}

class Officer extends Employee {
    Officer(String code, String name, String address, String number) {
        empCode = code;
        empName = name;
        empAdd = address;
        phNo = number;
        basicPay = 40000;
        DA = 0.30 * basicPay;
        HRA = 0.20 * basicPay;
        totalSalary = DA + HRA + basicPay;
    }
}

public class officedatabase {
    public static void main(String args[]) {
        Manager m1 = new Manager("m001", "Jhon", "America", "10500-22203");
        Typist t1 = new Typist("t001", "Mitchel", "Canada", "10500-12204");
        Officer o1 = new Officer("o001", "Harry", "India", "85093-53690");

        System.out.println("Manager Details:");
        m1.display();
        System.out.println();

        System.out.println("Typist Details:");
        t1.display();
        System.out.println();

        System.out.println("Officer Details:");
        o1.display();
        System.out.println();
    }
}