package binarySearch;

public class BSTechnique {

    /*infinite array concept, impt but it does not exit in java with primitive data type as array needs to be fixed size
    we can use arraylist to add infinite no.
    So first need to find end index, for that we need to compare target ele with random picking end idx at 1 ele.
    if key ele is greater than end idx ele, then increase end idx by 2 times ,
    once end idx found , then apply binaray search
    one type of qst comes like search 1st occ of 1 inside infinite array[ 0,0,0,0,0,1,1,1,;........]
     */


    //Array elements must be in sorted order.
    public static void main(String[] args) {
        binarySearch();
    }

    public static void binarySearch() {
        int []arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int start = 0, end = arr.length - 1, res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                res = mid;
                break;
        }
    }
        System.out.println(arr[res]+" found at index ="+res);
    }
}
