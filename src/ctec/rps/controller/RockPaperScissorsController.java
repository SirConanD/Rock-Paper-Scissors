package ctec.rps.controller;

import ctec.rps.view.RockPaperScissorsFrame;

public class RockPaperScissorsController
{
	private RockPaperScissorsFrame appFrame;
	private RockPaperScissorsController baseController;
	
	public RockPaperScissorsController()
	{
		baseController = new RockPaperScissorsController(this);
		appFrame = new RockPaperScissorsFrame(this);
	}
	
	public RockPaperScissorsFrame getAppFrame()
	{
		return appFrame;
	}
	
	public RockPaperScissorsController getBaseController()
	{
		return baseController;
	}
	
	public void start()
	{
		
	}
}
