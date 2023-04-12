/*Write the code for a class BonusEmployee which extends the class Employee.java. This class describes an employee who has a monthly bonus added to their monthly salary */
// Code by Aadith Sukumar (https://www.github.com/aadi1011)
public class BonusEmployee extends employee{

    private int bonus;
    public BonusEmployee(){
        super();
    }

    public int getBonus(){
        return bonus;
    }

    public void setBonus(int b){
        this.bonus = b;
    }

    // add the bonus to the monthly salary of the employee from the monthly salary of the employee from the NormalEmployee class
    public float getMonthlySalary(){
        NormalEmployee ne = new NormalEmployee();
        // add bonus to the monthlySalary from NormalEmployee class
        ne.setBasicSalary(super.getBasicSalary());
        float monthlySalary = (float) (ne.getMonthlySalary() + bonus);
        return monthlySalary; 
    }
}
