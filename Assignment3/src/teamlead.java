import java.util.Scanner;
class teamlead extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getteamlead()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please Enter The Basic Pay: ");
        bp = sc1.nextDouble();
    }
    void calculateteamlead()
    {
        da=(0.97*bp);
        hra=(0.1*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("**************************************************************************************");
        System.out.println("PAY SLIP FOR TEAM LEAD");
        System.out.println("**************************************************************************************");
        System.out.println("BASIC PAY: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS SALARY: Rs. "+gross);
        System.out.println("NET SALARY: Rs. "+net);
    }
}

