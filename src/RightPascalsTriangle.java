import java.util.Scanner;

public class RightPascalsTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  num = sc.nextInt();
        printRightPascalsTriangle(num);
    }
    public static void printRightPascalsTriangle(int n)
    {
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j= 1 ; j<=i ; j++)
            {
                if((i+j)%2==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i = n-1 ; i>=1 ; i--)
        {
            for(int j=1; j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
