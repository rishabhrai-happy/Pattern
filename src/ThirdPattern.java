import java.util.Scanner;

public class ThirdPattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
}
