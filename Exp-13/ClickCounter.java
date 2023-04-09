package net.codejava.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class ClickCounter extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	private int count;
	private JButton button;
	private JLabel label;
	
	public ClickCounter() {
		count=0;
		button=new JButton("Click here");
		button.addActionListener(this);
		label=new JLabel("Number of clicks:"+count);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		getContentPane().add(button);
		getContentPane().add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks:"+count);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClickCounter frame = new ClickCounter();
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
	public ClickCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
