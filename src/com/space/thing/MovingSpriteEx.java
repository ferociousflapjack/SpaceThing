package com.space.thing;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSpriteEx extends JFrame {
	
	public MovingSpriteEx() {
		
		initUI();
	}
	
	private void initUI() {
		
		add(new Board());
		
		setSize(800, 500);
		setResizable(false);
		
		setTitle("Moving sprite");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				MovingSpriteEx ex = new MovingSpriteEx();
				ex.setVisible(true);
			}
		});
	}

}
