package string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWords {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String orgStr = sc.nextLine();
        System.out.println("Original String ="+orgStr);

        String[] charArray = orgStr.split(" ");
        String [] revArray = new String[charArray.length] ;
        int j =0;
        for (int i = charArray.length-1 ;i >=0; i-- ){
         revArray[j] = charArray[i];
         j++;
        }
        System.out.println("Reversed Array= "+Arrays.toString(revArray));

    }
}
