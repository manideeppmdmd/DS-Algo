package Basic;

import java.util.Scanner;

public class delhi_rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            int num=sc.nextInt();
            String s=String.valueOf(num);
            Boolean ev = true;
            int odd=0;
            int even =0;

            if(s.length()%2!=0){
                ev= false;
            }
            int temp=num;
            if(ev){
                while(temp!=0){
                    even+=temp%10;
                    temp/=100;
                }
                temp=num/10;
                while(temp!=0){
                    odd+=temp%10;
                    temp/=100;

                }
            }else{
                while(temp!=0){
                    odd+=temp%10;
                    temp/=100;
                }
                temp=num/10;
                while(temp!=0){
                    even+=temp%10;
                    temp/=100;
                }
            }
            //System.out.println(odd +" "+even);
            if(odd%3==0 || even%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            i++;
        }
    }
}
