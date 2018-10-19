import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.println("What is your age...");
        age = in.nextInt();
        System.out.println("Thank you for inputting your age." +
                " According to our" +
                " records you are " + age + " years old");

    }
}
