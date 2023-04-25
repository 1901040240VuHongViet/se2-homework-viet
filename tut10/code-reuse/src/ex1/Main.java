package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Child child = new Child(name, age);
            System.out.println(child.toString());

            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();

        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
