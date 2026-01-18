package binarySearch;

public class SortedRotated_1 {
    public static void main(String[] args){
        int []arr={4,5,6,7,8,1,2,3};
        nTimesRotated(arr);
    }

    //sorted rotated me min ele how many times rotated[ normal linear , optimal binary search]
    public static void nTimesRotated(int []arr){
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
    }
}
