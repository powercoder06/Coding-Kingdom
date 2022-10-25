package leetcode;
import java.util.Scanner;
public class stringEquivalent {
        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            int l1=word1.length;
            int l2=word2.length;
            String letter1="";
            String letter2="";
            for(int i=0;i<l1;i++)
            {
                letter1=letter1+word1[i];
            }
            for(int i=0;i<l2;i++)
            {
                letter2=letter2+word2[i];
            }
            return letter1.equals(letter2);
        }
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n=in.nextInt();
            String[] w1= new String[n];
            String[] w2= new String[n];
            for(int i=0;i<n;i++)
            {
                w1[i]=in.next();
                w2[i]=in.next();
            }
            System.out.println(arrayStringsAreEqual(w1,w2));
        }
}
