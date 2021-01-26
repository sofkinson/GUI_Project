import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class TheGeneratorFrame extends JFrame implements ActionListener{

		ImageIcon icon = new ImageIcon("headphones.png");
		ImageIcon icon3 = new ImageIcon("happy.png");
		ImageIcon icon2 = new ImageIcon("okay.png");
		ImageIcon icon1 = new ImageIcon("sad.png");
		ImageIcon icon4 = new ImageIcon("cake.png");
		
		JLabel welcomeMessage = new JLabel("Hi there! So, what's your mood today?");
		JLabel question = new JLabel("And how would you like to change it?");
		JLabel goodbyeMessage = new JLabel("Welp, then i have some choices for you:");
		
		String btn4Name = "...this way...";
		String btn5Name = "...that way...";
		String textAreaText = "...some song for you...";
		String [] response = {"Bye :)"};
		
		JRadioButton btn1 = new JRadioButton("Ugh, not very good...");
		JRadioButton btn2 = new JRadioButton("It's fine, but could be better.");
		JRadioButton btn3 = new JRadioButton("It's really good, actually!");
		JRadioButton btn4 = new JRadioButton(btn4Name);
		JRadioButton btn5 = new JRadioButton(btn5Name);
		
		JTextArea textArea = new JTextArea();
		
		JButton button1 = new JButton("Previous");
		JButton button2 = new JButton("Next");
		JButton button3 = new JButton("This one!");
		
		int songOrder = 0;
		
		Border border = BorderFactory.createLineBorder(new Color(255, 102, 102), 3);
		
		String [] sad1 = {"Was not was – Walk the dinosaur" , "Modjo – Lady - Hear me tonight" , "More Fatter – Weirdo"};
		String [] sad2 = {"Mahalia – Do not disturb" , "Mr. Kitty – After dark" , "The Neighbourhood – Cry baby"};
		String [] okay1 = {"Will Smith – Men in Black" , "gianni & kyle – do you even miss me at all?" , "SZA – The weekend"};
		String [] okay2 = {"Tame Impala – Borderline" , "Yxngx1 – Rather do" , "Labrinth – Formula"};
		String [] happy1 = {"SZA – Good days" , "Coldplay – Adventure of a Lifetime" , "Childish Gambino – Redbone"};
		String [] happy2 = {"N.E.R.D & Rihanna – Lemon" , "Ambjaay – Uno" , "Jacquees & Chris Brown – Put in work"};
		
		int condition1 = 0;
		int condition2 = 0;
		int condition3 = 0;
		
		TheGeneratorFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 450);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setTitle("Songs for the mood generator");
		this.getContentPane().setBackground(new Color(255, 229, 204));		
		this.setIconImage(icon.getImage());
		
		welcomeMessage.setHorizontalAlignment(JLabel.CENTER);
		welcomeMessage.setPreferredSize(new Dimension(700, 50));
		welcomeMessage.setForeground(new Color(255, 102, 102));
		welcomeMessage.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 30));
		
		btn1.setPreferredSize(new Dimension(200, 50));
		btn1.setBackground(new Color(255, 229, 204));
		btn1.setForeground(new Color(255, 102, 102));
		btn1.setIcon(icon1);
		btn1.setFocusable(false);
		btn1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
		
		btn2.setPreferredSize(new Dimension(240, 50));
		btn2.setBackground(new Color(255, 229, 204));
		btn2.setForeground(new Color(255, 102, 102));
		btn2.setIcon(icon2);
		btn2.setFocusable(false);
		btn2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
		
		btn3.setPreferredSize(new Dimension(220, 50));
		btn3.setBackground(new Color(255, 229, 204));
		btn3.setForeground(new Color(255, 102, 102));
		btn3.setIcon(icon3);
		btn3.setFocusable(false);
		btn3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(btn1);
		group1.add(btn2);
		group1.add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);	
		btn3.addActionListener(this);	
		
		question.setHorizontalAlignment(JLabel.CENTER);
		question.setPreferredSize(new Dimension(700, 50));
		question.setForeground(new Color(255, 102, 102));
		question.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		
		btn4.setPreferredSize(new Dimension(300, 50));
		btn4.setBackground(new Color(255, 229, 204));
		btn4.setForeground(new Color(255, 102, 102));
		btn4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		btn4.setIcon(icon4);
		btn4.setFocusable(false);
		
		btn5.setPreferredSize(new Dimension(300, 50));
		btn5.setBackground(new Color(255, 229, 204));
		btn5.setForeground(new Color(255, 102, 102));
		btn5.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		btn5.setIcon(icon4);
		btn5.setFocusable(false);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(btn4);
		group2.add(btn5);
		
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		goodbyeMessage.setHorizontalAlignment(JLabel.CENTER);
		goodbyeMessage.setPreferredSize(new Dimension(700, 50));
		goodbyeMessage.setForeground(new Color(255, 102, 102));
		goodbyeMessage.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		
		textArea.setPreferredSize(new Dimension(600, 30));
		textArea.setBackground(new Color(255, 229, 204));
		textArea.setForeground(new Color(255, 102, 102));
		textArea.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		textArea.setBorder(border);
		textArea.setText(textAreaText); 
		textArea.setEditable(false);
		
		button1.setPreferredSize(new Dimension(160, 40));
		button1.setFocusable(false);
		button1.setBorder(BorderFactory.createEtchedBorder());
		button1.setBackground(new Color(255, 153, 153));
		button1.setEnabled(false);
		
		button2.setPreferredSize(new Dimension(160, 40));
		button2.setFocusable(false);
		button2.setBorder(BorderFactory.createEtchedBorder());
		button2.setBackground(new Color(255, 153, 153));
		button2.setEnabled(false);
		
		button3.setPreferredSize(new Dimension(160, 40));
		button3.setFocusable(false);
		button3.setBorder(BorderFactory.createEtchedBorder());
		button3.setBackground(new Color(255, 153, 153));;
		button3.setEnabled(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		
		
		
		this.add(welcomeMessage);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(question);
		this.add(btn4);
		this.add(btn5);
		this.add(goodbyeMessage);
		this.add(textArea);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1) {
			condition1 = 1;
		} else if(e.getSource() == btn2) {
			condition1 = 2;
		} else if(e.getSource() == btn3) {
			condition1 = 3;
		}
		
		
		if(condition1 == 1) {
			btn4.setText("I want to brighten up :(");
			btn5.setText("I want to cry ;(");
		} else if(condition1 == 2) {
			btn4.setText("I want to cheer up :/");
			btn5.setText("I want to set a productive mood :o");	
		} else if(condition1 == 3){
			btn4.setText("I want to keep up the good mood :)");
			btn5.setText("I just want to DANCE!!!");
		}
		
		
		if(e.getSource() == btn4) {
			condition2 = 1;
			button2.setEnabled(true);
			button3.setEnabled(true);
		}
		if(e.getSource() == btn5) {
			condition2 = 2;
			//textArea.setText(okay2[songOrder]);
			button2.setEnabled(true);
			button3.setEnabled(true);
		}
			
		if(condition1 == 1 && condition2 == 1) {
			textArea.setText(sad1[songOrder]);
			condition3 = 1;
		}else if(condition1 == 1 && condition2 == 2) {
			textArea.setText(sad2[songOrder]);
			condition3 = 2;
		}else if(condition1 == 2 && condition2 == 1) {
			textArea.setText(okay1[songOrder]);
			condition3 = 3;
		}else if(condition1 == 2 && condition2 == 2) {
			textArea.setText(okay2[songOrder]);
			condition3 = 4;
		}else if(condition1 == 3 && condition2 == 1) {
			textArea.setText(happy1[songOrder]);
			condition3 = 5;
		}else if(condition1 == 3 && condition2 == 2) {
			textArea.setText(happy2[songOrder]);
			condition3 = 6;
		}
		
		
		if(e.getSource() == button1) {
			songOrder -= 1;
			if(condition3 == 1) {
				textArea.setText(sad1[songOrder]);
			}else if(condition3 == 2) {
				textArea.setText(sad2[songOrder]);
			}else if(condition3 == 3) {
				textArea.setText(okay1[songOrder]);
			}else if(condition3 == 4) {
				textArea.setText(okay2[songOrder]);
			}else if(condition3 == 5) {
				textArea.setText(happy1[songOrder]);
			}else if(condition3 == 6) {
				textArea.setText(happy2[songOrder]);
			}
			button2.setEnabled(true);
			if(songOrder == 0) {
				button1.setEnabled(false);
			}
		}
		
		
		if(e.getSource() == button2) {
			songOrder += 1;
			if(condition3 == 1) {
			textArea.setText(sad1[songOrder]);	
			}else if(condition3 == 2) {
				textArea.setText(sad2[songOrder]);	
			}
			else if(condition3 == 3) {
				textArea.setText(okay1[songOrder]);	
			}
			else if(condition3 == 4) {
				textArea.setText(okay2[songOrder]);	
			}
			else if(condition3 == 5) {
				textArea.setText(happy1[songOrder]);	
			}
			else if(condition3 == 6) {
				textArea.setText(happy2[songOrder]);	
			}
			
			
			
			
			button1.setEnabled(true);
			if(songOrder == 2) {
				button2.setEnabled(false);
			}
		}
		
		if(e.getSource() == button3) {
			JOptionPane.showOptionDialog(null, "I'm happy I could help, have a great day, bye!", "Thank you for using me!", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, icon4, response,0);
			this.dispose();
		}
		}
		
		
		
	}


