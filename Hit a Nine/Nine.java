import java.util.Scanner;
import java.util.Random;
public class Nine {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		
		int user, comp;
		
		System.out.print("Playing a game\r\n"+ "=================\r\n"+ " "); 
		System.out.print("Ready to play? (Y/N)"); 
		String check= sc.nextLine(); 
		
		if(check.equals("Y")) {
			
			 user= (int)(Math.random() * (6 - 1 + 1) + 1);
			 System.out.println("You rolled "+user);
			 System.out.print("Would you like to roll again? (Y/N)"); 
			 check= sc.nextLine();
			 if(check.equals("Y")) {
				 int i= (int)(Math.random() * (6 - 1 + 1) + 1);
				 user+=i;
				 System.out.println("You rolled "+i+" and in total you have "+user);
				 
			 }
		if(user>9) {
			System.out.println("You are FAT and lost the game"); 
		}
		else {
			
			comp= (int)(Math.random() * (6 - 1 + 1) + 1);
			System.out.println("The computer rolled "+comp);
			if(comp<=4) {
				int j= (int)(Math.random() * (6 - 1 + 1) + 1);
				comp+=j;
				System.out.println("The computer rolls again and gets "+j+" in total "+comp);
			}
			
			if(comp>9) {
				System.out.println("Computer becomes FAT and You won the game"); 
			}
			else {
				if( user==9) {
					if(comp==9) {
						System.out.println("Game tied");
					}
					else {
						System.out.println("You won!!");
					}		
				}
				else if(comp==user) {
					System.out.println("Game tied");
				}
				else if (comp==9) {
					System.out.println("You Lost!!");
				}
				else if(9-comp > 9-user) {
					System.out.println("You Won!!");
				}
				else {
					System.out.println("You Lost!!");
				}
			}
			
		  }
		}

	}
}
