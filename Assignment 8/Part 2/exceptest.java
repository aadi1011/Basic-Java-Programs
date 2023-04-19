import java.util.Scanner;

public class exceptest{
    public static void main(String[] args) throws NOMATCHEXCP {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

       try {
            if (!str.equals("India")) {
                throw new NOMATCHEXCP("String is not equal to India");
            }
       }
        catch(NOMATCHEXCP e){
            e.printStackTrace();
        }
    }
}
