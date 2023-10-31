package com.LiteCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(inputNumbers());
    }

    public static int inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String[] array2 = example.split("\\+");
        int numberInt1 = Integer.parseInt(array2[0]);
        int numberInt2 = Integer.parseInt(array2[1]);
        return numberInt1 + numberInt2;




//        int numberInt1 = Integer.parseInt(numberString1);
//        String numberString2 = scanner.nextLine();
//        int numberInt2 = Integer.parseInt(numberString2);


    }
}
