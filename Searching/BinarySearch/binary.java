package Searching.BinarySearch;

public class binary {

    public static int binarySearch(int arr[],int target){

        int low = 0;
        int high =arr.length -1;

        while (low <= high){
            int mid = low + (high-low) /2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] <target ){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        
        return -1;
    } 
    
    
    public static void main(String[] args) {
        int[] arr  = {1,15,25,95,152,485};
        int target = 95;

        int result = binarySearch(arr, target);

        System.out.println(result);

    }
}
