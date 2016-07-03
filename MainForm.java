import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;


public class MainForm extends JFrame implements ActionListener 

{
public JPanel p;
public JLabel l1,l2,l3,l4,l5,l6,l13;
public JButton b1,b2,b3,b4;
public GridBagLayout gb1;
public GridBagConstraints gbc;

public MainForm()
{
//setContentPane(new JLabel(new ImageIcon("main.jpg")));
//setLayout(new FlowLayout());

gb1=new GridBagLayout();
gbc=new GridBagConstraints();
//l13=new JLabel();
p=new JPanel();
p.setLayout(gb1);

l1=new JLabel("MAIN MENU");
l2=new JLabel(" ");
l3=new JLabel(" ");
l4=new JLabel(" ");
l5=new JLabel(" ");
l6=new JLabel(" ");

b1=new JButton("INSERT");
b2=new JButton("UPDATE/SEARCH");
b3=new JButton("DELETE");
b4=new JButton("BACK");


addMainForm();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


}


public void addMainForm()
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

/*gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=100;
gbc.gridx=40;
gbc.gridy=150;
//gbl.setConstraints(l13,gbc);
p.add(l13);*/


setTitle("MAIN MENU");
p.setBackground(Color.PINK);
//l13.setIcon(new ImageIcon("main.jpg"));
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
insert o3=new insert();
dispose();
//have to call insert frame
}

if(ae.getSource()==b2)
{
update o3=new update();
dispose();
//have to call update frame
}

if(ae.getSource()==b3)
{
	delete o3=new delete();
dispose();
//have to call delete frame
}

if(ae.getSource()==b4)
{
Login o2=new Login();
dispose();
//have to call LOGIN frame
}

}

public static void main(String args[])
{
MainForm o3=new MainForm();
//FontSizeDemo i1=new FontSizeDemo();
}
}