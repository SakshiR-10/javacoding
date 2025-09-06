package string;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            boolean bool = false;
            for (int j = i+1; j < str.length(); j++) {
                if (!(str.charAt(i) == str.charAt(j))){
                    bool = true;
                }
                else {
                    bool = false;
                }
            }
        if (bool){
           System.out.println(str.charAt(i));
           break;
        }


        }
    }
}
