package exercise1;

class Coding{
    static int findSwaps(String []input1,int input2){
           if(input1 == null || input1.length == 0)
                 return -1;

            int swap = 0;  //Hold the count of interchangeable heights
            String []height;
           
             for(int i = 0; i < input1.length; i++){
                  height = input1[i].split("#");
                  int x = Integer.valueOf(height[0]);
                  int y = Integer.valueOf(height[1]);
                  if(!validate(x, y))
                          return -1;

                  for(int j = i+1; j < input1.length; j++){
                        height = input1[j].split("#");
                        int x1 = Integer.valueOf(height[0]);
                        int y1 = Integer.valueOf(height[1]);
                        if(!validate(x1, y1))
                               return -1;
 
                        if(x*12+y > x1*12+y1)
                                swap++;
                }
       }
       return swap;
}

    /*utility to validate the height*/
    static boolean validate(int x, int y){
            if( x<4 || x>7 || y<0 || y>11)
                    return false;
            return true;
    }

    public static void main(String... args){
           String []height = {"5#9","5#7"};
           int swap = findSwaps(height,2);
          System.out.println(swap);
    }
}
		
		

		
		
		
		
		
	