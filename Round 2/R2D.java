import java.util.Scanner;

public class R2D
{
	static int offIndecator=1;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String day=s.next();
		String date=s.next();
		s.close();
		int check=0;
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
		{
			//System.out.println("here");
			check++;
		}
		if(check==0)
		{
			System.out.println("Invalid Day");
			System.exit(0);
		}
		
		String part[]=date.split("/");
		int dd=Integer.parseInt(part[0]);
		int mm=Integer.parseInt(part[1]);
		int yy=Integer.parseInt(part[2]);
		
		switch(mm)
		{
		case 1:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 2:int c=yy%4;if(dd>29){System.out.println("Invalid Date");System.exit(0);}else if(c!=0){if(dd==29){System.out.println("Invalid Date");};}break;
		case 3:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 4:if(dd>30 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 5:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 6:if(dd>30 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 7:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 8:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 9:if(dd>30 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 10:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 11:if(dd>30 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		case 12:if(dd>31 && dd<1){System.out.println("Invalid Date");System.exit(0);}break;
		default:System.out.println("Invalid Date");System.exit(0);
		}
		int d=getDay(dd,mm,yy);
		/*String actual="";
		switch(d)
		{
		case 3:actual="Wednesday";System.out.println("Wednesday");break;
		case 4:actual="Thursday";System.out.println("Thursday");break;
		case 5:actual="Friday";System.out.println("Friday");break;
		case 6:actual="Saturday";System.out.println("Saturday");break;
		case 7:actual="Sunday";System.out.println("Sunday");break;
		case 1:actual="Monday";System.out.println("Monday");break;
		case 2:actual="Tuesday";System.out.println("Tuesday");break;
		
		}*/
		//System.out.println(offIndecator);
		if(offIndecator%4==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(dd);
		}
		
	}
	
	public static int getDay(int dd,int mm,int yy)
	{
		int d=1;
		for (int i = 1; i <=9999 ; i++)
		{
			for (int j = 1; j <= 12; j++) 
			{
				switch (j)
				{
				case 1:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 2:
					int s=28;
					int n=(i%4);
					if(n==0)
					{
						s=29;
					}
					else{s=28;}
						
					for (int j2 = 1; j2 <= s; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 3:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 4:
					
					for (int j2 = 1; j2 <= 30; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 5:
					
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 6:
					for (int j2 = 1; j2 <= 30; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 7:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 8:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 9:
					for (int j2 = 1; j2 <= 30; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 10:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 11:
					for (int j2 = 1; j2 <= 30; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;
				case 12:
					for (int j2 = 1; j2 <= 31; j2++) 
					{
						if(j2==dd && mm==j && yy==i)
						{
							return d;
						}
						else
						{
							if(d==7)
							{
								d=0;
							}
							d++;
							if(offIndecator==4)
							{
								offIndecator=0;
							}
							offIndecator++;
						}
						
					}
					break;

				
				}
					
				}
			}
		return d;
		}
	}

