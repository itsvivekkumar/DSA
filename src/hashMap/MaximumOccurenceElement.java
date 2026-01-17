package hashMap;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceElement {
    public static void main(String[] args) {
        maximumOccElement();
        secondHighestOccElement();
        sumOfHighAndLowOcc();
        sortBasedOccOfElement();
    }

    public static void maximumOccElement() {
        String str = "abbccc";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character i : str.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);  //agar key i ka value mila to wo put nhi to default value 0.
        }
        int max = 0;
        char ch = 0;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ch = entry.getKey();
            }
        }
        System.out.println(ch + "---" + max);
    }

    //2 highest occurence element
    public static void secondHighestOccElement(){
        String str = "abbcccddz";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character i : str.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);  //agar key i ka value mila to wo put nhi to default value 0.
        }
        int max = 0, secMax = 0;  //1 and 2 maxi occ will be counted here
        for (int val : mp.values()) {
            if (max < val) {
                secMax = max;
                max = val;
            } else if (max > val && val > secMax) {
                secMax = val;
            }
        }
        int res = str.length();
        char min = Character.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            char ch = entry.getKey();
            if (entry.getValue() == secMax && entry.getKey() < min) {
                res = Math.min(res, entry.getValue());
                min = entry.getKey();
            }
        }

        if (secMax == 0) {
            System.out.println("only unique( occ=1) character present in string ");
        }
        System.out.println(min + "----" + res);
    }

    //sum of highest and lowest frequency
    public static void sumOfHighAndLowOcc(){
        String str = "abbcccddz";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character i : str.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);  //agar key i ka value mila to wo put nhi to default value 0.
        }
        System.out.println("Input string len=" + str.length());
        int maxOcc = 0, minOcc = str.length();  //1 and 2 maxi occ will be counted here
        for (int val : mp.values()) {
            if (val > maxOcc) {
                maxOcc = val;
            }
            if (val < minOcc) {
                minOcc = val;
            }
        }
        System.out.println("sum =" + (maxOcc + minOcc));
    }

    //sort char in string based on their occurence
    public static void sortBasedOccOfElement() {
        String str = "abbccc";  //[c,b,a] bcuz c-3, b-2,a-1
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character i : str.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);  //agar key i ka value mila to wo put nhi to default value 0.
        }

        ArrayList<Character> ls=new ArrayList<>(mp.keySet());
        ls.sort((a,b) -> {
            int occDiff=Integer.compare(mp.get(b),mp.get(a));
            return (occDiff != 0 )? occDiff : Character.compare(a,b);
        });  //we must need to return as we are using {} after ->, where expression is written.
        System.out.println("sorted list ="+ls);
    }

}
