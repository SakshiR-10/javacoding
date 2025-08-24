package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n ; i++ )
        {
            System.out.println("Enter value for array");
            arr[i] =sc.nextInt();
        }
        System.out.println("Actual Array="+ Arrays.toString(arr));
       int length = arr.length;
        System.out.println(length);

        int[] arrReverse = new int [n];
        int j = 0;
        for ( int i=length-1; i>=0 ; i-- )
        {
                arrReverse[j] = arr[i];
                j++;
        }
        System.out.println("Reverse Array"+Arrays.toString(arrReverse));
    }
}
