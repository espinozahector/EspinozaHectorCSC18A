/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
             Print a table that shows the value of π approximated by computing the first 200,000 terms of this
             series. How many terms do you have to use before you first get a value that begins with 3.14159?
        */
        int n=200000;
        double pie = 3.14159;
        float total = 0;
        int pow=1;
        boolean roll=true;
        
        int i=1;
        while(roll){
            total+= (float)pow * 4 / (2 * i-1);
            i++;
            pow*=-1;
            if(i<=n){//Used to print out the table that shows the value of n for the first 200,000 terms
                System.out.println("Term "+i+": "+total);
            }
            
            if(Math.abs(total-pie) < 0.000001){
                System.out.println("The first term where the value begins with 3.14159 is "+i);
                roll=false;
            }
        }
        
    }
}
