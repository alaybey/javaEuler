package com.alaybey;

public class problemB {
    public static void main(String[] args) {
        // write your code here
        int i=1, fib[] = {1,2};
        double n=(4 * Math.pow(10,6)), sum=0; // n = four million limit
        while (i<n) {
            sum += (i % 2 == 0) ? i : 0;
            fib[1] = fib[0] + i;
            fib[0] = i;
            i = fib[1];
        }
        System.out.println("ProblemB: " + sum);
    }

}
