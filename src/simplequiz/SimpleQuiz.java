package simplequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleQuiz extends JFrame {


	private static final long serialVersionUID = 1L;
	//Creating objects from the main menu and first question
	public static SimpleQuiz sq;
	public Qstn1 que1;
	
	//constructor
	public SimpleQuiz() {
		
		//settings for the JFrame, same settings are used in all the other JFrames
		super("Movie Quiz");
		setSize(450,400);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Label for  the main screen image
		JLabel label = new JLabel(new ImageIcon("kuva1.jpg"));
		label.setBounds(12, 34, 408, 176);
		getContentPane().add(label);
		
		JLabel lblImageDownloadedFrom = new JLabel("Image downloaded from pixabay");
		lblImageDownloadedFrom.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblImageDownloadedFrom.setBounds(12, 213, 201, 16);
		getContentPane().add(lblImageDownloadedFrom);
		
		//title
		JLabel lblSimpleMovieQuiz = new JLabel("Simple Movie Quiz!");
		lblSimpleMovieQuiz.setFont(new Font("Bookman Old Style", Font.BOLD, 19));
		lblSimpleMovieQuiz.setBounds(116, 242, 201, 23);
		getContentPane().add(lblSimpleMovieQuiz);
		
		//start-button, which makes question 1 visible
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				que1 = new Qstn1();
				que1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(29, 278, 140, 52);
		getContentPane().add(btnNewButton);
		
		//exit button, which closes the application
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(263, 278, 145, 52);
		getContentPane().add(btnNewButton_1);
		
		
	}

	public static void main(String[] args) {
		//initializing the main object
		sq = new SimpleQuiz();
		sq.setVisible(true);
		
	}
}
