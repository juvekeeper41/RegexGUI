package regex.controller;

import regex.controller.RegexRunner;
import regex.view.RegexFrame;
import regex.view.RegexPanel;

public class RegexController 
{
	RegexFrame appFrame;
	public void start()
	{
		appFrame = new RegexFrame(this);
	}
}
