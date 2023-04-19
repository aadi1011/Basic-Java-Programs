# Assignment 8 Part 1
Write a java program to find the factorial of 'n' integers (as command line arguments)
Write your own exception `FactorialException` to validate integer values to be in a certain range
        `$ java ExceptionDemo 8 -6 14 abcd 5`
1. Static main method invokes another method `factorialCalculator()`
2. CLA which are strings but interpreted as integer values are passed to `factorialCalculator()` method
3. The user defined exception `FactorialException` should have proper constructors, Overridden `toString()` to display exception message along with input number that had generated the exception 'NumberFormat exception' & your exception for n range (n<0 or n>15)
