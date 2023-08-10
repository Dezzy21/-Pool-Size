package com.dezzy;

import java.util.Scanner;

public class Calculation {

    private Calculation(){}

    public static int corners() {

        System.out.print("""
                Welcome to my swimming pool builder!
                                
                Enter the number of corners your pool should have:
                """);
        int corners = scanner.nextInt();
        scanner.nextLine();
        return corners;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static int[][] createCoordinates(int[][] coordinates) {

        for(int i = 0; i < coordinates.length; i++) {
            System.out.println("Enter the x coordinate of " + (i + 1) );
            coordinates[i][0] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the y coordinate of " + (i + 1) );
            coordinates[i][1] = scanner.nextInt();
            scanner.nextLine();
        }
        return coordinates;
    }

    public static int area(int[][] coordinates) {
        int area = 0;

        for(int i = 0; i < coordinates.length; i++) {
            if(i < coordinates.length - 1) {
                area += (coordinates[i][0] * coordinates[i + 1][1] - coordinates[i + 1][0] * coordinates[i][1]);
            } else {
                area += (coordinates[i][0] * coordinates[0][1] - coordinates[0][0] * coordinates[i][1]);
            }
        }
        area /= 2;
        return Math.abs(area);
    }

    public static double depth() {
        System.out.print("Enter the depth of the pool: ");
        double depth = scanner.nextInt();
        scanner.nextLine();
        return depth;
    }
}