/*
* UCF COP 3330 Fall 2021 Assignment 18 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner temp = new Scanner(System.in);

        System.out.println("Press C to convert Fahrenheit to Celsius");
        System.out.println("Press F to convert Celsius to Fahrenheit");
        String choice = temp.next();
        System.out.printf("Your choice: %s%n", choice);
        int x;
        int solution;

        if(choice.equals("C") || choice.equals("c"))
        {
            System.out.println("Please enter in the temperature in Fahrenheit");
            x = temp.nextInt();
            solution = (x-32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %d", solution);
        }

        else if(choice.equals("F") || choice.equals("f"))
        {
            System.out.println("Please enter in the temperature in Celsius");
            x = temp.nextInt();
            solution = (x * 9 /5) + 32;
            System.out.printf("The temperature in Fahrenheit is %d", solution);
        }

        else
            System.out.println("Invalid choice.");
    }
}