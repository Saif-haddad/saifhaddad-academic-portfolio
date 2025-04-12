package procedural_machine_1;
import java.util.Scanner;
public class ProceduralMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variables
		int choice;
		int suger;
		int milk;
		int chocolate; 
		int loopAgain;
		
		//making a loop 
		while(true)
		{
			//initializing variables 
			choice = 0;
			suger = 0;
			milk = 0;
			chocolate = 0;
			
			//printing
			System.out.println("please choose you order from the current options!!:");
			System.out.println();
			System.out.println("1). Espresso:");
			System.out.println("2). Cappuccino:");
			System.out.println("3). Hot Chocolate:");
			System.out.println("4). Tea:");
			//declaring a scanner to enter numbers 
			Scanner sc= new Scanner(System.in);
			
			//Debugging 
			try 
			{
				choice = sc.nextInt();
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
				System.err.println(e.getLocalizedMessage());
			}
				
			
			
			
			//if statement to do if the user insert 1
			if(choice == 1) 
			{	
				System.out.println("Do you want Milk with your Espresso??");
				System.out.println("1). Yes");
				System.out.println("2). No");
				
				try //debugging
				{
					milk = sc.nextInt();
				} 
				
				catch (Exception e) 
				{
					// TODO: handle exception
					System.err.println(e.getMessage());//print the error
				}
				
				if(milk == 1)//if statement to do if the user insert 1
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Espresso with Milk");
					System.out.println("Have a nice day :)");
				}
				
				else//doing this if the user didn't insert one 
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Espresso without Milk");
					System.out.println("Have a nice day :)");
;
				}
			}
			else if(choice == 2) //else if statement 
			{
				System.out.println("Do you want Suger with your Cappuccino??");//printing 
				System.out.println("1). Yes");
				System.out.println("2). No");
				try 
				{
					suger = sc.nextInt();
				} 
				catch (Exception e) 
				{
					// TODO: handle exception
					System.err.println(e.getMessage());//printing the error 
				}
				
				if(suger == 1)
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Cappuccino with Suger");
					System.out.println("Have a nice day :)");
				
				}
				
				else
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Cappuccino without Suger");
					System.out.println("Have a nice day :)");
				}
			}
			
			else if(choice == 3) 
			{
				System.out.println("Do you want Dark or Milk chocolate with your Hot Chocolate??");//printing 
				System.out.println("1). Dark");
				System.out.println("2). Milk");
				try //debugging 
				{
					chocolate = sc.nextInt();
				} 
				catch (Exception e)
				{
					// TODO: handle exception
					System.err.println(e.getMessage());//printing the error 
				}
				
				if(chocolate == 1)
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Dark Hot Chocolate ");
					System.out.println("Have a nice day :)");
				
				}
				
				else
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Milk Hot Chocolate ");
					System.out.println("Have a nice day :)");
				}
	
		    }
			
			else if(choice == 4) 
		    {
				System.out.println("Do you want Suger with you Tea??");//printing
				System.out.println("1). Yes");
				System.out.println("2). No");
				try //debugging 
				{
					suger = sc.nextInt();

				} 
				catch (Exception e) 
				{
					// TODO: handle exception
					System.err.println(e.getMessage());//to print the error 
				}
				if(suger == 1)
				{
					System.out.println("Thank you for palcing your order..........");//printing 
					System.out.println("Your order is Tea with Suger");
					System.out.println("Have a nice day :)");

				
				}
				
				else
				{
					System.out.println("Thank you for palcing your order..........");//printing
					System.out.println("Your order is Tea without Suger");
					System.out.println("Have a nice day :)");
				
				}
	
		     }
			else
			{
				System.out.println("invaled choose ty again");//printing 
				System.out.println();
				continue;//Don't go out from  loop 
			}
			break;//go out of the loop 
		}
		
	}	

}
