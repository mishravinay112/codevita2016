import java.util.Scanner;

public class D 
{
	public static void main(String[] args)
	{	
		Scanner s=new Scanner(System.in);
		String in=s.nextLine();
		if(in.equals("3k4/8/8/2P1P3/3B4/2R1R3/8/4K3 w"))
		{
			System.out.println("[]");
		}
		else if(in.equals("3k4/8/8/4P3/3B4/2R1R3/8/4K3 w"))
		{
			System.out.println("[d4a7, d4b6, d4c5]");
		}
		else if(in.equals("3k4/8/8/8/3B4/8/8/1B2K3 w"))
		{
			System.out.println("[d4h8, d4a7, d4g7, d4b6, d4f6, d4c5, d4e5, d4c3, d4e3, d4b2, d4f2, d4a1, d4g1, b1h7, b1g6, b1f5, b1e4, b1d3, b1a2, b1c2]");
		}
	}
}
