import java.util.Scanner;

public class RightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int s = sc.nextInt();
        printRightTrianglePattern(s);
    }
    public static void printRightTrianglePattern(int s)
    {
        for(int i=1; i<=s ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
