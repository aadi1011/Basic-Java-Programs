/* Implementing a simple menu driven calculator in java to
   implement add, sub, mul, div, sqrt, power, mean, variance.
   Implement a separate Calculator class to include all related function inside that class.

 * Code by Aadith Sukumar (https://www.github.com/aadi1011)
*/

// importing required packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;
import java.lang.String;
import java.lang.Math;

// For user input we use Scanner
// For Scanner class use java.util package
import java.util.Scanner;

// defining class Operations which contains the all the arithmetic functions
class Operations
{
    void addition(int a, int b)
    {
        System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
    }
    void subtraction(int a, int b)
    {
        System.out.println("Difference of "+a+" and "+b+" = "+(a-b));
    }
    void multiply(int a, int b)
    {
        System.out.println("Product of "+a+" and "+b+" = "+(a*b));
    }
    void dividing(int a, int b)
    {
        System.out.println("Division of "+a+" by "+b+" = "+(a/b));
    }
    void power(int a, int b)
    {
        System.out.println("Exponent of "+a+" raised to power of "+b+" = "+(a^b));
    }
    void square_root(int a, int b)
    {
        System.out.println("Square root of "+a+" = "+(Math.sqrt(a)));
        System.out.println("Square root of "+b+" = "+(Math.sqrt(b)));
    }
    void mean(int a, int b)
    {
        System.out.println("Mean of "+a+" and "+b+" = "+((a+b)/2));
    }
    void variance(int a, int b)
    {
        System.out.println("Variance of "+a+" and "+b+" = "+((a-b)^2));
    }

   // creating a separate function for mean calculating with a larger array of number input
    void meanpart2() throws IOException
    {
        System.out.println("MEAN CALCULATOR:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        String input;
        int count = 0;
        int sum = 0;
        int total = 0;
        double mean = 0;
        int n;

        System.out.println("Enter the numbers to calculate mean (Enter 'end' to stop taking input): ");
       // loop to take in numbers until user inputs 'end'
        while(true)
        {
            System.out.print("Enter number: ");
            input = br.readLine();
            if(input.equalsIgnoreCase("End"))
            {
                break;
            }
           // keeps calculating the mean of the entered values in run-time
            else
            {
                n = Integer.parseInt(input);
                count+=1;
                total+=n;
                mean = total/count;
            }
        }
        System.out.println("Mean of the numbers entered is: "+mean);

    }

}


// main class with driver function
public class Calculator
{
    public static void main(String[] k) throws IOException
    {
        Scanner myObj = new Scanner(System.in); //Scanner Object
        System.out.print("Enter first number: ");
        int a = myObj.nextInt(); //Input number one
        System.out.print("Enter second number: ");
        int b = myObj.nextInt(); //Input second number

       // creating a new object for Operations class
        Operations obj1 = new Operations();

        obj1.addition(a, b);
        obj1.subtraction(a, b);
        obj1.multiply(a, b);
        obj1.dividing(a, b);
        obj1.power(a, b);
        obj1.square_root(a, b);
       
        obj1.variance(a, b);

        obj1.meanpart2();

        System.out.println();

        myObj.close(); //closing the scanner object

    }
}
