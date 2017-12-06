package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn4 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public Qstn4 qs4;
	public Qstn5 qs5 = new Qstn5();
	
	public Qstn4() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #4");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 121, 22);
		getContentPane().add(lblQuestion);
		
		JLabel lblHowManyMovies = new JLabel("How many live-action movies take place in Middle Earth?");
		lblHowManyMovies.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHowManyMovies.setBounds(12, 102, 408, 33);
		getContentPane().add(lblHowManyMovies);
		
		
		/*
		 * first question with just buttons as answers, each button has the same function of
		 * hiding the current frame and opening the new one
		 */
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs4, "Wrong! Correct answer is 6");
				qs5.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 196, 76, 66);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs4, "Wrong! Correct answer is 6");
				qs5.setVisible(true);
				dispose();
			}
		});
		button.setBounds(122, 196, 76, 66);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("6");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs4, "Correct!");
				qs5.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(236, 196, 76, 66);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(qs4, "Wrong! Correct answer is 6");
				qs5.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(344, 196, 76, 66);
		getContentPane().add(button_2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
	}

}
