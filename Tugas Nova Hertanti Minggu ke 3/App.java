import java.util.Scanner;

import Employee;
import BankAccount;
import Students;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 5000000);
        System.out.println(employee);

        BankAccount bankAccount = new BankAccount("1234567890", 10000000);
        System.out.println(bankAccount);

        Students student = new Student("Jane Smith", "12345", 3.85);
        System.out.println(student);
    }
}