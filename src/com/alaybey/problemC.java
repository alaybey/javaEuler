package com.alaybey;

public class problemC {

    public static boolean checkPrime(long n){
        for(long i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        // write your code here
        long i,pFck = 0, n = 600851475143L;
        for (i=2;n>1;i++) {
            if(n%i==0) {
                n = n/i;
                if (checkPrime(i))
                    pFck = i;
            }
        }
        System.out.println("ProblemC: " + pFck);
    }
}
