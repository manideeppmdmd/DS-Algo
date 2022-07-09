package Basic;

import java.util.Scanner;

public class Print_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        while(n!=0){
            ans+=n%10;
            if(n%10!=n){
                ans*=10;
            }
            n/=10;
        }
        System.out.println(ans);
    }

}
