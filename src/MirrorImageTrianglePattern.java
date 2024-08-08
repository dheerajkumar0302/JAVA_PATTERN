import java.util.Scanner;

public class MirrorImageTrianglePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printMirrorTrianglePattern(num);
    }
    public static void printMirrorTrianglePattern(int n)
    {
        for(int i = 1 ; i<= n ; i++)
        {
            for(int j =1 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = i ; j<= n ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = n-1 ; i>=1 ; i--)
        {
            for(int j=1 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=i ; j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
