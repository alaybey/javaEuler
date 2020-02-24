package com.alaybey;

public class problemG {
    public static boolean checkPrime(long n){
        for(long i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;

    }
    public static long sayMyPrime (int place){
        int count=0, i=0;
        for(i =2; count<place; i++){
            count += checkPrime(i) ? 1 : 0;
        }
        return i-1;
    }
    public static void main(String[] args){
        System.out.println("ProblemG: " + sayMyPrime(10001));

    }
}
