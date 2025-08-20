package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayAnd_alsoElements {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<size ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Actual Array"+ Arrays.toString(array));

        for (int j = array.length-1 ; j>=0 ;j--)
        {
            int num = array[j];

            int reverse=0;
         while(num>0)
         {
             int remainder = num%10 ;
             reverse = reverse*10+remainder;
              num= num/10;
         }
        System.out.println(reverse);
        }
    }
}
