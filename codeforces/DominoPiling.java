package codeforces;
import java.util.*;
public class DominoPiling {
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            int m,n;
            m=in.nextInt();
            n=in.nextInt();
             if(m%2==0) 
                System.out.println(n*(m/2));
     else
                System.out.println(n*(m/2)+ (n/2));
        }
    }   
    
}
