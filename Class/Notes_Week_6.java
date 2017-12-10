
//04/07/16
//April 7, 2016

int a = 1;
int b = 3;
int c = 5;

sum += a+b+c;

int[3] a = new int[3];

//elements index starts at zero!
//so a[0] <- is the first element
//a[1] <- is the second element
//a[2] <- is the third element

Randoms main.cpp

import java.security.SecureRandom;

main(){
	SecureRandom rng = new SecureRandom();
	
	int[] freq = new int[80];
	
	for(int i =0;i<1000;i++){
		int r = rng.nextInt()%80;
		if(r<0) r = -r;
		freq[r]++;
	}
    for(int i=0;i<80;i++){
        System.out.println("Number: "+(i+1)+" Freq: "+freq[i]);
    }
}




