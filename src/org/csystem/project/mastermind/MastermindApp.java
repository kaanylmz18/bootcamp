package org.csystem.project.mastermind;

import java.util.Scanner;

import org.csystem.util.array.ArrayUtil;

public class MastermindApp {
    public void run() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int[] realNum = Mastermind.getRandomNumber(4, 1000, 9999);
        ArrayUtil.display(realNum);

        do {
            System.out.println("////////////////////////");
            System.out.println("ENTER YOUR GUESS");
            int predictNum = scanner.nextInt();
            int[] predict = Mastermind.convertNum(predictNum);
            ArrayUtil.display(predict);
            int sumOfPlus = Mastermind.sumOfPlus(Mastermind.compareNum(realNum, predict));
            int sumOfMinus = Mastermind.sumOfMinus(realNum, predict);
            if (sumOfPlus == 4) {
                flag = false;
            }
            System.out.printf("+%d -%d%n", sumOfPlus, sumOfMinus);
        } while (flag);

    }
}
