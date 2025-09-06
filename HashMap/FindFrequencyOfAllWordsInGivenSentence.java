package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFrequencyOfAllWordsInGivenSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        String[] arr = str1.split(" ");
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i].toLowerCase())){
                int value= map.get(arr[i].toLowerCase());
                map.put(arr[i].toLowerCase(),value+1);
            }
        else{
                map.put(arr[i].toLowerCase(),1);
            }
        }
        System.out.println(map);
    }
}