import java.util.Scanner;

public class Vowel {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter input ");
        char inp1=input.next().charAt(0);
        char inp2 =Character.toUpperCase(inp1);


        switch(inp2)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(inp2+ "is a Vowel.");
                break;

            default: System.out.println(inp2+" is a Non-Vowel Character.");
        }

    }
}
