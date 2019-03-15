package atm;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


@SuppressWarnings({ "serial", "unused" })
public class Atm extends JFrame {

	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AtmHomeFrame();				
			}
		});
		

	}
	
	

	
























}
