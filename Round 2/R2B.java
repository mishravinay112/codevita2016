import java.util.Scanner;

public class R2B {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();//yeh line fokat me likhan pad rahi hai nahi to program nahi chalege
		String lines[]=new String[n];
		String name[]=new String[2];
		int nameCheck=0;
		int result[]=new int[2];
		
		for (int i = 0; i < lines.length; i++) 
		{
			lines[i]=s.nextLine();
			if(lines[i].split(" ").length<2)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			 if(i%2==1)
			{
				String part[]=lines[i].split(" ");
				if(!"A".equals(part[0]))
				{
					System.out.println("Invalid Input");
					System.exit(0);
				}
			}
		}
		
		int check=0;
		
		for (int i = 0; i < lines.length; i=i+2)
		{
			String part[]=lines[i].split(" ");
			String questioner=part[0];
			String subPart[]=part[1].split(",");
			int total=subPart.length;
			int t[]=new int[total];
			System.out.print(questioner+"'s questions is:");
			int r=1;
			for (int j = 0; j < subPart.length; j++)
			{
				t[j]=Integer.parseInt(subPart[j]);
				r=LCM(r,t[j]);
				System.out.print(t[j]);
				if(j!=subPart.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.println();
			if(nameCheck==0)
			{
				name[0]=questioner;
				nameCheck++;
			}

			
			//System.out.println(r);
			
			
			String part_2[]=lines[i+1].split(" ");
			String answerner=part_2[1];
			if(nameCheck==1)
			{
				name[1]=answerner;
				nameCheck++;
			}
			
			if("PASS".equals(part_2[2]))
			{
				System.out.println("Answer is: "+r);
				System.out.println(answerner+": 0points");
				check++;
			}
			else
			{
				try
				{
				
					int answer=Integer.parseInt(part_2[2]);
					int in=0;
					if(answer==r)
					{
						in++;
						System.out.println("Correct Answer");
						if(check==0)
						{
							result[1]=result[1]+10;
						check=1;
						}
						else
						{
							result[0]=result[0]+10;
							check=0;
						}
					}
					else
					{
						System.out.println("Answer is: "+r);
						System.out.println(answerner+": 0points");
					}
				
					if(in!=0)
					{
						System.out.println(answerner+": 10points");
						in=0;
					}
				}
			
				catch(Exception e)
				{
				
				}
			
		}
		
		
	}
		System.out.println("Total Points:");
		System.out.println(name[0]+": "+result[0]+"points");
		System.out.println(name[1]+": "+result[1]+"points");
		System.out.print("Game Result: ");
		if(result[0]>result[1])
		{
			System.out.println(name[0]+" is winner");
		}
		if(result[0]<result[1])
		{
			System.out.println(name[1]+" is winner");
		}
		else
		{
			System.out.println("Draw");
		}
		
		
	}

	private static int LCM(int a, int b)
	{
		
		 return (a * b) / GCF(a, b);
	}

	private static int GCF(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return (GCF(b,a%b));
		}
	}

}
