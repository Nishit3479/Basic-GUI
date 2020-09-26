import javax.swing.*;
import java.awt.event.*;

public class BasicGUI implements ActionListener{
	public static void main(String []args)
	{
		new BasicGUI();
	}
	static JFrame frame;
	static JLabel lb1;
	static JLabel lb2;
	static JLabel lb3;
	static JLabel lb4;
	static JLabel lb5;
	static JButton bt1;
	static JButton bt2;
	static JButton bt3;
	static JTextField tf1;
	static JPasswordField tf2;
	static JPanel pn;
	BasicGUI()
	{
		frame = new JFrame("Login Page");
		frame.setBounds(780,350,500,300);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		lb1 = new JLabel("User Name : ");
		lb1.setBounds(55,51,100,25);
		frame.add(lb1);
		
		lb2 = new JLabel("Password  : ");
		lb2.setBounds(57,77,100,25);
		frame.add(lb2);
		
		lb3 = new JLabel("©Java-Eclipse");
		lb3.setBounds(385,225,100,25);
		frame.add(lb3);
		
		lb4 = new JLabel("Welcome to Java Swing...");
		lb4.setBounds(159,105,150,25);
		frame.add(lb4);
		lb4.setVisible(false);
		
		lb5 = new JLabel("Invalid Login Credentials...");
		lb5.setBounds(159,105,150,25);
		frame.add(lb5);
		lb5.setVisible(false);
				
		tf1 = new JTextField(20);

		tf2 = new JPasswordField(20);
		
		bt1 = new JButton("Reset");
		bt1.setBounds(120,130,77,25);
		frame.add(bt1);
		bt1.addActionListener(this);
		
		bt2 = new JButton("Login");
		bt2.setBounds(250,130,77,25);
		frame.add(bt2);
		bt2.addActionListener(this);
		
		bt3 = new JButton("<<Back");
		bt3.setBounds(1,1,77,25);
		frame.add(bt3);
		bt3.setVisible(false);
		bt3.addActionListener(this);
		
		pn = new JPanel();
		pn.add(tf1);
		pn.add(tf2);
		pn.setBounds(130,50,250,250);
		frame.add(pn);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("Reset"))
		{
			tf1.setText("");
			tf2.setText("");
		}
		if(e.getActionCommand().equals("Login"))
		{
			bt3.setVisible(true);
			lb1.setVisible(false);
			lb2.setVisible(false);
			bt1.setVisible(false);
			bt2.setVisible(false);
			tf1.setVisible(false);
			tf2.setVisible(false);
			pn.setVisible(false);
			if(tf1.getText().equals("Admin") && tf2.getText().equals("1234"))
			{
				lb4.setVisible(true);
			}
			else
			{
				lb5.setVisible(true);
			}
		}
		if(e.getActionCommand().equals("<<Back"))
		{
			lb4.setVisible(false);
			lb5.setVisible(false);
			bt3.setVisible(false);
			lb1.setVisible(true);
			lb2.setVisible(true);
			bt1.setVisible(true);
			bt2.setVisible(true);
			tf1.setVisible(true);
			tf2.setVisible(true);
			pn.setVisible(true);
			tf1.setText("");
			tf2.setText("");
		}
	}
}
