package leetcode;

import java.util.Scanner;
public class rotatestring {
    public static boolean rotateString(String s, String goal) {
        //Solution 1 O(N^2)
        int n=s.length();
        int flag=0;
        String str="";
        if(s.equals(goal))
        {
            flag=1;
        }
        for(int i=0;i<n;i++)
        {
            str="";
            for(int j=1;j<n;j++)
            {
                str = str + s.charAt(j);
            }
            str=str+s.charAt(0);

            if(str.equals(goal))
            {
                flag=1;
                break;
            }
            s=str;
        }
        if(flag==1)
            return true;
        else
            return false;

        //Solution 2 O(N)
        // int n=s.length();
        // int flag=0;
        // String str="";
        // if(s.equals(goal))
        // {
        //     flag=1;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     str="";
        //     str=str+s.substring(1,n); // changes here     
        //     str=str+s.charAt(0);

        //     if(str.equals(goal))
        //     {
        //         flag=1;
        //         break;
        //     }
        //     s=str;
        // }
        // if(flag==1)
        //     return true;
        // else
        //     return false;

        //Solution 3 Easiest using concatnation
            // return (s+s).contains(goal) && (s.length()==goal.length());
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        String str;
        String goal;
        str = in.next();
        goal = in.next();
        System.out.println(rotateString(str,goal));        

    }
}
