import java.util.Scanner;

public class PalindromeTriangular {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        printPalindromeTriangular(num);
    }
    public static void printPalindromeTriangular(int n)
    {
        for(int i=1 ; i<=n; i++) {
            int num = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
                System.out.println();
        }
    }
}
