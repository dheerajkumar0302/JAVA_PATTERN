import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printDiamondPattern(num);
    }
    public static void printDiamondPattern(int n)
    {
        for(int i =1 ; i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
