package org.csystem.project.mastermind;

import java.util.Random;

import org.csystem.util.number.NumberUtil;

public class Mastermind {
    public static void main(String[] args) {

    }

    public void play() {

    }

    public static int sumOfMinus(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i] == b[i]) {
                continue;
            } else {
                for (int j = b.length-1; j >= 0; j--) {
                    if (a[j]==b[i]) {
                        sum++;
                        break;
                    }
                }
            }
        }
        return sum;

    }

    public static int sumOfPlus(boolean[] bool) {
        int sum = 0;
        for (int i = 0; i < bool.length; i++) {
            if (bool[i]) {
                sum++;
            }
        }
        return sum;
    }

    public static boolean[] compareNum(int[] a, int[] b) {
        boolean[] bool = new boolean[4];
        for (int i = 0; i < bool.length; i++) {
            if (a[i] == b[i]) {
                bool[i] = true;
            }
        }
        return bool;

    }

    public static int[] getRandomNumber(int a, int min, int max) {
        int[] num = new int[a];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(9) + 1;
            for (int j = i - 1; j >= 0; j--) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }

            }

        }
        return num;

    }

    public static int[] convertNum(int num) {
        int[] b = new int[NumberUtil.countDigits(num)];
        for (int i = b.length-1; i>=0; i--) {
            b[i] = num % 10;
            num = num / 10;
        }

        return b;

    }
}
