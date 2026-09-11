/*
Name: Soleil Serrano
Course #: 80231
Week: 2
Lab: 1
Date: 9/11/2026
*/
import java.util.Scanner;
public class FutureValue 
{
    public static void main(String [] args)
    {
        //equation - F = P * (1 + i)^t
        //for user input
        Scanner keyboard = new Scanner(System.in);
        //vars for calculation
        double presentValue, interestRate, futureV;
        int months;
        //ask user for account's present value
        System.out.println("Enter your account's present value: ");
        presentValue = keyboard.nextDouble();
        System.out.println("Enter the monthly interest rate (as a decimal): ");
        interestRate = keyboard.nextDouble();
        System.out.println("Enter the number of months the money will remain in the account: ");
        months = keyboard.nextInt();

        futureV = futureValue(presentValue, interestRate, months);

        //display the future value
        System.out.printf("The future value of your account will be $%.2f", futureV);

    }
    /*
        futureValue() - accepts present val, monthly interest rate, and number of months
        as parameters, calculates account's future value, return the account's future
        value as double
    */
    public static double futureValue(double p, double iR, int m) //p - present val, iR - monthly interest rate, m - # of months
    {
        double fV = p * Math.pow((1 + iR),m); //fV is future value of acc
        return fV;
    }
}
