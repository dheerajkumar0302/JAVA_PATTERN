import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printSquare(num);
    }
    public static void printSquare(int n)
    {
        for (int i = 1; i<= n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
