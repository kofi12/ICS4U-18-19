import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //integers and real numbers

        System.out.println(5 / 3);

        //since integer types don't have decimal places, any data after a decimal point is lost
        // this is called "truncation"

        // 5 / 3 = 1.666667....    5 / 3 = 1(.......)


        System.out.println(5.0 / 3.0);
        // since floats carry decimal places, we get a more accurate answer


        System.out.println(1.0 / 2 * 3);

        // operators (+ - / *) have precedence similar to bedmas in math
    }
}
