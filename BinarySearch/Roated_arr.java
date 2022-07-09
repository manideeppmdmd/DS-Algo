package BinarySearch;


public class Roated_arr {
    public static void main(String[] args) {
        int arr[]={11,12,15,18,2,5,6,8};
        System.out.println(rotated(arr));
    }

    public static int rotated(int arr[]){
        int lo=0;
        int hi=arr.length-1;

        if(arr[lo]<arr[hi]){
            return 0;
        }
        int n =arr.length;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            int prev= (mid-1+n)%n;
            int next=(mid+1)%n;

            if(arr[mid]<prev && next> arr[mid]){
                return mid;
            }else if(arr[mid]> arr[hi]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return 0;
    }
}
