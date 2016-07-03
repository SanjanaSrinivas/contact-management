import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
//import java.awt.Font;
public class insertadd extends JFrame implements ActionListener
{
	public JPanel p;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;	
	public JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3;
	GridBagConstraints gbc;	
	GridBagLayout gbl;
	
	public insertadd()	
	{
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		p=new JPanel();
		l13=new JLabel();
		p.setLayout(gbl);

		
		l1=new JLabel("Entry.id:");
		//l2=new JLabel(" ");
		l3=new JLabel("Name:");
		//l4=new JLabel(" ");
		l5=new JLabel("Address:");
		//l6=new JLabel(" ");
		l7=new JLabel("State:");
		//l8=new JLabel(" ");
		l9=new JLabel("Country:");
		//l10=new JLabel(" ");
		l11=new JLabel("Pincode:");
		l12=new JLabel(" ");
				
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);

		b1=new JButton("Insert");
		b2=new JButton("Clear");
		b3=new JButton("Back");
		
		
		addinsertadd();

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	void addinsertadd()
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
/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=4;
gbc.ipady=4;
gbc.gridx=0;
gbc.gridy=4;
gbl.setConstraints(l2,gbc);
p.add(l2);*/

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=5;
gbc.ipady=5;
gbc.gridx=0;
gbc.gridy=5;
gbl.setConstraints(t1,gbc);
p.add(t1);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=6;
gbc.ipady=6;
gbc.gridx=0;
gbc.gridy=6;
gbl.setConstraints(l3,gbc);
p.add(l3);

//getContentPane().add(p);
/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=7;
gbc.ipady=7;
gbc.gridx=0;
gbc.gridy=7;
gbl.setConstraints(l4,gbc);
p.add(l4);*/

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=8;
gbc.ipady=8;
gbc.gridx=0;
gbc.gridy=8;
gbl.setConstraints(t2,gbc);
p.add(t2);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=9;
gbc.ipady=9;
gbc.gridx=0;
gbc.gridy=9;
gbl.setConstraints(l5,gbc);
p.add(l5);

//getContentPane().add(p);
/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=10;
gbc.ipady=10;
gbc.gridx=0;
gbc.gridy=10;
gbl.setConstraints(l6,gbc);
p.add(l6);*/

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=11;
gbc.ipady=11;
gbc.gridx=0;
gbc.gridy=11;
gbl.setConstraints(t3,gbc);
p.add(t3);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=12;
gbc.ipady=12;
gbc.gridx=0;
gbc.gridy=12;
gbl.setConstraints(l7,gbc);
p.add(l7);

//getContentPane().add(p);
/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=13;
gbc.ipady=13;
gbc.gridx=0;
gbc.gridy=13;
gbl.setConstraints(l8,gbc);
p.add(l8);*/

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=14;
gbc.ipady=14;
gbc.gridx=0;
gbc.gridy=14;
gbl.setConstraints(t4,gbc);
p.add(t4);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=15;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=15;
gbl.setConstraints(l9,gbc);
p.add(l9);

//getContentPane().add(p);
/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=16;
gbc.ipady=16;
gbc.gridx=0;
gbc.gridy=16;
gbl.setConstraints(l10,gbc);
p.add(l10);*/

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=17;
gbc.ipady=17;
gbc.gridx=0;
gbc.gridy=17;
gbl.setConstraints(t5,gbc);
p.add(t5);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=18;
gbc.ipady=18;
gbc.gridx=0;
gbc.gridy=18;
gbl.setConstraints(l11,gbc);
p.add(l11);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=19;
gbc.ipady=19;
gbc.gridx=0;
gbc.gridy=19;
gbl.setConstraints(l12,gbc);
p.add(l12);

//getContentPane().add(p);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=20;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=20;
gbl.setConstraints(t6,gbc);
p.add(t6);


//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.WEST;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=21;
gbl.setConstraints(b1,gbc);
p.add(b1);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.CENTER;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=22;
gbl.setConstraints(b2,gbc);
p.add(b2);

//getContentPane().add(p);
//gbc.anchor=GridBagConstraints.EAST;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=23;
gbl.setConstraints(b3,gbc);
p.add(b3);

/*getContentPane().add(p);
//gbc.anchor=GridBagConstraints.NORTH;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=1;
gbc.gridx=1;
gbc.gridy=24;
gbl.setConstraints(b4,gbc);
p.add(b4);*/

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=10;
gbc.gridx=40;
gbc.gridy=50;
gbl.setConstraints(l13,gbc);
p.add(l13);
		
		p.setBackground(Color.PINK);
		b1.setBackground(Color.GRAY);
		b2.setBackground(Color.GRAY);
		b3.setBackground(Color.GRAY);
		
				
		l13.setIcon(new ImageIcon("ad1.jpg"));
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
		String e = t5.getText();
	 	String f = t6.getText();
		
		String var = ae.getActionCommand();

	 if(var=="Insert")
	   {
	   try
	   {
	     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	Connection con = DriverManager.getConnection("Jdbc:Odbc:ASHA-PC","","");

		 PreparedStatement st = con.prepareStatement("insert into address values(?,?,?,?,?,?)");
		 st.setString(1,a);
		 st.setString(2,b);
		 st.setString(3,c);
		 st.setString(4,d);
		 st.setString(5,e);
		 st.setString(6,f);
		 int z = st.executeUpdate();

		 if (z>0)
              {
			    l12.setText("Insertion Successful");
			}
        }

        catch(SQLException y)
          {	
            l12.setText("could not connect");
		System.out.println("SQL exception occured");
           }
        catch(ClassNotFoundException y)
         {
                   l12.setText("could not found");
			//y.printStackTrace();
		System.out.println("ClassnotFound exception occured");
		 }

	 }


	 if(ae.getSource()==b2)
       		{
		 t1.setText("");
		 t2.setText("");
		 t3.setText("");
		 t4.setText("");
		 t5.setText("");
		 t6.setText("");
		
		}
		if(var.equals("Back"))
        	{
		insert o2=new insert();
		}
	}
	public static void main(String args[])
	{
		insertadd i=new insertadd();
		
	}
}