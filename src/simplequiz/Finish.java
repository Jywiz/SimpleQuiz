package simplequiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finish extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public static Finish fin = new Finish();
	
	public Finish() {
		
		super("Movie Quiz");
		
		setSize(450,400);
		getContentPane().setLayout(null);
		
		//last page with a message to thank the user
		JLabel lblThanksForPlaying = new JLabel("Thanks For Playing!");
		lblThanksForPlaying.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblThanksForPlaying.setBounds(66, 111, 366, 62);
		getContentPane().add(lblThanksForPlaying);
		
		//exit button to close the app
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(163, 236, 97, 25);
		getContentPane().add(btnExit);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
