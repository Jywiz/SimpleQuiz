package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn1 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	Qstn1 que1;
	public Qstn2 qs2 = new Qstn2();
	
	
	public Qstn1() {
		
		super("Movie Quiz");
		
		
		setSize(450,400);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//first question
		JLabel lblWhichActorPlayed = new JLabel("Who played Deadpool in the movie Deadpool?");
		lblWhichActorPlayed.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWhichActorPlayed.setBounds(12, 64, 408, 82);
		getContentPane().add(lblWhichActorPlayed);
		
		//Radio buttons for the answers
		JRadioButton rdbtnRyanRenolds = new JRadioButton("Ryan Reynolds");
		rdbtnRyanRenolds.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnRyanRenolds.setBounds(12, 155, 172, 25);
		getContentPane().add(rdbtnRyanRenolds);
		
		JRadioButton rdbtnRyanGosling = new JRadioButton("Ryan Gosling");
		rdbtnRyanGosling.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnRyanGosling.setBounds(12, 195, 151, 25);
		getContentPane().add(rdbtnRyanGosling);
		
		JLabel lblQuestion = new JLabel("Question #1");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 24, 112, 27);
		getContentPane().add(lblQuestion);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Christian Bale");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(12, 239, 151, 25);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Jon Bernthal");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(12, 282, 127, 25);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		//button group so that the user can't select more than one button
		ButtonGroup btnGrp = new ButtonGroup();
		btnGrp.add(rdbtnRyanRenolds);
		btnGrp.add(rdbtnRyanGosling);
		btnGrp.add(rdbtnNewRadioButton);
		btnGrp.add(rdbtnNewRadioButton_1);
		
		/*
		 * button to tell the program to hide the current frame and open the next one
		 * also to tell the user the right answer and if he's correct or not
		 */
		JButton btnNewButton = new JButton("Ready");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					if(rdbtnRyanRenolds.isSelected()) {
						JOptionPane.showMessageDialog(que1, "Correct!");
						qs2.setVisible(true);
						dispose();
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong! It's Ryan Reynolds!");
						qs2.setVisible(true);
						dispose();		
					}
					
				}
			}
		
		});
		
		btnNewButton.setBounds(284, 212, 95, 38);
		getContentPane().add(btnNewButton);
		
	}
	
}
