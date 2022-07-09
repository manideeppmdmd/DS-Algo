package Basic;

import java.util.Scanner;

public class help_ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();

            int riks=0;
            int cabs=0;
            int arr[]= new int[n];
            int arr1[]= new int[m];
            int i=0;
            int j=0;
            while(i<n){
                arr[i]=sc.nextInt();
                i++;
            }
            while(j<m){
                arr1[j]=sc.nextInt();
                j++;
            }

            int sum=0;
            for(int k:arr){
                sum+=Math.min(k*c1,c2);
            }
            riks= Math.min(sum,c3);
            sum=0;
            for(int k:arr1){
                sum+=Math.min(k*c1,c2);
            }
            cabs= Math.min(sum,c3);

            System.out.println(Math.min(riks+cabs,c4));
            
            t--;

        }
    }
}
