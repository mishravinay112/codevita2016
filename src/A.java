import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A 
{
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int base=s.nextInt();
		pyramid(base);
		
	}
	static void pyramid(int base)
	{
		int total=getActual(base);
		List<String> series=getSeries(total);
		//System.out.println(series);
		int value=0;
		for (int i = 1; i <=base ; i++)
		{
			for(int j=1;j<=base-i;j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) 
			{
				System.out.print(series.get(value++)+" ");
			}
			System.out.println();
		}
		
	}
	
	static int getActual(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return (n+getActual(n-1));
	}
	
	static List<String> getSeries(int n)
	{
		List<String> series=new ArrayList<String>();
		for (int i = 1; i <= n; i++) 
		{
			int value=2*i*(((4*i)-1));
			String local=String.valueOf(value);
			int l=local.length();
			String v="";
			for (int j = 0; j < (5-l); j++)
			{
				v=v+"0";
			}
			v=v+local;
			series.add(v);
		}
		return series;
	}
	
	
}
