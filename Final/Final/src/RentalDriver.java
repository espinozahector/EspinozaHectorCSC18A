/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RentalDriver {
    
    public static void main(String[] args) {
        Ski s = new Ski(true,50,1234,100);
        System.out.println(s.lateCharge());
        System.out.println(s.toString());
    }
    
}
