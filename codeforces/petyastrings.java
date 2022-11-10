package codeforces;
import java.util.*;
public class petyastrings {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str2;
        str1 = in.next();
        str2 = in.next();
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1!=n2)
            System.out.println("NO");
        System.out.println(str1.equalsIgnoreCase(str2));
        

    }
}
