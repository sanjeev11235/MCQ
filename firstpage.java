import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
public class firstpage  
{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5,lblimg,l6,l7;
	JProgressBar pb;
	Font f,f2;
	ImageIcon i1;
    firstpage()
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
		{}

		f1=new JFrame();
		f1.setLayout(null);
		f1.setSize(1024, 500);
		i1=new ImageIcon("new.jpg");
		lblimg=new JLabel("",i1,JLabel.CENTER);
		f1.add(lblimg); 
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);
		lblimg.setBounds(0,0,1024,768);
		l1=new JLabel("MCQ");
		l2=new JLabel("ON");
		l3=new JLabel("JAVA");
		l4=new JLabel("MADE BY:");
		//l5=new JLabel("HIMANSHU");
		//l6=new JLabel("ZEYA");
		l7=new JLabel("SANJEEV");
		f=new Font("Algerian",Font.BOLD,55);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		//l5.setFont(f);
		//l6.setFont(f);
		l7.setFont(f);
		l1.setForeground(Color.orange);
		l2.setForeground(Color.orange);
		l3.setForeground(Color.orange);
		l4.setForeground(Color.blue);
		//l5.setForeground(Color.blue);
		//l6.setForeground(Color.blue);
		l7.setForeground(Color.blue);
		l1.setBounds(430,50,500,80);
		l2.setBounds(445,160,450,80);
		l3.setBounds(400,280,450,80);
		l4.setBounds(700,480,450,80);
		//l5.setBounds(600,560,550,50);
		//l6.setBounds(600,600,500,100);
		l7.setBounds(600,660,500,100);
		lblimg.add(l1);
		lblimg.add(l2);
		lblimg.add(l3);
		lblimg.add(l4);
		//lblimg.add(l5);
		//lblimg.add(l6);
		lblimg.add(l7);
		pb= new JProgressBar();
		pb.setBounds(300,410,350,30);
		pb.setBackground(Color.green);
		lblimg.add(pb);
		f1.setVisible(true);
		Runnable r = new Runnable()
		{
           public void run()
   		   {
				pb.setMaximum(100);
				int i=1;
				while(true)
				{
           			pb.setValue(i++);
           			try
           			{
               				Thread.sleep(50);                        
					}
					catch(Exception e)
					{}
					if(i==100)
					{
					f1.dispose();
					new background();
					}
				}
			}
        };
		new Thread (r).start();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) 
	{
	  new firstpage();	
	}
}
