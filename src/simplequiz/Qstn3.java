package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn3 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	Qstn3 qs3;
	public Qstn4 qs4 = new Qstn4();
	
	public Qstn3() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #3");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 183, 22);
		getContentPane().add(lblQuestion);
		
		JLabel lblWhatsTheName = new JLabel("Who is Luke Skywalker? (Multiple correct answers)");
		lblWhatsTheName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWhatsTheName.setBounds(12, 104, 408, 16);
		getContentPane().add(lblWhatsTheName);
		
		
		//Checkboxes containing the answers, one of them is wrong and other three correct
		JCheckBox chckbxMainCharacterOf = new JCheckBox("Main character of original Star Wars trilogy");
		chckbxMainCharacterOf.setBounds(8, 175, 282, 25);
		getContentPane().add(chckbxMainCharacterOf);
		
		JCheckBox chckbxAJedi = new JCheckBox("A jedi");
		chckbxAJedi.setBounds(8, 205, 113, 25);
		getContentPane().add(chckbxAJedi);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Son of Darth Vader");
		chckbxNewCheckBox.setBounds(8, 235, 154, 25);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxASithLord = new JCheckBox("A sith lord");
		chckbxASithLord.setBounds(8, 265, 113, 25);
		getContentPane().add(chckbxASithLord);
		
		
		//if the user had checked the wrong checkbox, the program says that the answer was wrong
		JButton btnReady = new JButton("Ready");
		btnReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxASithLord.isSelected()) {
					JOptionPane.showMessageDialog(null, "Wrong! Luke is not a sith lord!");
					qs4.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(qs3, "Correct!");
					qs4.setVisible(true);
					dispose();
				}
			}
		});
		btnReady.setBounds(280, 265, 97, 25);
		getContentPane().add(btnReady);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
}
