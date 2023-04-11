package net.codejava.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private MyBean myBean;
	private JLabel label;
	private JTextField textField;
	
	public MyFrame(){
		myBean=new MyBean();
		textField=new JTextField(10);
		JButton button=new JButton("Set Property");
		button.addActionListener(this);
		label=new JLabel(myBean.getName());
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		getContentPane().add(button);
		getContentPane().add(label);
		getContentPane().add(textField);
	}
	
	public void actionPerformed(ActionEvent e){
		String newText = textField.getText();
		myBean.setName(newText);
		label.setText(myBean.getName());
	}

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
