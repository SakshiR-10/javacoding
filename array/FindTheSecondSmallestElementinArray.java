package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSecondSmallestElementinArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the value of array");
        int array[]= new int[size];
        for (int i =0 ; i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Given Array"+ Arrays.toString(array));
        int min1= array[0];
        for (int i=1 ; i< array.length;i++){
            if(array[i]< min1){
                min1 = array[i];
            }
           continue;
        }
        System.out.println("Smallest Number ="+min1);

        int min2 = array[0];
        for(int i=1; i<array.length ; i++){
            if(array[i]<min2 && array[i]>min1){
               min2 = array[i];
            }
            continue;
        }

System.out.println("Second smallest element ="+min2);


    }
}
