abstract class employee{
    
    private String name, address, designation, department, DOJ, BankName, BankAccNo, UAN, ESI;
    protected int paidDays;
    protected float basicSalary, basicWage;

    // getter and setter methods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDOJ(){
        return DOJ;
    }

    public void setDOJ(String DOJ){
        this.DOJ = DOJ;
    }

    public String getBankName(){
        return BankName;
    }

    public void setBankName(String BankName){
        this.BankName = BankName;
    }

    public String getBankAccNo(){
        return BankAccNo;
    }

    public void setBankAccNo(String BankAccNo){
        this.BankAccNo = BankAccNo;
    }

    public String getUAN(){
        return UAN;
    }

    public void setUAN(String UAN){
        this.UAN = UAN;
    }

    public String getESI(){
        return ESI;
    }

    public void setESI(String ESI){
        this.ESI = ESI;
    }

    public float getBasicSalary(){
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary){
        this.basicSalary = basicSalary;
    }

    public int getPaidDays(){
        return paidDays;
    }

    public void setPaidDays(int paidDays){
        this.paidDays = paidDays;
    }

    public float getBasicWage(){
        return basicWage;
    }

    public void setBasicWage(float basicWage){
        this.basicWage = basicWage;
    }
    
    // abstract method
    public abstract float getMonthlySalary();
}
