import java.util.Scanner;

public class NumberIncreasingPyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        printNumberIncreasingPyramid(num);
    }
    public static void printNumberIncreasingPyramid(int n)
    {
        for(int i=1 ; i<=n; i++)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
