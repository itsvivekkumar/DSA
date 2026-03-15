package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindAndRemoveDuplicates {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,1,3,6};
        String arr2="vivek";
        findDuplicatesInArray(arr2);
        removeDuplicatesInArray(arr2);

    }
    public static void findDuplicatesInArray(String arr2){
        Set<Character> set = new HashSet<>();
        for(char c : arr2.toCharArray()){
            if(!set.add(c)){
                System.out.println(c);    //each elements which are duplicates
            }
        }
    }

    public static void removeDuplicatesInArray(String arr2) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : arr2.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(Character c : set){
            sb.append(c);
        }
        System.out.println(sb);
//        System.out.println(set);      //all elements after removing duplicates
    }

}
