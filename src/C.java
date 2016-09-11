
import java.util.Scanner;
public class C
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		int b[]=new int[n];
		for (int i = 0; i < b.length; i++)
		{
			b[i]=s.nextInt();
		}
		
		int value[]=new int[n];
		int min=0;
		int index=0;
		for (int i = 0; i < n; i++)
		{
			
			value[i]=((a[i]+(k*2))*b[i]);
			if(min>=value[i])
			{
				min=value[i];
				index=i;
			}
			value[i]=((a[i]-(k*2))*b[i]);
			if(min>=value[i])
			{
				min=value[i];
				index=i;
			}
		}
		/*System.out.println(min);
		System.out.println(index);*/
		int result=0;
		for (int i = 0; i < n; i++)
		{
			if(i==index)
			{
				result=result+min;
			}
			else
			{
				result=result+(a[i]*b[i]);
			}
		}
		System.out.println(result);
		
	}
}
