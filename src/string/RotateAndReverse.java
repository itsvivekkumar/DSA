package string;

import java.util.Arrays;

public class RotateAndReverse {
    public static void main(String[] args) {
        reverseString();
        rotateStringFromLeft();
        rotateStringFromRight();
    }
    public static void reverseString(){
        String str="vivek";
        char []ch=str.toCharArray();
        int l=0, r=ch.length-1;
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        System.out.println("Original string ="+str);
        System.out.println("After reversing string ="+String.valueOf(ch));
    }

    //Rotate string from left side using index
    public static void rotateStringFromLeft() {
        String str = "bablu";
        int noOfCharToRotate=2;   //o/p = bluba
        String s=str.substring(noOfCharToRotate)+str.substring(0,noOfCharToRotate);
        System.out.println("Original string ="+str);
        System.out.println("After rotating 2 char from string ="+s);
    }
    //Rotate string from RIGHT side using index
    public static void rotateStringFromRight() {
        String str = "Edward";
        int noOfCharToRotate=2;   //o/p = rdEdwa
        String s=str.substring(str.length()-noOfCharToRotate)+str.substring(0,str.length()-noOfCharToRotate);
        System.out.println("Original string ="+str);
        System.out.println("After rotating 2 RIGHT side char from string ="+s);
    }
}
