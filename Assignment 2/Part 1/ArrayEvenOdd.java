// Create a Java Program that takes accepts numbers from users and stores them in two different arrays, odd and even.
// Code by Aadith Sukumar (https://www.github.com/aadi1011)

package EvenOddArray;
import java.util.Scanner; 

public class ArrayEvenOdd 
{
    public static void main(String[] args) {
        // Create two arrays odd and even
        int[] odd = new int[10];
        int[] even = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to classify, enter 'end' to stop: ");
        while(true)
        {
            String input = sc.nextLine();
            if(input.equals("end"))
            {
                break;
            }
            else
            {
                int num = Integer.parseInt(input);
                if(num%2 == 0)
                {
                    for(int i=0; i<even.length; i++)
                    {
                        if(even[i] == 0)
                        {
                            even[i] = num;
                            break;
                        }
                    }
                }
                else
                {
                    for(int i=0; i<odd.length; i++)
                    {
                        if(odd[i] == 0)
                        {
                            odd[i] = num;
                            break;
                        }
                    }
                }
            }
        }
        sc.close();
        // Print the arrays
        System.out.println("Even numbers: ");
        for(int i=0; i<even.length; i++)
        {
            if(even[i] != 0)
            {
                System.out.print(even[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers: ");
        for(int i=0; i<odd.length; i++)
        {
            if(odd[i] != 0)
            {
                System.out.print(odd[i]+" ");
            }
        }
    }    
}
