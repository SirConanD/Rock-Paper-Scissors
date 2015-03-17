package ctec.rps.view;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ctec.rps.controller.RockPaperScissorsController;

public class RockPaperScissorsPanel extends Panel
{
	private RockPaperScissorsController baseController;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private JTextArea  displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;
	private JTextField simpleField;
	private JTextField winField;
	private JTextField loseField;
	private JTextField tieField;
	
	public RockPaperScissorsPanel(RockPaperScissorsController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		displayArea = new JTextArea(10,30);
		displayPane = new JScrollPane(displayArea);
		
		setupDisplayPane();
		setupPanel();
		setupLayout();
		setupListener();
	}
	
	private void setupDisplayPane()
	{
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		displayArea.setEditable(false);
		displayArea.setBackground(Color.GRAY);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setSize(1000,1000);
		this.setLayout(baseLayout);
		this.add(displayPane);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 37, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 46, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 43, SpringLayout.EAST, paperButton);
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 43, SpringLayout.SOUTH, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, displayPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayPane, 50, SpringLayout.WEST, this);
	}
	
	private void setupListener()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPreformed(ActionEvent click)
			{
				for()
				{
					
				}
			}
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void anctionPreformed(ActionEventListener()
			{
				for()
				{
					
				}
			}
		});
			
		scissorsButton.addActionListener(new ActionListener()
		{
			public void anctionPreformed(ActionEventListener()
			{
				for()
				{
					
				}
			}
		});
	}
}
