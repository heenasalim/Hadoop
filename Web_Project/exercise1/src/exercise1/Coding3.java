package exercise1;

import java.io.*;
import java.util.Arrays;
public class Coding3
{ 


	
	public static int[] stringconversion(String a[],int input2)
	{
		int count=0;
		String[] element=new String[16];
		String[] array=new String[16];
		
		for(int k=0;k<a.length;k++)
		{
			
		     element=a[k].split("#");
		     int z=count;
		     for (int y=0;y<element.length;y++)
		     {
		    	
		    	 
		        array[z]=element[y];
		     
		       z++;
		     
			}
		     count= count+input2;
		}

		 int  integer_array[]=new  int[input2 *input2];
		for(int i=0;i<array.length;i++)
		{
     //  System.out.println("ciijs*************************************" + array[i]);
       
                   integer_array[i]=Integer.valueOf(array[i]);
      
                  // System.out.println("integer array is ******" + integer_array[i]);
      
       
		}
       

		return integer_array;
	}
	
	
	public static int[][] monoToBidi(  int[] array,  int input2 ) {
	    if (array.length != (input2*input2))
	        throw new IllegalArgumentException("Invalid array length");

	    int[][] bidi = new int[input2][input2];
	    for ( int i = 0; i < input2; i++ )
	        System.arraycopy(array, (i*input2), bidi[i], 0, input2);
	    for ( int i = 0; i < input2; i++ )
	    {
	    	  for ( int j = 0; j < input2; j++ )
	  	    {
	    	//System.out.println(bidi[i][j]);
	    }
	    }
	    return bidi;
	}
 public static String minimumCost(String[] input1,int input2)
    {
        //Write code here
        
        
	   
	        int cost[][]= monoToBidi( stringconversion(input1,input2), input2);
	    	   
	        if(cost.length==0||cost[0].length==0) 
	        return "NA";
	        
	        
	        int m = cost.length;
	        int n = cost[0].length;
	 
	        int[][] dp = new int[m+1][n+1];
	        for(int i = 0; i < dp.length; i++){
	            Arrays.fill(dp[i], Integer.MAX_VALUE);
	        }
	        dp[1][1] = cost[0][0];
	        for(int i = 1; i <= m; i++){
	            for(int j = 1; j <= n; j++){
	                if(i==1&&j==1) continue;
	                dp[i][j] = cost[i-1][j-1]+
	                        Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
	                
	               
	                
	            }
	        }
	        System.out.println("minimal cost is" + dp[m][n]);
	        return dp[m][n]+ ",";
	    }
	 
	  
	}


        
        
        
        
        
        
        
        
        
        
        