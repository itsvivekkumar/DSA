package binarySearch;

import java.util.Arrays;

public class SortedAndNearlySortedRotated_1 {
    public static void main(String[] args){
        int []arr={4,5,6,7,8,1,2,3};
        int target=6;
        nTimesRotated(arr);
        elementInSortedRotated(arr,target);
    }

    //sorted rotated me min ele how many times rotated[ normal linear , optimal binary search]
    public static int nTimesRotated(int []arr){
        int n=arr.length;
        int s=0, e=n-1,eleIdx=0;
        while (s<=e){
            int mid=s+(e-s)/2;
            int prev=(mid+n -1)%n, next=(mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                eleIdx=mid;
                break;
            }else if(arr[mid]> arr[s]){
                s=mid+1;
            }else if(arr[mid] < arr[e]){
                e=mid-1;
            }
        }
        System.out.println("no of times array rotated is ="+eleIdx);
        return eleIdx;
    }

    //we need to first find idx of min ele, then apply BS technique in both side of min ele array.
    public static void elementInSortedRotated(int[] arr, int target) {
        //4,5,6,7,8,1,2,3 . tar=6
//      calling above method first , then using return min element idx.
       int eleIdx= nTimesRotated(arr);
        int[] arr1 = Arrays.copyOfRange(arr, 0, eleIdx - 1);
        int[] arr2 = Arrays.copyOfRange(arr, eleIdx, arr.length - 1);
        if (target >= arr[0] && target <= arr[eleIdx - 1]) {
            BSTechnique.binarySearch(arr1, target);
        } else {
            BSTechnique.binarySearch(arr2, target);
        }
        System.out.println("ElementInSortedRotated completed successfully");
    }

    //Nearly sorted array
    public static void elementInNearlySorted(int[] arr, int target) {

    }

}
