package binarySearch;

import java.util.Arrays;

public class BookAllocationPblm {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 70, 80, 90};
        int nOfStu = 2;
//       Integer maxiValueInArray= Arrays.stream(arr).max();
        Arrays.sort(arr);
        int maxiValue = arr[arr.length - 1], add = 0;
        for (int i : arr) {
            add = add + i;
        }
        System.out.println("array me maximum value =" + maxiValue + " and total of array elements =" + add);
        maximumPagesAStudentRead(arr, maxiValue, add, nOfStu);
    }

    public static void maximumPagesAStudentRead(int[] arr, int maxiValue, int add, int nOfStu) {
        int res = 0;
        while (maxiValue <= add) {
            int mid = maxiValue + (add - maxiValue) / 2;
            if (validMaxiValueAsPages(arr, mid, nOfStu)) {
                res = mid;
                add = mid - 1;
            } else {
                maxiValue = mid + 1;
            }
        }
        System.out.println("The minimum value of maxiMum number of pages a student can read ="+res);
    }

    public static boolean validMaxiValueAsPages(int[] arr, int mid, int nOfStu) {
        if (nOfStu > arr.length) {
            return false;
        }
        int sum = 0, cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                cnt++;
                sum = arr[i];
            }
        }

        if (!(cnt <= nOfStu)) {
            return false;
        }
        return true;
    }
}
