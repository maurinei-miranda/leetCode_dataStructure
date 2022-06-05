package day01;

import java.util.ArrayList;

public class maxDigitSolution {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = maxDigit(6);
        ArrayList<Integer> arrayVazio = new ArrayList<>();
    }

    public static ArrayList<Integer> maxDigit(int maxDigit) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 1000; i <= 7770; i++) {
            int[] digits = Integer.toString(i).chars().map(c -> c - '0').toArray();
            boolean digitFlag = false;
            for (int num : digits) {
                if (num > maxDigit) {
                    digitFlag = true;
                    break;
                }
            }
            if (digitFlag) continue;
            int sum = 0;
            for (int num : digits) {
                sum += num;
            }
            if (sum == 21) myArray.add(i);
        }

        return myArray;
    }
}
