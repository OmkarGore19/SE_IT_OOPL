import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice,cont;
        int select;
        do{
            System.out.print("\nSelect the Vehicle:\n1.Bicycle\n2.Bike\n3.Car\nEnter Your choice: ");
            choice = sc.nextInt();
            System.out.print("Select the Type Of Road:\n1.Highway\n2.City Roads\nEnter Your choice: ");
            select = sc.nextInt();
            if(select != 1 && select != 2){
                System.out.print("Invalid Input");
                break;
            }
            switch (choice)
            {
                case 1:{
                    bicycle obj1 = new bicycle();
                    obj1.gearChange();
                    if(select==1){obj1.speedUp();}
                    else if(select==2){obj1.applyBreak();}
                    System.out.println("\n---------------------------------------\nBICYCLE PRESENT STATE\n---------------------------------------");
                    obj1.printState();
                    break;
                }
                case 2:{
                    bike obj2= new bike();
                    obj2.gearChange();
                    if(select==1){obj2.speedUp();}
                    else if(select==2){obj2.applyBreak();}
                    System.out.println("\n---------------------------------------\nBIKE PRESENT STATE\n---------------------------------------");
                    obj2.printState();
                    break;
                }
                case 3:{
                    car obj3= new car();
                    obj3.gearChange();
                    if(select==1){obj3.speedUp();}
                    else if(select==2){obj3.applyBreak();}
                    System.out.println("\n---------------------------------------\nCAR PRESENT STATE\n---------------------------------------");
                    obj3.printState();
                    break;
                }
            }
            System.out.println("Enter 0 to EXIT OR 1 to CONTINUE");
            cont = sc.nextInt();
        }while(cont == 1);
    }
}