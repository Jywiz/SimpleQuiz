package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn10 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn10 qs10;
	public Finish fin = new Finish();
	
	public Qstn10() {
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblFinalQuestion = new JLabel("Final Question!");
		lblFinalQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFinalQuestion.setBounds(12, 13, 159, 22);
		getContentPane().add(lblFinalQuestion);
		
		JLabel lblInWhatMovie = new JLabel("In what movie, do we hear the famous quote: \"Run Forrest, run!\"?");
		lblInWhatMovie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInWhatMovie.setBounds(12, 133, 420, 22);
		getContentPane().add(lblInWhatMovie);
		
		JButton btnNewButton = new JButton("Lost in Translation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs10, "Wrong! Correct answer was Forrest Gump");
				fin.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(28, 209, 159, 49);
		getContentPane().add(btnNewButton);
		
		JButton btnBatman = new JButton("Batman");
		btnBatman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs10, "Wrong! Correct answer was Forrest Gump");
				fin.setVisible(true);
				dispose();
			}
		});
		btnBatman.setBounds(28, 281, 159, 49);
		getContentPane().add(btnBatman);
		
		JButton btnCastaway = new JButton("Castaway");
		btnCastaway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs10, "Wrong! Correct answer was Forrest Gump");
				fin.setVisible(true);
				dispose();
			}
		});
		btnCastaway.setBounds(219, 209, 159, 49);
		getContentPane().add(btnCastaway);
		
		JButton btnForrestGump = new JButton("Forrest Gump");
		btnForrestGump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs10, "Correct! And Forrest kept running");
				fin.setVisible(true);
				dispose();

			}
		});
		btnForrestGump.setBounds(219, 281, 159, 49);
		getContentPane().add(btnForrestGump);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

}
