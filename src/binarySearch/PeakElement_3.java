package binarySearch;

import java.util.Arrays;

public class PeakElement_3 {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 9, 5, 6, 8, 7};
//        int peakEleIdx = peakElementInUnsortedArray(arr);
//        System.out.println("peak ele is =" + arr[peakEleIdx] + " present at index =" + peakEleIdx);  //idx=5
//        int peakEleIdx1 = peakElementInArray(Arrays.copyOf(arr, peakEleIdx));
//        System.out.println("2 approach peak ele is =" + arr[peakEleIdx1] + " present at index =" + peakEleIdx1);
        int[] arr1 = {2, 4, 5, 9, 8, 7};    //o/p = idx - 3
        int keyEle = 9;
        searchElementInBitonicArray(arr1, keyEle);
    }

    //remember binary search always return one peak ele as it ignores one part of array.
    public static int peakElementInUnsortedArray(int[] arr) {
        int s = 0, e = arr.length - 1, res = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
//                    System.out.println("Peak element found at =" + mid);
                    res = mid;
                    return res;
                } else if (arr[mid + 1] > arr[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }

            } else if (mid == 0) {
                if (arr[mid] > arr[1]) {
                    res = mid;
                    return res;
                } else {
                    res = mid + 1;
                    return res;
                }
            } else if (mid == arr.length - 1) {
                if (arr[mid] > arr[arr.length - 2]) {
                    res = mid;
                    return res;
                } else {
                    res = mid - 1;
                    return res;
                }
            }
        }
        return res;
    }


    //2 variant - simply using binary search , also gives result
    public static int peakElementInArray(int[] arr) {
        int s = 0, e = arr.length - 1, res = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
//                    System.out.println("Peak element found at =" + mid);
                res = mid;
                return res;
            } else if (arr[mid + 1] > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return res;
    }

    //Bitonic array - array which increases first and then decreases.
    public static void searchElementInBitonicArray(int[] arr, int keyEle) {
        int peakEle = peakElementInArray(arr);
        System.out.println("Peak element of given array ="+peakEle);
        int[] leftArr = Arrays.copyOfRange(arr, 0, peakEle);
        System.out.println(Arrays.toString(leftArr));
        int[] rightArr = Arrays.copyOfRange(arr, peakEle, arr.length);
        System.out.println(Arrays.toString(rightArr));
        if (keyEle < arr[peakEle]) {
            BSTechnique.binarySearch(leftArr, keyEle);
        } else {
            BSTechnique.binarySearch(rightArr, keyEle);
        }
    }
}
