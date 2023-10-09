package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {

    public static final int MAX_WIN = 3;
    public static final int MAX_RANDOM = 100;
    public static final int MAX_STEP = 10;

    public static void iterationOfGameEven() {

        Even.greetGameEven();

        int win = 0;
        int defeat = 0;

        while (win < Even.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Even.questionGameEven();

                if (Even.getAnswerEven().equals("yes")) {
                    if (Even.randomNumberInGameEven % 2 == 0) {
                        Even.gameWin();
                        win++;
                    } else {
                        Even.gameOverAnswerYes();
                        defeat++;
                    }
                } else if (Even.getAnswerEven().equals("no")) {
                    if (Even.randomNumberInGameEven % 2 != 0) {
                        Even.gameWin();
                        win++;
                    } else {
                        Even.gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    Even.gameOverErrorEven();
                    defeat++;
                }
            }
        }
        if (win == Even.MAX_WIN) {
            Even.gameOverCongratulation();
        }
    }

    public static void iterationOfGameCalc() {

        Calc.greetGameCalc();

        int win = 0;
        int defeat = 0;

        while (win < Calc.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Calc.questionGameCalc();

                if (Calc.getAnswerCalc() == Calc.getExpectedResult()) {
                    Calc.gameWin();
                    win++;
                } else {
                    Calc.gameOverErrorCalc();
                    defeat++;
                }
            }

            if (win == Calc.MAX_WIN) {
                Calc.gameOverCongratulation();
            }
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    public static int calculateExpression(int number1, int number2, char operator) {
        int result;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else {
            result = 0;
        }
        return result;
    }

    public static void iterationOfGameGCD() {

        GCD.greetGameGCD();

        int win = 0;
        int defeat = 0;

        while (win < GCD.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                GCD.questionGameGCD();

                if (GCD.getAnswerGCD() == GCD.getExpectedResultGCD()) {
                    GCD.gameWin();
                    win++;
                } else {
                    GCD.gameOverErrorGCD();
                    defeat++;
                }
            }

            if (win == GCD.MAX_WIN) {
                GCD.gameOverCongratulation();
            }
        }
    }

    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void iterationOfGameProgression() {

        Progression.greetGameProgression();

        int win = 0;
        int defeat = 0;

        while (win < Progression.MAX_WIN) {

            if (defeat > 0) {
                break;
            } else {

                Progression.questionGameProgression();

                if (Progression.getAnswerProgression() == Progression.getExpectedResultProgression()) {
                    Progression.gameWin();
                    win++;
                } else {
                    Progression.gameOverErrorProgression();
                    defeat++;
                }
            }
            if (win == Progression.MAX_WIN) {
                Progression.gameOverCongratulation();
            }
        }
    }





    private static String gamer = "";

    public static void gameGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    public static void nameGamer() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        gamer = userName;
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + gamer + "!");
    }

    public static void gameOverAnswerNo() {
        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverAnswerYes() {
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorPrime() {
        System.out.println("'" + Prime.getAnswerPrime() + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }
}
