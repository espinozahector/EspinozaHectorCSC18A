/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


public class ExampleString {
    
    public void stringstring(){
        System.out.println("String Examples");
        String x = "Hector Espinoza";
        System.out.println("Hello "+ x);//Outputs the name after greeting
        System.out.println(x.toUpperCase());//Makes the whole name become uppercase
    }
    public void ConvertString(){
        System.out.println("Convert String");
        String age = "37";
        String salary = "50000";
        //Wrapper Classes 
        int a = Integer.parseInt(age)/2;//Used to convert the string into a int
        System.out.println(a);
//        char test = (char)a; //Static Cast a toa  char
        double s = Double.parseDouble(salary)*.15;
        System.out.println(s);
    }
    public void ExerciseA(){
        //Objective is to only print out the word world
        String a = "Hello World";
        System.out.println(a.substring(6));   
        
    }
    
}
