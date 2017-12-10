/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_b;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment_2_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        b) Write an application that estimates the value of the mathematical constant e by using
           the following formula. Allow the user to enter the number of terms to calculate.
        */
        int terms;
        float e = 1;
        int f = 1;
        Scanner cin = new Scanner (System.in);
        System.out.println("Input the number of terms to calculate: ");
        terms = cin.nextInt();
        
        for(int i=1;i<=terms;i++){
           e+=(1/f);
           f*=i;
        }
        System.out.printf("%s%.2f \n","The sum of e is -> ",e);
    }
    
}
