import java.util.Scanner;
public class countdigit
{
    static long countDigit(long n)
    {
        return (long)(Math.log10(n))+1;
    }
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            long n;
            n=in.nextLong();
            System.out.println(countDigit(n));
        }

    }
}