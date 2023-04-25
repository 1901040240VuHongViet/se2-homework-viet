package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter student info
        System.out.println("Enter student info \n(first name - last name - faculty number):");
        String[] studentInfo = scanner.nextLine().split("\\s+");
        String studentFirstName = studentInfo[0];
        String studentLastName = studentInfo[1];
        String facultyNumber = studentInfo[2];
        try {
            Student student = new Student(studentFirstName, studentLastName, facultyNumber);
            System.out.println("Student information:");
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Faculty number: " + student.getFacultyNumber());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        // prompt user to enter worker info
        System.out.println("Enter worker info \n(first name - last name - week salary - work hours per day)" +
                ":");
        String[] workerInfo = scanner.nextLine().split("\\s+");
        String workerFirstName = workerInfo[0];
        String workerLastName = workerInfo[1];
        double weekSalary = Double.parseDouble(workerInfo[2]);
        double workHoursPerDay = Double.parseDouble(workerInfo[3]);
        try {
            Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, workHoursPerDay);
            System.out.println("Worker information:");
            System.out.println("First Name: " + worker.getFirstName());
            System.out.println("Last Name: " + worker.getLastName());
            System.out.printf("Week Salary: %.2f%n", worker.getWeekSalary());
            System.out.printf("Hours per day: %.2f%n", worker.getWorkHoursPerDay());
            System.out.printf("Salary per hour: %.2f%n", worker.calculateSalaryPerHour());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


