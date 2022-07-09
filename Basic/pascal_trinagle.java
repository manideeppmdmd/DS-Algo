package Basic;

import java.util.Scanner;

public class pascal_trinagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line=sc.nextInt();

        for (int i=0;i<line;i++){
            for(int j=0;j<i+1;j++){
                int num= fac(i)/(fac(i-j)*fac(j));
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }

    public static int fac(int n){
        if(n==1 || n==0){
            return 1;
        }

        return n*fac(n-1);
    }
}
