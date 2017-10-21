package game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class GameBoardGUI {
	JFrame frame;
	JTextField textfield;
	JTextArea scrollField;
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	JLabel timeLabel;
	
	public void go() {
		frame = new JFrame();
		topPanel = new JPanel();
		middlePanel = new JPanel();
		bottomPanel = new JPanel();
		timeLabel = new JLabel("Time Label/Holder Text");
		textfield = new JTextField(10);
		scrollField = new JTextArea(10, 10); //rows, columns
		JScrollPane scroller = new JScrollPane(scrollField);
		
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollField.setLineWrap(true);
		scrollField.setWrapStyleWord(true);
		scrollField.setFont(new Font("Courier", Font.PLAIN, 12));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(BorderLayout.NORTH, topPanel);
		frame.getContentPane().add(BorderLayout.CENTER, middlePanel);
		frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
		
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
		
		bottomPanel.add(textfield);
		bottomPanel.add(scroller);
		topPanel.add(timeLabel);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		textfield.requestFocus();
		
		textfield.addActionListener(new textListener());
		
	}
	
	//when user enters a word need to add it to the user's list of words played
	//and display it in the JTextArea
	class textListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String wordEntered = textfield.getText();
			//if a word is longer than 10 letters it won't look so pretty
			//scrollField.append(String.format("%1$10s", wordEntered));
			scrollField.append(wordEntered + "\t");
			textfield.setText(""); //clear field when user hits enter
			//add method to send wordEntered.. somewhere
		}
		
	}
	
	public static void main(String[] args) {
		GameBoardGUI test = new GameBoardGUI();
		test.go();
	}
}
