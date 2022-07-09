package BinarySearch;

public class BS_Orderless {
    public static void main(String[] args) {
       // int arr[] = {1,2,3,4,5,6,7,8,9};
        int arr[] = {9,8,7,6,5,4,3,2,1};

        int num =8;

        if(arr[0]>arr[1]){
            System.out.println(BS_dec(arr, num));
        }else{
            System.out.println(BS_ace(arr, num));
        }
    }

    public static int BS_ace(int arr[],int num){
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return -1;
    }

    public static int BS_dec(int arr[],int num){
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }
}
