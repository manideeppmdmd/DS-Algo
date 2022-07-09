package Basic;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         long num = sc.nextLong();
         long temp= num;
         int n=0;

         while (temp!=0){
             temp=temp/10;
             n++;
         }

        temp=num;
        long sum=0;
        while(temp!=0){
            sum+=Math.pow(temp%10, n);
            temp=temp/10;
        }
        if(sum ==num){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
