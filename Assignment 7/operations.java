/* Write a Java application that will be able to add, subtract, multiply, divide, 
compare, convert to floating point, and find absolute value for rational 
numbers, with exception handling */

import java.lang.Math;

public class operations{

    // one rational number will be input as "num1/den1" and the other as "num2/den2"
    int num1, num2, den1, den2;
    int num_result, den_result;
    
    public operations(int num1, int num2, int den1, int den2){
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
    }

    // add two rational numbers and return the result in the same format "num/dem"
    public String add(){
        if (den1 == den2){
            num_result = num1 + num2;
            den_result = den1;
        }
        else{
            num_result = (num1*den2) + (num2*den1);
            den_result = den1*den2;
        }
        return num_result+"/"+den_result;
    }

    // subtract two rational numbers and return the result in the same format "num/dem"
    public String subtract(){
        if (den1 == den2){
            num_result = num1 - num2;
            den_result = den1;
        }
        else{
            num_result = (num1*den2) - (num2*den1);
            den_result = den1*den2;
        }
        return num_result+"/"+den_result;
    }

    // multiply two rational numbers and return the result in the same format "num/dem"
    public String multiply(){
        num_result = num1*num2;
        den_result = den1*den2;
        return num_result+"/"+den_result;
    }

    // divide two rational numbers and return the result in the same format "num/dem"
    public String divide(){
        //throwing divideByZero exception is the denominator is zero
        if (den2 == 0){
            throw new ArithmeticException("Divide by zero");
        }
        else{
            num_result = num1*den2;
            den_result = den1*num2;
            return num_result+"/"+den_result;
        }
    }

    // compare two rational numbers and return the result in the same format "num/dem"
    public String compare(){
        if (num1/den1 == num2/den2){
            return "Both numbers are equal";
        }
        else if (num1/den1 > num2/den2){
            return "First number is greater";
        }
        else{
            return "Second number is greater";
        }
    }

    // convert both rational numbers to floating point and return the result
    public String convert(){
        return "First number in floating point: "+(float)num1/den1+" Second number in floating point: "+(float)num2/den2;
    }

    // find absolute value of both rational numbers and return the result
    public String absolute(){
        return "Absolute value of first number: "+Math.abs(num1/den1)+" Absolute value of second number: "+Math.abs(num2/den2);
    }

}
