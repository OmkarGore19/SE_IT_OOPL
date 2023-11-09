import java.util.Scanner;

public abstract class Shape{

    public abstract double Compute_Area();

    double height;
    double width;
    Scanner sc = new Scanner(System.in);

    public double getheight(){
        System.out.println("Enter the Height: ");
        height = sc.nextDouble();
        return height;
    }

    public double getwidth(){
        System.out.println("Enter the Width: ");
        width = sc.nextDouble();
        return width;
    }

    public void Setvalues(double height, double width){
        this.height = height;
        this.width = width;
    }



}