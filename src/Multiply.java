import java.util.Scanner;

public class Multiply
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int answer = 0;

        answer = multi(3,4);

        System.out.println(answer);

    }

    public static int multi(int x, int y)
    {
        int i = 0;

        for(i = 0; i < y; i++)
        {
            return i * y;
        }

        return i;
    }
}
