/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slkhdg;

import java.math.BigInteger;
import java.security.SecureRandom;
/**
 *
 * @author rcc
 */
public class Slkhdg {
    public static BigInteger[] generate(int n){
        BigInteger[] table = new BigInteger[n+1];
        table[0]=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            table[i] = table[i-1].multiply(BigInteger.valueOf(i));
        }
        return table;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      SecureRandom rng = new SecureRandom();
//	
//	int[] freq = new int[80];
//	
//	for(int i =0;i<100000000;i++){
//		int r = rng.nextInt()%80;
//		if(r<0) r = -r;
//		freq[r]++;
//	}
//        for(int i=0;i<80;i++){
//            System.out.println("Number: "+(i+1)+" Freq: "+freq[i]);
//        }
        BigInteger[] fact = generate(1000);
        int count=0;
        for(BigInteger item:fact){
            System.out.println( (count++)+"!= "+item.toString());
            if(count == 100) System.out.println();
        }
    }
    
}
