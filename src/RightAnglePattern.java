import java.util.Scanner;
//1
//1 2
//1 2  3
//1 2  3 4

public class RightAnglePattern {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
        }
