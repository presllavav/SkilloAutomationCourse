package main.java;

public class SumOfAaGivvenArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int sum = 0;

        for(int counter= 0; counter<arr.length;counter++){
            sum+=arr[counter];
            System.out.println(sum);
        }
    }
}