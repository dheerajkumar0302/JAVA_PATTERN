import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printRightHalfPyramid(num);
    }
    public static void printRightHalfPyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1 ; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
