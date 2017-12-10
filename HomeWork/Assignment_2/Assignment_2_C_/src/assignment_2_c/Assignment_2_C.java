/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_c;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment_2_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        c) Write an application that computes the value of ex by using the following formula. Allow
           the user to enter the number of terms to calculate.
        */
        Scanner cin = new Scanner (System.in);
        int terms;//Input
        int temp=1;//For the x to the pow of...
        float e = 1;//the sum
        int f = 1;//the base
        
        System.out.println("Input the number of terms: ");
        terms=cin.nextInt();
        System.out.println("Input the number of powers: ");
        temp=cin.nextInt();
        
        for(int i =1;i<terms;i++){
           f*=i;
           e+=((float)temp/f);
           temp*=temp;
        }
        System.out.printf("%s%.2f \n","The sum of e^x is -> ",e);
    }
    
    
}
