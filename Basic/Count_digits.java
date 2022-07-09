package Basic;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int n = sc.nextInt();
        int count =0;
        while(num !=0){
            if(num%10==n){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
