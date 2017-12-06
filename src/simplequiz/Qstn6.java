package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn6 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn6 qs6;
	public Qstn7 qs7 = new Qstn7();
	
	public Qstn6() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #6");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 209, 28);
		getContentPane().add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("Lord of The Rings or Harry Potter?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 97, 408, 16);
		getContentPane().add(lblNewLabel);
		
		
		//this button pops out a input field where the user can type the answer
		JButton btnReadyToAnswer = new JButton("Ready to Answer!");
		btnReadyToAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String q6 = JOptionPane.showInputDialog(null, "Which is it?", "", JOptionPane.QUESTION_MESSAGE);
				//The equalsIgnoreCase in the if statement defines what typed answers are accepted
				if(q6.equalsIgnoreCase("Lord of The Rings") || q6.equalsIgnoreCase("lord of the rings") ||
				q6.equalsIgnoreCase("lotr")) {
					JOptionPane.showMessageDialog(qs6, "Correct! It is Lord of The Rings!");
					qs7.setVisible(true);
					dispose();
				}
				else if (q6.equalsIgnoreCase("Harry Potter") || q6.equalsIgnoreCase("harry potter") ||
						q6.equalsIgnoreCase("hp")) {
					JOptionPane.showMessageDialog(qs6, "Well that's like your opinion maan, but it's wrong :/");
					qs7.setVisible(true);
					dispose();
				}
				
				//the else statement is there to give response even if you don't type anything to the field
				else
				{
					JOptionPane.showMessageDialog(qs6, "Can't decide huh? That's ok too.");
					qs7.setVisible(true);
					dispose();
				}
			}
		});
		btnReadyToAnswer.setBounds(149, 192, 133, 28);
		getContentPane().add(btnReadyToAnswer);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
