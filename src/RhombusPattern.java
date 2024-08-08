import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printRhombusPattern(num);
    }
    public static void printRhombusPattern(int n)
    {
        for(int i =1 ; i<= n ; i++)
        {
            for(int j =1 ; j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
