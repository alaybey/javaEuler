package com.alaybey;

public class problemF {

    public static int squareOfSum(float n){ return (int)Math.pow(((n*(n+1))/2), 2); }          // n*n+1 / 2 == sum (1+...+n)
    public static int sumOfSquare(float n) { return (int)(n*(n+1)*((2*n)+1))/6; }              // (n * n+1 * 2n+1) / 6 == 1P + .... nP  -> P == pow
    public static void main(String[] args){

        int squareOfSum = squareOfSum(100);
        int sumOfSquare = sumOfSquare(100);
        System.out.println("ProblemF: " + (squareOfSum - sumOfSquare));
    }
}
