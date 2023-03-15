package com.company;
// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class StringLexicoGraphicalOrder {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcomejava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String newStr = s.substring(0, k);
        String smallest = newStr;
        String largest = newStr;

        for (int i = k; i < s.length(); i++) {
            newStr = newStr.substring(1, k) + s.charAt(i);
            if (largest.compareTo(newStr) < 0)
                largest = newStr;
            if (smallest.compareTo(newStr) > 0)
                smallest = newStr;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
