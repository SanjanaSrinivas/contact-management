import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

import java.awt.Color;
//import java.awt.Font;
public class updatemail extends JFrame implements ActionListener
{
	public JPanel p;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l13;	
	public JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;
	GridBagConstraints gbc;	
	GridBagLayout gbl;
	
	public updatemail()	
	{
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		p=new JPanel();
		l13=new JLabel();
		p.setLayout(gbl);
		
		//l=new JLabel("E-MAIL ADDRESS :                                                                                                                                            ");
		l1=new JLabel("Entry.id:");
		l2=new JLabel(" ");
		l3=new JLabel("Name:");
		l4=new JLabel(" ");
		l5=new JLabel("E-mail Id 1:");
		l6=new JLabel(" ");
		l7=new JLabel("E-mail Id 2:");
		l8=new JLabel(" ");
				
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		
		b1=new JButton("Update");
		b2=new JButton("Search");
		b3=new JButton("Clear");
		b4=new JButton("Back");
		
		
		addupdatemail();

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	void addupdatemail()
	{

		getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=0;
gbc.gridy=1;
gbl.setConstraints(l1,gbc);
p.add(l1);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=2;
gbc.ipady=2;
gbc.gridx=0;
gbc.gridy=2;
gbl.setConstraints(l2,gbc);
p.add(l2);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=3;
gbc.ipady=3;
gbc.gridx=0;
gbc.gridy=3;
gbl.setConstraints(t1,gbc);
p.add(t1);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=4;
gbc.ipady=4;
gbc.gridx=0;
gbc.gridy=4;
gbl.setConstraints(l3,gbc);
p.add(l3);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=5;
gbc.ipady=5;
gbc.gridx=0;
gbc.gridy=5;
gbl.setConstraints(l4,gbc);
p.add(l4);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=6;
gbc.ipady=6;
gbc.gridx=0;
gbc.gridy=6;
gbl.setConstraints(t2,gbc);
p.add(t2);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=7;
gbc.ipady=7;
gbc.gridx=0;
gbc.gridy=7;
gbl.setConstraints(l5,gbc);
p.add(l5);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=8;
gbc.ipady=8;
gbc.gridx=0;
gbc.gridy=8;
gbl.setConstraints(l6,gbc);
p.add(l6);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=9;
gbc.ipady=9;
gbc.gridx=0;
gbc.gridy=9;
gbl.setConstraints(t3,gbc);
p.add(t3);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=10;
gbc.ipady=10;
gbc.gridx=0;
gbc.gridy=10;
gbl.setConstraints(l7,gbc);
p.add(l7);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=11;
gbc.ipady=11;
gbc.gridx=0;
gbc.gridy=11;
gbl.setConstraints(l8,gbc);
p.add(l8);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=12;
gbc.ipady=12;
gbc.gridx=0;
gbc.gridy=12;
gbl.setConstraints(t4,gbc);
p.add(t4);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=10;
gbc.gridx=40;
gbc.gridy=50;
gbl.setConstraints(l13,gbc);
p.add(l13);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.WEST;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=19;
gbl.setConstraints(b1,gbc);
p.add(b1);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.CENTER;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=20;
gbl.setConstraints(b2,gbc);
p.add(b2);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.EAST;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=21;
gbl.setConstraints(b3,gbc);
p.add(b3);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.NORTH;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=22;
gbl.setConstraints(b4,gbc);
p.add(b4);

		p.setBackground(Color.PINK);
		b1.setBackground(Color.GRAY);
		b2.setBackground(Color.GRAY);
		b3.setBackground(Color.GRAY);
		b4.setBackground(Color.GRAY);
		
		l13.setIcon(new ImageIcon("e1.jpg"));
		setVisible(true);
		setSize(1466,729);
		setDefaultCloseOperation(3);

	}
	public void actionPerformed(ActionEvent ae)	
	{
		String a = t1.getText();
	 	String b = t2.getText();
	 	String c = t3.getText();
	 	String d = t4.getText();
	 
		String var = ae.getActionCommand();

		if(var.equals("Update"))
	   	{
			try
	   		{
	     			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		 		Connection con = DriverManager.getConnection("Jdbc:Odbc:ASHA-PC","","");

		 		PreparedStatement st = con.prepareStatement("update email set name=?,email1=?,email2=? where entryid=?");

				st.setString(1,b);
		 		st.setString(2,c);
		 		st.setString(3,d);
				st.setString(4,a);
		 		
				int z = st.executeUpdate();

		 		if (z>0)
              			{
			    		l8.setText("Update Successful");
				}
        		
			}
        		catch(SQLException y)
         		{
            			l8.setForeground(Color.RED);
				l8.setText("could not connect");
					//y.printStackTrace();
				System.out.println("SQL Exception");
           		}
        		catch(ClassNotFoundException NF)
         		{
           			l8.setForeground(Color.RED);
           		 	l8.setText("could not found");
					//y.printStackTrace();
				System.out.println("ClassNotFound Exception");
		 	}

		}
		//if(ae.getSource()==b2)	
		//{
		if(var.equals("Search"))
		{
       			try
			{

	      			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		 		Connection con = DriverManager.getConnection("Jdbc:Odbc:ASHA-PC","","");

		 		Statement st = con.createStatement();

		 		ResultSet rs = st.executeQuery("select * from email where entryid="+a);

		 		if(rs.next())
		 		{
	     				String a1 = rs.getString(1);
		 			String b1 = rs.getString(2);
		 			String c1 = rs.getString(3);
					String d1 = rs.getString(4);
		 			
					t1.setText(a1);
		 			t2.setText(b1);
		 			t3.setText(c1);
					t4.setText(d1);
		 			
        			}
			}
        		catch(SQLException S)
          		{
                   		l8.setForeground(Color.RED);
				l8.setText("could not connect");
					//y.printStackTrace();
				System.out.println("SQL Exception");
           		}
        		catch(ClassNotFoundException Ex)
         		{
           			l8.setForeground(Color.RED);
            			l8.setText("could not found");
					//y.printStackTrace();
				System.out.println("ClassNotFound Exception");
		 	}
			//dispose();
		}
		if(ae.getSource()==b3)
       		{
		  	t1.setText("");
		 	t2.setText("");
		  	t3.setText("");
		  	t4.setText("");
		}
		if(var.equals("Back"))
        	{
			update o2=new update();

		}
	}
	public static void main(String args[])
	{
		updatemail i=new updatemail();
		
	}
}