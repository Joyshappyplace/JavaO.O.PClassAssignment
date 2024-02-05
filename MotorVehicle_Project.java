/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorvehicle_project;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MotorVehicle_Project {
    public static void main(String[] args) {
        // Prompt the user to enter the buying price
        try ( // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the buying price
            System.out.print("Enter the buying price of the vehicle: ");
            double buyingPrice = scanner.nextDouble();
            
            // Prompt the user to enter the selling price
            System.out.print("Enter the selling price of the vehicle: ");
            double sellingPrice = scanner.nextDouble();
            
            // Calculate the profit for selling motor vehicles
            double profit = sellingPrice - buyingPrice;
            
            // Display the output
            System.out.println("Buying Price: $" + buyingPrice);
            System.out.println("Selling Price: $" + sellingPrice);
            System.out.println("Profit: $" + profit);
        }
    }
}
