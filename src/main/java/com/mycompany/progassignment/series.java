/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class series {
     private ArrayList<seriesModel> seriesList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void captureSeries() {
        System.out.println("CAPTURE A NEW SERIES");
        System.out.println("--------------------");

        System.out.print("Enter the series ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();

        int ageRestriction = -1;
        while (ageRestriction == -1) {
            System.out.print("Enter the age restriction: ");
            try {
                String input = scanner.nextLine();
                ageRestriction = Integer.parseInt(input);
                if (ageRestriction < 2 || ageRestriction > 18) {
                    System.out.println("Age restriction must be between 2 and 18.");
                    ageRestriction = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid age restriction. Only numbers are allowed.");
            }
        }

        System.out.print("Enter the number of episodes: ");
        int numberOfEpisodes = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        seriesList.add(new seriesModel(id, name, ageRestriction, numberOfEpisodes));
        System.out.println("Series successfully saved!");
    }

    public void searchSeries() {
        System.out.println("SEARCH FOR A SERIES");
        System.out.println("-------------------");

        System.out.print("Enter the series ID to search: ");
        String idToSearch = scanner.nextLine();

        seriesModel foundSeries = null;
        for (seriesModel series : seriesList) {
            if (series.getSeriesId().equalsIgnoreCase(idToSearch)) {
                foundSeries = series;
                break;
            }
        }

        if (foundSeries != null) {
            System.out.println(foundSeries.toString());
        } else {
            System.out.println("Series with ID: " + idToSearch + " was not found!");
        }
    }

    public void updateSeries() {
        System.out.println("UPDATE A SERIES");
        System.out.println("---------------");

        System.out.print("Enter the series ID to update: ");
        String idToUpdate = scanner.nextLine();

        seriesModel seriesToUpdate = null;
        for (seriesModel series : seriesList) {
            if (series.getSeriesId().equalsIgnoreCase(idToUpdate)) {
                seriesToUpdate = series;
                break;
            }
        }

        if (seriesToUpdate != null) {
            System.out.print("Enter the new series name: ");
            String newName = scanner.nextLine();
            seriesToUpdate.setSeriesName(newName);

            int newAgeRestriction = -1;
            while (newAgeRestriction == -1) {
                System.out.print("Enter the new age restriction: ");
                try {
                    String input = scanner.nextLine();
                    newAgeRestriction = Integer.parseInt(input);
                    if (newAgeRestriction < 2 || newAgeRestriction > 18) {
                        System.out.println("Age restriction must be between 2 and 18.");
                        newAgeRestriction = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age restriction. Only numbers are allowed.");
                }
            }
            seriesToUpdate.setSeriesAgeRestriction(newAgeRestriction);

            System.out.print("Enter the new number of episodes: ");
            int newNumEpisodes = scanner.nextInt();
            seriesToUpdate.setSeriesNumberOfEpisodes(newNumEpisodes);
            scanner.nextLine();

            System.out.println("Series updated successfully!");
        } else {
            System.out.println("Series with ID: " + idToUpdate + " was not found!");
        }
    }

    public void deleteSeries() {
        System.out.println("DELETE A SERIES");
        System.out.println("---------------");

        System.out.print("Enter the series ID to delete: ");
        String idToDelete = scanner.nextLine();

        seriesModel seriesToDelete = null;
        for (seriesModel series : seriesList) {
            if (series.getSeriesId().equalsIgnoreCase(idToDelete)) {
                seriesToDelete = series;
                break;
            }
        }

        if (seriesToDelete != null) {
            System.out.print("Are you sure you want to delete series " + idToDelete + " from the system? Yes (y) to delete: ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                seriesList.remove(seriesToDelete);
                System.out.println("Series with ID: " + idToDelete + " was deleted!");
            } else {
                System.out.println("Deletion canceled.");
            }
        } else {
            System.out.println("Series with ID: " + idToDelete + " was not found!");
        }
    }

    public void printSeriesReport() {
        System.out.println("PRINT SERIES REPORT - 2025");
        System.out.println("--------------------------");
        if (seriesList.isEmpty()) {
            System.out.println("No series data available.");
        } else {
            for (seriesModel series : seriesList) {
                System.out.println(series.toString());
                System.out.println("--------------------------");
            }
        }
    }

    public void exitSeriesApplication() {
        System.out.println("Exiting application...");
    }
}
