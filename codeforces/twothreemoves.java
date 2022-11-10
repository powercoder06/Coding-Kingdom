package codeforces;
import java.util.*;
public class twothreemoves {
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            int t;
            t=in.nextInt();
            int n;
            while(t>0)
            {
                n=in.nextInt();
                int d=n%3;
                int a=(int)(n/3);
                if(n==1)
                    System.out.println(a+2);
                else if(d==2 || d==1)
                    System.out.println(a+1);
                else if(d==0)
                    System.out.println(a);
                t--;
            }
        }
    }
}