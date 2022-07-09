package BinarySearch;

public class Ceil_Floor {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,8,10,10,12,19};
        int num =5;
        System.out.println(floor(arr, num));

    }

    public static int floor(int arr[],int num){
        int lo =0;
        int hi= arr.length-1;
        int ans =-1;

        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]<num){
                ans =arr[mid];
                lo=mid+1;
            }else if(arr[mid]>num){
                hi=mid-1;
            }else{
                return arr[mid];
            }
        }

        return ans;
    }

    public static int ceil(int arr[],int num){
        int lo =0;
        int hi= arr.length-1;
        int ans =-1;

        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]<num){
                lo=mid+1;
            }else if(arr[mid]>num){
                ans =arr[mid];
                hi=mid-1;
            }else{
                return arr[mid];
            }
        }

        return ans;
    }
}
