package binarySearch;

public class SearchIn2DArray_4 {
    public static void main(String[] args){
        int [][]arr={{5,6,7,8},{9,10,11,12,},{13,14,15,16},{17,18,19,20}};
        int key=14;
        elementIn2DArray(arr,key);

    }
    //we should start searching from first row & last column
    public static void elementIn2DArray(int [][]arr, int key){
        int nRow=arr.length, nCol=arr[0].length;
        int i=0,j=nCol-1;
        while(i>=0 && i<nRow || j>=0 && j<nCol ){
            if(key > arr[i][j]){
                i++;
            }else if(key < arr[i][j]){
                j--;
            }else {
                System.out.println(key+"- element present at index ( "+i+","+j+" )" );
                break;
            }
        }
    }
}
