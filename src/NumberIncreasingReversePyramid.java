import java.util.Scanner;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNumberIncreasingReversePyramid(num);
    }
    public static void printNumberIncreasingReversePyramid(int n)
    {
        for(int i=n ; i>=1;i--)
        {
            for(int j=1 ; j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
