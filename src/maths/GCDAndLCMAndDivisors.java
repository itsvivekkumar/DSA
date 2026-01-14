package maths;

import java.util.Arrays;

public class GCDAndLCMAndDivisors {
    public static void main(String[] args) {
         gcd();
         lcm();
         divisors();
    }

    //GCD
    public static void gcd(){
        int n1=10, n2=15;
        if(n1==n2){
            System.out.println("Both are equal so return n1/n2 ");
        }
        if(n2 == 0){
            System.out.println("As n2 is zero just retuning n1 value");
        }
        //1st approach= o(n1)
//        int greatestDivisors=1;
//        for(int i=1; i<Math.min(n1,n2); i++){
//            if(n1%i == 0 && n2%i == 0) {
//                greatestDivisors = i;
//            }
//        }
//        System.out.println("Greatest common factor for n1 and n2 ="+greatestDivisors);

        //2nd approach=log(n1,n2)
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println("Greatest common factor for n1 and n2 ="+n1);

        //3rd apprach using recursion
//        return (n1 > n2) ? gcd(n2,n1%n2) : gcd(n1, n2%n1);   //for this make gcd() parameterised with return type
    }

    //LCM
    public static void lcm(){
    //call gcd() stores value and then
     // use formula ,  gcd * lcm = n1 * n2 ;
    }

    //Divisors
    public static void divisors() {
        //here we have to print all no as array , which divides given no
        System.out.println("Divisors method started --------------------");
        int n=19, cnt=0;
        int []arr=new int[n];
        for(int i=1; i<=n; i++){
            if (n%i==0){
                arr[cnt++]=i;
            }
        }
        //now array no and also some garbage value as 0 bcuz we use dynamic allocation method for memory
        System.out.println("All divisors for given no as array ="+ Arrays.toString(Arrays.copyOf(arr, cnt)));

    }
}
