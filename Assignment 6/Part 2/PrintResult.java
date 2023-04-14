/* Java program to implement multiple inheritance and impletmenting an interface on Student info 
*  Code by Aadith Sukumar (https://www.github.com/aadi1011)
*/

public class PrintResult extends Student implements Exam{
        
    PrintResult(String n, String br, String bt, String PRN, int S1, int S2, int S3, int S4, int S5)
    {
        super(n, br, bt, PRN, S1, S2, S3, S4, S5);
    }

    public int calculatePercent(){
        return (Sub1 +Sub2 + Sub3 + Sub4 + Sub5)/5;
    }

    public void show(){
        display();
        System.out.println("Percentage: " + calculatePercent()+"%");
    }

    public static void main(String[] args) {
        PrintResult pr = new PrintResult("Aadi","AIML","2021","003",99,96,89,93,92);
       
        pr.show();
    }
}
