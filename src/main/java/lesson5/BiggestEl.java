package main.java.lesson5;

public class BiggestEl
{
    public static void main(String args[])
    {
        int arr[] = {2,5,3,108,19};
        int BigEl = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(BigEl < arr[i])
            {
                BigEl = arr[i];
            }
        }
        System.out.print(BigEl);
    }
}