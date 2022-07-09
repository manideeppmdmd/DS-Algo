package Basic;
import java.util.Scanner;

public class F_to_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min= sc.nextInt();
        int max= sc.nextInt();
        int step= sc.nextInt();


        while(min<=max){
            double c=  ((5)*(min-32))/9;
            System.out.println(min +" "+ (int)c);
            min+=step;
        }
    }
}