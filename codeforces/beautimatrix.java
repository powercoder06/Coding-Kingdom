package codeforces;
import java.util.*;

public class beautimatrix {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        int a[][] = new int[5][5];
        int m=2,n=2;
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                a[i][j]=in.nextInt();
                if(a[i][j]==1)
                 {
                    m=i;
                    n=j;
                    break;
                 }
            }
        }
        if(m>=2 && n>=2)
            System.out.println(m+n-4);
        else if(m>=2 && n<2)
            System.out.println(m-n);
        else if(m<2 && n>=2)
            System.out.println(n-m);
        else 
            System.out.println(4-m-n);
    }
}
