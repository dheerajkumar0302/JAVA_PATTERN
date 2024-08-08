import java.util.Scanner;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        printHollowTrianglePattern(num);
    }
    public static void printHollowTrianglePattern(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                if (j==i||j==1||i==1||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
