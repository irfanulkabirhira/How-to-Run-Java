package How_To_Run_JAVA;

import java.util.Scanner;

public class Input_from_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter my name: ");
        String name = scanner.nextLine();
        System.out.println("name = " + name);

        System.out.print("Enter my age: ");
        String age = scanner.nextLine();
        System.out.println("age = " + age);

        scanner.close();
    }
}
