package BinarySearch;

public class min_diff {
    public static void main(String[] args) {
        int arr[] = {4,6,10};
        int num =7;
        System.out.println(min_dif(arr, num));
    }

    public static int min_dif(int arr[] ,int num){
        int lo =0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(arr[mid]==num){
                return mid;
            }else if (arr[mid]>num){
                hi= mid -1;
            }else{
                lo= mid+1;
            }
        }

        if(Math.abs(arr[lo]-num)<Math.abs(arr[hi]-num)){
            return lo;
        }else{
            return hi;
        }


    }
}
