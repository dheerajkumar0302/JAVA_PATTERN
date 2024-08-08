import java.util.Scanner;

public class ButterflyStarPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printButterflyStar(num);
    }
    public static void printButterflyStar(int n) {
        for (int i = 1; i <= n; i++)
        {
            //printing first left side
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                 System.out.print("*");
                else
                    System.out.print(" ");
            }
            // printing space first half
            for(int j=1;j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            //printing first right side
            for(int j=i;j>=1;j--)
            {
                if((i+j)%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1 ; i>=1 ; i--)
        {
            for(int j=1 ; j<=i;j++)
            {
                if((i+j)%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=1 ; j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                if((i+j)%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
