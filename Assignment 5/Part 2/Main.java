import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input all the details of the employee into the object
        NormalEmployee ne = new NormalEmployee();

        System.out.println("Enter the name of the employee: ");
        ne.setName(sc.nextLine());
        
        System.out.println("Enter the address of the employee: ");
        ne.setAddress(sc.nextLine());
        
        System.out.println("Enter the designation of the employee: ");
        ne.setDesignation(sc.nextLine());
        
        System.out.println("Enter the department of the employee: ");
        ne.setDepartment(sc.nextLine());
        
        System.out.println("Enter the date of joining of the employee: ");
        ne.setDOJ(sc.nextLine());
        
        System.out.println("Enter the bank name of the employee: ");
        ne.setBankName(sc.nextLine());
        
        System.out.println("Enter the bank account number of the employee: ");
        ne.setBankAccNo(sc.nextLine());
        
        System.out.println("Enter the UAN of the employee: ");
        ne.setUAN(sc.nextLine());
        
        System.out.println("Enter the ESI of the employee: ");
        ne.setESI(sc.nextLine());
        
        System.out.println("Enter the paid days of the employee: ");
        ne.setPaidDays(sc.nextInt());
        
        System.out.println("Enter the basic monthly salary of the employee: ");
        ne.setBasicSalary(sc.nextFloat());

        // calculate the monthly salary of the employee
        System.out.println("The monthly salary of the employee is: " + ne.getMonthlySalary());

        // ask the user if they want to add a bonus to the employee
        System.out.println("Do you want to add a bonus to the employee? (y/n)");
        char choice = sc.next().charAt(0);
        
        // if yes, then add the bonus to the monthly salary of the employee used previously from NormalEmployee class ne
        if(choice == 'y'){
            BonusEmployee be = new BonusEmployee();
        
            be.setName(ne.getName());
            be.setAddress(ne.getAddress());
            be.setDesignation(ne.getDesignation());
            be.setDepartment(ne.getDepartment());
            be.setDOJ(ne.getDOJ());
            be.setBankName(ne.getBankName());
            be.setBankAccNo(ne.getBankAccNo());
            be.setUAN(ne.getUAN());
            be.setESI(ne.getESI());
            be.setPaidDays(ne.getPaidDays());
            be.setBasicSalary(ne.getBasicSalary());
            System.out.println("Enter the bonus amount: ");
            be.setBonus(sc.nextInt());
            System.out.println("The monthly salary of the employee is: " + be.getMonthlySalary());        
        }
        
        sc.close();
    }
}
