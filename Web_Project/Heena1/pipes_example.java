
public class pipes_example {

	
	

	public static int[] GetJoinedePipes(int[] input1,int input2)
	{ 
		  int sum[] = new int[input2+1];
		  int  b[]=new int[input2-1];
	       for(int i=0;i<input2;i++){
		  for(int j=i+1;j<input2;j++)
		  {
			  
			  
			  if(input1[i]>input1[j])
			  {
				  int temp = input1[i];
				  input1[i]=input1[j];
				  input1[j]=temp;
				  
				  
				  
			  }
			  
	       }
		
	       }
	
		  
		  
	    
		  
	       sum[0]=0;
	  for(int k=1;k<sum.length-1;k++)	
	  {
		  sum[0]=input1[0];
		  sum[k]= sum[k-1] + input1[k];
		 
		  
		//  System.out.println(sum[k]);  
		  
		  
	  }
	  for(int k=1;k<sum.length-1;k++)	
	  {
		  sum[0]=input1[0];
		  sum[k]= sum[k-1] + input1[k];
		 
		  
		 // System.out.println(sum[k]);  
		  
		  
	  }
  for(int k=1;k<sum.length-1;k++)	
	  {
		
		  sum[k-1]=sum[k];
		 
		  
		  
	  }
  for(int k=0;k<input2-1;k++)	
  {
	
      b[k]=sum[k];
	  System.out.println(sum[k]);  
	  
	  
  }
	return sum;
	
		
		
		
	}
	public static void main(String args[])
	{
		//pipes_example p=new pipes_example();
		 int b[]= {4,4,5,186,8,9};
	pipes_example.GetJoinedePipes(b,6);
	}	
	
	
}


