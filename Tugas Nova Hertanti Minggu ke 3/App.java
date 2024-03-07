// Class Person (parent class)
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

// Class Employee (child class)
class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}

// Class BankAccount (child class)
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}

// Class Student (child class)
class Student extends Person {
    private String nim;
    private double gpa;

    public Student(String name, String nim, double gpa) {
        super(name);
        this.nim = nim;
        this.gpa = gpa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nGPA: " + gpa;
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        // Employee
        Employee employee = new Employee("John Doe", 5000000);
        System.out.println(employee);

        // BankAccount
        BankAccount bankAccount = new BankAccount("1234567890", 10000000);
        System.out.println(bankAccount);

        // Student
        Student student = new Student("Jane Smith", "12345", 3.85);
        System.out.println(student);
    }
}
