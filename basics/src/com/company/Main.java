package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static String pluralize (String m , int count){
        if (count==1){
            return  m;
        }
        else{
            return m + "s";
        }


    }

    public static void flipNHeads(int headRow) {
        int flip=0, heads=0;
        double coins;
        Random num = new Random();
        while (heads<headRow){
            coins= num.nextDouble();
            if(coins <0.5){
                System.out.println("tails");
                flip++;
                heads=0;
            }
            else {
                System.out.println("heads");
                flip++;
                heads++;
            }
        }
        System.out.println("It took "+flip +" flips to flip "+heads +" heads in a row.");
    }

    static void clock (){
        int sec=0;
        while(true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
         if (sec != second ){
             System.out.println(time);
             sec = second;
         }
        }
    }
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(5);
        clock();
    }
}
