package BinarySearch;

public class Count_Occurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5};
        int num =3;
        int f= BS_First_Last_occurence.First_occ(arr, num);
        int l= BS_First_Last_occurence.Last_occ(arr, num);
        System.out.println(l-f+1);
    }
}
