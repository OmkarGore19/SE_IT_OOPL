
import java.util.*;

public class Main
{
    public static void main(String[] args) {

        int choice , cont;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Select The Shape Of Which You Need To Find Area:\n1.Rectangle\n2.Triangle\nYour Choice: \n");
            choice = sc.nextInt();
            if(choice == 1)
            {
                Shape sh = new Rectangle();
                System.out.println("\nThe Area Of Rectangle is : "+ sh.Compute_Area());
            }
            else
            {
                Shape sha = new Triangle();
                System.out.println("\nThe Area Of Triangle is : "+ sha.Compute_Area());
            }
            System.out.print("\nEnter 1 to Continue & 0 to Exit : ");
            cont = sc.nextInt();
        }while(cont == 1);


    }
}




/*public class Main
{
	public static void main(String[] args) {
        
        Shape sh = new Rectangle();
        System.out.println("The Area Of Rectangle is : "+ sh.Compute_Area());
        sh = new Triangle();
        System.out.println("The Area Of Triangle is : "+ sh.Compute_Area());
        
        
	}
}*/