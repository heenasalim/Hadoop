package exercise1;

public class Apple2 {



	    int m, n;
	    int[][] a, f;
	    String s;

	    public Apple2(int[][] a) {
	        this.m = a.length;
	        this.n = a[0].length;
	        this.a = a;
	    }

	    void solve(int row) {
	        f = new int[m][n];
	        for (int i = 0; i < m; ++i)
	            for (int j = 0; j < n; ++j)
	                f[i][j] = Integer.MAX_VALUE;

	        for (int i = 0; i < n; ++i) {
	            int sum = 0;
	            for (int j = 0; j < m; ++j)
	                sum += a[j][i];
	            for (int j1 = 0; j1 < m; ++j1) {
	                int tmp_sum = 0;
	                boolean first = true;
	                for (int j2 = j1; j2 != j1 || first; j2 = (j2+1)%m) {
	                    if (first)
	                        first = false;
	                    tmp_sum += a[j2][i];
	                    int best_sum = Math.min(tmp_sum, sum - tmp_sum +a[j1][i]+a[j2][i]);
	                    
	                    
	                   
	                    if (j1 == j2)
	                    {
	                        best_sum = a[j1][i];
	                    
	                     s="D";
	                    }
	                    int prev = 0;
	                    if (i > 0)
	                    {
	                        prev = f[j1][i-1];
	                        s="R";
	                    }
	                    f[j2][i] = Math.min(f[j2][i], best_sum + prev);
	                }
	            }
	        }

	        System.out.println(f[row][n-1]);
	        System.out.println(s);
	        
	        
	        
	    }

	    public static void main(String[] args) {
	        new Apple2(new int[][]{{2, 3, 17}, {4, 1, -1}, {5, 0, 14}}).solve(0); //46
	        new Apple2(new int[][]{{1, 1}, {-1, -1}}).solve(0); //2
	    }
	}
	
	
	
