package ctec.rps.model;

public class RockPaperScissors
{
	private int computerChoice;
	private int tieCount;
	private int winCount;
	private int loseCount;
	
	public int getLoseCount()
	{
		return loseCount;
	}

	public void setTieCount(int tieCount)
	{
		this.tieCount = tieCount;
	}

	public void setWinCount(int winCount)
	{
		this.winCount = winCount;
	}

	public void setLoseCount(int loseCount)
	{
		this.loseCount = loseCount;
	}

	public int randomChoice()
	{
		return (int)(Math.random()*3);
	}
	
	public int getTieCount()
	{
		return tieCount;
	}
	
	public int getWinCount()
	{
		return winCount;
	}
	
	public int GetLoseCount()
	{
		return loseCount;
	}
}
