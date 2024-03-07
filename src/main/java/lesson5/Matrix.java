package main.java.lesson5;

import java.util.Scanner;

import java.io.*;
public class Matrix {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {3,6,7}};

        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }}