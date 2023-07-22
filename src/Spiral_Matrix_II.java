import java.util.;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]ans = Generate(n);
		for (int i = 0; i  ans.length; i++) {
			for (int j = 0; j  ans[0].length; j++) {
			    System.out.print(ans[i][j]+ );
			    
			}
		   
		}
		
		Spiral(ans);
	}
	
	public static int[][] Generate(int n){
	    int count = 1;
	    int[][] arr = new int[n][n];
		for (int i = 0; i  arr.length; i++) {
			for (int j = 0; j  arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		return arr;
	   
	}
	
	public static void Spiral(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int te = arr.length  arr[0].length;
		int count = 0;
		while (minr = maxr && minc = maxc) {
			for (int i = minc; i = maxc && count  te; i++) {
				System.out.print(arr[minr][i] +  );
				count++;
			}
			minr++;
			for (int i = minr; i = maxr && count  te; i++) {
				System.out.print(arr[i][maxc] +  );
				count++;
			}
			maxc--;
			for (int i = maxc; i = minc && count  te; i--) {
				System.out.print(arr[maxr][i] +  );
				count++;
			}
			maxr--;

			for (int i = maxr; i = minr && count  te; i--) {
				System.out.print(arr[i][minc] +  );
				count++;
			}
			minc++;
		}
	}
}
