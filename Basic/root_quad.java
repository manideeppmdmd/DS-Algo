package Basic;

import java.util.Scanner;

public class root_quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        if(a!=0){

        
        int rt= b*b -(4*a*c);
        if(rt>=0){
            System.out.println("Real and Distinct");
            int ans1= (int)(-b+Math.sqrt(rt))/2*a;
            int ans2= (int)(-b-Math.sqrt(rt))/2*a;

            if(ans1<ans2){
                System.out.println(ans1 +" "+ans2);
            }else{
                System.out.println(ans2 +" "+ans1);
            }
            

        }else if(rt==0){
            System.out.println("Real and Equal");

            int ans1= (int)(-b+Math.sqrt(rt))/2*a;
            int ans2= ans1;

            System.out.println(ans1 +" "+ans2);
        }else{
            System.out.println("Imaginary");
        }
    }

       // (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
    }
}
