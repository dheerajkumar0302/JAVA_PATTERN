import java.util.Scanner;

public class KPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        printKPattern(num);
    }
    public static void printKPattern(int n)
    {
        for (int i= n ; i>=1;i--)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2 ;i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
