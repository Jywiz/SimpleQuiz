package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qstn2 extends JFrame{

	private static final long serialVersionUID = 1L;

	//an array for the dropdown
	String[] runTimes = { "8 hours, 5 minutes", "2 days", "35 Days, 17 hours", "5 hours, 21 minutes"};
	
	Qstn2 qs2;
	public Qstn3 qs3 = new Qstn3();
	
	
	public Qstn2() {
	
		super("Movie Quiz");
	
		setSize(450,400);
		getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question #2");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(12, 13, 117, 30);
		getContentPane().add(lblQuestion);
		
		JLabel lblHoeLongIs = new JLabel("How long is the world's longest movie?");
		lblHoeLongIs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHoeLongIs.setBounds(12, 105, 357, 30);
		getContentPane().add(lblHoeLongIs);
		
		//a button which pops up an input dialog with a dropdown menu and also makes the next frame appear
		JButton btnReady = new JButton("Ready to Answer");
		btnReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnReady) {
					String q2 = (String) JOptionPane.showInputDialog(null, "Longest movie is:", "", JOptionPane.QUESTION_MESSAGE, null, runTimes, "O");
					if (q2 == "35 Days, 17 hours") {
						JOptionPane.showMessageDialog(qs2, "Correct! The movie is called Logistics and it's from the year 2012");
						qs3.setVisible(true);
						dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong! The correct answer would be 35 days & 17 hours");
						qs3.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnReady.setBounds(127, 181, 139, 45);
		getContentPane().add(btnReady);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
