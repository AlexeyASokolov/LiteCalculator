package com.LiteCalculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {
    private static int index;

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        System.out.println(StringCalc(example));

    }


    public static String StringCalc(String example) throws Exception {
        String adding = "+";
        String substracting = "-";
        String multiplying = "*";
        String dividing = "/";
        String result = "";

        boolean containsAdding = example.contains(example.valueOf(adding));
        boolean containsSub = example.contains(example.valueOf(substracting));
        boolean containsMult = example.contains(example.valueOf(multiplying));
        boolean containsDiv = example.contains(example.valueOf(dividing));

        if (!containsAdding && !containsDiv && !containsMult && !containsSub) {

            throw new Exception("Cтрока не является математической операцией");


        }


        if (containsAdding || containsDiv || containsMult || containsSub) {
            if (containsAdding) {
                String[] array2 = example.split("\\s*\\+\\s*");
                if (array2.length > 2) {

                    throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

                }
                if (array2[0].equals("1") || array2[0].equals("2") || array2[0].equals("3") || array2[0].equals("4") || array2[0].equals("5") || array2[0].equals("6") || array2[0].equals("7") || array2[0].equals("8") || array2[0].equals("9") || array2[0].equals("10") || array2[1].equals("1") || array2[1].equals("2") || array2[1].equals("3") || array2[1].equals("4") || array2[1].equals("5") || array2[1].equals("6") || array2[1].equals("7") || array2[1].equals("8") || array2[1].equals("9") || array2[1].equals("10")) {

                    try {
                        int numberInt2 = Integer.parseInt(array2[1]);
                        int numberInt1 = Integer.parseInt(array2[0]);
                        result = String.valueOf(numberInt1 + numberInt2);
                    } catch (Exception e) {
                        throw  new Exception("Используются одновременно разные системы счисления");
                    }


                } else {
                    result = convRim(convArab(array2[0]) + convArab(array2[1]));
                }
            } else if (containsSub) {
                String[] array2 = example.split("\\s*\\-\\s*");
                if (array2[0].equals("1") || array2[0].equals("2") || array2[0].equals("3") || array2[0].equals("4") || array2[0].equals("5") || array2[0].equals("6") || array2[0].equals("7") || array2[0].equals("8") || array2[0].equals("9") || array2[0].equals("10") || array2[1].equals("1") || array2[1].equals("2") || array2[1].equals("3") || array2[1].equals("4") || array2[1].equals("5") || array2[1].equals("6") || array2[1].equals("7") || array2[1].equals("8") || array2[1].equals("9") || array2[1].equals("10")) {
                    try {
                        int numberInt2 = Integer.parseInt(array2[1]);
                        int numberInt1 = Integer.parseInt(array2[0]);
                        result = String.valueOf(numberInt1 - numberInt2);
                    } catch (NumberFormatException e) {
                        throw  new NumberFormatException("Используются одновременно разные системы счисления");
                    }

                } else {
                    result = convRim(convArab(array2[0]) - convArab(array2[1]));
                }

            } else if (containsMult) {
                String[] array2 = example.split("\\s*\\*\\s*");
                if (array2[0].equals("1") || array2[0].equals("2") || array2[0].equals("3") || array2[0].equals("4") || array2[0].equals("5") || array2[0].equals("6") || array2[0].equals("7") || array2[0].equals("8") || array2[0].equals("9") || array2[0].equals("10") || array2[1].equals("1") || array2[1].equals("2") || array2[1].equals("3") || array2[1].equals("4") || array2[1].equals("5") || array2[1].equals("6") || array2[1].equals("7") || array2[1].equals("8") || array2[1].equals("9") || array2[1].equals("10")) {
                    try {
                        int numberInt2 = Integer.parseInt(array2[1]);
                        int numberInt1 = Integer.parseInt(array2[0]);
                        result = String.valueOf(numberInt1 * numberInt2);
                    } catch (NumberFormatException e) {
                        throw  new NumberFormatException("Используются одновременно разные системы счисления");
                    }

                } else {
                    result = convRim(convArab(array2[0]) * convArab(array2[1]));
                }
            } else if (containsDiv) {
                String[] array2 = example.split("\\s*\\/\\s*");
                if (array2[0].equals("1") || array2[0].equals("2") || array2[0].equals("3") || array2[0].equals("4") || array2[0].equals("5") || array2[0].equals("6") || array2[0].equals("7") || array2[0].equals("8") || array2[0].equals("9") || array2[0].equals("10") || array2[1].equals("1") || array2[1].equals("2") || array2[1].equals("3") || array2[1].equals("4") || array2[1].equals("5") || array2[1].equals("6") || array2[1].equals("7") || array2[1].equals("8") || array2[1].equals("9") || array2[1].equals("10")) {
                    try {
                        int numberInt2 = Integer.parseInt(array2[1]);
                        int numberInt1 = Integer.parseInt(array2[0]);
                        result = String.valueOf(numberInt1 / numberInt2);
                    } catch (NumberFormatException e) {
                        throw  new NumberFormatException("Используются одновременно разные системы счисления");
                    }

                } else {
                    result = convRim(convArab(array2[0]) / convArab(array2[1]));
                }
            }
        }

        return result;
    }


    public static String convRim(int number) throws Exception {

        String[] rimArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String result1 = "";

        if (number > 0) {
            result1 = rimArray[number - 1];
        } else if (number < 0) {
                throw new Exception("В римской системе нет отрицательных чисел.");
        }
        return result1;

    }


    public static int convArab(String numberRim) {

        String[] rimArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        String searchinString = numberRim;
        int index = Arrays.asList(rimArray).indexOf(searchinString);
        int result2 = arabArray[index];
        return result2;
    }
}





