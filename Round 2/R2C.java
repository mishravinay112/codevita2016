import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class R2C
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for (int i = 0; i <t; i++)
		{
			ArrayList<Integer>a=new ArrayList<Integer>();
			ArrayList<Integer>b=new ArrayList<Integer>();
			int n=s.nextInt();
			for (int j = 0; j < n; j++) 
			{
				a.add(s.nextInt());
			}
			Collections.sort(a);
			
			for (int j = 0; j < a.size(); j++) 
			{
				try
				{
					int sum=a.get(0)+a.get(1);
					a.remove(0);
					//System.out.println(a);
					a.remove(0);
					//System.out.println(a);
					b.add(sum);
					a.add(sum);
					Collections.sort(a);
					//System.out.println(a);
				}
				catch(Exception e)
				{
					//System.out.println("here");
				}
			}
			b.add(a.get(0)+a.get(1));
			
			//System.out.println(b);
			//System.out.println(a);
			int result=0;
			for (int j = 0; j < b.size(); j++)
			{
				result=result+b.get(j);
			}
			System.out.println(result);
		}
	}

}