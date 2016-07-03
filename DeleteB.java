import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;

public class DeleteB extends JFrame implements ActionListener

{
public JPanel p;
public JLabel l0,l1,l2,l3,l4,l5,l6,l13;
public JTextField t1,t2,t3;
public JButton b0,b1,b2,b3;
public GridBagLayout gbl;
public GridBagConstraints gbc;

public DeleteB()
{

gbl=new GridBagLayout();
gbc=new GridBagConstraints();
p=new JPanel();
l0=new JLabel();
p.setLayout(gbl);


l1=new JLabel("Entry.id:");
l2=new JLabel(" ");
l3=new JLabel("Name:");
l4=new JLabel(" ");
l5=new JLabel("Birthday");
l6=new JLabel(" ");
//l7=new JLabel("Month:");
l13=new JLabel(" ");
//l9=new JLabel("Year:");
//l10=new JLabel(" ");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
//t4=new JTextField(20);
//t5=new JTextField(20);

b0=new JButton("SEARCH");
b1=new JButton("DELETE");
b2=new JButton("CLEAR");
b3=new JButton("BACK");

b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
addDeleteB();

}

public void addDeleteB()

{

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=0;
gbc.gridy=1;
gbl.setConstraints(l1,gbc);
p.add(l1);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=2;
gbc.ipady=2;
gbc.gridx=0;
gbc.gridy=2;
gbl.setConstraints(l2,gbc);
p.add(l2);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=3;
gbc.ipady=3;
gbc.gridx=0;
gbc.gridy=3;
gbl.setConstraints(t1,gbc);
p.add(t1);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=4;
gbc.ipady=4;
gbc.gridx=0;
gbc.gridy=4;
gbl.setConstraints(l3,gbc);
p.add(l3);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=5;
gbc.ipady=5;
gbc.gridx=0;
gbc.gridy=5;
gbl.setConstraints(l4,gbc);
p.add(l4);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=6;
gbc.ipady=6;
gbc.gridx=0;
gbc.gridy=6;
gbl.setConstraints(t2,gbc);
p.add(t2);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=7;
gbc.ipady=7;
gbc.gridx=0;
gbc.gridy=7;
gbl.setConstraints(l5,gbc);
p.add(l5);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=8;
gbc.ipady=8;
gbc.gridx=0;
gbc.gridy=8;
gbl.setConstraints(l6,gbc);
p.add(l6);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=9;
gbc.ipady=9;
gbc.gridx=0;
gbc.gridy=9;
gbl.setConstraints(t3,gbc);
p.add(t3);

/*getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=10;
gbc.ipady=10;
gbc.gridx=0;
gbc.gridy=10;
gbl.setConstraints(l7,gbc);
p.add(l7);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=11;
gbc.ipady=11;
gbc.gridx=0;
gbc.gridy=11;
gbl.setConstraints(l8,gbc);
p.add(l8);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=12;
gbc.ipady=12;
gbc.gridx=0;
gbc.gridy=12;
gbl.setConstraints(t4,gbc);
p.add(t4);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=13;
gbc.ipady=13;
gbc.gridx=0;
gbc.gridy=13;
gbl.setConstraints(l9,gbc);
p.add(l9);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=14;
gbc.ipady=14;
gbc.gridx=0;
gbc.gridy=14;
gbl.setConstraints(l10,gbc);
p.add(l10);

getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=15;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=15;
gbl.setConstraints(t5,gbc);
p.add(t5);*/


getContentPane().add(p);
gbc.fill=GridBagConstraints.VERTICAL;
gbc.ipadx=0;
gbc.ipady=27;
gbc.gridx=0;
gbc.gridy=27;
gbl.setConstraints(l0,gbc);
p.add(l0);


getContentPane().add(p);
gbc.anchor=GridBagConstraints.WEST;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=22;
gbc.ipady=22;
gbc.gridx=0;
gbc.gridy=22;
gbl.setConstraints(b0,gbc);
p.add(b0);


getContentPane().add(p);
gbc.anchor=GridBagConstraints.WEST;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=19;
gbc.ipady=19;
gbc.gridx=0;
gbc.gridy=19;
gbl.setConstraints(b1,gbc);
p.add(b1);

getContentPane().add(p);
gbc.anchor=GridBagConstraints.CENTER;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=20;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=20;
gbl.setConstraints(b2,gbc);
p.add(b2);

getContentPane().add(p);
gbc.anchor=GridBagConstraints.EAST;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=21;
gbc.ipady=21;
gbc.gridx=0;
gbc.gridy=21;
gbl.setConstraints(b3,gbc);
p.add(b3);


getContentPane().add(p);
p.add(l13);

p.setBackground(Color.orange);
b0.setBackground(Color.pink);
b1.setBackground(Color.pink);
b2.setBackground(Color.pink);
b3.setBackground(Color.pink);
l13.setBackground(Color.blue);
l0.setIcon(new ImageIcon("bday.jpg"));

setTitle("  **Delete Birthday**");
setVisible(true);
setSize(1366,729);
setDefaultCloseOperation(3);

}

public void actionPerformed(ActionEvent ae)
{

		String a = t1.getText();
	 	String b = t2.getText();
	 	String c = t3.getText();
	 	
      if(ae.getSource()==b0)	
		{
       			try
			{

	      			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		 		Connection con = DriverManager.getConnection("Jdbc:Odbc:ASHA-PC","","");

		 		Statement st = con.createStatement();

		 		ResultSet rs = st.executeQuery("select * from birthday where entryid="+a);

		 		if(rs.next())
		 		{
	     				String ai = rs.getString(1);
		 			String bi = rs.getString(2);
		 			String ci = rs.getString(3);
		 			
					t1.setText(ai);
		 			t2.setText(bi);
		 			t3.setText(ci);
		 			
        			}
			}
        		catch(SQLException S)
          		{
                   		l13.setForeground(Color.RED);
				l13.setText("could not connect");
					//y.printStackTrace();
				System.out.println("SQL Exception");
           		}
        		catch(ClassNotFoundException Ex)
         		{
           			l13.setForeground(Color.RED);
            			l13.setText("could not found");
					//y.printStackTrace();
				System.out.println("ClassNotFound Exception");
		 	}
			//dispose();
		}
	


if(ae.getSource()==b1)
{
try
	 {
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		 Connection con = DriverManager.getConnection("Jdbc:Odbc:ASHA-PC","","");

		Statement st = con.createStatement();


		 int z1 = st.executeUpdate("delete from birthday where entryid="+a); 

		 if (z1>0)
              {
			    l13.setText("Deletion Successful");
			}
        }

        catch(SQLException y)
		{
		l13.setText("Could not connect!!");
	System.out.println("SQL exception"+y);
		}
        catch(Exception y){
	l13.setText("Could not connect!!");
	System.out.println("Class not found");
        }


}

if(ae.getSource()==b2)
{

t1.setText("");
t2.setText("");
t3.setText("");

}

if(ae.getSource()==b3)
{
delete o3=new delete();
dispose();
}

}

public static void main(String args[])
{
DeleteB d1=new DeleteB();
}
}