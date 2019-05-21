import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
public class background  implements ActionListener
{
JFrame ff;
JDesktopPane dp;
JInternalFrame i1,i2;
JLabel l,l1;
Font f;
static JTextField t;
JButton b,b1;
background()
{
	try
	{
		for(LookAndFeelInfo info:UIManager.getInstalledLookAndFeels())
		{
			if("Nimbus".equals(info.getName()))
			{
				UIManager.setLookAndFeel(info.getClassName());
				break;
			
			}
		}
	}

	catch(Exception e)
	{
	
	}

	ff=new JFrame();
	ff.setLayout(null);
	dp=new JDesktopPane();
	dp.setSize(1024,768);
	i1=new JInternalFrame("->LOGIN FRAME<-",true,true);
	//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	//i1.setLocation(d.width/2-i1.getSize().width/2,d.height/2-i1.getSize().height/2);
	 i1.setBounds(240,20,480,670);
	 i1.setBackground(Color.white);

	 f=new Font("Algerian",Font.BOLD,20);

	 l=new JLabel("Enter your Name:");
	 l.setBounds(15,100,200,30);
	 l.setFont(f);
	 l.setVisible(true);

	 t= new JTextField();
	 t.setBounds(220,100,230,35);
	 t.setBackground(Color.white);

	 String t1=t.getText();
	 t.setVisible(true);

	 l1=new JLabel("Do you want to play the game??");
	 l1.setFont(f);
	 l1.setBounds(55,200,400,30);
	 l1.setVisible(true);

	 b=new JButton("YES");
	 b.addActionListener(this);
	 b.setBounds(30,290,150,30);
	 b.setVisible(true);

	 b1=new JButton("NO");
	 b1.addActionListener(this);
	 b1.setBounds(30,290,150,30);
	 b1.setVisible(true);

	 i1.add(l);
	 i1.add(t);
	 i1.add(l1);
	 i1.add(b);
	 i1.add(b1);

	i1.setVisible(true);
	dp.add(i1);
	ff.add(dp);
	ff.setSize(1024,768);
	ff.setVisible(true);
	ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
public void actionPerformed(ActionEvent a)
{
	if(a.getSource()==b)
	{    i1.dispose();
	    // JOptionPane.
		new fframe();
	}
  	else
	{    
			ff.dispose();
		
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new background();
	}

}
