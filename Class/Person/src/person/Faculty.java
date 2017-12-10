
package person;

public class Faculty extends Person
{
    protected String degree;
    
    public Faculty(String first,String last,int Age,Character Gender,String Degree)
    {
        super(first,last,Age,Gender);//automatically puts it into its higher order constructer
        degree = Degree;
    }
    //get
    public String getDegree()
    {
        return degree;
    }
    //set
    public void setDegree(String d)
    {
        degree = d;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", degree: " + degree;
    }
    
}
