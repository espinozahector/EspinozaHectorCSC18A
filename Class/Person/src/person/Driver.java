
package person;

public class Driver {
    
    public static void main(String args[]){
        
        Person a_person = new Person("Bill","Jones",34,'m');
        
        System.out.println(a_person.toString());
        
        Faculty a_faculty  = new Faculty("paul","conrad",43,'m',"CSCI");
        System.out.println(a_faculty.toString());
       
        Student a_student = new Student("Hector","Espinoza",19,'m',"Computer Science",4.0f);
        System.out.println(a_student.toString());
    }
    
}
