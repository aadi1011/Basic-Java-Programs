package EvenOddArray;
import java.util.Scanner; 
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int l = 0; l < 10; l++)
        {
            int n = sc.nextInt();
            array[l] = n;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int l = 0; l < 10; l++){
            list.add(array[l]);
        }
        System.out.println(list);
        sc.close();        
    }
}
