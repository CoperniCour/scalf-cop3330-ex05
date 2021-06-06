/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 5 - Simple Math
package org.example;
import java.util.Scanner;
import java.text.MessageFormat;

public class Exercise5 {
    public static void main(String[] args) {
        /* You’ll often write programs that deal with numbers. And depending on the programming
        *language you use, you’ll have to convert the inputs you get to numerical data types.
         */

        /*Write a program that prompts for two numbers. Print the sum, difference, product, and quotient
        *of those numbers as shown in the example output:
        */

        //Get strings of the numbers 1 and 2 from user
        Scanner getNum1 = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String Num1 = getNum1.nextLine();
        Integer i=Integer.parseInt(Num1);

        Scanner getNum2 = new Scanner(System.in);
        System.out.print("What is the second number? ");
        String Num2 = getNum2.nextLine();
        Integer j=Integer.parseInt(Num2);

        //Math calculations
        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;

        //Interpolation using messageFormat method
        String math = MessageFormat.format("{0} + {1} = {2} \n{0} - {1} = {3} \n{0} * {1} = {4} \n{0} / {1} = {5} \n ", i, j, a, b, c, d);


        //Print all 4 algebraic functions using interpolation with the messageFormat method
        System.out.println(math);



    }
}
