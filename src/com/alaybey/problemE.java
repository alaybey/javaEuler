package com.alaybey;

public class problemE {
    public static boolean checkDiv(int num){
        for(int i=2;i<=20;i++)
            if(num%i!=0)
                return false;
        return true;
    }
    public static void main(String[] args){
        int i=2520; // Currently, the answer of 2520 has been given in the projectEuler. Our number should be larger
        for(; true;i++){
            if(checkDiv(i))
                break;
        }
        System.out.println("ProblemE: " + i);
    }
}
