package BinarySearch;

public class Search_in_rotated {
    public static void main(String[] args) {
        int arr[]={11,12,15,18,2,5,6,8};
        int num=6;

        int small=Roated_arr.rotated(arr);
        int left=search(arr,0, small-1, num);
        int right=search(arr,small, arr.length-1, num);

        if(left!=-1){
            System.out.println(left);
        }else if(right!=-1){
            System.out.println(right);
        }else{
            System.out.println("-1");
        }

    }

    public static int search(int arr[],int lo, int hi,int num){

        while(lo<=hi){
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
}
