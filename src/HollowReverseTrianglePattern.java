import java.util.Scanner;

public class HollowReverseTrianglePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printHollowReverseTrianglePattern(num);
    }
    public static void printHollowReverseTrianglePattern(int n)
    {
        for(int i=n; i>=1 ; i--)
        {
            for(int j=n ; j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i;j++)
            {
                if(i==n||j==1||j==i)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
