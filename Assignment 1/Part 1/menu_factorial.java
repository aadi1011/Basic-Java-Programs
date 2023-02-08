/* Implementing a menu-driven Java program (like fib or factorial) to implement these input methods in java 
    (command line args, Scanner, BufferedReader, DataInputStream, Console )

    Code by Aadith Sukumar (https://www.github.com/aadi1011)
*/

package Factorial;
import java.io.*;
import java.util.Scanner; 

//creating a class to get factorial of a number
class Get_Factorial
{
    //function to get factorial of a number
    void fetch_fact(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact); //Prints result
    }
}

public class menu_factorial 
{
    public static void main(String[] args) throws IOException
    {  
        //creating an object of Get_Factorial class and buffer reader object
        Get_Factorial obj1 = new Get_Factorial();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        //creating a menu
        int choice;
        System.out.println("Enter your choice: ");
        System.out.println("1. Command Line Arg");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");
        System.out.println("6. Exit");
        choice = Integer.parseInt(b.readLine()); //taking input from user

        if(choice == 1) //if user chooses command line arg
        {
            // the number is passed as a command line argument. User should pass the number 
            // as argument while calling the program and then select this option
            obj1.fetch_fact(Integer.parseInt(args[0]));
        }
        else if(choice == 2) //if user chooses scanner method
        {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter your number for scanner: ");
            int a = myObj.nextInt();
            obj1.fetch_fact(a);
            myObj.close();
        }
        else if(choice == 3) //if user chooses buffer reader method
        {
            BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your number for BufferReader: ");
            String n = a1.readLine();
            int n1 = Integer.parseInt(n);
            obj1.fetch_fact(n1);
        }
        else if(choice == 4) //if user chooses data input stream method
        {
            //taking data input stream from input.txt file
            try
            {
                DataInputStream a2 = new DataInputStream(new FileInputStream("C:\\Users\\Aadith Sukumar\\Desktop\\E-Learn\\SIT\\Second Year\\Sem 4\\PIJ Lab\\Factorial\\input.txt"));
                // readline() method is used to read string. It is deprecated in to take input from a file. 
                String s = a2.readLine();
                int n2 = Integer.parseInt(s);
                obj1.fetch_fact(n2);
                a2.close();
            }catch (Exception e) //catching exception
            {
                e.printStackTrace();
            } 
        }
        else if(choice == 5) //if user chooses console method
        {
            Console a3 = System.console();
            System.out.print("Enter your number for console: ");
            int n3 = Integer.parseInt(a3.readLine());
            obj1.fetch_fact(n3);
        }
        else if(choice == 6) //if user chooses to exit
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
