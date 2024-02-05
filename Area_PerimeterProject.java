/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_perimeterproject;

/**
 *
 * @author User
 */
public class Area_PerimeterProject {

    public static void main(String[] args) {
        // Given values
        double base = 10;
        double height = 7;
        double hypotenuse = 12;

        // Calculate area using the formula: (1/2) * base * height
        double area = 0.5 * base * height;

        // Calculate perimeter using the formula: base + height + hypotenuse
        double perimeter = base + height + hypotenuse;

        // Display the results
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

