import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class F 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int numOfTeams=s.nextInt();
		String teams[]=new String[numOfTeams];
		
		for (int i = 0; i < teams.length; i++)
		{
			teams[i]=s.next();
		}
		
		int numOfMatches=s.nextInt();
		String matches[]=new String[numOfMatches];
		s.nextLine();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for (int i = 0; i < matches.length; i++)
		{
			matches[i]=s.nextLine();
			String match[]=matches[i].split(" ");
			if(match[0].equals(match[1]))
			{
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Invalid Input");
					System.exit(0);
				}
			}
			
			int t1score=Integer.valueOf(match[2]);
			int t2score=Integer.valueOf(match[3]);
			Object v1=hm.get(match[0]);
			if(v1==null)
			{
				int points=0;
				if(t1score>t2score)
				{
					points=2;
				}
				else if(t1score<t2score)
				{
					points=0;
				}
				else
				{
					points=1;
				}
				hm.put(match[0], points);
			}
			else
			{
				int points=0;
				if(t1score>t2score)
				{
					points=2;
				}
				else if(t1score<t2score)
				{
					points=0;
				}
				else
				{
					points=1;
				}
				hm.put(match[0], hm.get(match[0])+points);
			}
			
			Object v2=hm.get(match[1]);
			if(v2==null)
			{
				int points=0;
				if(t1score<t2score)
				{
					points=2;
				}
				else if(t1score>t2score)
				{
					points=0;
				}
				else
				{
					points=1;
				}
				hm.put(match[1], points);
			}
			else
			{
				int points=0;
				if(t1score<t2score)
				{
					points=2;
				}
				else if(t1score>t2score)
				{
					points=0;
				}
				else
				{
					points=1;
				}
				hm.put(match[1], hm.get(match[1])+points);
			}
			
			
		}
		
		
		//System.out.println(hm);
		for (int i = 0; i < teams.length; i++) 
		{
			//System.out.println(teams[i]);
			Object c=hm.get(teams[i]);
			if(c==null)
			{hm.put(teams[i], 0);}
		}
		//System.out.println(hm);
		
	Set<Map.Entry<String,Integer>> mset=	hm.entrySet();
	Iterator<Map.Entry<String,Integer>> i=mset.iterator();
	
	ArrayList<String> key=new ArrayList<String>();
	ArrayList<Integer> value=new ArrayList<Integer>();
	
	for (int j = 0; j < teams.length; j++)
	{
		value.add(hm.get(teams[j]));
		key.add(teams[j]);
	}
	
	
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.addAll(value);
	Collections.sort(a);
	for (int j = a.size()-1; j >=0; j--) 
	{
		int max=a.get(j);
		
		for (int k = 0; k < value.size(); k++)
		{
			
			if(value.get(k)==max)
			{
				System.out.println(key.get(k));
				key.remove(k);
				value.remove(k);
			}
		}
		
		
	}
	
	
	
		
		
	}
}
