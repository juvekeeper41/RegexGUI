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
	private JButton regexButton;
	private JLabel regexTitle;

	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(740, 540));
		this.submitButton = new JButton ("Submit");
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
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberField, -5, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberField, -474, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, emailLabel, -19, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, phoneNumberLabel, -363, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, phoneNumberLabel, -600, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberField, 0, SpringLayout.WEST, emailField);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 146, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, emailField, -634, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 30, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameField, -474, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameLabel, -624, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 25, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameLabel, 0, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, -5, SpringLayout.NORTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 0, SpringLayout.WEST, emailField);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameField, -474, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 205, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 406, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -95, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameLabel, -476, SpringLayout.SOUTH, this);
		
	}
	
	private void setupListeners()
	{
		
	}

	


}