import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printPyramidNumber(num);
    }
    public static void printPyramidNumber(int n)
    {
        for(int i =1 ; i<=n ;i++)
        {
            int num=i;
            for (int j=1 ; j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            //printing right side
            num--;
            for(int j=1;j<i;j++)
            {
                num--;
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
