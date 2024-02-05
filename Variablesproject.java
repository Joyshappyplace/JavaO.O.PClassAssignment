/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variablesproject;

import java.util.Scanner;
public class Variablesproject {

    

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner obj = new Scanner(System.in);

        // Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");
        int firstNumber = obj.nextInt();

        // Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");
        int secondNumber = obj.nextInt();

        // Calculate the sum of the two integers.
        int sum = firstNumber + secondNumber;

        // Display the sum
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum); 
        
    }
}



        
 
