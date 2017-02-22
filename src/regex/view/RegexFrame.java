package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexPanel appPanel;
	private RegexController baseController;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		appPanel = new RegexPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		
	}
}
