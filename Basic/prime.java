package Basic;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans="Prime";
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                ans = "Not Prime";
                break;
            }
        }

        System.out.println(ans);
    }
}
