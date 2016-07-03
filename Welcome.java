import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Welcome extends JFrame implements ActionListener
{
	private JPanel p;
	private JLabel l;
	private JButton b1,b2;
	public GridBagLayout gbl;
	public GridBagConstraints gbc;

	public Welcome()
	{
		
		setLayout(new BorderLayout());
    		setContentPane(new JLabel(new ImageIcon("welcome.jpg")));
    		setLayout(new FlowLayout());


		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		p=new JPanel();
		p.setLayout(gbl);
		
		b1=new JButton("Next");
		b2=new JButton("Exit");
		
		addWelcome();

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
		
	public void addWelcome()
	{

		getContentPane().add(p);	
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.ipadx=100;
		gbc.ipady=15;
		gbc.gridx=0;
		gbc.gridy=1;
		
	//b1.setBounds(150,325,75,25);
		
		gbl.setConstraints(b1,gbc);
		p.add(b1);

		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.ipadx=100;
		gbc.ipady=15;
		gbc.gridx=2;
		gbc.gridy=1;
		
	//b2.setBounds(250,325,75,25);

		gbl.setConstraints(b2,gbc);
		p.add(b2);

		setTitle("Welcome");
		p.setBackground(Color.PINK);
		setVisible(true);
		setSize(1000,590);
		setDefaultCloseOperation(3);
	
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Login o2=new Login();
			dispose();
			//have to call LOGIN frame
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}

	}

    
	public static void main(String args[])
	{
		Welcome i1=new Welcome();
	}
}
