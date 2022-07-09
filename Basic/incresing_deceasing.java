package Basic;

import java.util.*;
public class incresing_deceasing {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int pre=sc.nextInt();

        boolean dec=true;
        boolean bol= true;

        boolean inc=false;

        int i=0;

        while(i<n-1){
            int cur=sc.nextInt();
            if(cur==pre){
                bol=false;
                break;
            }else if(cur>pre){
                if(dec){
                    dec=false;
                }
                inc=true;
            }else{
                if(dec){
                    pre=cur;
                    i++;
                    continue;
                }else if(inc){
                    bol= false;
                    break;
                }
            }
            pre=cur;
            i++;
        }
        if(bol){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
