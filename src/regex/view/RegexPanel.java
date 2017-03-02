package regex.view;

import javax.swing.*;
import regex.controller.RegexController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextArea regexDisplay;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneNumberField;
	private JTextField emailField;
	private JButton submitButton;
	private JButton chatButton;
	private JButton twitterButton;
	private JButton regexButton;
	private JLabel regexTitle;

	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(740, 540));
		this.submitButton = new JButton ("Submit");
		this.chatButton = new JButton ("Chat");
		this.regexButton = new JButton ("Regex");
		this.twitterButton = new JButton ("Check Twitter");
		this.firstNameLabel = new JLabel ("First Name:");
		this.lastNameLabel = new JLabel ("Last Name:");
		this.phoneNumberLabel = new JLabel ("Phone Number:");
		this.emailLabel = new JLabel ("Email:");
		this.phoneNumberField = new JTextField ("type here");
		this.emailField = new JTextField ("type here");
		this.firstNameField = new JTextField ("type here");
		this.lastNameField = new JTextField ("type here");
		
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
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700, 700));
		this.setBackground(Color.GRAY);
		this.add(submitButton);
		this.add(regexButton);
		this.add(twitterButton);
		this.add(chatButton);
		this.add(phoneNumberField);
		this.add(emailField);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(emailLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 0, SpringLayout.WEST, phoneNumberField);
		baseLayout.putConstraint(SpringLayout.EAST, emailField, 0, SpringLayout.EAST, phoneNumberField);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 44, SpringLayout.EAST, twitterButton);
		baseLayout.putConstraint(SpringLayout.NORTH, regexButton, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, regexButton, -35, SpringLayout.WEST, submitButton);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, twitterButton, 0, SpringLayout.EAST, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, twitterButton, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameField, 0, SpringLayout.EAST, phoneNumberField);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameField, 0, SpringLayout.EAST, phoneNumberField);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberField, 6, SpringLayout.EAST, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberField, -408, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 30, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -233, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberField, -5, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, emailLabel, -19, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, phoneNumberLabel, -363, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberLabel, -600, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 30, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameLabel, -624, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 25, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameLabel, 0, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, -5, SpringLayout.NORTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameLabel, -476, SpringLayout.SOUTH, this);
		
	}
	
	private void setupListeners()
	{
		
	}

//	
//	  if("derp".matches("[A-Za-z]{2,30}"))
//	  {
//	  	JOptionPane.showMessageDialog(appFrame, "good");
//	  }
//	  else
//	  {
//	  	JOptionPane.showMessageDialog(appFrame, "poor");
//	  }
//	 


}