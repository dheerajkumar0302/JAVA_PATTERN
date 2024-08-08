import java.util.Scanner;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printReverseLeftHalfPyramid(num);
    }
    public static void printReverseLeftHalfPyramid(int n)
    {
        for(int i=n ; i>=1 ; i--)
        {
            for(int j=1 ; j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
