package com.alaybey;

public class problemD {

    public static boolean checkP(int num) {
        int revNum = 0, tempNum=num;
        int length = String.valueOf(num).length();
        while (length > 0) {
            revNum += (tempNum % 10) * Math.pow(10, length-1);
            tempNum /= 10;
            length--;
        }
        return revNum == num;
    }

    public static int findPalindrome(int i) {
        int palindromeNum, maxP = 0;
        for (; i>1; i--) {
            for (int j=999; j >1; j--) {
                palindromeNum = i * j;
                if (checkP(palindromeNum) && maxP<palindromeNum)
                    maxP = palindromeNum;
            }
        }
        return maxP;
    }

    public static void main(String[] args) {
        System.out.println("ProblemD: " + findPalindrome(999));
    }
}
