package Basic;

import java.util.Scanner;

public class simple_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(sum>=0){
            int n = sc.nextInt();
            if(sum+n>=0){
                System.out.println(n);
            }
            sum+=n;
        }
    }
}
