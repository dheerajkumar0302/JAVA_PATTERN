import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int s = sc.nextInt();
        printLeftTrianglePattern(s);
        leftTriangle(s);
    }
    public static void printLeftTrianglePattern(int s)
    {
        for(int i=1; i<=s; i++)
        {
            for(int j =1; j<=s ; j++)
            {
                if(j<=s-i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void leftTriangle(int s)
    {
        int i, j;
//Outer loop work for rows
        for (i=0; i<s; i++)
        {
//inner loop work for space
            for (j=0; j<=s-i-1; j++)
            {
//prints space between two stars
                System.out.print("  ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
