import java.util.Scanner;

public class Perfectsquare {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter intervals");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("perfect square between the intervals are:");
        for(int i = n1; i <= n2; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.print("perfect square =" + i);

            }
        }
    }
}
