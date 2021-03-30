import java.util.Scanner;

public class DangerousWork {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("How much would you like to earn?"); 
		double check= sc.nextDouble(); 
		
		int days=0;
		double pay=0.01;
		while(pay<=check) {
			if (days>30) {
				System.out.print("It will take more than 30 days and you won't survive working more than 30 days...");
				break;
			}
			days++;
			pay=pay*2;
		}
		
		if(days<=30)
		  System.out.print("You will have your money in "+days+" days."); 
		
	}
	
}
