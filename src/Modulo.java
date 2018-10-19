import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a number");
        int num = in.nextInt();
        int result = num % 10;

        System.out.println(result);
    }
}
