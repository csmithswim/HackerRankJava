package com.csmithswim;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        Integer inputInteger = scan.nextInt();

        Double inputDouble = scan.nextDouble();

        String inputString = scan.nextLine();

        System.out.println(inputInteger+i);
        System.out.println(inputDouble+2);
        System.out.println(s+inputString);

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
    }
}
