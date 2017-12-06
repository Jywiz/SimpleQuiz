package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn9 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn9 qs9;
	public Qstn10 qs10 = new Qstn10();
	
	public Qstn9() {
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #9");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 135, 22);
		getContentPane().add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("Which one of these famous one liners was uttered by Arnold?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(12, 111, 420, 53);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("This is Sparta!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs9, "Wrong! Correct answer was hasta-la-vista baby");
				qs10.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(12, 209, 179, 43);
		getContentPane().add(btnNewButton);
		
		JButton btnHasta = new JButton("Hasta-la-vista baby");
		btnHasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs9, "Correct! Arnold said this famous phrase in Terminator 2: Judgement Day");
				qs10.setVisible(true);
				dispose();
			}
		});
		btnHasta.setBounds(12, 278, 179, 43);
		getContentPane().add(btnHasta);
		
		JButton btnYouCallThat = new JButton("I ain't got time to bleed");
		btnYouCallThat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs9, "Wrong! Correct answer was hasta-la-vista baby");
				qs10.setVisible(true);
				dispose();
			}
		});
		btnYouCallThat.setBounds(231, 209, 179, 43);
		getContentPane().add(btnYouCallThat);
		
		JButton btnIAmThe = new JButton("I am the LAW!");
		btnIAmThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs9, "Wrong! Correct answer was hasta-la-vista baby");
				qs10.setVisible(true);
				dispose();
			}
		});
		btnIAmThe.setBounds(231, 278, 179, 43);
		getContentPane().add(btnIAmThe);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

}
