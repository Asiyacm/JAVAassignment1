import java.util.Scanner;

public class Trianglepattern {
    public static void main(String[] args)

    {
        int i,j,n;

        System.out.print("Input number n is : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++) {

                System.out.print(i);
            }
            System.out.println("");
        }
    }

}
