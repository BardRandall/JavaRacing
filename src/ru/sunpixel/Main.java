package ru.sunpixel;

import javax.swing.JFrame;

public class Main implements Constants {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(new Road());
		frame.setVisible(true);
	}

}
