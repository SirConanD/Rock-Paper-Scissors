package ctec.rps.view;

import javax.swing.JFrame;

import ctec.rps.controller.RockPaperScissorsController;
import ctec.rps.view.RockPaperScissorsPanel;

public class RockPaperScissorsFrame extends JFrame
{
	private RockPaperScissorsPanel basePanel;
	
	public RockPaperScissorsFrame(RockPaperScissorsController baseController)
	{
		basePanel = new RockPaperScissorsPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
}
