package game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		
		//also in the final version each label would not just get a letter from the letter class
		//but from the GameBoard class
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		middlePanel.setLayout(gridBag);
		constraints.fill = GridBagConstraints.BOTH;
		//for each component to add to middlePanel
		//create component
		//set the instance variables in the GridBagConstraints instance
		
		//row 1
		JLabel label1 = new JLabel(Letter.getLetter());
		label1.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 0;
		constraints.gridy = 0;
		gridBag.setConstraints(label1, constraints);
		middlePanel.add(label1);
		
		JLabel label2 = new JLabel(Letter.getLetter());
		label2.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 1;
		constraints.gridy = 0;
		gridBag.setConstraints(label2, constraints);
		middlePanel.add(label2);
		
		JLabel label3 = new JLabel(Letter.getLetter());
		label3.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 2;
		constraints.gridy = 0;
		gridBag.setConstraints(label3, constraints);
		middlePanel.add(label3);
		
		JLabel label4 = new JLabel(Letter.getLetter());
		label4.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 3;
		constraints.gridy = 0;
		gridBag.setConstraints(label4, constraints);
		middlePanel.add(label4);
		
		JLabel label5 = new JLabel(Letter.getLetter());
		label5.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 4;
		constraints.gridy = 0;
		gridBag.setConstraints(label5, constraints);
		middlePanel.add(label5);
		
		//row 2
		JLabel label6 = new JLabel(Letter.getLetter());
		label6.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 0;
		constraints.gridy = 1;
		gridBag.setConstraints(label6, constraints);
		middlePanel.add(label6);
		
		JLabel label7 = new JLabel(Letter.getLetter());
		label7.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 1;
		constraints.gridy = 1;
		gridBag.setConstraints(label7, constraints);
		middlePanel.add(label7);
		
		JLabel label8 = new JLabel(Letter.getLetter());
		label8.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 2;
		constraints.gridy = 1;
		gridBag.setConstraints(label8, constraints);
		middlePanel.add(label8);
		
		JLabel label9 = new JLabel(Letter.getLetter());
		label9.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 3;
		constraints.gridy = 1;
		gridBag.setConstraints(label9, constraints);
		middlePanel.add(label9);
		
		JLabel label10 = new JLabel(Letter.getLetter());
		label10.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 4;
		constraints.gridy = 1;
		gridBag.setConstraints(label10, constraints);
		middlePanel.add(label10);
		
		//row 3
		JLabel label11 = new JLabel(Letter.getLetter());
		label11.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 0;
		constraints.gridy = 2;
		gridBag.setConstraints(label11, constraints);
		middlePanel.add(label11);
		
		JLabel label12 = new JLabel(Letter.getLetter());
		label12.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 1;
		constraints.gridy = 2;
		gridBag.setConstraints(label12, constraints);
		middlePanel.add(label12);
		
		JLabel label13 = new JLabel(Letter.getLetter());
		label13.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 2;
		constraints.gridy = 2;
		gridBag.setConstraints(label13, constraints);
		middlePanel.add(label13);
		
		JLabel label14 = new JLabel(Letter.getLetter());
		label14.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 3;
		constraints.gridy = 2;
		gridBag.setConstraints(label14, constraints);
		middlePanel.add(label14);
		
		JLabel label15 = new JLabel(Letter.getLetter());
		label15.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 4;
		constraints.gridy = 2;
		gridBag.setConstraints(label15, constraints);
		middlePanel.add(label15);
		
		//row 4
		JLabel label16 = new JLabel(Letter.getLetter());
		label16.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 0;
		constraints.gridy = 3;
		gridBag.setConstraints(label16, constraints);
		middlePanel.add(label16);
		
		JLabel label17 = new JLabel(Letter.getLetter());
		label17.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 1;
		constraints.gridy = 3;
		gridBag.setConstraints(label17, constraints);
		middlePanel.add(label17);
		
		JLabel label18 = new JLabel(Letter.getLetter());
		label18.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 2;
		constraints.gridy = 3;
		gridBag.setConstraints(label18, constraints);
		middlePanel.add(label18);
		
		JLabel label19 = new JLabel(Letter.getLetter());
		label19.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 3;
		constraints.gridy = 3;
		gridBag.setConstraints(label19, constraints);
		middlePanel.add(label19);
		
		JLabel label20 = new JLabel(Letter.getLetter());
		label20.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 4;
		constraints.gridy = 3;
		gridBag.setConstraints(label20, constraints);
		middlePanel.add(label20);
		
		//row 5
		JLabel label21 = new JLabel(Letter.getLetter());
		label21.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 0;
		constraints.gridy = 4;
		gridBag.setConstraints(label21, constraints);
		middlePanel.add(label21);
		
		JLabel label22 = new JLabel(Letter.getLetter());
		label22.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 1;
		constraints.gridy = 4;
		gridBag.setConstraints(label22, constraints);
		middlePanel.add(label22);
		
		JLabel label23 = new JLabel(Letter.getLetter());
		label23.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 2;
		constraints.gridy = 4;
		gridBag.setConstraints(label23, constraints);
		middlePanel.add(label23);
		
		JLabel label24 = new JLabel(Letter.getLetter());
		label24.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 3;
		constraints.gridy = 4;
		gridBag.setConstraints(label24, constraints);
		middlePanel.add(label24);
		
		JLabel label25 = new JLabel(Letter.getLetter());
		label25.setFont(new Font("Courier", Font.BOLD, 36));
		constraints.gridx = 4;
		constraints.gridy = 4;
		gridBag.setConstraints(label25, constraints);
		middlePanel.add(label25);
		
		//*******************************
		
		bottomPanel.add(textfield);
		bottomPanel.add(scroller);
		topPanel.add(timeLabel);
		
		frame.setSize(500, 450);
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
