import java.util.Scanner;

public class Selection
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age...?");
        int age = in.nextInt();

        //we use if-else statement blocks to make decisions in our code
        // these use boolean expressions

        if(age >= 13)
        {
            System.out.println("Enjoy the movie!!!");
            if(age == 13)
            {
                System.out.println("You almost didn't get it!");
            }
        }
        else
        {
            System.out.println("You are too young to watch this movie, try another one");
        }
    }
}
