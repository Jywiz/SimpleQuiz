package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn7 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn7 qs7;
	public Qstn8 qs8 = new Qstn8();
	
	public Qstn7() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #7");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 141, 33);
		getContentPane().add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("What is the oldest animated disney movie?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 128, 333, 19);
		getContentPane().add(lblNewLabel);
		
		//basic button question again
		JButton btnNewButton = new JButton("Snow White");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs7, "Correct! It was released as early as 1937");
				qs8.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(34, 213, 141, 33);
		getContentPane().add(btnNewButton);
		
		JButton btnPinocchio = new JButton("Pinocchio");
		btnPinocchio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs7, "Wrong! Correct answer is Snow White");
				qs8.setVisible(true);
				dispose();
			}
		});
		btnPinocchio.setBounds(34, 280, 141, 33);
		getContentPane().add(btnPinocchio);
		
		JButton btnDumbo = new JButton("Dumbo");
		btnDumbo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs7, "Wrong! Correct answer is Snow White");
				qs8.setVisible(true);
				dispose();
			}
		});
		btnDumbo.setBounds(227, 213, 141, 33);
		getContentPane().add(btnDumbo);
		
		JButton btnBambi = new JButton("Bambi");
		btnBambi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs7, "Wrong! Correct answer is Snow White");
				qs8.setVisible(true);
				dispose();
			}
		});
		btnBambi.setBounds(227, 280, 141, 33);
		getContentPane().add(btnBambi);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

}
