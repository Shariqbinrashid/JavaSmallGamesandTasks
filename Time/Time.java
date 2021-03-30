import java.util.*;  

public class Time {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		int totals, seconds, minutes, hours;
		
		System.out.print("Give a number of seconds: ");  
		  totals= sc.nextInt(); 
		  hours = totals/3600;
		  
		  minutes =(totals%3600)/60;
		  seconds = (totals%60);

		  System.out.print(hours + " hours " + minutes + " minutes " + seconds+ " seconds." );
		
		
		
	    }
}
