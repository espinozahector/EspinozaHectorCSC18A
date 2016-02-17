/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Employee {
    
    float salary;
    float bonus;
    
    void CalculateTotalPay(){
        float total = salary + bonus;
        System.out.println(total);
    }
    
}
