package EvenOddArray;
import java.util.Scanner;

public class SmallestDistance 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int minI=0,minJ=0;
        for (int i = 0; i < 9; i++) 
        {
            int diff = arr[i+1] - arr[i];
            if(diff < min)
            {
                min = diff;
                minI = i;
                minJ = i+1;
            }
        }
        System.out.println("The smallest distance is between " + arr[minI] + " and " + arr[minJ]+ " and the distance is " + min);
        sc.close();
    }
}
