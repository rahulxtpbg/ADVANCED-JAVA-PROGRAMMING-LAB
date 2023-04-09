package net.codejava.swing;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		MyBean myBean=new MyBean();
		JTextField textField=new JTextField(10);
		JButton button=new JButton("Set Property");
		button.addActionListener(this);
		JLabel label=new JLabel(myBean.getName());
		getContentPane().add(button);
		getContentPane().add(textField);
		getContentPane().add(label);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
	public void actionPerformed(ActionEvent e) {
		myBean.setName(((JTextField) getContentPane().getComponent(0)).getText());
		label.setText(myBean.getName());
		
	}

}
