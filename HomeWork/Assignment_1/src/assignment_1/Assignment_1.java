/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.Scanner;

/**
 *
 * @author Espinoza Hector
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);//Used for user input
        boolean again = true;//Used to continue the menu selection
        do{
            System.out.println("Hello Welcome to the Assignment Menu.\n1. Largest and Smallest Integers.\n2. Odd or Even.\n3. Multiples.\n4. Exit");
            System.out.print("Input your selection: ");
            char answ = cin.next().charAt(0);//switch statement input, used for char to only take in the first position

            switch(answ){
                case '1':{
                    System.out.println("Largest and Smallest Integer");
                    int largest=0;
                    int smallest = 10000;//To ensure that there will be a smaller number
                    System.out.println("Input 5 numbers");
                    for(int i = 0;i<5;i++){
                        System.out.println("Input number "+(i+1));
                        int number = cin.nextInt();
                        
                        if(number<smallest){//Used to see if input is smaller
                            smallest = number;
                        }else if(number > largest){//Used to see if input is largest
                            largest = number;
                        }
                    }
                    System.out.println("The smallest number is "+smallest);
                    System.out.println("The largest number is "+largest);
                    System.out.println();
                    break;
                } 
                case '2':{
                    System.out.println("Odd or Even");
                    System.out.println("Input an integer and I will determine it is even or odd");
                    int num = cin.nextInt();
                    if(num%2==0){//is divisable by 2 then is even
                        System.out.println(num+" is an Even number");
                    }else{
                        System.out.println(num+" is an Odd number");
                    }
                    System.out.println();
                    break;
                }
                case '3':{
                    System.out.println("Multiples");
                    System.out.println("Input a number and then input a second number.\nI will see if the first number is a multiple of the second.");
                    int first,second;
                    System.out.print("First number: ");
                    first = cin.nextInt();
                    System.out.print("Second number: ");
                    second = cin.nextInt();
                    if(first%second==0){
                        System.out.println(first+" is a multiple of "+second);
                    }else{
                        System.out.println(first+" is not a multiple of "+second);

                    }
                    System.out.println();
                    break;
                }
                case '4':{
                    again = false;//Sets the do-while to false and ends it
                    System.out.println("Exiting...\n");
                    System.out.println();
                    break;
                }
                default:System.out.println("Error: Invalid input. Please input a 1,2,3,or a 4");
            }
        }while(again==true);
    }
    
}
