public class NormalEmployee extends employee{
    
    //constructor
    public NormalEmployee(){
        super();
    }

    // getter and setter methods
    public float getBasicSalary(){
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary){
        this.basicSalary = basicSalary;
    }

    // basicWage calculation by dividing basicSalary by 30 and multiplying by paidDays
    public float getBasicWage(){
        basicWage = (float)(getBasicSalary() / 30) * paidDays;
        return basicWage;
    }

    public float earnings(){
        // ta = travel allowance
        // ta is 20% of basic salary
        float ta = (float)(getBasicWage() * 0.2);
        System.out.println("\nTravel allowance: " + ta);

        // hra = house rent allowance
        // hra is 40% of basic salary
        float hra = (float)(getBasicWage() * 0.4);
        System.out.println("House rent allowance: " + hra);

        // cv = conveyance allowance
        // cv is 10% of basic salary
        float cv = (float)(getBasicWage() * 0.1);
        System.out.println("Conveyance allowance: " + cv);

        // medi = medical allowance
        // medi is 15% of basic salary
        float medi = (float)(getBasicWage() * 0.15);
        System.out.println("Medical allowance: " + medi);

        float totalAllowance = ta + hra + cv + medi;
        System.out.println("Total allowance: " + totalAllowance);
        return totalAllowance;
    }

    public float deductions(){
        // epf = employee provident fund
        // epf is 12% of basic salary
        float epf = (float)(getBasicWage() * 0.12);
        System.out.println("\nEmployee provident fund: " + epf);

        // pt = professional tax
        // pt is 10% of basic salary
        float pt = (float)(getBasicWage() * 0.1);
        System.out.println("Professional tax: " + pt);

        //esi = employee state insurance
        // esi is 1.75% of basic salary
        float esi = (float)(getBasicWage() * 0.0175);
        System.out.println("Employee state insurance: " + esi);

        float totalDeduction = epf + pt + esi;
        System.out.println("Total deduction: " + totalDeduction);
        return totalDeduction;
    }

    //getMonthlySalary() method
    public float getMonthlySalary(){
        float monthlySalary = getBasicWage() + earnings() - deductions();
        System.out.println("\nMonthly salary: " + monthlySalary);
        return monthlySalary;
    }

    
}
