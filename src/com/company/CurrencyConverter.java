package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
public class CurrencyConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
            String us=u.format(payment);
            NumberFormat i=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
            String india=i.format(payment);
            NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china=c.format(payment);
            NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france=f.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }


