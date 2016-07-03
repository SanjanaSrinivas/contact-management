import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;

public class update extends JFrame implements ActionListener 

{
public JPanel p;
public JLabel l1,l2,l3,l4,l5,l6,l7,l13;
public JButton b1,b2,b3,b4,b5,b6;
public GridBagLayout gb1;
public GridBagConstraints gbc;

public update()
{
gb1=new GridBagLayout();
gbc=new GridBagConstraints();
p=new JPanel();
l13=new JLabel();
p.setLayout(gb1);



l1=new JLabel("UPDATE/SEARCH ");
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
addupdate();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

}


public void addupdate()
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

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=100;
gbc.gridx=40;
gbc.gridy=50;
//gbl.setConstraints(l13,gbc);
p.add(l13);

setTitle("UPDATE/SEARCH");
p.setBackground(Color.PINK);
l13.setIcon(new ImageIcon("update.gif"));
setVisible(true);
setSize(1466,729);
setDefaultCloseOperation(3);
Font font = new Font(Font.SERIF, Font.BOLD, 30);
l1.setFont(font);


}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
updatephno o2=new updatephno();
dispose();
//have to call phone number frame
}

if(ae.getSource()==b2)
{
updateadd o3=new updateadd();
dispose();
//have to call address frame
}

if(ae.getSource()==b3)
{
updatemail o3=new updatemail();
dispose();
//have to call email frame
}

if(ae.getSource()==b4)
{
updatebdy o3=new updatebdy();
dispose();
//have to call birthday frame
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
update o3=new update();
//FontSizeDemo i1=new FontSizeDemo();
}
}