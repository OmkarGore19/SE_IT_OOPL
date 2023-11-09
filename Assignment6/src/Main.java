import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main (String[]args)
    {
        //part1
        int[] arr = { 32, 44, 33, 54, 56, 34 };
        System.out.println ("Array is : " + Arrays.toString (arr));
        System.out.println ("Enter the index number: ");
        try
        {
            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt ();
            System.out.println ("Array element at position " + a + " is " + arr[a]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter correct index number\n"+e);
        }


        //part2
        try
        {
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter the First number: ");
            String x = sc.nextLine();
            int Num1 = Integer.parseInt(x);
            System.out.println ("Enter the Second number: ");
            String y = sc.nextLine();
            int Num2 = Integer.parseInt(y);
            System.out.println (Num1 / Num2);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Enter Valid Integer\n"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Num2 Can't be zero\n"+e);
        }


    }
}


