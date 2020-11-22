package exercise1;

public class good_job {


	    static int mark=0;
		public  static int maxTreedesroyed( int input1,int input2,int input3,String s)
	{
			
			
			
			
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
	                  int x = Integer.valueOf(s6[0]);
	                  int y = Integer.valueOf(s6[1]);
	                
	                 
	                 row_no=x;
	                 column_no=y;
	             //    System.out.println("y is now" + column_no);
	                 
	                 if(row_no > input1)
	                  return 0;
	                 if(column_no > input2)
	                	 return 0;
	   		        for(int zs=1;zs<=input1;zs++)
	      		    {
	      		  	  for(int  j=1;j<=input2;j++)
	      		  	  {
	      		  		  
	      		  	      a[row_no][column_no]=1;
	      		  	  
	      		
	      		  	  }	  	  
	      		
	      		  }}
			      
			
//			   		
//	   		     for(int zs=1;zs<=input1;zs++)
//	   		    {
//	   		    	//System.out.println("x is now" + row_no);
//	                //System.out.println("y is now" + column_no);
//	   		  	  for( int j=1;j<=input2;j++)
//	   		  	  {
//	   		  		    		 
//	             // System.out.println("" + zs + "" +j + a[zs][j]); 
//	   		  	  }
//	   		  	  
//	   		
//	   		  }
	              
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
				    
				      int  diagonal[]=new int[16];
				    
				      for (int y = 1; y < a.length; y++) {
				    	 
				    	    for (int x = 1; x < a.length; x++) {
				    	    	 int d_count=0;
				    	        for (int z = 1; z <=input2-x; z++) {
				    	        //   System.out.println(a[y+z][x+z]);
				    	   
		                              System.out.println(z);
				    	         	   System.out.println(x+z);
				    	    	     
				    	    	                             if(a[z][x+z]==1)
				    	    	                                {
				    	    		                             d_count ++;                  // diagonal  i*i j*j is remaining
				    	    		 
				    	    	                                 }
				    	    	 
				    	                      }  //end of z
				    	           //System.out.println( " " + "................" + d_count); 
				    	        diagonal[x]=d_count;
					    	    d_maximum=maximun(diagonal);   
					    	    System.out.println(d_maximum);
				    	    }                      //end of x
				    	
				    	    
				    	    System.out.println(".....................................................");
				    	}
				      
				      
				      
				      
//			      
			     System.out.println(" diagonal " + d_maximum); 
			     
			  
			     
			     if( h_maximum > d_maximum  && h_maximum > v_maximum)
			         	 
			     {
			    	 
			    	 final_output=h_maximum;
			     }
			     if( d_maximum > h_maximum  && d_maximum > v_maximum)
		         	 
			     {
			    	 
			    	 final_output=d_maximum;
			     }
			      
			     if( v_maximum > d_maximum  && v_maximum > h_maximum)
		         	 
			     {
			    	 
			    	 final_output=v_maximum;
			     }
			      System.out.println("final" + final_output); 
			      
		return final_output;
	    
	    
	    // System.out.println("x=" +x + "y is" +y );
//	      for(int j = i+1; j < pair.length; j++){
//	          s6 = pair[j].split(",");
//	            int x1 = Integer.valueOf(s6[0]);
//	            int y1 = Integer.valueOf(s6[1]);
//	        
//	                  
//	    }
	 	

	}



	 
		public static int maximun(int g[])
		{
			
			int max=0;
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
			 maxTreedesroyed( 6,7,14,tree);
		}
	}
