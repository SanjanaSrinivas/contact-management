import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{

public JPanel p;
public JLabel l1,l2,l3,l4,l5,l6,l13;
public JTextField t1;
public JPasswordField pf;
public JButton b1,b2,b3;
public GridBagLayout gbl;
public GridBagConstraints gbc;

public Login()
{
//setContentPane(new JLabel(new ImageIcon("3.jpg")));	
//setLayout(new FlowLayout());


gbl=new GridBagLayout();
gbc=new GridBagConstraints();
p=new JPanel();
l13=new JLabel();
p.setLayout(gbl);

l2=new JLabel("Login ID :");
l3=new JLabel("Password :   ");
l4=new JLabel(" ");
l5=new JLabel(" ");
l6=new JLabel(" ");
l1=new JLabel(" ");
t1=new JTextField(20);
pf=new JPasswordField(20);
b1=new JButton("sign in");
b2=new JButton("Back");
b3=new JButton("Exit");

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

addLogin();

}

public void addLogin()
{

getContentPane().add(p);

//gbc.fill=GridBagConstraints.CENTER;
//gbc.ipadx=0;
//gbc.ipady=0;
/*gbc.weightx=0;
gbc.weighty=0;
gbc.gridwidth=0;
gbc.gridheight=0;*/
//gbc.gridx=1;
//gbc.gridy=0;
//gbl.setConstraints(l1,gbc);
//p.add(l1);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=1;
gbl.setConstraints(l4,gbc);
p.add(l4);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=0;
gbc.gridy=2;
gbl.setConstraints(l2,gbc);
p.add(l2);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=5;
gbc.gridx=1;
gbc.gridy=2;
gbl.setConstraints(t1,gbc);
p.add(t1);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=0;
gbc.gridy=3;
gbl.setConstraints(l5,gbc);
p.add(l5);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=0;
gbc.gridy=4;
gbl.setConstraints(l3,gbc);
p.add(l3);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=0;
gbc.ipady=5;
gbc.gridx=1;
gbc.gridy=4;
gbl.setConstraints(pf,gbc);
p.add(pf);

gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=0;
gbc.ipady=15;
gbc.gridx=1;
gbc.gridy=5;
gbl.setConstraints(l6,gbc);
p.add(l6);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipadx=1;
gbc.ipady=100;
gbc.gridx=40;
gbc.gridy=50;
//gbl.setConstraints(l13,gbc);
p.add(l13);

gbc.anchor=GridBagConstraints.WEST;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=1;
gbc.gridy=6;
gbl.setConstraints(b1,gbc);
p.add(b1);

gbc.anchor=GridBagConstraints.CENTER;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=0;
gbc.ipady=0;
gbc.gridx=1;
gbc.gridy=6;
gbl.setConstraints(b2,gbc);
p.add(b2);

gbc.anchor=GridBagConstraints.EAST;
gbc.fill=GridBagConstraints.CENTER;
gbc.ipadx=11;
gbc.ipady=0;
gbc.gridx=1;
gbc.gridy=6;
gbl.setConstraints(b3,gbc);
p.add(b3);

setTitle("Login");
p.setBackground(Color.PINK);
l13.setIcon(new ImageIcon("login.jpg"));
setVisible(true);
setSize(3250,1220);
setDefaultCloseOperation(3);

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String uname=t1.getText();
String password=String.valueOf(pf.getPassword());
if((uname.equals("contact"))&&(password.equals("scratch")))
{
System.out.println("Valid Login Details.");
dispose();
MainForm o3=new MainForm();
}
else
{
l6.setForeground(Color.RED);
l6.setText("Invalid login details !");
System.out.println("Invalid Details");
}
}
if(ae.getSource()==b2)
{
/*l6.setText(" ");
t1.setText("");
pf.setText("");*/
Welcome o2=new Welcome();

}
if(ae.getSource()==b3)
{
System.exit(0);
}
}

public static void main(String args[])
{
Login o2=new Login();
}
}
