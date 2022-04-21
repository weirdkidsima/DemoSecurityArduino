import java.awt.*;
import java.io.*;
import javax.swing.*;
public class Main {
	static boolean start=true;
	static JLabel window1;
	static JLabel window2;
	static JLabel door1;
	static JLabel door2;
	static JFrame frame;
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setSize(400,250);
		frame.setLocation(350, 350);
		ImageIcon img = new ImageIcon("shield.png");
		frame.setIconImage(img.getImage());
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(1,2));
		JLabel title= new JLabel("Security");
		title.setFont(new Font("Times",Font.BOLD,20));
		panel.add(title);
		JPanel security = new JPanel();
		security.setLayout(new GridLayout(4,1));
		panel.add(security);
		window1 = new JLabel("Window 1");
		window2 = new JLabel("Window 2");
		door1 = new JLabel("Door 1");
		door2 = new JLabel("Door2");
		security.add(window1);
		security.add(window2);
		security.add(door1);
		security.add(door2);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Reader read = new Reader();
		read.start();
	}

}
