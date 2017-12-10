package person;

public class Student extends Person 
{
    protected String major;
    protected float gpa;
    
    public Student(String first,String last,int Age,Character Gender,String Major, float Gpa)
    {
        super(first,last,Age,Gender);
        major = Major;
        gpa = Gpa;
    }
    //set
    public void setMajor(String m)
    {
        major = m;
    }
    public void setGpa(float GPA)
    {
        if(GPA >= 0) gpa = GPA;
    }
    //get
    public float getGpa()
    {
        return gpa;
    }
    public String getMajor()
    {
        return major;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", major: " + major + ", gpa: " + gpa;
    }
}
