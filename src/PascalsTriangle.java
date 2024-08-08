import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printPascalsTriangle(num);
    }
    public static void printPascalsTriangle(int n)
    {
         for(int i=1 ; i <=n ; i++)
         {
             for(int j=1 ; j<=n-i ; j++)
             {
                 System.out.print(" ");
             }
             int x=1;
             for(int j=1 ; j<=i ; j++)
             {
                    System.out.print(x+" ");
                    x=x*(i-j)/j;
             }
             System.out.println();
         }
    }
}
