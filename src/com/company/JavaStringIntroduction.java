package com.company;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
public class JavaStringIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = (int)(A.length() + B.length());
        System.out.println(sum);
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "+ B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}
