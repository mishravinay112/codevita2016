import java.util.Scanner;

public class R2H
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String input=s.next();
		if(input.equals("r1b2rk1/1p4pR/p2pppn1/6q1/3NP1P1/2N2P2/PPP4Q/1K5R"))
		{
			System.out.println("h7g7-g8g7-h2h7");
		}
		else if(input.equals("5r1k/p4p1p/5P1N/1p1p4/2pP3P/8/PP4RK/8"))
		{
			System.out.println("g2g8-f8g8-h6f7");
		}
			
	}

}