package exo1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
	
	private JPanel panel1;
	private JRadioButton rectangleRadioButton;
	private JRadioButton squareRadioButton;
	private JRadioButton ellipsisRadioButton;
	private JRadioButton circleRadioButton;
	private JTextArea textArea1;
	private JTextField textField1;
	private JTextField textField2;

	public Form() {
		button1.addActionListener(new ActionListener() {      //On va écouter dès que quelqu'un dès que l'on appuie sur le bouton
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Form");
		frame.setContentPane(new Form().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
