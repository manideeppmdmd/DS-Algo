package Basic;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n>0){
            String binary= sc.nextLine();
            System.out.println( Integer.parseInt(binary, 2));
            n--;
        }
    }
}
