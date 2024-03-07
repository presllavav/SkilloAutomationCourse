package main.java.lesson5;


import java.util.Scanner;

public class DynamicMatrix {
    public static void main(String[] args) {


        System.out.print("Enter 2D array size : ");
          Scanner s = new Scanner(System.in);

        int rows =  Integer.parseInt(s.nextLine());
        int columns = Integer.parseInt(s.nextLine());
        System.out.println("Enter array elements : ");

        int twoD[][]=new int[rows][columns];

        for(int i = 0; i<rows; i++) {
            for(int j= 0; j<columns; j++) {
                twoD[i][j]=s.nextInt();

                List<int[]> values = new ArayList<int[]>();



                }

            }
        }
    }
}
