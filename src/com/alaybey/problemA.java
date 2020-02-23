package com.alaybey;

public class problemA {

    public static void main(String[] args) {
	// write your code here
        int i=0,n=1000;
        float sum=0;
        for(i=0; i<n; i++)
            sum += (i%3==0) ? i : ((i%5==0) ? i : 0);
        System.out.println("Sum: " + sum);
    }

}

