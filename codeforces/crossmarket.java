package codeforces;

import java.util.*;
public class crossmarket {
    public static int small(int n,int m)
    {
        if(n<m)
        return n;
        else
        return m;
    }
    public static int large(int n,int m)
    {
        if(n>m)
        return n;
        else
        return m;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t;
        t=in.nextInt();
        while(t>0)
        {
            int n,m;
            n=in.nextInt();
            m=in.nextInt();
            if (n == 1 && m == 1)
                System.out.println(0);
            else if (n== 1 || m == 1)
                System.out.println(large(n,m));
            else
                System.out.println(small(n+2*m-2,m+2*n-2));
            t--;
        }
    }
}
