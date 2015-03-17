package ctec.rps.model;

public class RockPaperScissors
{
	private int computerChoice;
	private int tieCount;
	private int winCount;
	
	public int randomchoice()
	{
		return (int)(Math.random()*3);
	}
}
