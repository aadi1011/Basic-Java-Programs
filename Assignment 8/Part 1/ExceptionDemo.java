class FactorialException extends Exception {
    public FactorialException(String s) {
        super(s);
    }
}

public class ExceptionDemo{
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                int fact = 1;
                n = Integer.parseInt(args[i]);
                if (n < 0 || n > 15) {
                    throw new FactorialException("Number out of range");
                }
                for (int j = 1; j <= n; j++) {
                    fact = fact * j;
                }
                System.out.println("Factorial of " + n + " is " + fact);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (FactorialException e) {
                System.out.println(e.toString());
            }
        }
    }
}
