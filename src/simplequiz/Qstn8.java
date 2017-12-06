package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn8 extends JFrame {

	private static final long serialVersionUID = 1L;
	public Qstn8 qs8;
	public Qstn9 qs9 = new Qstn9();
	
	public Qstn8() {
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #8");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuestion.setBounds(12, 13, 144, 25);
		getContentPane().add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("Who is the strongest Avenger?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 125, 363, 25);
		getContentPane().add(lblNewLabel);
		
		
		JButton btnHulk = new JButton("Hulk");
		btnHulk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs8, "Correct! Though it's a bit questionable between him and Thor");
				qs9.setVisible(true);
				dispose();
			}
		});
		//same as before, but the buttons have color
		btnHulk.setForeground(new Color(51, 153, 51));
		btnHulk.setFont(new Font("Tekton Pro", Font.BOLD, 22));
		btnHulk.setBounds(29, 214, 174, 32);
		getContentPane().add(btnHulk);
		
		JButton btnThor = new JButton("Thor");
		btnThor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs8, "Wrong! Though it's a bit questionable between him and The Hulk");
				qs9.setVisible(true);
				dispose();
			}
		});
		btnThor.setForeground(new Color(0, 153, 255));
		btnThor.setFont(new Font("Tekton Pro", Font.BOLD, 22));
		btnThor.setBounds(29, 279, 174, 32);
		getContentPane().add(btnThor);
		
		JButton btnIronMan = new JButton("Iron Man");
		btnIronMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs8, "Wrong! Not by a long shot, sorry!");
				qs9.setVisible(true);
				dispose();
			}
		});
		btnIronMan.setForeground(new Color(204, 0, 0));
		btnIronMan.setFont(new Font("Tekton Pro", Font.BOLD, 22));
		btnIronMan.setBounds(234, 214, 174, 32);
		getContentPane().add(btnIronMan);
		
		JButton btnGroot = new JButton("I am Groot!");
		btnGroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs8, "I am Groot!");
				qs9.setVisible(true);
				dispose();
			}
		});
		btnGroot.setForeground(new Color(153, 51, 0));
		btnGroot.setFont(new Font("Tekton Pro", Font.BOLD, 22));
		btnGroot.setBounds(234, 279, 174, 32);
		getContentPane().add(btnGroot);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
	}

}
