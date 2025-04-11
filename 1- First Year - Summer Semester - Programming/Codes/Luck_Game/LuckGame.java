package luck_game;
import java.util.Random;
import java.util.Scanner;

public class LuckGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	
	
			
	     
		int win=30;
		int score = 0;
		
		

				
				for(int i=0; i<8; i++)
				
				{
					System.out.println("Please press anything to roll the dice.");
					try 
					{
						String press = sc.next();				

					} 
					catch (Exception e) 
					{
						// TODO: handle exception
						System.err.println(e.getMessage());
					}
					
					int r = new Random().nextInt(6) + 1;
					System.out.println("The dice : "+r);
					score=score+r;
					
					System.out.println("Your score now is : "+score);
					

					if(score >= win)
					{
						System.out.println("congratulations :) my friend you won!!!!!");
						break;
					}
					
					else if(score==4)
					{
						score=15;
						System.out.println("congratulations you got a ladder!! your score now is : "+score);
					}
					
					else if(score==3)
					{
						score=1;
						System.out.println("oops you got a snake!! your score now is : "+score);
					}
					
					else if(score==9)
					{
						score=1;
						System.out.println("oops you got a snake!! your score now is : "+score);

					}
					
					else if(score==29)
					{
						
						score=20;
						System.out.println("oops you got a snake!! your score now is : "+score);
					}
					
					else if(score==13)
					{
						
						score=19;
						System.out.println("congratulations you got a ladder your score is "+score);
					}
	
				}			
				
				if(score < 30)
				{
					System.out.println("game over!! try again :( ");
				}
					
	}
}




