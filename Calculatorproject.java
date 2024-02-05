/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculatorproject {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (Scanner scanner = new Scanner(System.in))
        {
            //prompt user input
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            
            //operations
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int modulus = num1 % num2;
            
            float quotient = (num1/num2 );
            
            //display results
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
            System.out.println("The difference of" + num1 + " and " + num2 + " is: " + difference);
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
            System.out.println("The modulus of " + num1 + " and " + num2 + " is: " + modulus);
            
            System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);
            
        }
        
    }
}
