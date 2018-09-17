package com.nathan.menu;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class AbstractMenu extends JPanel implements ActionListener{
	
	Dimension buttonDimension;
	int buttonWidth = 30, buttonHeight = 10;
	
	
	private static final long serialVersionUID = 1L;
	ArrayList<JButton> buttons;
	GridBagConstraints gbc;
	GridBagLayout mgr;
	
	public AbstractMenu() {
		gbc = new GridBagConstraints(); 
		mgr = new GridBagLayout();
		setLayout(mgr);
		buttons = new ArrayList<JButton>();
		buttonDimension = new Dimension();
		addButtons();
		populateMenu();
	}
	
	private void populateMenu() {
		gbc.gridx = 0;
		gbc.gridy = 0;	
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		for(JButton button : buttons) { 
			mgr.setConstraints(button, gbc);
			button.setSize(buttonDimension);
			add(button,gbc);	
			
			gbc.gridx++; 
			
			if((gbc.gridx % 3) == 0) { 
				gbc.gridx = 0; 
				gbc.gridy++;
			}
		}
	}

	public abstract void addButtons();
	
	public void addButtonActionListener(JButton b, String actionCommand, ActionListener listener) { 
		b.setActionCommand(actionCommand);
		b.addActionListener(listener);
	}
	
	
}
