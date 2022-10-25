import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter input string");
        String input = str.next();

        int i, strLength = 0, flag = 0;
        char ch[] = input.toCharArray();
        for (char a : ch) {
            strLength++;
        }
        for (i = 0; i < strLength; i++) {

            if (ch[i] != ch[strLength - i - 1]) {
                flag = 1;
                break;
            }
        }


        if (flag == 1) {
            System.out.println("Entered string is not palindrome.");
        } else {
            System.out.println("Entered string is palindrome.");
        }
    }
}
