package string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringUsingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String orgStr = sc.nextLine();
        char [] arr1 = orgStr.toCharArray();
        char[] revArr1 = new char[arr1.length];
        int j = 0;
        for(int i = arr1.length-1;i>=0;i--){
           revArr1[j] = arr1[i];
           j++;
        }
        System.out.print(Arrays.toString(revArr1));
    }
}
