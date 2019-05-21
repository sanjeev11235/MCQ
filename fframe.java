import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;

public class fframe implements ActionListener 
{


	JFrame f;
	JLabel l1, l2, l3, l6, l5, l4;
	JButton b1;
	Font fo, f1;

	fframe() 
	{
		try 
		{
			for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
			{
				if ("Nimbus".equals(info.getName())) 
				{
					UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		}

		catch (Exception e) 
		{

		}
		
		f = new JFrame("RULES");
		f.setLayout(null);
		// f.setOpacity(1.2f);
		fo = new Font("Rockwell Extra Bold", Font.BOLD, 35);
		l1 = new JLabel("INSTRUCTIONS");
		l1.setFont(fo);
		l1.setBounds(240, 30, 350, 70);
		l1.setForeground(Color.blue);
		l2 = new JLabel("* All Participants must have the knowledge of JAVA");
		f1 = new Font("Lucida Sans", Font.BOLD, 16);
		l2.setFont(f1);
		l2.setBounds(20, 120, 530, 50);
		l3 = new JLabel(
				"* Once the question is answered right that money is safe.");
		l3.setFont(f1);
		l3.setBounds(20, 180, 550, 80);
		l4 = new JLabel(
				"* The money won after each question is roughly doubled from the previous amount won.");
		l4.setFont(f1);
		l4.setBounds(20, 240, 900, 110);
		l5 = new JLabel(
				"* A PARTICIPANT can use a lifeline when he/she is uncertain about his/her answer. ");
		l5.setFont(f1);
		l5.setBounds(20, 300, 1000, 140);
		l6 = new JLabel("* A lifeline can only be used once.  ");
		l6.setFont(f1);
		l6.setBounds(20, 360, 900, 170);
		b1 = new JButton(" ARE U READY........!!! ");
		b1.setFont(fo);
		b1.setBounds(120, 550, 550, 70);
		b1.addActionListener(this);

		/*
		 * Runnable r = new Runnable() { public void run() { pb.setMaximum(100);
		 * int i=1; while(true) { setValue(i++); try { Thread.sleep(10,000); }
		 * catch(Exception e) {} if() { f.dispose();
		 * 
		 * 
		 * } } }
		 * 
		 * };
		 * 
		 * new Thread (r).start();
		 */

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(b1);

		f.setBounds(120, 25, 790, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent a) 
	{
		if (a.getSource() == b1)
		{
		 	f.dispose();
		 	new mainform().read();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new fframe();
	}

}
