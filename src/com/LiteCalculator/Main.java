package com.LiteCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(inputNumbers());
    }

    public static int inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String adding = "+";
        String substracting = "-";
        String multiplying = "*";
        String dividing ="/";
        boolean containsAdding = example.contains(example.valueOf(adding));
        boolean containsSub = example.contains(example.valueOf(substracting));
        boolean containsMult = example.contains(example.valueOf(multiplying));
        boolean containsDiv = example.contains(example.valueOf(dividing));
        int result = 0;
        if (containsAdding) {
            String[] array2 = example.split(" \\+ " );
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
}
