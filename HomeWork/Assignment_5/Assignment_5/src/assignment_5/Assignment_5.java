/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;

import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base;
        int exponent;
        int number1,number2;
        
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Input the base: ");
        base = cin.nextInt();
        System.out.print("Input the exponent: ");
        exponent = cin.nextInt();
        System.out.print("Input number 1: ");
        number1 = cin.nextInt();
        System.out.print("Input number 2: ");
        number2 = cin.nextInt();
        
        System.out.println();
        System.out.println(base+" to the power of "+exponent+" is "+integerPower(base,exponent));
        System.out.println("Greatest common divisor for "+number1+" and "+number2+" is "+gcd(number1,number2));
        
    }
    public static int gcd(int number1,int number2){
        int a,b;//a is the greater number, b is the smaller number
        
        //Used to find the greater of the two numbers
        if(number1<number2){
            a=number2;
            b=number1;
        }else{
            a=number1;
            b=number2;
        }   
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static int integerPower(int base,int exponent){
        if(exponent<=0){
            return 1;
        }else{
            return (base * integerPower(base,--exponent));
        }
    }
    
}