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





            }

            }
        }

    public static class SumOfAaGivvenArray {
        public static void main(String[] args) {
            int arr[] = {2,3,4,5};
            int sum = 0;

            for(int counter= 0; counter<arr.length;counter++){
                sum+=arr[counter];
                System.out.println(sum);
            }
        }
    }
}
