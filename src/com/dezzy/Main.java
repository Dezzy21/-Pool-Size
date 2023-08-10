package com.dezzy;

public class Main {
    public static void main(String[] args) {
        int[][] coordinates = Calculation.createCoordinates(new int[Calculation.corners()][2]);
        double area = Calculation.area(coordinates);
        double depth = Calculation.depth();

        double volume = area * depth;

        System.out.println("The area of the pool is: " + area +
                "\nThe volume of the pool is " + volume);
    }
}
