package codeforces;

import java.util.*;
public class bitplusplus {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        int x=0;
        String statement;
        n=in.nextInt();
        while(n>0)
        {
            statement = in.next();
            if(statement.charAt(0)=='+')
                ++x;
            else if(statement.charAt(0)=='-')
                --x;
            else {
                if(statement.charAt(1)=='+')
                    x++;
                else
                    x--;

            statement="";
            }
            n--;
        }
        System.out.println(x);
    }
}
