import java.util.*;

public class Result
{
	public static void main(String[] args) throws InterruptedException 
	{
		Map<String, Integer> totalPoints=new HashMap<String,Integer>();
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0||n>=10)
		{
			System.exit(1);
		}
		
		
		String first;
		first=sc.next()+" "+sc.next();
		
		String second;
		second=sc.next()+" "+sc.next()+" "+sc.next();
		
		String arr[]=first.split(" ");
		String arr1[]=second.split(" ");
	
		String ques=arr[1];
		String []q1=ques.split(",");
		
		int ans = Integer.parseInt(arr1[2]);
		
	
		int finalans=0;
		boolean flag=false;
		
		totalPoints.put(arr[0], 0);
		totalPoints.put(arr1[1],0);
		
		int sum=0;
		
		for(int j=0; j<q1.length; j++)
		{
			if(Integer.parseInt(q1[j])<=1||Integer.parseInt(q1[j])>=100)
			{
				System.exit(1);
			}
			else
			l.add(Integer.parseInt(q1[j]));
		}
		
		System.out.print(arr[0]+"'s question is: ");
		for(int x=0; x<q1.length; x++)
		{
			if(x!=0)
			{
				System.out.print(",");
			}
				System.out.print(q1[x]);
		}
		System.out.println();
		int x=0;
		while(true)
		{
		
			if(ans%Integer.parseInt(q1[x])==0)
			{
				
				flag=true;
				x++;
			}
			else
				flag=false;
			
			 
			 
			
			if(x==q1.length)
			{
				break;
			}
			
			
			if(second=="PASS")
			{
				for(x=1; x<q1.length;x++)
				{
					if(ans%Integer.parseInt(q1[x-1])==0)
					{
						finalans=ans;
					}
				}
				if(x==q1.length){
					System.out.println("Answer is "+finalans);
					break;
				}
					
			}
			
		}
		
		if(flag)
		{
			System.out.println("Correct Answer");
			System.out.println(arr1[1]+": 10Points");
			sum=sum+10;
			totalPoints.put(arr1[1], sum);
		}
		
		System.out.println("Total Points:");
		Set<String> s=totalPoints.keySet();

		for (String str : s) {
			System.out.println(str+": "+totalPoints.get(str));
		}
		
		if(totalPoints.get(arr[0])>totalPoints.get(arr1[1]))
			System.out.println("Game Reult: "+arr[0]+" is winner");
		else
			System.out.println("Game Reult: "+arr1[1]+" is winner");
	}
}