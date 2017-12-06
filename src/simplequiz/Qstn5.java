package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn5 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn5 qs5;
	public Qstn6 qs6 = new Qstn6();
	
	public Qstn5() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #5");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 184, 22);
		getContentPane().add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("How many oscars did the movie Titanic claim?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 121, 366, 16);
		getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs5, "Wrong! Correct answer is 11");
				qs6.setVisible(true);
				dispose();
			}
		});
		button.setBounds(12, 223, 76, 66);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("11");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs5, "Correct!");
				qs6.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(120, 223, 76, 66);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs5, "Wrong! Correct answer is 11");
				qs6.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(230, 223, 76, 66);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs5, "Wrong! Correct answer is 11");
				qs6.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(344, 223, 76, 66);
		getContentPane().add(button_3);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

}
