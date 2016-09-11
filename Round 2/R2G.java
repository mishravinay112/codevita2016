
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class R2G {

	public static void main(String[] args)
	{
		try
		{
			Scanner s=new Scanner(System.in);
			String password=s.next();
			String unique=s.next();
			s.close();
			String[] u=unique.split("");
			HashSet<String>hs=new HashSet<String>();
			for (int i = 0; i < u.length; i++)
			{
				hs.add(u[i]);
			}
			if(hs.size()!=10)
			{
				System.out.println("-1");
				System.exit(0);
			}
			String part[]=password.split("\\|");
			//System.out.println(part.length);
			ArrayList<String>a=new ArrayList<String>();
			int last=0;
			for (int i = 0; i < 10; i++)
			{
				//System.out.println(part[i]);
				if(part[i].length()>1)
				{
					int temp=part[i].charAt(0)-'0';
					if(temp>=last)
					{
						last=temp;
					}
					a.add(part[i]);
				}
			}
			int result[]=new int[last+1];
			for (int i = 0; i < a.size(); i++) 
			{
				String value=a.get(i);
				char[] v=value.toCharArray();
				int actual=v[v.length-1]-'0';
				for (int j = 0; j < v.length-1; j++) 
				{
					result[v[j]-'0']=actual;
				}
			}
		
			char[] work=part[11].toCharArray();
			ArrayList<Integer> w=new ArrayList<Integer>();
			for (int i = 0; i < work.length; i++) 
			{
				w.add(work[i]-'0');
			}
			for (int i = 0; i < w.size()-1; i++) 
			{
				result[w.get(i)]=result[w.get(i)]+10;
			}
			/*for (int i = 0; i < result.length; i++)
			{
				System.out.println(result[i]);
				0|1|2|43|14|5|6|7|308|29||0149
			 	*Acf$Zd&T@
			}*/
			ArrayList<Integer>finalR=new ArrayList<Integer>();
			int temp=w.get(w.size()-1);
			finalR.add(temp);
			for (int i = 0; i < result.length-1; i++) 
			{
				finalR.add(result[i]-temp);
				temp=result[i]-temp;
			}
			//System.out.println(finalR);
			String answer="";
			for (int i = 0; i < finalR.size(); i++) 
			{
				answer=answer+u[finalR.get(i)];
			}
			System.out.println(answer);
		}
		catch(Exception e)
		{
			System.out.println("-1");
			
		}
	}

}