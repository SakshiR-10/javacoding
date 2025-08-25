package string;

import java.util.Scanner;

public class CheckIfStringIsPalindromeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String orgStr = sc.nextLine();
        System.out.println("Original String ="+orgStr);
        String revStr = "";

        for (int i = orgStr.length()-1 ;i>=0 ; i--){
            revStr= revStr + orgStr.charAt(i);
        }
        System.out.println("Reversed String = "+revStr);
        if(orgStr.equalsIgnoreCase(revStr)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
    }
}
