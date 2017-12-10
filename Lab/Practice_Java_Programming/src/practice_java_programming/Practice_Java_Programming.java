/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_java_programming;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Practice_Java_Programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a simple java program");
        System.out.print("---------------------------------------\n");
        //Used to print out information
        int number = 100;
        
        System.out.println("Number = "+number);
        
        number*=2;
        
        System.out.println("Number * 2 = "+number);
        System.out.print("---------------------------------------\n");
        //Used to test the if else if else statements
        int x = 10;
        int y = 10;
        
        if(x<y){
            System.out.println("X is less than Y");
        }else if(x==y){
            System.out.println("X is equal to Y");
        }else{
            System.out.println("X is greater than Y");
        }
        System.out.print("---------------------------------------\n");
        Scanner cin = new Scanner(System.in);//Used to read in from the user
        String str = "Hector";
        System.out.print("Input your name\n");
//        str = cin.nextLine();
        System.out.println("This is what you said "+str);
        System.out.print("---------------------------------------\n");
        int a = 5;
        int b = 12;
        int c = (int)/*This is used to statically cast into an integer*/ Math.sqrt(a*a+b*b);/*This is the square root function*/
        System.out.println("The hypotenuse is "+c);
        System.out.print("---------------------------------------\n");
        String num = "100";
        System.out.println("Convert string to int: "+(100+Integer.parseInt(num)));//This allows me to convert the string into an int
        System.out.print("---------------------------------------\n");
        //Find the average of the sum of the array
        int array[] = new int [5];
        for(int i = 0;i < array.length;i++){
            array[i]=i*10;
        }
        int total = 0;
        for(int i =0;i< array.length;i++){
            total = total + array[i];
        }
        System.out.println("The average of the array is "+(total/array.length));
        System.out.print("---------------------------------------\n");
        int random = (int)(Math.random()*100);//Random numbe generator???
        System.out.println(random);
        System.out.print("---------------------------------------\n");
     
// TODO code application logic here
    }
    
}
