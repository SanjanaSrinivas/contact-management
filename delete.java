import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;


public class delete extends JFrame implements ActionListener 

{
public JPanel p;
public JLabel l0,l1,l2,l3,l4,l5,l6,l7;
public JButton b1,b2,b3,b4,b5;
public GridBagLayout gb1;
public GridBagConstraints gbc;

public delete()
{
gb1=new GridBagLayout();
gbc=new GridBagConstraints();
p=new JPanel();
l0=new JLabel();
p.setLayout(gb1);



l1=new JLabel("DELETE");
l2=new JLabel(" ");
l3=new JLabel(" ");
l4=new JLabel(" ");
l5=new JLabel(" ");
l6=new JLabel(" ");
l7=new JLabel(" ");
b1=new JButton("PHONE NO");
b2=new JButton("ADDRESS");
b3=new JButton("EMAIL");
b4=new JButton("BIRTHDAY");
b5=new JButton("BACK");

adddelete();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);


}


public void adddelete()
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

gbc.fill=GridBagConstraints.VERTICAL;
gbc.ipadx=0;
gbc.ipady=27;
gbc.gridx=0;
gbc.gridy=27;
//gbl.setConstraints(l0,gbc);
p.add(l0);



p.setBackground(Color.orange);
b5.setBackground(Color.pink);
b4.setBackground(Color.pink);
b1.setBackground(Color.pink);
b2.setBackground(Color.pink);
b3.setBackground(Color.pink);
l0.setIcon(new ImageIcon("trash.jpg"));


setTitle("DELETE");
setVisible(true);
setSize(1466,729);
setDefaultCloseOperation(3);
Font font = new Font(Font.SERIF, Font.BOLD, 50);
l1.setFont(font);


}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{

dispose();
DeletePh d1=new DeletePh();
}

if(ae.getSource()==b2)
{

dispose();
DeleteAdd d1=new DeleteAdd();
}

if(ae.getSource()==b3)
{
dispose();
DeleteEm d1=new DeleteEm();
}

if(ae.getSource()==b4)
{
dispose();
DeleteB d1=new DeleteB();
}

if(ae.getSource()==b5)
{
	MainForm o3=new MainForm();
//dispose();
}


}



public static void main(String args[])
{
delete o3=new delete();
//FontSizeDemo i1=new FontSizeDemo();
}
}