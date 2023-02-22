public class Student 
{
    private int prn;
    private String name;
    private String DOB;
    private int marks;
    Student(int p, String nm, String db, int m) {
        prn = p;
        name = nm;
        DOB = db;
        marks = m;
    }
    public int getPrn() {
        return prn;
    }
    public void setPrn(int p) {
        prn = p;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getDOB() {
        return DOB;
    }
    public void setDOB(String d) {
        DOB = d;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int m) {
        marks = m;
    }
}
