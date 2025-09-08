/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progassignment;

/**
 *
 * @author RC_Student_lab
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class PROGassignment {

    public static void main(String[] args) {
         series seriesApp = new series();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nLATEST SERIES 2025");
            System.out.println("--------------------");
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new series");
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update age restriction");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print sales report - 2025");
            System.out.println("(6) Exit application");
            System.out.println("--------------------");

            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        seriesApp.captureSeries();
                        break;
                    case 2:
                        seriesApp.searchSeries();
                        break;
                    case 3:
                        seriesApp.updateSeries();
                        break;
                    case 4:
                        seriesApp.deleteSeries();
                        break;
                    case 5:
                        seriesApp.printSeriesReport();
                        break;
                    case 6:
                        seriesApp.exitSeriesApplication();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
                choice = 0; 
            }
        }
        scanner.close();
    
    }
}
