import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int choice,cont;
        do
        {
            System.out.println("PAYSLIP");
            System.out.println("SELECT THE EMPLOYEE :\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER");
            Scanner sc =new Scanner(System.in);
            System.out.print("ENTER YOUR CHOICE: ");
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    programmer p =new programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                    break;
                }
                case 2:
                {
                    teamlead tl =new teamlead();
                    tl.getdata();
                    tl.getteamlead();
                    tl.display();
                    tl.calculateteamlead();
                    break;
                }
                case 3:
                {
                    assistantpromana ASP =new assistantpromana();
                    ASP.getdata();
                    ASP.getasp();
                    ASP.display();
                    ASP.calculateasp();
                    break;
                }
                case 4:
                {
                    promana PM =new promana();
                    PM.getdata();
                    PM.getpromana();
                    PM.display();
                    PM.calculatepromana();
                    break;
                }
            }
            System.out.println("\n\nPlease Enter 0 to Exit Or Enter 1 to Continue");
            cont = sc.nextInt();
        }
        while(cont==1);
    }
}
