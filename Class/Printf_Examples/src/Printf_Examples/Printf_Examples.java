/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printf_Examples;

import java.util.Scanner;//Used for cin
import java.util.Random;//Get a "random" number
import java.util.Timer;

/**
 *
 * @author rcc
 */
public class Printf_Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Demonstrates Input 
        Scanner Keyboard = new Scanner (System.in);
        System.out.print("Enter an integer value: ");
        int number = Keyboard.nextInt();
        System.out.println("You entered: "+ number);
        
        System.out.println("=================================");
        
        //Demonstrate inputing a floating point number
        System.out.print("Enter a float number: ");
        float num = Keyboard.nextFloat();
        //Demonstrate right justification with the format 
        //Specifier: %.3f
        System.out.printf("%.3f\n",num);
        System.out.printf("%.3f\n",num*3);
        System.out.printf("%.3f\n",num*26);
        System.out.printf("%.3f\n",num*114);
        System.out.println();
        
        System.out.println("=================================");
        //Used to demonstrate the set length
        System.out.printf("%.1f\n",num);
        System.out.printf("%.2f\n",num*3);
        System.out.printf("%.3f\n",num*26);
        System.out.printf("%.4f\n",num*114);
        System.out.println();
        
        System.out.println("=================================");
    
        int x = 5;
        int y = 8;
        System.out.printf(" %d + %d = %d \n",x,y,x+y);
        System.out.printf("%s%s","This is the first string\n","This is the second string\n");
        System.out.println("=================================");
        
        ////////////////////
        //Demonstrates left justification with width of 4
        System.out.printf("%-4d\n",1);
        System.out.printf("%-4d\n",13);
        System.out.printf("%-4d\n",263);
        System.out.printf("%-4d\n",1114);
        System.out.println();
        System.out.println("=================================");
        
        //Demonstrate right justification with width of 4
        System.out.printf("%4d\n",1);
        System.out.printf("%4d\n",13);
        System.out.printf("%4d\n",263);
        System.out.printf("%4d\n",1114);
        System.out.println();
        System.out.println("=================================");
        
        //Demonstrate right justification with
        //width of 5, and zero filled
        System.out.printf("%05d\n",1);
        System.out.printf("%05d\n",13);
        System.out.printf("%05d\n",263);
        System.out.printf("%05d\n",1114);
        System.out.println();
        System.out.println("=================================");
        
        //Test for fun
        System.out.printf("'%+5d'\n", 10);//At least five-wide, with a plus sign
        System.out.printf("'%-+5d'\n", 10);//Five-wide, plus sign, left-justified
        System.out.println();
        
    }

    
}
