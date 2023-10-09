package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {
    public static final int MAX_RANDOM = 100;
    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

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
                    if (Even.getRandomNumberInGameEven() % 2 == 0) {
                        Even.gameWin();
                        win++;
                    } else {
                        Even.gameOverAnswerYes();
                        defeat++;
                    }
                } else if (Even.getAnswerEven().equals("no")) {
                    if (Even.getRandomNumberInGameEven() % 2 != 0) {
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

    public static void iterationOfGamePrime() {

        Prime.greetGamePrime();

        int win = 0;
        int defeat = 0;

        while (win < Prime.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                Prime.questionGamePrime();

                boolean isPrime = Prime.checkPrimeNumber();

                if (Prime.getAnswerPrime().equals("yes")) {
                    if (isPrime) {
                        Prime.gameWin();
                        win++;
                    } else {
                        Prime.gameOverAnswerYes();
                        defeat++;
                    }

                } else if (Prime.getAnswerPrime().equals("no")) {

                    if (!isPrime) {
                        Prime.gameWin();
                        win++;
                    } else {
                        Prime.gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    Prime.gameOverErrorPrime();
                    defeat++;
                }
            }
        }
        if (win == Prime.MAX_WIN) {
            Prime.gameOverCongratulation();
        }
    }
}
