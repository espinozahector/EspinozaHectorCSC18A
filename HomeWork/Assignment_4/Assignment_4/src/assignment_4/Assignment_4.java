/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.util.Scanner;

/**
 *
 * @author Eugenia
 */
public class Assignment_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 0;
        int exponent = 0;
        int number1=0,number2=0;
        
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
        int common=0;
        int a,b;//a is the greater number, b is the smaller number
        int r,q;//r is occurances b can go into a, q is the remainder
        boolean again=true;//used to continue looping
        
        if(number1<number2){
            a=number2;
            b=number1;
        }else{
            a=number1;
            b=number2;
        }
        while(again==true){
            
            q=a/b;
            r=a%b;
            
            if(a==0){
                common= b;
                again=false;
            }else if(b==0){
                common= a;
                again=false;
            }else if(r==0){
                common= b;
                again=false;
            }
            
            a=b;
            b=r;
        }
        return common;
    }
    public static int integerPower(int base,int exponent){
        int result=base;
        
        for(int i=1;i<exponent;i++){
            result*=base;
        }
        return result;
    }
    
}
