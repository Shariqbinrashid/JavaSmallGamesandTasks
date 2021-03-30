import java.util.Scanner;
import java.util.Random;
public class GameSRP {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		int scissor=1;
		int rock=2;
		int paper=3;
		
		int user,comp;
		
		int wins=0, loss=0,ties=0;
		
		while(true) {
			System.out.print("Scissor (1), rock (2), paper (3) or 0 to quit:"); 
	
			user= sc.nextInt(); 
			
			if(user==0) {
				System.out.println("Score: "+wins+" (you)"+ loss+" (computer) "+ties+" (draw).");
				break;
			}
			
			else {
				comp= (int)(Math.random() * (3 - 1 + 1) + 1);
			
				if(user==comp) {
					System.out.println("It's a draw!");
					ties++;
				}
				
				else if(user==1 && comp ==2) {
					System.out.println("You lost, computer had rock!");
					loss++;
				}
				else if(user==1 && comp ==3) {
					System.out.println("You won, computer had Paper!");
					wins++;
				}
				else if(user==2 && comp ==1) {
					System.out.println("You won, computer had Scissor!");
					wins++;
				}
				else if(user==2 && comp ==3) {
					System.out.println("You lost, computer had rock!");
					loss++;
				}
				else if(user==3 && comp ==1) {
					System.out.println("You lost, computer had Scissor!");
					loss++;
				}
				else if(user==3 && comp ==2) {
					System.out.println("You won, computer had rock!");
					wins++;
				}
			}
		}
	}

}
