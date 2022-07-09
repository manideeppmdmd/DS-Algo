package BinarySearch;

public class BS_on_nearly_sorted {
    public static void main(String[] args) {
        int arr[]={5,10,30,20,40};
        int num=5;
        System.out.println(BS(arr,num));

    }

    public static int BS(int arr[],int num){
        int lo=0;
        int hi=arr.length-1;

        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]==num){
                return mid;
            }else if(mid+1<arr.length && arr[mid+1]==num){
                return mid+1;
            }else if(mid-1>-1 && arr[mid-1]==num){
                    return mid-1;
            }else if(arr[mid]>num){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }

        return -1;
    }
}
