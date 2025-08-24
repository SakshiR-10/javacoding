package string;

import java.util.Scanner;

public class ReverseStringAndPrintOnlyVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String");
        String orgStr = sc.nextLine();
        System.out.println("Original String ="+orgStr);
        String revStr = "";
        for (int i = orgStr.length()-1; i>=0 ; i--){
           char vow = orgStr.charAt(i);
           if(vow == 'a'|| vow == 'e'|| vow == 'i'|| vow == 'o'|| vow == 'u'||vow == 'A'||vow == 'E'
                   ||vow == 'I'|| vow == 'O'||vow == 'U' ){
               revStr= revStr + vow;
           }
        }
        System.out.println("Reversed String = "+revStr);
    }
}
