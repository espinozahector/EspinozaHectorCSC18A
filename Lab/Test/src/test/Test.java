/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

public class Test {

    
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner cin = new Scanner(System.in); //Used for input
//        String str;//Declares the string str 
//        str = cin.nextLine(); //sets str(string) to the terminal input
//        System.out.println("Hello World" + str);//Prints Hello world and the str
//        System.out.print("Hello World\n");
        //Learn the basics of java
        System.out.println("Hello World");//Used to print out and ends line
        //Adding numbers
        int x = 10;//Variables
        int y = 20;//Variables
        int result = x + y;//Sets a new variable equal to the sum of x and y
        System.out.println("result = "+result);//Used to print the result value
        //If statement 
        ExampleWhile obj = new ExampleWhile();
        obj.whileloop();
    }
    
}
