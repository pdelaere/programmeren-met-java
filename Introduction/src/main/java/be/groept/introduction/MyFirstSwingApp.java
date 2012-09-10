package be.groept.introduction;

import java.awt.EventQueue;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MyFirstSwingApp {

	private JFrame frame;

	
	// Dit is commentaar //
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstSwingApp window = new MyFirstSwingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstSwingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("open");
		JEditorPane editPane = new JEditorPane();
		frame.getContentPane().add(btnNewButton);
		
		btnOpen.addActionListener (new ActionListener(){
		public void  ActionPerfiormed(ActionEvent e){
			JoptionPane joptionPane = new JOptionPane();
			String Url
		}
			
		}
		
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane);
	}
}