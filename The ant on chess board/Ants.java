import java.util.Scanner;
import java.util.Random;
public class Ants {
	public static boolean check(int [][] grid) {
       int check=0;
	    
	    for (int row = 0; row < grid.length; row++)
	    {
	    	for (int col = 0; col < grid[row].length; col++)
	        {
	    		if(! (grid[row][col] == 1)) {
	    			 check--;
	    		}
	    		else
	    			check++;
	        }
	    }
	    if(check==64)
	    	return true;
	    else
	    	return false;
	   }
	
	
	public static void main(String args[]) {
	    int[][] grid = new int[8][8];
	    int[] steps = new int[10];
	    int average,sum=0;
	    for (int row = 0; row < grid.length; row++)
	    {
	    	for (int col = 0; col < grid[row].length; col++)
	        {
	    		grid[row][col] = 0; 
	        }
	    }
	    int stepsTaken = 0;

	    int x = 0;
	    int y = 0; // start position 0,0
	   for(int j=0;j<10;j++) {
	
		   while(true)
		    {
		    	int random = (int) (Math.random() * 4) + 1;
		        if (random == 1)
		        {   
		        	x--; //move left
		        	if (x<0) {
	            	stepsTaken--;
	            	x++;
	            	continue;
	                 }
		        	else
		        	stepsTaken++;
		            
		            
		           
		        }
		        else if (random == 2)
		        {
		            x++; //move right
		        	if (x>7) {
	            	stepsTaken--;
	            	x--;
	            	continue;
	                 }
		        	else
		        	stepsTaken++;
		        }
		        
		        else if (random == 3)
		        {
		            y--; //move up
		            if(y<0) {
		            	stepsTaken--;
		            	y++;
		            	continue;
		            }
		            else
		            stepsTaken++;
		        }
		        else if (random == 4)
		        {
		            y++; //move down
		    
		            
		            if (y > 7 )
		            {
		             y--;
		             stepsTaken--;
		             continue;
		             
		            }
		            else
		            	stepsTaken++;
		        }
		        grid[x][y]=1;
		        if(check(grid)) {
		        	break;
		        }
		    }
		   System.out.println("Number of Steps in this simulation: " + stepsTaken);
		   steps[j]=stepsTaken;
	   }
	   
	   for (int i = 0; i < steps.length; i++) {
		   
		   sum+=steps[i];
	   }
	    average=sum/10;
	   System.out.println("Average amount of steps:" + average);
	 }
}

