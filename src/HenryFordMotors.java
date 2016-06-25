/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.util.Scanner;

public class HenryFordMotors
{
    public static void main(String[] args)
    {
        String ID="";
        char first,last;
        int newCars=0,oldCars=0,fullTime=0,partTime=0,cars=0;
        Scanner input=new Scanner(System.in);
        do
        {
            System.out.println("Enter ID number: ");
            ID=input.nextLine();
            first=ID.charAt(0);
            if(first!='0')
            {
                last=ID.charAt(3);
                System.out.println("Enter number of cars sold: ");
                cars=input.nextInt();
                input.nextLine();
                if(last=='f' || last=='F')
                {
                    if(first=='1')
                    {
                        newCars+=cars;
                    }
                    else if(first=='2')
                    {
                        oldCars+=cars;
                    }
                    fullTime+=cars;
                    cars=0;
                }
                else if(last=='p' || last=='P')
                {
                    if(first=='1')
                    {
                        newCars+=cars;
                    }
                    else if(first=='2')
                    {
                        oldCars+=cars;
                    }
                    partTime+=cars;
                    cars=0;
                }
            }
        }while(first!='0');
        System.out.println("\n**********************************************************");
        System.out.println("HenryFord Motors Sales Information");
        System.out.println("Number of new Cars sold: " + newCars);
        System.out.println("Number of old Cars sold: " + oldCars);
        System.out.println("Number of cars sold by Full Time Employees: " + fullTime);
        System.out.println("Number of cars sold by Part Time Employees: " + partTime);
        System.out.println("**********************************************************");
    }
}
