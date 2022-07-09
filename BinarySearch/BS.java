package BinarySearch;

public class BS {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,4,5,6,7,8,9};

        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==2){
                System.out.println(mid);
                break;
            }else if(arr[mid]>2){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
    }
}
