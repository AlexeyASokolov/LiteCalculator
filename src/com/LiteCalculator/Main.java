package com.LiteCalculator;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        System.out.println(Numbers(example));

    }


    public static String Numbers(String example) throws Exception {
        String adding = "+";
        String substracting = "-";
        String multiplying = "*";
        String dividing = "/";
        String result = null;
        boolean containsAdding = example.contains(example.valueOf(adding));
        boolean containsSub = example.contains(example.valueOf(substracting));
        boolean containsMult = example.contains(example.valueOf(multiplying));
        boolean containsDiv = example.contains(example.valueOf(dividing));


        if (containsAdding) {
            String[] array2 = example.split("\\s*\\+\\s*");

            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            if ((numberInt1 > 0 && numberInt1 <= 10) && (numberInt2 > 0 && numberInt2 <= 10)) {

                result = String.valueOf(numberInt1 + numberInt2);
            }

        } else if (containsSub) {
            String[] array2 = example.split("\\s*\\-\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            if ((numberInt1 > 0 && numberInt1 <= 10) && (numberInt2 > 0 && numberInt2 <= 10)) {
                result = String.valueOf(numberInt1 - numberInt2);
            }

        } else if (containsMult) {
            String[] array2 = example.split("\\s*\\*\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            if ((numberInt1 > 0 && numberInt1 <= 10) && (numberInt2 > 0 && numberInt2 <= 10)) {
                result = String.valueOf(numberInt1 * numberInt2);
            }
        } else if (containsDiv) {
            String[] array2 = example.split("\\s*\\/\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            if ((numberInt1 > 0 && numberInt1 <= 10) && (numberInt2 > 0 && numberInt2 <= 10)) {
                result = String.valueOf(numberInt1 / numberInt2);
            }
        } else if (containsAdding) {
            String[] array2 = example.split("\\s*\\+\\s*");
            result = convRim(convArab(array2[0]) + convArab(array2[1]));
        } else if (containsSub) {
            String[] array2 = example.split("\\s*\\-\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = convRim(convArab(array2[0]) - convArab(array2[1]));
        } else if (containsMult) {
            String[] array2 = example.split("\\s*\\*\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = convRim(convArab(array2[0]) * convArab(array2[1]));
        } else if (containsDiv) {
            String[] array2 = example.split("\\s*\\/\\s*");
            int numberInt1 = Integer.parseInt(array2[0]);
            int numberInt2 = Integer.parseInt(array2[1]);
            result = convRim(convArab(array2[0]) / convArab(array2[1]));
        }

        return result;
    }


    public static String convRim(int number) {

        String[] rimArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII"};
        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72};
        String result1 = null;

        if (number > 0) {
            result1 = rimArray[number - 1];
        }
        return result1;

    }


    public static int convArab(String numberRim) {

        String[] rimArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII"};
        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72};

        String searchinString = numberRim;
        int index = Arrays.asList(rimArray).indexOf(searchinString);
        int result2 = arabArray[index];
        return result2;
    }

}





