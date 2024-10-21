package com.bullet.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 0, result = 0;
        System.out.print("Enter the first integer: ");
        String value = scanner.next();
        while (!isInt(value)) {
            System.out.print("Enter a valid integer: ");
            value = scanner.next();
        }
        first = Integer.parseInt(value);
        System.out.print("Enter the second integer: ");
        String value1 = scanner.next();
        while (!isInt(value1)) {
            System.out.print("Enter a valid integer: ");
            value1 = scanner.next();
        }
        second = Integer.parseInt(value1);
        result = first + second;
        System.out.println("The result of adding " + first + " and " + second + " is " + result);



    }
    // Create a method for validating for int values
    private static boolean isInt(String value) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();


    }
}
