import java.util.Scanner;

public class Fibonacci {
    static int n1=0,n2=1,temp;
    static void fibonacci(int count)
    {
        if (count > 0) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(" " + temp);
            fibonacci(count - 1);
        }
    }
    public static void main(String[] args){
        System.out.print("count is:");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.print("fibonnaci series is:");
        System.out.print(n1+" \n"+n2);
        fibonacci(count-2);
    }
}
