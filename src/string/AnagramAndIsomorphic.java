package string;

import java.util.Arrays;

public class AnagramAndIsomorphic {
    public static void main(String[] args) {
        anagramString();
        isomorphicString();
    }
    public static void anagramString(){  //Anagram string is the one where interchanging its char gives same(2nd) string.
        String s="anagram", t="nagaram";
        if(s.length() != t.length()){
            System.out.println("Both string length are different====");
            return;
        }
        char[] chS=s.toCharArray();
        char[] chT=t.toCharArray();
        Arrays.sort(chS);
        Arrays.sort(chT);
        boolean flag=true;
        for(int i=0; i<s.length(); i++){
            if(chS[i] != chT[i]){
                flag=false;
            }
        }
        if(flag){
            System.out.println("String is Anagram--");
        }else{
            System.out.println("String is not Anagram--");
        }
    }

    //Isomorphic string the one where characters are replaced to get another string .
    public static void isomorphicString() {
        String s = "egg", t = "add";
        boolean flag=true;
        if(s.length() != t.length()){
            System.out.println("Both string length are different====");
            return;
        }
        int[] arrS=new int[256];  //initially all 256 values will be 0.
        int[] arrT=new int[256];
        for(int i=0; i<s.length(); i++){
            if(arrS[s.charAt(i)] != arrT[t.charAt(i)]){
                //here comparision happens on Ascii value of char present at i index( s.charAt(i) )
                //starting me all 0, so ye condition fail hoga agar char unique hai to, agar char repeat hua to change hoga .
                flag=false;
            }
            //char ASCII value pe arr[] value same hai.
            arrS[s.charAt(i)]=i+1;     //waha ke value ko update krdo taki next time track krne me easy hoga.
            arrT[t.charAt(i)]=i+1;
        }
        if(flag){
            System.out.println("String are Isomorphic -----");
        }else{
            System.out.println("String are NOT Isomorphic -----");
        }
    }
}
