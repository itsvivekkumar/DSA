package string;

import java.util.Arrays;
import java.util.HashMap;

public class LagestOddNumberInString {
    public static void main(String[] args) {
        lagestOddNoInString();
        commonPrefixInStringArray();
    }
    public static void lagestOddNoInString(){
        String str = "0214638";   //o/p = 21463
        int j=-1;
        for(int i=str.length()-1; i>=0; i--){
            if((str.charAt(i)-'0')%2 != 0){
                j=i+1;
                break;
            }
        }
        System.out.println("idx of j="+j);
        if(j==-1){
            System.out.println("No odd number present in given string");
        }

        for(int i=0; i<j; i++){
            if((str.charAt(i)-'0') != 0){
                System.out.println("largest odd no in given string="+str.substring(i,j));
                break;
            }
        }
    }

    public static void commonPrefixInStringArray(){
        String []arr={"flower","flood","flow","floght","flow"};
        Arrays.sort(arr);
        String first=arr[0], last=arr[arr.length-1];
        int cnt=0;
        for(int i=0; i<Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
//                System.out.println("Not a single char matched, string are unique =");
                break;
            }
            cnt++;
        }
        System.out.println("Common prefix final ="+ first.substring(0,cnt));

    }

}
