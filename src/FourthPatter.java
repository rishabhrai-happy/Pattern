import java.util.Scanner;

public class FourthPatter {
//            5 4 3 2 1
//            4 3 2 1
//            3 2 1
//            2 1
//            1
//            1
//            2 1
//            3 2 1
//            4 3 2 1
//            5 4 3 2 1

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    }
