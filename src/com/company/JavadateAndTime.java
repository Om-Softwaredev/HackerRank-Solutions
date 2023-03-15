package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavadateAndTime {
//    https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
    public static void main(String[] args) {


    }
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        Date date = cal.getTime();
        String dayWeek = new SimpleDateFormat("EEEE").format(date);
        return dayWeek.toUpperCase();
    }

}

