package companyInterview;

import java.util.*;

public class CertaAi {

    public static void main(String[] args) {
//        wordWithHighestOccOfElement();
//        numberOfDuplicatesInArray();
//        numberOfTimesDuplicatesEleRepeated();
        countAnagramGroups();

    }
    public static void wordWithHighestOccOfElement(){
        System.out.println("wordWithHighestOccOfElement method started--------------");
        String str="Hello apple pie";
        String[] strings=str.split(" ");
        int maxi=0;
        String res="";
        for(String s : strings){
            char[] ch=s.toCharArray();   //['H','e','l','l','o']
            int freq=maxOccOfElementInArray(ch);
            if(freq > maxi){
                maxi=freq;
                res=s;
            }
        }
        System.out.println(res + "--> contains character having highest no of repeated char ="+maxi);
    }
    public  static int maxOccOfElementInArray(char[] ch){
        Map<Character,Integer> map=new HashMap<>();
        int maxOccOfchar=0;
        for(char c: ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int occ : map.values()){
            if(occ > maxOccOfchar){
                maxOccOfchar=occ;
            }
        }
        return maxOccOfchar;
    }

    public static void numberOfDuplicatesInArray(){
        System.out.println("numberOfDuplicatesInArray method started ---------------------");
        int []arr={1,2,2,2,5,3,3};  //o/p = 2 [ 2 and 3]
        Map<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i : map.values()){
            if(i > 1){
                cnt++;
            }
        }
        System.out.println("total number of element having duplicated in array ="+cnt);
    }

    public static void numberOfTimesDuplicatesEleRepeated(){
        System.out.println("numberOfTimesDuplicatesEleRepeated method started -----------------------------");
        int []arr={1,2,2,2,5,3,3};    //o/p = 2
        Map<Integer,Integer> map=new HashMap<>();
        int dupRepeated=0,maxi=0;
        for(int c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i : map.values()){
            if(i > 1 && i > maxi){
                maxi=i;
                dupRepeated=dupRepeated+(i-1);   // i-1 bcuz first time wo element unique hoga
            }
        }
        System.out.println("total number of times number having duplicated repeated in array ="+dupRepeated);
        System.out.println("total number of times that duplicated occurs in array ="+maxi);
    }

    public static void countAnagramGroups() {
        String input="aa aa dgo dog gdo";
        String[] words = input.split(" ");

        // Map<sortedWord, Set of original words>
        Map<String, Set<String>> map = new HashMap<>();

        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new HashSet<>());
            map.get(key).add(word);
        }

        int count = 0;

        for (Set<String> group : map.values()) {
            if (group.size() > 1) {       // more than 1 UNIQUE word
                count++;
            }
        }

        System.out.println("total no of anagram string in given string ="+count);
    }
}
