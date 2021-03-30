import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h,q,m,k,j,year;
		String a[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.print("Enter year:"); 
		year = s.nextInt();
		System.out.println(""); 
		System.out.print("Enter month (1-12):"); 
		m = s.nextInt();
		System.out.println(""); 
		System.out.print("Enter day of the month (1-31)"); 
		q = s.nextInt();
		System.out.println(""); 
		
		
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		year -= (m < 3) ? 1 : 0;
		h=( year + year/4 - year/100 + year/400 + t[m-1] + q) % 7;
		
		System.out.println("Day of week is "+a[h+1]); 
		
	}

}
