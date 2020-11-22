package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coding2 {

	
	
	
	
	public static String minimumCost(String[] input1 ,int input2 )
	{
		
		int h = 1,e=1,size=input2,f = 1,min = 0,a = 0,b = 0,c = 0,i;
		int p=0;
		int l,m,o;
		int count=0;
		String path[] =new String[11];
		String s ="heena";
		String[] element=new String[16];
		String[] array=new String[16];
		
		for(int k=0;k<input1.length;k++)
		{
			
		     element=input1[k].split("#");
		     int z=count;
		     for (int y=0;y<element.length;y++)
		     {
		    	// for(int z=count;z<array.length;z++)
		    	// {
		    	 
		        array[z]=element[y];
		        //System.out.println("element at z" +" " + z +" "+  array[z]);
		       // }
		       z++;
		     
			}
		     count= count+input2;
		}

	
		int min_cost=0;

        min_cost=min_cost+Integer.valueOf( array[array.length-1])+Integer.valueOf(array[0]);
		
		//while(array.length!=input2)
	//	{	
	
	int length=array.length-1;
	System.out.println(length);
	int last=Integer.valueOf(array[length]);
	System.out.println("last  element is" + last );
	
     for(i=0;i<1;i++)	
     {
    	

		for(int j=min;j<3;j++)
		{
		System.out.println(min);
			

		h=min+1;
		System.out.println("h is"+h);
		 a=Integer.valueOf(array[h]);
		System.out.println("a is" + a);
		
	  
		e=min+size;
		System.out.println("e is"+ e);
		 b=Integer.valueOf(array[e]);
		System.out.println("b is"+ b);	
	  
	
		 f=min+size+1;
		System.out.println("f is "+ f);
	    c=Integer.valueOf(array[f]);
		System.out.println("c ys" + c);
		
		
	    l=Integer.valueOf(array[length-size-size-1]);
	    m=Integer.valueOf(array[length-size-size]);
	    o=Integer.valueOf(array[length-size]);



		
	
		if((a < b) && (a < c))
		{
			min=h;
			path[p]="R";
			min_cost=min_cost+a;
			System.out.println("minimun***************" + min);
			//count++;
			p++;
			
			if(h==14)
			{
				
				min_cost=min_cost+a;
				System.out.println(min_cost);
			}
		
		}
		//System.out.println("minimun******** is" + min);
		if(b<a && b<c)
		{
			
			min=e;		
			path[p]="B";
			min_cost=min_cost+b;
			//count++;
			//System.out.println("minimun******** is" + min);
			p++;
			
	     
			
		}
	      	//	System.out.println("minimun******** is" + min);
		if(c<a && c<b)
		{
            min=f;
            path[p]="D";
            min_cost=min_cost +c ;
            //count++;
			//System.out.println("minimun****************" + min);
          p++;
          
        
		}
		//System.out.println("{{{{{{{{{{{{{{{{{{{{{{{" + h);
	  if(h==length-size-size|| e==length-size-size || f==length-size-size)
		//if(min==length-size-size-1)
		  {
			  min=length-size;
			//  path[length-size-size]=path[length-size];
			  System.out.println("*********************" + h);
		    System.out.println("*********************" + min);
			System.out.println(length-size-size);
			    //System.out.println(Integer.valueOf(array[m]));
			    System.out.println("oooooooooooo" + o);
         
        	  
            
             System.out.println(min);
        	 min_cost=min_cost+  Integer.valueOf(array[length-size]);
        	 System.out.println("main minimyukm sdos" + min_cost);
        	 path[p-1]="D";
        	 p++;
           //}
		  }
		
	  System.out.println("*********************************************************" + min);
	  if(min==length-size-1)
	  {
		  path[p]="D";
		  p++;
		  path[p]="B";
		  p++;
	  }
		  if(f==length-1 || e==length-2 )
          {
        	 int n= Integer.valueOf(array[f]);
        	 min_cost=min_cost +n; 
        	 path[p]="R";
        	 p++;
          }
            
		
		  if(h==length-2 || h==length-1)
          { 
		  int n= Integer.valueOf(array[h]);
     	  min_cost=min_cost +n;
     	  path[p]="R";
     	  p++;
          }



       if(min==length-size|| min==length-size  ||min==length-size)
          { 
    	   System.out.println("@&@&@@@@&&@" + min);
		 
     	  path[p]="B";
     	  p++;
          }

		//System.out.println("minimun******** is" + min);
//		if( h==length-1 || h==length-size || e==length-1 || e==length-size||f==length-1 || f==length-size)
//		{
//			
//			h=length;
//			e=length;
//			f=length;
//		}
//	
		System.out.println("***" + min);
	
      // String path1[]= new  String[path.length];
//     	for(int j1=0;j1<path1.length;j1++)
//     	{
     	
     
		
		
     		List<String> items = new ArrayList<String>(path.length);
     		for(String input : path) {
     		   if (input != null) { 
     		      items.add(input);
     		   }
     		}
     		String[] outputs = items.toArray(new String[items.size()]);
	        s= Arrays.toString(outputs);
     //	}
		System.out.println("minimun+cost is nowww" + min_cost);
		
	   System.out.println(s);
		
			//} // if=min;
	
	}  // end of for
		   //System.out.println("***&&&&&&&&&&" + min);
	}// end of second for 
	
		return s;
	}
	

	
		  public static void main(String... args){
	           String []matrix= {"5#9#3#1",
	        		   "9#7#6#3","2#1#3#2",
	        		   "2#3#4#1" };
	           String swap = minimumCost(matrix,4);
	          System.out.println(swap);
	    }
}
