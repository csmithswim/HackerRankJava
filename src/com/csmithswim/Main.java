package com.csmithswim;
import java.util.Scanner;

//Calculate the final bill one pays when given a tax, base price of food and a calculated tip.

public class Main {

    public static void main(String[] args) {
          // Create a Scanner object to read input from stdin.
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        double tip = (meal_cost * ((double)tip_percent/100));
        double tax = (meal_cost * ((double)tax_percent/100));
        double totalCost = meal_cost + tip + tax;
        int bill = (int)Math.round(totalCost);

        System.out.println(bill);
    }
}
