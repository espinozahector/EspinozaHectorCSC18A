/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


public class ExampleArray {
    
    public void array(){
        System.out.println("Normal Array");
        int a[] = {1,2,3,4,5};
//        for(int i = 0; i <a.length;i++){
            for(int temp : a){//enhanced for loop
            System.out.println(temp);
        }
    }
    public void funarray(){
        System.out.println("String Array");
        String st[] = {"One", "Two", "Three"};
        for(String temp3 : st){
            System.out.println(temp3);
        }
    }
    public void twoDimension(){
        System.out.println("Two Dimension Array");
        int num=0;
        int [][]twoD = new int [2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                num++;
                twoD[i][j]=num;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }
    }
}
