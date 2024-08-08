import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printSquareHollow(num);
    }
    public static void printSquareHollow(int n)
    {
        for (int i=1 ; i<=n;i++)
        {
            for(int j=1 ; j<=n;j++)
            {
                if(j==1||j==n||i==1||i==n)
                    System.out.print("* " );
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
