package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

    }
}
