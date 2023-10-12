package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static final int MAX_WIN = 3;
    private static String userName;
    private static int answerInt;
    private static String answerStr;
    private static int expectedResult;


    public static void iterationOfGameEven() {

        greetGame();
        Even.gameTaskEven();

        int win = 0;
        int defeat = 0;

        while (win < MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Even.questionGameEven();
                Even.answerGameEven();
                int question = Even.getQuestionEven();
                answerStr = Even.getAnswerEven();

                if (answerStr.equals("yes")) {
                    if (question % 2 == 0) {
                        gameWin();
                        win++;
                    } else {
                        gameOverAnswerYes();
                        defeat++;
                    }
                } else if (answerStr.equals("no")) {
                    if (question % 2 != 0) {
                        gameWin();
                        win++;
                    } else {
                        gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    gameOverErrorStringResult();
                    defeat++;
                }
            }
        }
        if (win == MAX_WIN) {
            gameOverCongratulation();
        }
    }

    public static void iterationOfGameCalc() {

        greetGame();
        Calc.gameTaskCalc();

        int win = 0;
        int defeat = 0;

        while (win < MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Calc.questionGameCalc();
                Calc.answerGameCalc();
                expectedResult = Calc.getExpectedResultCalc();
                answerInt = Calc.getAnswerCalc();

                if (answerInt == expectedResult) {
                    gameWin();
                    win++;
                } else {
                    gameOverErrorIntResult();
                    defeat++;
                }
            }

            if (win == MAX_WIN) {
                gameOverCongratulation();
            }
        }
    }

    public static void iterationOfGameGCD() {

        greetGame();
        GCD.gameTaskGCD();

        int win = 0;
        int defeat = 0;

        while (win < MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                GCD.questionGameGCD();
                GCD.answerGameGCD();
                expectedResult = GCD.getExpectedResultGCD();
                answerInt = GCD.getAnswerGCD();

                if (answerInt == expectedResult) {
                    gameWin();
                    win++;
                } else {
                    gameOverErrorIntResult();
                    defeat++;
                }
            }

            if (win == MAX_WIN) {
                gameOverCongratulation();
            }
        }
    }

    public static void iterationOfGameProgression() {

        greetGame();
        Progression.gameTaskProgression();

        int win = 0;
        int defeat = 0;

        while (win < MAX_WIN) {

            if (defeat > 0) {
                break;
            } else {

                Progression.questionGameProgression();
                Progression.answerGameProgression();
                expectedResult = Progression.getExpectedResultProgression();
                answerInt = Progression.getAnswerProgression();

                if (answerInt == expectedResult) {
                    gameWin();
                    win++;
                } else {
                    gameOverErrorIntResult();
                    defeat++;
                }
            }
            if (win == MAX_WIN) {
                gameOverCongratulation();
            }
        }
    }

    public static void iterationOfGamePrime() {

        greetGame();
        Prime.gameTaskPrime();

        int win = 0;
        int defeat = 0;

        while (win < MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Prime.questionGamePrime();
                Prime.answerGamePrime();
                answerStr = Prime.getAnswerPrime();

                boolean isPrime = Prime.checkPrimeNumber();

                if (answerStr.equals("yes")) {
                    if (isPrime) {
                        gameWin();
                        win++;
                    } else {
                        gameOverAnswerYes();
                        defeat++;
                    }

                } else if (answerStr.equals("no")) {

                    if (!isPrime) {
                        gameWin();
                        win++;
                    } else {
                        gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    gameOverErrorStringResult();
                    defeat++;
                }
            }
        }
        if (win == MAX_WIN) {
            gameOverCongratulation();
        }
    }

    public static void greetGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gameOverAnswerNo() {
        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void gameOverAnswerYes() {
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void gameOverErrorStringResult() {
        System.out.print("'" + answerStr + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void gameOverErrorIntResult() {
        System.out.print("'" + answerInt + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was " + "'" + expectedResult + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
