package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int item = scanner.nextInt();

        switch (item) {
            case 1:
                Cli.newGame();
                break;
            case 2:
                Even.gameEven();
                break;
            case 3:
                Calc.gameCalc();
                break;
            case 0:
                System.out.print("Exit");
                break;
            default:
                System.out.print("Exit");
                break;
        }
    }
}
