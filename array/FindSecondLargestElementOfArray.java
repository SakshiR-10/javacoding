package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElementOfArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the values in array");
        for (int i = 0; i<size ; i++){
            array[i] = sc.nextInt();
        }
System.out.println("Given Array:"+ Arrays.toString(array));
        int max1 = 0;

        for (int i =0 ;i < array.length ;i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
            continue;
        }
        System.out.println("Largest="+max1);
        int max2 = 0;
        for (int i =0 ;i < array.length ;i++) {
            if (array[i] > max2 && array[i]<max1) {
                max2 = array[i];
            }
            continue;
        }

        System.out.println("Largest Element of given array ="+max2);
    }
}
