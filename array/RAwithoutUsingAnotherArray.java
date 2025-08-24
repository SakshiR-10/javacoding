package array;

import java.util.Arrays;
import java.util.Scanner;

public class RAwithoutUsingAnotherArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for( int i =0 ; i<n ;i++)
        {
           array[i] = sc.nextInt();
        }
        System.out.println("Actual Array="+ Arrays.toString(array));
        int k;
        for (int i =0 ;i< array.length/2; i++)
        {
            k= array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=k;
            System.out.println(k);
        }
        System.out.println("Reversed Array="+ Arrays.toString(array));
    }
}
