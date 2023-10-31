package com.LiteCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(arabNumbers());
        System.out.println(rimNumbers());
    }

    public static int arabNumbers() {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String adding = "+";
        String substracting = "-";
        String multiplying = "*";
        String dividing = "/";
        boolean containsAdding = example.contains(example.valueOf(adding));
        boolean containsSub = example.contains(example.valueOf(substracting));
        boolean containsMult = example.contains(example.valueOf(multiplying));
        boolean containsDiv = example.contains(example.valueOf(dividing));
        int result = 0;
        if (containsAdding) {
            String[] array2 = example.split(" \\+ ");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = numberInt1 + numberInt2;
        } else if (containsSub) {
            String[] array2 = example.split(" \\- ");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = numberInt1 - numberInt2;
        } else if (containsMult) {
            String[] array2 = example.split(" \\* ");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = numberInt1 * numberInt2;
        } else if (containsDiv) {
            String[] array2 = example.split(" \\/ ");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = numberInt1 / numberInt2;
        }
        return result;

    }

    public static String rimNumbers() {

        Scanner scanner = new Scanner(System.in);
        int example = scanner.nextInt();
        String rim = convRim(example);
        return rim;
    }

    public static String convRim(int number) {

        String[] rimArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII"};
        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72};
        String result2 = null;

        for (int i = 0; i < arabArray.length; i++) {
            if (number == arabArray[i]) {
                result2 = rimArray[i];
            }
        }
        return result2;

    }
}

