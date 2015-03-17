package ctec.rps.controller;

import ctec.rps.view.RockPaperScissorsFrame;

public class RockPaperScissorsController
{
	private RockPaperScissorsFrame appFrame;
	private RockPaperScissors myGame;
	
	public RockPaperScissors getMyGame()
	{
		return myGame;
	}
	
	public RockPaperScissorsController()
	{
		appFrame = new RockPaperScissorsFrame(this);
	}
	
	public RockPaperScissorsFrame getAppFrame()
	{
		return appFrame;
	}
	
	public void start()
	{
		
	}
}
