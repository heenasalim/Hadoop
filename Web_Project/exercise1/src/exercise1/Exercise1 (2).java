package exercise1;

public class Exercise1 {

	static int count=0;
	public static int[] GetJoinedePipes(int[] input1,int input2)
	{  
		int min = 0;
		 
		
		   int a[]=new int[8];
		       for( int i=0;i<input1.length-1 ;i++)
		        {    	

			      int min_value =999;
			   
			      int position;
                 
			          for( int j=0;j< input1.length-1;j++)
				      {
			    	 	    	 
			            if(input1[i] < input1[j]  )
                               {     
			            	      position=i++;
			                      input1[i]=input1[i++];
			                    
				  
			                      min_value=input1[i];
			                      count=count+1;
			                    //  System.out.println( count );
				                  min= min_value;
				                  System.out.println("min value is" +min);
				            		                  
                               }
			            
			                   if(input1[i]  > input1[j]  )
                        {     
		            	      position=i++;
		                      input1[i]=input1[i++];
		                    
			  
		                      min_value=input1[i];
		                      count=count+1;
		                    //  System.out.println( count );
			                  min= min_value;
			                  System.out.println("min value is" +min);
			            		                  
                        }
		            
			       
			         //   System.out.println("*********" +a[j]);	
			           //System.out.println( "ou count is" +count );
	                   	//	          int  size=count;
		             // System.out.println("a lengyth is " + a.length);	 
		
                               //		   mark=i;
				      }  
			          a[i]=min;
                         
//			          int k;
//					   int mark=i;
//					for(k=mark;k<input1.length-1 ;k++)
//				        { 
//						  input1[k]=input1[k++];
//						 
//						
//						  System.out.println("element of array is" +k+ "  "+ input1[k]);  
//						  
//						  
//				        }
		        }     
		       for( int l=0;l<a.length;l++)
				 {
				System.out.println("our output is" +a[l]);
				 }
				
				return  a;
			   
		
		
		
		
	}
		        
//			   int k;
//			   for(k=mark;k<input1.length-1 ;k++)
//		        { 
//				  input1[k]=input1[k++];
//				 
//				
//				  System.out.println("element of array is" +k+ "  "+ input1[k]);  
//				  
//				  
//		        }
			   //System.out.println(k);
			    // input1[k]= input1[input1.length-1];

	public static void main(String args[])
	{
		
		 int b[]= {4,8,5,186};
		 Exercise1.GetJoinedePipes(b,4);
	}
}

