package binarySearch;

public class BSTechnique {
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
