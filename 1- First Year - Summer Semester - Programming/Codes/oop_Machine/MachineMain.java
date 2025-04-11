package oop_machine_2;
import java.util.Scanner;
public class MachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		int suger;
		int milk;
		int chocolate; 
		int loopAgain;
		
		while(true)
		{
			choice = 0;
			suger = 0;
			milk = 0;
			chocolate = 0;
			System.out.println("please choose you ordeer from the current options!!:");
			System.out.println();
			System.out.println("1). Espresso:");
			System.out.println("2). Cappuccino:");
			System.out.println("3). Hot Chocolate:");
			System.out.println("4). Tea:");
			
			Scanner sc= new Scanner(System.in);
			choice = sc.nextInt();
			
			if(choice == 1) 
			{
				Espresso esp = new Espresso();
			}
			else if(choice == 2) 
			{
				Cappuccino cappuccinooo = new Cappuccino();
			}
			
			else if(choice == 3) 
			{
				HotChocolate hotChoco = new HotChocolate();
		    }
			
			else if(choice == 4) 
		    {
				Tea teaa = new Tea();
		     }
			else
			{
				System.out.println("invaled choose ty again");
				System.out.println();
				continue;
			}
			break;
		}
		
	}

}
