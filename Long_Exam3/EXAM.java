package LongExam3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class EXAM {

	private JFrame frame;
	private JRadioButton rdbtnthird_choice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EXAM window = new EXAM();
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
	public EXAM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("EXAM");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setBounds(181, 11, 145, 29);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblQuestion = new JLabel("Question #1: Who originally developed the Java Programming Language?");
		lblQuestion.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblQuestion.setBounds(22, 58, 425, 29);
		frame.getContentPane().add(lblQuestion);
		
		
		JRadioButton rdbtnfirst_choice = new JRadioButton("Timberners-Lee");
		rdbtnfirst_choice.setFont(new Font("SansSerif", Font.PLAIN, 12));
		rdbtnfirst_choice.setBounds(20, 90, 427, 23);
		frame.getContentPane().add(rdbtnfirst_choice);
		
		JRadioButton rdbtnsecond_choice = new JRadioButton("Guido Van Rossum");
		rdbtnsecond_choice.setFont(new Font("SansSerif", Font.PLAIN, 12));
		rdbtnsecond_choice.setBounds(20, 116, 427, 23);
		frame.getContentPane().add(rdbtnsecond_choice);
		
		JRadioButton rdbtnthird_choice = new JRadioButton("James Gosling");
		rdbtnthird_choice.setFont(new Font("SansSerif", Font.PLAIN, 12));
		rdbtnthird_choice.setBounds(22, 142, 427, 23);
		frame.getContentPane().add(rdbtnthird_choice);
		
		JRadioButton rdbtnfourth_choice = new JRadioButton("Mark Zuckerberg");
		rdbtnfourth_choice.setFont(new Font("SansSerif", Font.PLAIN, 12));
		rdbtnfourth_choice.setBounds(22, 168, 427, 23);
		frame.getContentPane().add(rdbtnfourth_choice);
		
		ButtonGroup group = new ButtonGroup();
        group.add(rdbtnfirst_choice);
        group.add(rdbtnsecond_choice);
        group.add(rdbtnthird_choice);
        group.add(rdbtnfourth_choice);
        
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (rdbtnthird_choice.isSelected()){
				        JRadioButton selectedRadioButton = rdbtnthird_choice;
				        JOptionPane.showMessageDialog(frame, "YOUR ANSWER IS CORRECT");
				        btnSubmit.setFocusable(true);
				    } else {
				        JOptionPane.showMessageDialog(frame, "YOUR ANSWER IS INCORRECT");
				        btnSubmit.setFocusable(false);
			}
				}
		});
		btnSubmit.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSubmit.setBounds(358, 212, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
