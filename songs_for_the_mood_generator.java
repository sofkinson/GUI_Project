package GUI_Project;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class songs_for_the_mood_generator {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Songs for the mood generator");
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		
		String btn1 = "ugh, not very good";
		String btn2 = "it's fine, but could be better";
		String btn3 = "it's really good, actually!";
		
		
		//creating the main structure
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel();
		mainPanel.add(topPanel);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JPanel leftPanel = new JPanel();
		topPanel.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		
		JPanel rightPanel = new JPanel();
		topPanel.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
	
		JTextArea theActualSongs = new JTextArea();
		mainPanel.add(theActualSongs);
		theActualSongs.setBounds(100, 100, 100, 100);
		
		JPanel bottomPanel = new JPanel();
		mainPanel.add(bottomPanel);
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
 
		//left panel
		JLabel welcomeMessage = new JLabel("Hey there! So what's your mood today?");
		leftPanel.add(welcomeMessage);
		
		JRadioButton button1 = new JRadioButton(btn1);
		button1.setMnemonic(KeyEvent.VK_D);
	    leftPanel.add(button1); 
		JRadioButton button2 = new JRadioButton(btn2);
		button2.setMnemonic(KeyEvent.VK_D);
	    leftPanel.add(button2);
		JRadioButton button3 = new JRadioButton(btn3);
		button3.setMnemonic(KeyEvent.VK_D);
		leftPanel.add(button3);
        
	    ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        
        
        //right panel
        JLabel welcomeMessage2 = new JLabel("And how would you like to change it?");
        rightPanel.add(welcomeMessage2);

        JRadioButton button11 = new JRadioButton("..this way..");
        button1.setMnemonic(KeyEvent.VK_D);
        rightPanel.add(button11); 
        JRadioButton button22 = new JRadioButton("..that way..");
		button1.setMnemonic(KeyEvent.VK_D);
		rightPanel.add(button22);

		ButtonGroup group2 = new ButtonGroup();
		group.add(button11);
		group.add(button22);
	
		
		JButton bigButton1 = new JButton("Previous");
		bottomPanel.add(bigButton1);
		JButton bigButton2 = new JButton("Next");
		bottomPanel.add(bigButton2);
		JButton bigButton3 = new JButton("I choose this one!");
		bottomPanel.add(bigButton3);

		
		frame.pack();
		// Setting the frame visibility to true
		frame.setVisible(true);
	}

}
