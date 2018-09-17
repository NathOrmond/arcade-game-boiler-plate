package com.nathan.game;

import java.applet.Applet;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class AbstractGame extends Applet implements Runnable, KeyListener, MouseMotionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	public boolean gameOver = false;
	

	public AbstractGame() {
		
	}
	
	public abstract void doGameUpdates();
	
	public abstract void initGame();
	
	@Override
	public void run() {
		gameLoop();
	}
	
	public void gameLoop() { 
		
		initGame();
		
		while(!gameOver) { 
			doGameUpdates();
			render();
		} 
		
		endGame();
	}
	
	public abstract void endGame();
	
	public void render() { 
		repaint();
	}
	
}
