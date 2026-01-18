package binarySearch;

public class FloorAndCeil_2 {
    public static void main(String[] args) {
        int []arr={2,3,4,7,8,9,11};
        char []arr1={'b','c','d','f','g','h','j'};
        char nextChar='f';
        int tarF=6, tarC=5;
        floorBS(arr,tarF);
        ceilBS(arr,tarC);
        nextLetterBS(arr1,nextChar);

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
                System.out.println("Ceil is found ="+arr[mid]);
            } else if (arr[mid] < tarC) {
                s=mid+1;
            }else{
                res=arr[mid];
                e=mid-1;
            }
        }
        System.out.println("Ceil( smallest b/w all greatest ele from target) is ="+res);
    }

    //similiar to Ceil logic
    public static void nextLetterBS(char []arr1, char nextChar){
        int s=0, e=arr1.length-1;
        char res = ' ';
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr1[mid] == nextChar){
                s=mid+1;
//                System.out.println("NextChar is found ="+arr1[mid+1]);
//                break;
            } else if (arr1[mid] < nextChar) {
                s=mid+1;
            }else{
                res=arr1[mid];
                e=mid-1;
            }
        }
        System.out.println("Next character from target( smallest b/w all greatest ele from target) is ="+res);
    }
}
