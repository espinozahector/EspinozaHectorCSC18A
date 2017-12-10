/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
/**
 *
 * @author rcc
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Character gender;
                   
    public Person()
    {
        firstName="";
        lastName="";
        age=0;
        gender=' ';
    }
    
    public Person(String first,String last,int Age,Character Gender)
    {
        firstName = first;
        lastName = last;
        setAge(Age);
        setGender(Gender);
    }
    //get
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getageName()
    {
        return age;
    }
    public Character getGenderName()
    {
        return gender;
    }
    public void setFirstName(String first)
    {
        firstName = first; 
    }
    public void setLastName(String last)
    {
        lastName = last;
    }
    public void setAge(int a)
    {
        if(a >= 0)age = a;
    }
    public void setGender(Character gen)
    {
        if( gen != null){
            String g = gen.toString().toUpperCase();
            if("M".equals(g) || "F".equals(g) )gender = g.charAt(0);
        }
    }
    @Override
    public String toString()
    {
        return lastName + ", " + firstName + ", age: "+ age + ", gender: " + gender;
    }
    
    
    
    
}


