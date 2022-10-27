import java.util.Scanner;
public class countdigit
{
    static long countDigit(long n)
    {
        return (long)(Math.log10(n))+1;
    }
    static void printDigit(long digit,long n)
    {
        while(digit>0)
        {
            System.out.println((long)(n/Math.pow(10, digit-1)));
            n=(long) (n%Math.pow(10, digit-1));
            digit--;
        }
    }
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            long n;
            n=in.nextLong();
            long digit = countDigit(n);
            printDigit(digit,n);
    }
}