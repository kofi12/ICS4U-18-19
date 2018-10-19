import java.util.Scanner;

public class Repetition
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 10");

        int num = in.nextInt();
        int i;

        //there are 3 different types of loops, for, while and do...while

        for(i = 0; i < num; i++)
        {
            System.out.println("*\t" + i);

        }
        System.out.println(i);

        i = 0;
        while(i < num)
        {
            System.out.println("*\t" + i);
            i++;
        }


        do
        {
            System.out.println("*\t" + i);
            i++;
        }
        while(i < num);
    }
}
