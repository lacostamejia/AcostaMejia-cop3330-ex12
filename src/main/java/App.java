/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        int principal;
        double rate;
        int years;

        System.out.print("Enter the principal: ");
        principal = in.nextInt();

        System.out.print("Enter the rate of interest: ");
        rate = in.nextDouble(); //Here we are scanning in percentage

        double rate_change = ((rate)/100);

        System.out.print("Enter the number of years: ");
        years = in.nextInt();

        long interest = Math.round((principal * (1 + (rate_change * years)))); //Here we are calculating the interest in that period of time.

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + interest +".");


    }
}
