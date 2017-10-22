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
		
		//not sure if best way to do this
		//each row should go in it's own panel
		//each panel can go in middlePanel with BoxLayout
		middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
		//row 1
		JPanel row1 = new JPanel();
		middlePanel.add(row1);
		
		JLabel label1 = new JLabel(Letter.getLetter());
		label1.setFont(new Font("Courier", Font.BOLD, 36));
		row1.add(label1);
		
		JLabel label2 = new JLabel(Letter.getLetter());
		label2.setFont(new Font("Courier", Font.BOLD, 36));
		row1.add(label2);
		
		JLabel label3 = new JLabel(Letter.getLetter());
		label3.setFont(new Font("Courier", Font.BOLD, 36));
		row1.add(label3);
		
		JLabel label4 = new JLabel(Letter.getLetter());
		label4.setFont(new Font("Courier", Font.BOLD, 36));
		row1.add(label4);
		
		JLabel label5 = new JLabel(Letter.getLetter());
		label5.setFont(new Font("Courier", Font.BOLD, 36));
		row1.add(label5);
		
		//row 2
		JPanel row2 = new JPanel();
		middlePanel.add(row2);
		
		JLabel label6 = new JLabel(Letter.getLetter());
		label6.setFont(new Font("Courier", Font.BOLD, 36));
		row2.add(label6);
		
		JLabel label7 = new JLabel(Letter.getLetter());
		label7.setFont(new Font("Courier", Font.BOLD, 36));
		row2.add(label7);
		
		JLabel label8 = new JLabel(Letter.getLetter());
		label8.setFont(new Font("Courier", Font.BOLD, 36));
		row2.add(label8);
		
		JLabel label9 = new JLabel(Letter.getLetter());
		label9.setFont(new Font("Courier", Font.BOLD, 36));
		row2.add(label9);
		
		JLabel label10 = new JLabel(Letter.getLetter());
		label10.setFont(new Font("Courier", Font.BOLD, 36));
		row2.add(label10);
		
		//row 3
		JPanel row3 = new JPanel();
		middlePanel.add(row3);
				
		JLabel label11 = new JLabel(Letter.getLetter());
		label11.setFont(new Font("Courier", Font.BOLD, 36));
		row3.add(label11);
				
		JLabel label12 = new JLabel(Letter.getLetter());
		label12.setFont(new Font("Courier", Font.BOLD, 36));
		row3.add(label12);
				
		JLabel label13 = new JLabel(Letter.getLetter());
		label13.setFont(new Font("Courier", Font.BOLD, 36));
		row3.add(label13);
				
		JLabel label14 = new JLabel(Letter.getLetter());
		label14.setFont(new Font("Courier", Font.BOLD, 36));
		row3.add(label14);
				
		JLabel label15 = new JLabel(Letter.getLetter());
		label15.setFont(new Font("Courier", Font.BOLD, 36));
		row3.add(label15);
		
		//row 4
		JPanel row4 = new JPanel();
		middlePanel.add(row4);
				
		JLabel label16 = new JLabel(Letter.getLetter());
		label16.setFont(new Font("Courier", Font.BOLD, 36));
		row4.add(label16);
				
		JLabel label17 = new JLabel(Letter.getLetter());
		label17.setFont(new Font("Courier", Font.BOLD, 36));
		row4.add(label17);
				
		JLabel label18 = new JLabel(Letter.getLetter());
		label18.setFont(new Font("Courier", Font.BOLD, 36));
		row4.add(label18);
				
		JLabel label19 = new JLabel(Letter.getLetter());
		label19.setFont(new Font("Courier", Font.BOLD, 36));
		row4.add(label19);
				
		JLabel label20 = new JLabel(Letter.getLetter());
		label20.setFont(new Font("Courier", Font.BOLD, 36));
		row4.add(label20);
		
		//row 5
		JPanel row5 = new JPanel();
		middlePanel.add(row5);
				
		JLabel label21 = new JLabel(Letter.getLetter());
		label21.setFont(new Font("Courier", Font.BOLD, 36));
		row5.add(label21);
				
		JLabel label22 = new JLabel(Letter.getLetter());
		label22.setFont(new Font("Courier", Font.BOLD, 36));
		row5.add(label22);
				
		JLabel label23 = new JLabel(Letter.getLetter());
		label23.setFont(new Font("Courier", Font.BOLD, 36));
		row5.add(label23);
				
		JLabel label24 = new JLabel(Letter.getLetter());
		label24.setFont(new Font("Courier", Font.BOLD, 36));
		row5.add(label24);
				
		JLabel label25 = new JLabel(Letter.getLetter());
		label25.setFont(new Font("Courier", Font.BOLD, 36));
		row5.add(label25);
		//*******************************
		
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
