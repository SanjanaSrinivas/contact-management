import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;


public class insert extends JFrame implements ActionListener 

{
public JPanel p;
public JLabel l1,l2,l3,l4,l5,l6,l7;
public JButton b1,b2,b3,b4,b5;
public GridBagLayout gb1;
public GridBagConstraints gbc;

public insert()
{
gb1=new GridBagLayout();
gbc=new GridBagConstraints();
p=new JPanel();
p.setLayout(gb1);



l1=new JLabel("INSERT");
l2=new JLabel(" ");
l3=new JLabel(" ");
l4=new JLabel(" ");
l5=new JLabel(" ");
l6=new JLabel(" ");
l7=new JLabel(" ");
b1=new JButton("PHONE NUMBER");
b2=new JButton("ADDRESS");
b3=new JButton("EMAIL");
b4=new JButton("BIRTHDAY");
b5=new JButton("BACK");
addinsert();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);


}


public void addinsert()
{

getContentPane().add(p);

gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=0;
gbc.gridy=0;
gb1.setConstraints(l1,gbc);
p.add(l1);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=0;
gb1.setConstraints(l2,gbc);
p.add(l2);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=100;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=2;
gb1.setConstraints(b1,gbc);
p.add(b1);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=3;
gb1.setConstraints(l3,gbc);
p.add(l3);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=100;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=4;
gb1.setConstraints(b2,gbc);
p.add(b2);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=5;
gb1.setConstraints(l4,gbc);
p.add(l4);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=100;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=6;
gb1.setConstraints(b3,gbc);
p.add(b3);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=7;
gb1.setConstraints(l5,gbc);
p.add(l5);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=100;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=8;
gb1.setConstraints(b4,gbc);
p.add(b4);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=9;
gb1.setConstraints(l6,gbc);
p.add(l6);


gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=100;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=10;
gb1.setConstraints(b5,gbc);
p.add(b5);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=0;
gbc.gridy=11;
gb1.setConstraints(l7,gbc);
p.add(l7);





setTitle("INSERT");
setVisible(true);
setSize(1466,729);
p.setBackground(Color.PINK);
setDefaultCloseOperation(3);
Font font = new Font(Font.SERIF, Font.BOLD, 60);
l1.setFont(font);


}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	
dispose();
insertph i=new insertph();
//i.addComp();
//have to call insert frame
}

if(ae.getSource()==b2)
{
	insertadd i=new insertadd();
	//i.addComp();
dispose();
//have to call update frame
}

if(ae.getSource()==b3)
{
	insertem i=new insertem();
	//i.addComp();
dispose();
//have to call delete frame
}

if(ae.getSource()==b4)
{
	insertbir i=new insertbir();
	//k.addComp();
dispose();
//have to call search frame
}

if(ae.getSource()==b5)
{
MainForm o3=new MainForm();
dispose();
//have to call back frame
}



}



public static void main(String args[])
{
insert o3=new insert();
//FontSizeDemo i1=new FontSizeDemo();
}
}