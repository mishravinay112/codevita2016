

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		
		System.out.println(numbers(n));
	}
	public static long numbers(long n)
	{
		if(n>2000000)
		{
			return 0;
		}
		long ans=0;
		List<Long> all=primeno(n);
		long sum=0;
		for(long i=0; i<all.size();i++)
		{
			
			sum=sum+all.get((int) i);
			if(sum<=n)
			{
			if(sum==2)
			{
				continue;
			}
			Boolean p=true;
			for(long j=2;j<sum;j++)
			{
				
				if(sum%j==0)
				{
					p=false;
					break;
				}
				
			}
			if(p.equals(true))
			{
				++ans;
			}
			}
		}
		
		return ans;
		
	}
	
public static List<Long> primeno(long n)
	{
		
		List<Long> l=new ArrayList<Long>();
		l.add(2l);
		
		for(long i=3;i<=n;i=i+2)
		{
			Boolean prime=true;
			for(long j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime.equals(true))
			{
				l.add(i);
			}
			
		}
		
		return l;
		}
	}
