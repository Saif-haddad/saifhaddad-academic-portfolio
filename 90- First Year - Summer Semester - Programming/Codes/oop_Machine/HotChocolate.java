package oop_machine_2;

import java.util.Scanner;

public class HotChocolate extends CupSize{
	HotChocolate()
	{
		System.out.println("Do you want any additions?\n1. Yes\n2. No");
		Scanner sc= new Scanner(System.in);
		setChoice(sc.nextInt());
		if (getChoice() == 1)
		{
			
			HotChocolate.additions();
		}
		if (getChoice() == 2)
		{
			CupSize.additions();
			System.out.println("Thank you for palcing your order..........");
			System.out.println("Your order is Hot Chocolate without any additions");
			System.out.println("Have a nice day :)");
		}
	}
	
	
	
	//att
	private int choice;
	
	
	
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
    //methods
	
	public static void additions()
	{
		int add;
		Scanner sc= new Scanner(System.in);
		System.out.println("choose your additions");
		System.out.println("1). Milk");
		System.out.println("2). Suger");
		System.out.println("3). Milk and Suger");

		add = sc.nextInt();
		if(add == 1)
		{
			addi(1);
		}
		
		else if (add == 2)
		{
			addi(2);

		}
		else
		{
			addi(1, 2);
		}
	}
	static void addi(int i)
	{
		if(i==1)
		{
			System.out.println("Thank you for palcing your order..........");
			System.out.println("Your order is Hot Chocolate with Milk");
			System.out.println("Have a nice day :)");
		}
		else
		{
			System.out.println("Thank you for palcing your order..........");
			System.out.println("Your order is  Hot Chocolate with Suger");
			System.out.println("Have a nice day :)");
		}
	}
	
	static void addi(int i, int j)
	{
		System.out.println("Thank you for palcing your order..........");
		System.out.println("Your order is  Hot Chocolate with Milk and Suger");
		System.out.println("Have a nice day :)");
	}
}
