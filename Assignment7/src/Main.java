import java.lang.*;
import java.util.*;

public class Main
{
    public static int count=0;
    public static void check_palindrome(String x){
        StringBuilder s=new StringBuilder(x);
        if (x.equals(s.reverse().toString())){
            System.out.println(x+" Element is Palindrome");
            count ++;
        }
        else{
            System.out.println(x+" Element is Not Palindrome");
        }
    }
    public static void string_operation() {
        String word;
        Scanner scan=new Scanner(System.in);
        int n;
        ArrayList <String> words=new ArrayList<>();
        System.out.println("Enter the Number of Elements: ");
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter The Element: ");
            word=scan.next();
            words.add(word);
        }
        count=0;
        for(String w:words){
            check_palindrome(w);
        }
        System.out.println("The Palindrome Count is: " + count);
    }
    public static void integer_operation(){
        int num;
        Scanner scan=new Scanner(System.in);
        ArrayList <Integer> numb=new ArrayList<>();
        System.out.println("Enter the Number of Elements: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter The Element: ");
            num=scan.nextInt();
            numb.add(num);
        }
        for(int number:numb){
            check_evenorodd(number);
            if(isPrime(number)==true){
                System.out.println(number+" is Prime Number");
            }
            else{
                System.out.println(number+" is Not Prime Number");
            }

        }
    }
    public static void check_evenorodd(int real){
        if(real%2==0){
            System.out.println(real+" is an Even Number.");
        }
        else{
            System.out.println(real+" is an Odd Number.");
        }
    }
public static boolean isPrime(int real)
    {
        if (real <= 1)
            return false;
        if (real == 2 || real == 3)
            return true;
        if (real % 2 == 0 || real % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(real); i = i + 6) {
            if (real % i == 0 || real % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("PROGRAM FOR GENERICS.");
        System.out.println("***********************************************************************************");
        System.out.println("1)String\n2)Integer");
        System.out.println("***********************************************************************************");
        System.out.print("Select The Option: ");
        ch=scan.nextInt();
        if (ch==1)
        {
            string_operation();
        }
        else
        {
            integer_operation();
        }
    }

}



