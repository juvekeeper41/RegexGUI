package regex.view;

import javax.swing.*;

import regex.controller.RegexController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextArea regexDisplay;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneNumberField;
	private JTextField emailField;
	private JButton regexButton;
	private JLabel regexTitle;

	
	public RegexPanel(RegexController baseController)
	{
		setupRegexDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupRegexDisplay()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

	


}