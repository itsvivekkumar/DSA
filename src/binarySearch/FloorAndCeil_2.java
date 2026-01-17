package binarySearch;

public class FloorAndCeil_2 {
    public static void main(String[] args) {
        int []arr={2,3,4,7,8,9,11};
        int tarF=6, tarC=5;
        floorBS(arr,tarF);
        ceilBS(arr,tarC);

    }
    //Floor means greatest ele b/w collection of smaller elements that target
    public static void floorBS(int []arr, int tarF){
        int s=0, e=arr.length-1;
        int res=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid] == tarF){
                System.out.println("Floor is found ="+arr[mid]);
            } else if (arr[mid] < tarF) {
                res=arr[mid];
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println("Floor(greatest b/w all smallest ele from target) is ="+res);
    }

    public static void ceilBS(int []arr, int tarC){
        int s=0, e=arr.length-1;
        int res=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid] == tarC){
                System.out.println("Floor is found ="+arr[mid]);
            } else if (arr[mid] < tarC) {
                s=mid+1;
            }else{
                res=arr[mid];
                e=mid-1;
            }
        }
        System.out.println("Ceil( smallest b/w all greatest ele from target) is ="+res);
    }
}
