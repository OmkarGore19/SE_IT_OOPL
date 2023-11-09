import java.util.Scanner;

class Employee
{
    int emp_id;
    double mobile;
    String email;
    String name;
    String address;
    Scanner s = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Please Enter The Employee Name: ");
        name = s.nextLine();
        System.out.println("Please Enter The Employee ID: ");
        emp_id = s.nextInt();
        System.out.println("Please Enter The Employee Mobile Number: ");
        mobile = s.nextDouble();
        System.out.println("Please Enter The Employee Address: ");
        s.nextLine();
        address = s.nextLine();
        System.out.println("Please Enter The Employee Mail id: ");
        email = s.nextLine();
    }
    void display()
    {
        System.out.println("\n\nEmployee Name:"+ name);
        System.out.println("Employee ID:"+ emp_id);
        System.out.println("Employee Mail id:"+ email);
        System.out.println("Employee Address:"+ address);
        System.out.println("Employee Mobile Number:"+ mobile+"\n\n");
    }
}

