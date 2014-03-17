package hw5;
import java.util.Scanner;
public class HW5 {


    public static void main(String[] args) {
       int thirsty;
        int breakfast;
 
        Scanner input = new Scanner(System.in);
        
        System.out.print("hungry");
        
        System.out.print("get in line");
        
        System.out.print("buy lunch");
        
        System.out.print("thirsty");
        
        System.out.print("enter 1 if thirsty");
        thirsty = input.nextInt();
        if(thirsty == 1)
        {
            System.out.print("buy a dietcoke");
        }
        else
        {
            System.out.print("buy a water");
        }
        
        System.out.print("enter 2 if had breakfast");
        breakfast = input.nextInt();
        if(breakfast == 2)
        {
            System.out.print("buy a coke");
        }
  else
        {
            System.out.print("buy a water");
        }
        
        System.out.print("eat lunch");
        
        System.out.print("return tray");
        
        System.out.print("leave");
        
    }
    
}


//enter 2 if had breakfast
//Only ask this if user is thristy, please
