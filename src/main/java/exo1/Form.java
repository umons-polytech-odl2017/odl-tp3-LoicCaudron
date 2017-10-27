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
	private JTextArea Messages;
	private JPanel drawingPanel;
	private JTextField textField1;
	private JTextField textField2;

	public Form() {

		rectangleRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		squareRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		ellipsisRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		circleRadioButton.addActionListener(new ActionListener() {
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

	private void createUIComponents() {
		drawingPanel = new JPanel();

	}
}
