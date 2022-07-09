package Basic;
import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num= sc.nextLong();

        int ans =0;
        int i=0;
        while(num!=0){
            ans+=(int) (Math.pow(2, i)*(num%10));
            num=num/10;
            i++;
        }
        System.out.println(ans);
    }
}
