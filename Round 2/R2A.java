import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class R2A {
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = s.nextInt();
		int k = s.nextInt();
		s.close();
		long result = 0;
		if(n>=0 && k<=1000000000 && n>=k)
		{
			for (int i = 0; i <= k; i = i + 2)
			{
				result = result + nCr(n, i);
			}
			System.out.println(result);
		}
	}

	static long nCr(int n, int r) 
	{
		if(r == 0 || n == r)
		{
			return 1;
		}
		else
		{
			return  (nCr(n - 1, r - 1) + nCr(n - 1, r));
		}
		
	}
}
