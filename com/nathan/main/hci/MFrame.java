package com.nathan.main.hci;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	int height, width;
	

	public MFrame(JPanel panel, String title) {
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension d = new Dimension(width, height);
		setSize(d);
		updateFrame(panel);
	}
	
	public void updateFrame(JPanel panel) { 
		add(panel);
		repaint();
	}
	
	public void updateFrame() { 
		repaint();
	}
	
}
