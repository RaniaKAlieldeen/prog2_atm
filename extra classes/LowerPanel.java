package atm;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LowerPanel extends JPanel {
	//private UpperPanel upperPanel;
	public LowerPanel() {
		//upperPanel = new UpperPanel();
		setBackground(AtmHomeFrame.color);
		GridBagConstraints gc = new GridBagConstraints();
		setLayout(new GridBagLayout());
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton enterButton = new JButton("ENTER");
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(button1,gc);

		gc.gridx = 2;
		gc.gridy = 1;
		add(button2,gc);

		gc.gridx = 3;
		gc.gridy = 1;
		add(button3,gc);

		gc.gridx = 1;
		gc.gridy = 2;
		add(button4,gc);

		gc.gridx = 2;
		gc.gridy = 2;
		add(button5,gc);

		gc.gridx = 3;
		gc.gridy = 2;
		add(button6,gc);

		gc.gridx = 1;
		gc.gridy = 3;
		add(button7,gc);

		gc.gridx = 2;
		gc.gridy = 3;
		add(button8,gc);

		gc.gridx = 3;
		gc.gridy = 3;
		add(button9,gc);

		gc.gridx = 2;
		gc.gridy = 4;
		add(button0,gc);
		
		gc.gridx = 2;
		gc.gridy =5;
		add(enterButton,gc);
		
		//add behavior
		
		button0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//append("0");
			}
		});
		
		
		
		
		
		
	}
}
