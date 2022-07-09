package BinarySearch;

public class BS_First_Last_occurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5};
        int num =3;
        System.out.println(First_occ(arr, num));
        System.out.println(Last_occ(arr, num));
    }

    public static int First_occ(int arr[],int num){
        int lo =0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==num){
                ans=mid;
                hi=mid-1;
            }else if(arr[mid]>num){
                hi=mid-1;
            }else{
               lo=mid+1;
            }
        }
        return ans;
    }

    public static int Last_occ(int arr[], int num){
        int lo =0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==num){
                ans=mid;
                lo=mid+1;
            }else if(arr[mid]>num){
                hi=mid-1;
            }else{
               lo=mid+1;
            }
        }
        return ans;
    }
}
