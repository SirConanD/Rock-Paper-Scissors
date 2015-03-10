package ctec.rps.view;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import ctec.rps.controller.RockPaperScissorsController;
import ctec.rps.view.RockPaperScissorsPanel;

public class RockPaperScissorsFrame extends Frame
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
