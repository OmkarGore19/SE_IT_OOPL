import java.util.Scanner;

public class bicycle implements vehicle{
    Scanner sc = new Scanner(System.in);

    int Current_gear,Current_Speed;
    public int getCurrent_gear(){
        System.out.print("Enter the Current Gear of Bicycle: ");
        Current_gear =sc.nextInt();
        return Current_gear;
    }

    public int getCurrent_Speed(){
        System.out.print("Enter the Current Speed of Bicycle(km/h): ");
        Current_Speed=sc.nextInt();
        return Current_Speed;
    }

    @Override
    public void gearChange() {
        int change_gear;
        System.out.print("Current Gear Is: "+getCurrent_gear());
        System.out.print("\nChange Gear To: ");
        change_gear = sc.nextInt();
        Current_gear=change_gear;
    }

    @Override
    public void speedUp() {
        int SpeedUp;
        System.out.print("Current Speed Is(km/h): "+ getCurrent_Speed());
        System.out.print("\nIncrease Speed By(km/h): ");
        SpeedUp = sc.nextInt();
        Current_Speed+=SpeedUp;
    }

    @Override
    public void applyBreak() {
        int decrement;
        System.out.print("Current Speed Is(km/h): "+getCurrent_Speed());
        System.out.print("\nDecrease Speed By(km/h): ");
        decrement  = sc.nextInt();
        Current_Speed-=decrement;
    }

    public void printState(){
        System.out.println("Gear Of Bicycle is: "+Current_gear+"\nSpeed Of Bicycle is(km/h): "+Current_Speed+"\n");
    }

}
