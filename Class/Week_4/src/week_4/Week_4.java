/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_4;
import java.util.*;//inclues all the util packages

/**
 *
 * @author rcc
 */
public class Week_4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cin = new Scanner (System.in);
        System.out.println("Enter a value for X: ");
        int x = cin.nextInt();
        System.out.println("Enter a value for Y: ");
        int y = cin.nextInt();
        System.out.println("Enter a value for Z: ");
        int z = cin.nextInt();
        System.out.println("Enter a value for W: ");
        int w = cin.nextInt();
        
        
        System.out.println(myMin(x,y,z,w));
        /*
        Modular programming - break problems down into smaller more managable parts
        
        
        access modifier's
        public-
        private-
        protected-
        
        return_type function name([parameter list]){
            //Function body has to code to execute function
            return return_value;
        }
        
        public long_factorical (long n){
            long f=1;
        
        for(int i=1;i<=n;i++{
            f=f*i;
        }
        return f;
        }
        
        ///////////////////
        //Must put static//
        ///////////////////
        public static long factorial(long n){
            long f=1;
        
        if(n<0){
            f=-1;
        }
        }
        
        public static void main(){
            //code
        }
        
        //Package;
        //import;
        
        public class name_of)class{
            member variables;
        }
        */
        
        
    }
    public static int myMin(int x,int y,int z,int w){
            int result = x;
            
            if(y<result) result=y;
            if(z<result) result = z;
            if(w<result) result =w;
            
            return result;
        }
    
}
