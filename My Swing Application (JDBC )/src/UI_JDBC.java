import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class UI_JDBC implements ActionListener{
JTextField l1text,l2text,l3text,l4text,l5text,l6text,l7text,l8text;
UI_JDBC()
{
	JFrame f=new JFrame();
	
	//First name
	JPanel cell1=new JPanel(new GridBagLayout());
	GridBagConstraints c=new GridBagConstraints();
	JLabel l1=new JLabel("First Name");
	l1text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l1.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell1.add(l1,c);
	c.gridx=0;
	c.gridy=2;
	l1text.setPreferredSize(new Dimension(20,30));
	cell1.add(l1text,c);
	
	//Last name
	JPanel cell2=new JPanel(new GridBagLayout());
	JLabel l2=new JLabel("Last Name");
	l2text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l2.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell2.add(l2,c);
	c.gridx=0;
	c.gridy=2;
	l2text.setPreferredSize(new Dimension(20,30));
	cell2.add(l2text,c);
	
	//country
	JPanel cell3=new JPanel(new GridBagLayout());
	JLabel l3=new JLabel("Country");
	l3text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l3.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell3.add(l3,c);
	c.gridx=0;
	c.gridy=2;
	l3text.setPreferredSize(new Dimension(20,30));
	cell3.add(l3text,c);
	
	//state
	JPanel cell4=new JPanel(new GridBagLayout());
	JLabel l4=new JLabel("State");
	l4text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l4.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell4.add(l4,c);
	c.gridx=0;
	c.gridy=2;
	l4text.setPreferredSize(new Dimension(20,30));
	cell4.add(l4text,c);
	
	//city
	JPanel cell5=new JPanel(new GridBagLayout());
	JLabel l5=new JLabel("City");
	l5text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l5.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell5.add(l5,c);
	c.gridx=0;
	c.gridy=2;
	l5text.setPreferredSize(new Dimension(20,30));
	cell5.add(l5text,c);
	
	//college name
	JPanel cell6=new JPanel(new GridBagLayout());
	JLabel l6=new JLabel("College Name");
	l6text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l6.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell6.add(l6,c);
	c.gridx=0;
	c.gridy=2;
	l6text.setPreferredSize(new Dimension(20,30));
	cell6.add(l6text,c);
	
	//course
	JPanel cell7=new JPanel(new GridBagLayout());
	JLabel l7=new JLabel("Course");
	l7text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l7.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell7.add(l7,c);
	c.gridx=0;
	c.gridy=2;
	l7text.setPreferredSize(new Dimension(20,30));
	cell7.add(l7text,c);
	
	//Mail ID 
	JPanel cell8=new JPanel(new GridBagLayout());
	JLabel l8=new JLabel("Mail ID");
	l8text=new JTextField();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=0.5;
	c.gridx=0;
	c.gridy=0;
	l8.setFont(new Font("Arial",Font.BOLD,15));
	c.insets=new Insets(10,10,1,1);
	cell8.add(l8,c);
	c.gridx=0;
	c.gridy=2;
	l8text.setPreferredSize(new Dimension(20,30));
	cell8.add(l8text,c);
	
	JPanel mainpanel=new JPanel(new GridLayout(3,3,50,50));
	mainpanel.add(cell1);mainpanel.add(cell2);mainpanel.add(cell3);mainpanel.add(cell4);mainpanel.add(cell5);mainpanel.add(cell6);mainpanel.add(cell7);mainpanel.add(cell8);
	mainpanel.setSize(800,400);
	
	JButton button=new JButton("Submit");
	button.setBounds(300,425,120,60);
	button.setBackground(Color.cyan);
	button.addActionListener(this);
	f.add(mainpanel);
	f.add(button);
	f.setTitle("My Swing Application (JDBC)");
	f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
	}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Submit Button is clicked");
	String Firstname=l1text.getText();
	String Lastname=l2text.getText();
	String Country=l3text.getText();
	String State=l4text.getText();
	String City=l5text.getText();
	String College=l6text.getText();
	String Course=l7text.getText();
	String MailID=l8text.getText();
	try
	{
		String URL="jdbc:mysql://localhost/MyJDBC";
		String Username="root";
		String Password="849889sri";
		
		Connection conn=DriverManager.getConnection(URL,Username,Password);
		System.out.println("connection is established");
		Statement statement=conn.createStatement();
		String sql="insert into student(student_firstname,student_lastname,student_country,student_state,student_city,student_college,student_course,student_emailID) values('"+Firstname+"','"+Lastname+"','"+Country+"','"+State+"','"+City+"','"+College+"','"+Course+"','"+MailID+"');";
		statement.executeUpdate(sql);
		System.out.println("Record is inserted");
	}
	catch(Exception er)
	{
		System.out.println(er.getMessage());
	}
}

}
