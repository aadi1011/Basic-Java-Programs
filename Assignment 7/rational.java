// main class for rational numbers to be implemented here.
// take user input from Command Line Arguments as "num1 den1 sum num2 den2" and call the operations class to perform the operations
// Code by Aadith Sukumar (https://www.github.com/aadi1011)

public class rational {
    public static void main(String[] args) {
        // get the input from command line arguments with try catch block to handle strings words as input
        try{
            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            String operator = args[2];
            int num2 = Integer.parseInt(args[3]);
            int den2 = Integer.parseInt(args[4]);

            operations op = new operations(num1, num2, den1, den2);
        switch(operator){
            case "+":
                System.out.println(op.add());
                break;
            case "-":
                System.out.println(op.subtract());
                break;
            case "x":
                System.out.println(op.multiply());
                break;
            case "/":
                System.out.println(op.divide());
                break;
            case "compare":
                System.out.println(op.compare());
                break;
            case "abs":
                System.out.println(op.absolute());
                break;
            case "convert":
                System.out.println(op.convert());
                break;
            default:
                System.out.println("Invalid operation");
        }

        }
        catch(Exception e){
            System.out.println("Invalid input");
            System.exit(0);
        }        
    }
    
}
