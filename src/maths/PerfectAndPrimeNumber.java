package maths;

public class PerfectAndPrimeNumber {
    public static void main(String[] args) {
        perfectNumber();
        isPrimeNumber(7);
        countOfPrimeNumberInrange(5);
    }

    public static void perfectNumber(){
        //perfect no, the one whose all divisors sum except number itself is equal to given number.
        int n=6,sum=0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not prefect number");
        }
    }

    //Prime no
    public static boolean isPrimeNumber(int n) {
        //perfect no, the one whose all divisors sum except number itself is equal to given number.
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt == 2) {
            System.out.println("Prime number");
            return true;
        } else {
            System.out.println("Not prime");
            return false;
        }

    }

    //count no of prime number in Range

    public static void countOfPrimeNumberInrange(int num){
        //suppose range is 2-5
        System.out.println("Counting Prime no in Range started -----");
        int totalCount=0;
        for(int i=2; i<=num; i++) {
            if (isPrimeNumber(i)) {
                totalCount++;
            }
        }
        System.out.println("Total prime no in Range ="+totalCount);
    }
}
