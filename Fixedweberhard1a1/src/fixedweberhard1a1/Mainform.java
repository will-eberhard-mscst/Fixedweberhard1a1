package fixedweberhard1a1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainform extends JFrame {

	private JPanel contentPane;
	private JLabel grossPayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainform frame = new Mainform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsUp = new JLabel("Gross pay:");
		lblWhatIsUp.setBounds(21, 24, 115, 14);
		contentPane.add(lblWhatIsUp);
		
		JButton btnDoNotPress = new JButton("Calculate");
		btnDoNotPress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	      
				int hours = 40;
		      double grossPay, payRate = 25.0;
		      
		      grossPay = hours * payRate;
		      grossPayLabel.setText("Your gross pay is $" + grossPay);
			}
		});
		btnDoNotPress.setBounds(89, 124, 143, 23);
		contentPane.add(btnDoNotPress);
		
		grossPayLabel = new JLabel("");
		grossPayLabel.setBounds(126, 24, 191, 14);
		contentPane.add(grossPayLabel);
	}
}
