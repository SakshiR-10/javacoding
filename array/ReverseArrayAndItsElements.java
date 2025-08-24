package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayAndItsElements {
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

        for (int j = 0 ;  j <array.length/2 ;j++)
        {
            int num = array[j];
            int reverse=0;
            while(num>0) {
                int remainder1 = num%10 ;
                reverse = reverse*10+remainder1;
                num= num/10;
            }
            array[j]=reverse;

            int num2 = array[array.length-1-j];
            int reverse2=0;
            while(num2 > 0) {
                int remainder2 = num2 % 10 ;
                reverse2 = reverse2*10+remainder2;
                num2 = num2/10;
            }
            array[array.length-1-j]=reverse2;

            int temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }
        System.out.println("Reversed Array="+Arrays.toString(array));
    }

}
