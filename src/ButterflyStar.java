import java.util.Scanner;

public class ButterflyStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        printButterflyStar(num);
    }
    public static void printButterflyStar(int n)
    {
        //printing upper half
        for(int i = 1 ;i<=n ; i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1 ; j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //printing lower half
        for(int i=n-1; i>=1 ; i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1 ; j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
