/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_a;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment_2_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        a) Write an application that reads a nonnegative integer and computes and prints its factorial.
        */
        Scanner cin = new Scanner(System.in);
        System.out.println("Input a nonnegative Integer: ");
        int number = cin.nextInt();
        int sum = 1;
        for(int i =1;i<=number;i++){
            sum *= i; 
        }
        System.out.println("Factorial of "+number+" is "+sum);
    }
    
}