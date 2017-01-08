public class Student
{
    private String first;
    private String last;
    private int ID;
    private double gpa;
    
    public Student(String l, String f, int ID, double gpa)
    {
        this.last = l;
        this.first = f;
        this.ID = ID;
        this.gpa = gpa;
    }
    
    public String getFirst()
    {
        return first;
    }
    
    public String getLast()
    {
        return last;
    }
    
    public int GetID()
    {
        return ID;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    
    public String toString()
    {
        return first + " " + last + " " + "(" + ID + ")" + " " + gpa;        
    }
}
    