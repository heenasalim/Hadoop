package snippet;



public class Heena 
	
{
    static int mark=0;
	public  static int maxTreedesroyed( int input1,int input2,int input3,String s)
{
		
			  int     i_maximum=0;
			  int     di_maximum=0;
			  int x,y;

			  int     lower1_maximum=0;
//			  int     lower2_maximum=0;
		
	     	   int final_output = 0;
	   int a[][] = new int[input1+1][input2+1];
		String s6[]=new String[input3];
		 int row_no = 0,column_no = 0;
	
	 	int h_maximum=0;
		int v_maximum=0;
		int d_maximum=0;
	      
	       String s3=s.replaceAll("[((]", "");
	     //  System.out.println(s3);
	       String s4=s3.replaceAll("[))]", "#");
	    //   System.out.println(s4);
	       String s5=s4.replaceAll("##", "#");
	     //  System.out.println(s5);
	    
             String[] pair= s5.split("#");
                                                              //		      int ints[] = new int[pair.length];
	
		      for(int i = 0; i < pair.length; i++){
                  s6 = pair[i].split(",");
                  x = Integer.valueOf(s6[0]);
                  y = Integer.valueOf(s6[1]);
                
                 row_no=x;
                 column_no=y;
  
                 
                 if(row_no > input1  || row_no <0)
                  return 0;
                 if(column_no > input2  || column_no <0 )
                	 return 0;
                 
                 
   		        for(int zs=1;zs<=input1;zs++)
      		    {
      		  	  for(int  j=1;j<=input2;j++)
      		  	  {
      		  		  
      		  	      a[row_no][column_no]=1;
      		  	  
      		
      		  	  }	  	  
      		
      		  }}
		
              
		      for(int i=1;i<=input1;i++)
   		    {
		    	int   h_count = 0;
   		  	   for(int j=1;j<=input2;j++)
   		  	   {
   		  		  
   		  	                          if( a[i][j]==1)
   		  	                          {
   		  	                                   h_count++; 
   		  	                        }
   		  	                // System.out.println( "a[6][7]" + a[6][7]);
 
   		  	  }
   		
   		  	
   		     	int horizontal[]=new int[100];
   		  	    horizontal[i]=h_count;
   		    	h_maximum=maximun(horizontal);
   			 // System.out.println(h_maximum);	  	
   		    }
		//	  System.out.println(h_maximum);
		      
		      
		      int vertical[]=new int[16];
		    //  System.out.println(h_maximum);
		     
		      for(int i=1;i<=input2;i++)
	   		    {
		    	  
		 		 int   v_count = 0;
		 		
	   		  	   for(int j=1;j<=input1;j++)
	   		  	   { 		  	   
	   		  	                       if( a[j][i]==1)
	   		  	                          {
	   		  	                    	 v_count++;
	  	      
	   		  	                          }
	   		  	                       
	   		  	              	                       
	   		  	                       
	   		  	          }
	   		                     vertical[i]=v_count;
	   		                 //    System.out.println(vertical[i]);
                             
	   		  	
	   		    }		
		              v_maximum=maximun(vertical);
			    

			    int z=0;
			      int  diagonal[]=new int[16];                                          //upper2
			      int  inverse_diagonal[]=new int[16];                                   //upper1
			      int  lower1_diagonal[]=new int[16];                                     //lower1
			     // int  lower2_diagonal[]=new int[16];                                     //lower2
			      for (int y1 = 1; y1 < a.length; y1++) {
			    	 
			    	    for (int x1 = 1; x1 < a.length; x1++) {
			    	    	 int d_count=0;
			    	        for ( z = 1; z <=input2-x1; z++) {
			    	       // System.out.println("upper 2");
			    	    	     
			    	    	                             if(a[z][x1+z]==1)
			    	    	                                {
			    	    		                             d_count ++;                  // diagonal  i*i j*j is remaining
			    	    		 
			    	    	                                 }
//			    	    	                  
//			    	    	 
			    	                      }  //end of z
			    	 
			    	       // System.out.println(" ");
			    	        diagonal[x1]=d_count;
				    	    d_maximum=maximun(diagonal);   
				    	   	    
			    	    }                      //end of x
			    	  	  
			                       
			    	}
			
			      System.out.println(d_maximum);
			//      
			      
			      
			    	   
			    
			    	    for (int x1 = input1+2;  x1 > 1 ; x1--) {
			    	    	 int di_count=0;
//			    	      
			    	    	 
		    	    	 for (int z1 = 1; z1 < x1; z1++) {
		    	    	
			    	         	   try
			    	         	     {
//			    	    	     
			    	    	                             if(a[x1-z1][z1]==1)
			    	    	                                {
			    	    		                             di_count ++;                  // diagonal  i*i j*j is remaining
			    	    		 
			    	    	                              }
			    	    	 
			    	    	                             															
			    	                      }  //end of z
		    	    	 
		    	    	 catch (Exception e) {
							// TODO: handle exception
						}
		    	    	 }
			    	     
			    	         
			    	       inverse_diagonal[x1]=di_count;
				    	   di_maximum=maximun(inverse_diagonal);   
				
			    	    }                      //end of x
			    	

  
			    	   
			    	    for (int x1 = 1;  x1 < input1  ; x1++) {
			    	    	 int lower1_count=0;

			    	    	 
		    	    	 for (int z1 = input1; z1 > x1; z1--) {
		    	    	
			    	         	   try
			    	         	     {
			    	      
//			    	         		 
//			    	         		 
//			    	         		  
			    	    	                             if(a[z1][x1-z1]==1)
			    	    	                                {
			    	    		                             lower1_count++;                  // d iagonal  i*i j*j is remaining
			    	    		 
			    	    	                              }
			    	    	 
			    	                      }  //end of z
		    	    	 
		    	    	 catch (Exception e) {
					
						}

			    	         
			    	       lower1_diagonal[x1]=lower1_count;
				    	   lower1_maximum=maximun(lower1_diagonal);  
				    	
				    	 
			    	    }                      //end of x
			    	    }
			    	    
			    	  
//			    	 
//			      for(int i=1;i<=input1 ;i++)
//			      {
//			    	  
//			    	   int count =0;  
//			    	  for(int j=1;j<=input2 ;j++)
//			    	  {
//			    	  try
//			    	  {
//			    		 
//			    		  if(a[j][j]==1)
//			    		  {
//			    			  count ++;
//			    		  }
//			    	  }
//			    	  
//			    	  
//			    	  
//			    	  catch(Exception e){
//			    		  
//			    	  }
//			      }
			    	  
			    	//  i_maximum = count;
			    	  
			    	  
			    //  }
	
//		   System.out.println("upper second   "  + d_maximum);
//		   System.out.println("horixontal  "  + h_maximum);
//		   System.out.println("vertical "  + v_maximum);
//		   System.out.println("lower first"  + lower1_maximum);
//		   System.out.println("diagonally same "  + i_maximum);
		   
		   
		   int  pass[]=new int[100];
		   
		   pass[0]=di_maximum;
		   pass[1]=d_maximum;
		   pass[2]=h_maximum;
		   pass[3]=v_maximum;
		   pass[4]=lower1_maximum;
		   pass[5]=i_maximum;
		   
		       int final_max=maximun(pass);
		            System.out.println("**********&&&&&&&&&&&&&&&&&&&&&&&&&*****" + final_max);
		   
		                            
		                            
	
	return final_max;
    
    


}

	 static int maximum=0;
	public static int maximun(int g[])
	{
	//	 int maximum=0;
	
		for (int i = 0; i < g.length; i++) 
		{		
		if(maximum < g[i])
		{
		maximum=g[i];
		
		}
		
		
		}
		//System.out.println("max is" + maximum);
		return maximum;
		
	}
	
	
	public static void main(String args[])
	{
		
		//String tree="((2,1)(6,6)(4,2)(2,5)(2,6)(2,7)(3,4)(6,1)(6,2)(2,3)(6,3)(6,4)(6,5)(6,7))";
		String tree="((2,3)(2,1)(6,6)(4,2)(2,5)(2,6)(2,7)(3,4)(6,1)(6,2)(6,3)(6,4)(6,5)(1,7))";
		//String tree="((2,1)(2,6)(3,3)(4,4)(4,6)(5,2)(5,5)(5,7)(6,4)(6,6)(5,1)(8,2)(7,3)(7,7)(9,3)(9,6))";
		 maxTreedesroyed(6,7,14,tree);
	}
}