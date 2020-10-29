package com.csmithswim;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        //Declare variables
        Integer inputInteger;
        Double inputDouble;
        String inputString;

        //Reading input from console
        inputInteger = scan.nextInt();
        inputDouble = scan.nextDouble();
        scan.nextLine();
        inputString = scan.nextLine();

        System.out.println(inputInteger+i);
        System.out.println(inputDouble+2);
        System.out.println(s+inputString);


    }
}
