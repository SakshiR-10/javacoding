package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurenceOfUniqueLettersOfString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        Map<Character ,Integer> map = new HashMap<>();
        for (int i =0 ; i<str1.length() ; i++){

            if (map.containsKey(str1.charAt(i)))
            {
            int value= map.get(str1.charAt(i));
            map.put(str1.charAt(i),value+1);
            }
            else {
                map.put(str1.charAt(i),1);
            }
        }

       System.out.println(map);
    }
}
