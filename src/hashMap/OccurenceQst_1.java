package hashMap;

import java.util.HashMap;

public class OccurenceQst_1 {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,1,3,6};
        String arr2="vivek";
        String str1 = "aabbbccd";
        firstNonRepeatingNumber(arr1);
        firstNonRepeatingCharacter(arr2);
        stringCompressionUsingItsCoutn(str1);

    }
    public static void firstNonRepeatingNumber(int []arr1){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num : arr1){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        System.out.println(mp);
        for(int num : arr1){
            if(mp.get(num) == 1){   // if we check (mp.get(num) > 1 ) then duplicate we found
                System.out.println("First non repeating number -> "+num+" having occurence ="+mp.get(num));
                break;
            }
        }
        System.out.println("Non repeating number wala completed===========");
    }

    public static void firstNonRepeatingCharacter(String arr2){
        char []chars=arr2.toCharArray();
        //this is understanding purpose
        //        int []cArray=new String(chars)
        //                .chars()
        //                .map(c-> c-'0')
        //                        .toArray();
        //        firstNonRepeatingNumber(cArray);

        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch : chars){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);
        for(char ch : chars){
            if(mp.get(ch) == 1){
                System.out.println("First non/repeating character in String -> "+ch+" having occurence ="+mp.get(ch));
                break;
            }
        }
    }

    public static void stringCompressionUsingItsCoutn(String s) {
        StringBuilder result = new StringBuilder();

        int count = 1;  //aabbbccaa
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println(result);
    }
}
