package exercise1;

public class Heena 
	
{
    static int mark=0;
	public  static int maxTreedesroyed( int input1,int input2,int input3,String s)
{
		
			  int     i_maximum=0;
			  int     di_maximum=0;
			  int x,y;

			  int     lower1_maximum=0;
			  int     lower2_maximum=0;
		
		   int final_output = 0;
	 int a[][] = new int[input1+1][input2+1];
		String s6[]=new String[input3];
		 int row_no = 0,column_no = 0;
	
	 	int h_maximum=0;
		int v_maximum=0;
		int d_maximum=0;
	     
	       String s3=s.replaceAll("[((]", "");
	       String s4=s3.replaceAll("[))]", "#");
	       String s5=s4.replaceAll("##", "#");
	    
             String[] pair= s5.split("#");
                                                              //		      int ints[] = new int[pair.length];
	
		      for(int i = 0; i < pair.length; i++){
                  s6 = pair[i].split(",");
                  x = Integer.valueOf(s6[0]);
                  y = Integer.valueOf(s6[1]);
                
                 row_no=x;
                 column_no=y;
             //    System.out.println("y is now" + column_no);
                 
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
		      //**********************************************logic to find out same elements repeated**********************************
		      
		
//		   		
//   		     for(int zs=1;zs<=input1;zs++)
//   		    {
//   		    	//System.out.println("x is now" + row_no);    //  
//                //System.out.println("y is now" + column_no);
//   		  	  for( int j=1;j<=input2;j++)
//   		  	  {
//   		  		    		 
//             // System.out.println("" + zs + "" +j + a[zs][j]); 
//   		  	  }
//   		  	  
//   		
//   		  }
              
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
   		
   		  	
   		     	int horizontal[]=new int[9];
   		  	    horizontal[i]=h_count;
   		    	  h_maximum=maximun(horizontal);
   		  	    		  	
   		    }
		      
		      
		      
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
                             
	   		  	
	   		    }		
		              v_maximum=maximun(vertical);
			      //System.out.println("***************" + v_maximum);
//
			    int z=0;
			      int  diagonal[]=new int[16];                                          //upper2
			      int  inverse_diagonal[]=new int[16];                                   //upper1
			      int  lower1_diagonal[]=new int[16];                                     //lower1
			      int  lower2_diagonal[]=new int[16];                                     //lower2
			      for (int y1 = 1; y1 < a.length; y1++) {
			    	 
			    	    for (int x1 = 1; x1 < a.length; x1++) {
			    	    	 int d_count=0;
			    	        for ( z = 1; z <=input2-x1; z++) {
			    	       // System.out.println("upper 2");
			    	    	     
			    	    	                             if(a[z][x1+z]==1)
			    	    	                                {
			    	    		                             d_count ++;                  // diagonal  i*i j*j is remaining
			    	    		 
			    	    	                                 }
//			    	    	                             System.out
//																.println(z);
//			    	    	                             System.out
//																.println(x1+z);
//			    	    	                             System.out
//																.println("...............");
			    	    	 
			    	                      }  //end of z
			    	 
			    	        System.out.println(" ");
			    	        diagonal[x1]=d_count;
				    	    d_maximum=maximun(diagonal);   
				    	   	    
			    	    }                      //end of x
			    	  	  
			                       
			    	}
			  
			      System.out.println("******************************************************************************************************************************");
			      
			      
			      
			    	   
			    //  System.out.println(input1);
			    	    for (int x1 = input1+2;  x1 > 1 ; x1--) {
			    	    	 int di_count=0;
//			    	        for (int z1 = x1 -1; z1 > 1; z1--) {
			    	    	 
		    	    	 for (int z1 = 1; z1 < x1; z1++) {
		    	    		  System.out.println("....................... 1...................");
			    	         	   try
			    	         	     {
//			    	    	     
			    	    	                             if(a[x1-z1][z1]==1)
			    	    	                                {
			    	    		                             di_count ++;                  // diagonal  i*i j*j is remaining
			    	    		 
			    	    	                              }
////			    	    	 
//			    	    	                             System.out
//																.println(x1-z1);
//			    	    	                             System.out
//																.println(z1);
//			    	    	                             System.out
																//.println("................");
			    	                      }  //end of z
		    	    	 
		    	    	 catch (Exception e) {
							// TODO: handle exception
						}
		    	    	 }
			    	     
			    	         
			    	       inverse_diagonal[x1]=di_count;
				    	   di_maximum=maximun(inverse_diagonal);   
				    	//   System.out.println("si maximum is" + di_maximum);
			    	    }                      //end of x
			    	
			   
			    	    
			    	    
			     	   
			    	    for (int x1 = 1;  x1 < input1  ; x1++) {
			    	    	 int lower1_count=0;
//			    	        for (int z1 = x1 -1; z1 > 1; z1--) {
			    	    	 
		    	    	 for (int z1 = input1; z1 > x1; z1--) {
		    	    		// System.out.println("...............2nd upper.........");
			    	         	   try
			    	         	     {
			    	         		  System.out.println(z1);
			    	    	       System.out.println(z1-x1);
			    	    	       System.out.println(".............................");
//			    	         		 
//			    	         		 
//			    	         		  
			    	    	                             if(a[z1][x1-z1]==1)
			    	    	                                {
			    	    		                             lower1_count++;                  // d iagonal  i*i j*j is remaining
			    	    		 
			    	    	                              }
			    	    	 
			    	                      }  //end of z
		    	    	 
		    	    	 catch (Exception e) {
							// TODO: handle exception
						}
		    	    	 
//			    	        System.out.println("..........................................");
			    	         
			    	       lower1_diagonal[x1]=lower1_count;
				    	   lower1_maximum=maximun(lower1_diagonal);  
				    	//   System.out.println("lower 1 maximum is" + lower1_maximum);
				    	 
			    	    }                      //end of x
			    	    }
			    	    
			    	    System.out.println("lower 1 maximum is" + lower1_maximum);
			    	   
			    	    
			    	    
			    	   
			    	    
			    	    
			    	    
			    	    
			      
			      for(int i=1;i<input1 ;i++)
			      {
			    	  int count =0;
			    	  for(int j=1;j<input1 ;j++)
			    	  {
			    	  
			    		 
			    		  if(a[i][i]==1)
			    		  {
			    			  count ++;
			    		  }
			    		  
			      }
			    	  
			    	  i_maximum = count;
			    	  
			    	  
			      }
			      
			      System.out.println("****************************" + i_maximum);
			      
//		      
		     //System.out.println(" diagonal " + d_maximum); 
		     
		  
		     
		     if( h_maximum > d_maximum  && h_maximum > v_maximum && h_maximum >i_maximum  && h_maximum> di_maximum   && h_maximum > lower1_maximum)
		         	 
		     {
		    	 
		    	 final_output=h_maximum;
		     }
		     if( d_maximum > h_maximum  && d_maximum > v_maximum && d_maximum > i_maximum   && d_maximum > di_maximum  && d_maximum > lower1_maximum)
	         	 
		     {
		    	 
		    	 final_output=d_maximum;
		     }
		      
		     if( v_maximum > d_maximum  && v_maximum > h_maximum && v_maximum > i_maximum  && v_maximum > di_maximum    && v_maximum > lower1_maximum)
	         	 
		     {
		    	 
		    	 final_output=v_maximum;
		     }
		     
		     if( i_maximum > d_maximum  && i_maximum > h_maximum && i_maximum > v_maximum   && i_maximum > di_maximum  && i_maximum > lower1_maximum)
	         	 
		     {
		    	 
		    	 final_output=i_maximum;
		     }
 if( di_maximum > d_maximum  && di_maximum > h_maximum && di_maximum > v_maximum   && di_maximum > i_maximum   && di_maximum > lower1_maximum)
	         	 
		     {
		    	 
		    	 final_output=di_maximum;
		     }
		     
 if( lower1_maximum > d_maximum  && lower1_maximum > di_maximum && lower1_maximum > v_maximum   && lower1_maximum > i_maximum  &&  lower1_maximum > h_maximum )
 	 
 {
	 
	 final_output=lower1_maximum;
 }
		      System.out.println("final" + final_output); 
		      
	return final_output;
    
    
    // System.out.println("x=" +x + "y is" +y );
//      for(int j = i+1; j < pair.length; j++){
//          s6 = pair[j].split(",");
//            int x1 = Integer.valueOf(s6[0]);
//            int y1 = Integer.valueOf(s6[1]);
//        
//                  
//    }
 	

}


	static int max=0;
 
	public static int maximun(int g[])
	{
		
		
		for (int i = 0; i < g.length; i++) 
		{		
		if(g[i] > max)
		{
		max=g[i];
		
		}
		
		}
		//System.out.println("max is" + max);
		return max;
		
	}
	
	
	public static void main(String args[])
	{
		String tree="((2,3)(2,1)(6,6)(4,2)(2,5)(2,6)(2,7)(3,4)(6,1)(6,2)(6,3)(6,4)(6,5)(1,7))";
	//String tree="((2,2)(1,3)(1,5)(2,4)(3,3)(3,1)(3,5)(4,1)(4,2)(4,4)(5,1)(5,2)(5,3)(6,2) (6,3)(1,2))";
		 maxTreedesroyed( 6,7,14,tree);
	}
}