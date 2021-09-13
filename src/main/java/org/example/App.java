/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is your name?" );
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Hello, " + input + ", nice to meet you!");
    }
}
