import java.util.Collections;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainform implements ActionListener
{
	ArrayList<Integer> numbers=null;
	static String ques[] = new String[50];
	static String a[] = new String[50];
	static String b[] = new String[50];
	static String c[] = new String[50];
	static String d[] = new String[50];
	static String answer[] = new String[50];
	int[] prize={0,1000,3000,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,20000000};
	int incre=1,incre_num=0;
	static JFrame f2;
	JPanel p1, p2, p3;
	JLabel l1,l2,l3;
	static JLabel l4,l5,l6,l7;
	JLabel L1, L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15;
	ButtonGroup bg;
	static JRadioButton r1,r2,r3,r4;
	JButton b1, b2, b3, b4;
	Font f,f4;
	public static Boolean flag=true;
	mainform() 
	{
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		}

		catch (Exception e) {	}
		
		f = new Font("Algerian", Font.BOLD, 20);
		f2 = new JFrame("MAIN FRAME");
		f2.setLayout(null);
		
		// panel 1 code
		p1 = new JPanel();
		p1.setLayout(null);
		l1 = new JLabel("WELCOME TO JAVA QUIZ - GAME");
		l1.setBackground(Color.red);
		l1.setBounds(70, 50, 500, 20);
		l1.setFont(f);	
		l4 = new JLabel("TIME - 00:00");
		l4.setFont(f);
		l4.setBounds(240, 120, 200, 30);
		b1 = new JButton("START");
		b1.setBounds(20, 120, 200, 30);
		b1.setBackground(Color.gray);
		b1.addActionListener(this);

		p1.add(l1);
		p1.add(l4);
		p1.add(b1);
		p1.setBackground(new Color(255,158,61));
		p1.setBounds(10, 90, 560, 200);
		p1.setVisible(true);
		
		// panel 2 code
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10, 320, 850, 350);
		p2.setBackground(new Color(255,255,204)); 
		p2.setVisible(true);
		
		// panel 3 code
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1,3,10,10));
		
		b2 = new JButton("50-50");
		f4 = new Font("Algerian", Font.BOLD, 15);
		b2.setFont(f4);
		b2.addActionListener(this);
		b3 = new JButton("SKIP");
		b3.setSize(30,40);
		b3.setFont(f4);
		b3.addActionListener(this);
		b4 = new JButton("PHONE-O-FRIEND");
		b4.setSize(30,40);
		b4.setFont(f4);
		b4.addActionListener(this);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.setBounds(590, 100, 400, 150);
		p3.setBackground(Color.white);
		p3.setVisible(true);
		
		L15 = new JLabel("2,00,00,000");
		L15.setFont(f4);
		L15.setBounds(900, 200, 200, 200);
		L15.setBackground(Color.blue);
		L15.setVisible(true);
		L14 = new JLabel("1,00,00,000");
		L14.setBounds(900, 220, 200, 200);
		L14.setFont(f4);
		L14.setVisible(true);
		L13 = new JLabel("50,00,000");
		L13.setBounds(900, 240, 200, 200);
		L13.setFont(f4);
		L13.setVisible(true);
		L12 = new JLabel("25,00,000");
		L12.setBounds(900, 260, 200, 200);
		L12.setFont(f4);
		L12.setVisible(true);
		L11 = new JLabel("12,50,000");
		L11.setBounds(900, 280, 200, 200);
		L11.setFont(f4);
		L11.setVisible(true);
		L10 = new JLabel("6,40,000");
		L10.setBounds(900, 300, 200, 200);
		L10.setFont(f4);
		L10.setVisible(true);
		L9 = new JLabel("3,20,000");
		L9.setBounds(900, 320, 200, 200);
		L9.setFont(f4);
		L9.setVisible(true);
		L8 = new JLabel("1,60,000");
		L8.setBounds(900, 340, 200, 200);
		L8.setFont(f4);
		L8.setVisible(true);
		L7 = new JLabel("80,000");
		L7.setBounds(900, 360, 200, 200);
		L7.setFont(f4);
		L7.setVisible(true);
		L6 = new JLabel("40,000");
		L6.setBounds(900, 380, 200, 200);
		L6.setFont(f4);
		L6.setVisible(true);
		L5 = new JLabel("20,000");
		L5.setBounds(900, 400, 200, 200);
		L5.setFont(f4);
		L5.setVisible(true);
		L4 = new JLabel("10,000");
		L4.setBounds(900, 420, 200, 200);
		L4.setFont(f4);
		L4.setVisible(true);
		L3 = new JLabel("5,000");
		L3.setBounds(900, 440, 200, 200);
		L3.setFont(f4);
		L3.setVisible(true);
		L2 = new JLabel("3,000");
		L2.setBounds(900, 460, 200, 200);
		L2.setFont(f4);
		L2.setVisible(true);
		L1 = new JLabel("1,000");
		L1.setBounds(900, 480, 200, 200);
		L1.setFont(f4);
		L1.setVisible(true);
		
		//adding panel 1 in frame
		f2.add(p1);
		//adding panel 2 in frame
		f2.add(p2);
		//adding panel 3 in frame
		f2.add(p3);
		
		f2.add(L1);
		f2.add(L2);
		f2.add(L3);
		f2.add(L4);
		f2.add(L5);
		f2.add(L6);
		f2.add(L7);
		f2.add(L8);
		f2.add(L9);
		f2.add(L10);
		f2.add(L11);
		f2.add(L12);
		f2.add(L13);
		f2.add(L14);
		f2.add(L15);
		
		f2.setSize(1024, 768);
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Randomization............!
		
		 numbers = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++)
        {
			numbers.add(i+1);
		}
 
		Collections.shuffle(numbers);
	
	}

	public void actionPerformed(ActionEvent e) 
	{

		if (e.getSource() == b1) 
		{
			System.out.println("Button 1 clicked");
			b1.setEnabled(false);
			//starting timer thread.
			new Thread(new time(),"Time Thread").start();
			
			l2 = new JLabel("ques");
			l2.setForeground(Color.blue);
			l2.setBounds(20, 10, 800, 30);
			l3 = new JLabel("OPTIONS:");
			l3.setBounds(20, 25, 450, 30);
			//l3.setForeground(Color.blue);
			l3.setFont(f);
			
			l5 = new JLabel("");
			l5.setFont(f);
			l5.setBounds(300, 100, 450, 30);
			l5.setVisible(false);
			
			l6 = new JLabel("");
			l6.setFont(f);
			l6.setBounds(300, 140, 450, 30);
			l6.setVisible(false);
			
			l7 = new JLabel("");
			l7.setFont(f);
			l7.setBounds(300, 160, 450, 30);
			l7.setVisible(false);
			
			bg = new ButtonGroup();
			r1 = new JRadioButton();
			r1.addActionListener(this);
			r1.setBounds(20,100,350,30);
			r2 = new JRadioButton();
			r2.addActionListener(this);
			r2.setBounds(20,140,350,30);
			r3 = new JRadioButton();
			r3.addActionListener(this);
			r3.setBounds(20,180,350,30);
			r4 = new JRadioButton();
			r4.addActionListener(this);
			r4.setBounds(20,220,350,30);
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			bg.add(r4);
			p2.add(l2);
			p2.add(l3);
			p2.add(r1);
			p2.add(r2);
			p2.add(r3);
			p2.add(r4);
			p2.add(l5);
			p2.add(l6);
			p2.add(l7);
			
			System.out.println("no generated is : "+numbers.get(incre_num));
			l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)-1]);
			r1.setText(a[numbers.get(incre_num)-1]);
			r2.setText(b[numbers.get(incre_num)-1]);
			r3.setText(c[numbers.get(incre_num)-1]);
			r4.setText(d[numbers.get(incre_num)-1]);
			
		}
		
		else if(e.getSource()==b2) 
		{
				System.out.println("Button 2 clicked");
				if(r1.getLabel().equals(answer[numbers.get(incre_num)]))
						
						{   
							r1.setText(a[numbers.get(incre_num)-1]);
							r2.setText(b[numbers.get(incre_num)-1]);
							r3.setText("");
							r4.setText("");
						}  
						
			   else if(r2.getLabel().equals(answer[numbers.get(incre_num)]))
				{
						
							r1.setText("");
		                    r2.setText(a[numbers.get(incre_num)-1]);
							r3.setText(b[numbers.get(incre_num)-1]);
		                    r4.setText("");
				}
			
				else if(r3.getLabel().equals(answer[numbers.get(incre_num)]))
				{
						
							r1.setText("");
		                    r2.setText(a[numbers.get(incre_num)-1]);
							r3.setText("");
		                    r4.setText(a[numbers.get(incre_num)-1]);
				}
				
				else if(r4.getLabel().equals(answer[numbers.get(incre_num)]))
				{
						
							r1.setText("");
		                    r2.setText("");
							r3.setText(a[numbers.get(incre_num)-1]);
		                    r4.setText(a[numbers.get(incre_num)-1]);
				}
			
		        b3.setEnabled(false);	
			}
		
		else if (e.getSource() == b3)
		{
			System.out.println("Button 3 clicked");
			
			incre_num++;
			System.out.println("no generated is : "+numbers.get(incre_num));
			l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)]);
			r1.setText(a[numbers.get(incre_num)]);
			r2.setText(b[numbers.get(incre_num)]);
			r3.setText(c[numbers.get(incre_num)]);
			r4.setText(d[numbers.get(incre_num)]);
			bg.clearSelection();
			b3.setEnabled(false);
		}
		
		if(r1.isSelected()==true)
		{
			
			int s=JOptionPane.showConfirmDialog(null,"Do you want to lock this answer?","Confirm - Lock",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
			if(s==0)
			{
				System.out.println("Value r1.get label is :"+r1.getLabel());
				System.out.println("Value k...:"+answer[numbers.get(incre_num)-1]);
				if(r1.getLabel().equals(answer[numbers.get(incre_num)-1]))
				{
				JOptionPane.showMessageDialog(f2, "You Won:"+prize[incre]);
				bg.clearSelection();
					if(incre==1)
					{
					L1.setForeground(Color.green);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.green);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.green);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.green);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.green);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.green);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.green);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.green);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.green);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.green);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.green);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.green);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.green);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.green);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.green);
					}
				
				incre_num++;
				incre++;
					if(incre<=15)
					{
					System.out.println("no generated is : "+numbers.get(incre_num));
					l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)-1]);
					r1.setText(a[numbers.get(incre_num)-1]);
					r2.setText(b[numbers.get(incre_num)-1]);
					r3.setText(c[numbers.get(incre_num)-1]);
					r4.setText(d[numbers.get(incre_num)-1]);
					}
					else
					{
					JOptionPane.showMessageDialog(f2,new String("Congratulations........!\nU Win the Game.........!"));
					f2.dispose();
					}
				}	
				else
				{
			
				JOptionPane.showMessageDialog(f2,new String("Oh No...You Lose -" + prize[incre]+" /-Rs."));
				mainform.flag=false;
				l2.setVisible(false);
				l3.setVisible(false);
				r1.setVisible(false);
				r2.setVisible(false);
				r3.setVisible(false);
				r4.setVisible(false);
				l5.setText("Dear. "+background.t.getText());
				l5.setVisible(true);
				l6.setText("U had Won "+ prize[incre-1]+" /-Rs.");
				l6.setVisible(true);
				l7.setText("U have Taken - "+String.valueOf(time.min)+"min. : "+String.valueOf(time.sec)+"sec. Time.");
				l7.setVisible(true);
				//f2.dispose();
					if(incre==1)
					{
					L1.setForeground(Color.red);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.red);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.red);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.red);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.red);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.red);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.red);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.red);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.red);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.red);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.red);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.red);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.red);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.red);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.red);
					}
				
				}
			}
			
			
		}
		else if(r2.isSelected()==true)
		{
			int s=JOptionPane.showConfirmDialog(null,"Do you want to lock this answer?","Confirm - Lock",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
			if(s==0)
			{
				
				System.out.println("Value r1.get label is :"+r2.getLabel());
				System.out.println("Value k:"+answer[numbers.get(incre_num)-1]);
				if(r2.getLabel().equals(answer[numbers.get(incre_num)-1]))
				{
					JOptionPane.showMessageDialog(f2, "You Won:"+prize[incre]);
					bg.clearSelection();
					if(incre==1)
					{
					L1.setForeground(Color.green);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.green);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.green);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.green);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.green);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.green);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.green);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.green);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.green);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.green);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.green);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.green);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.green);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.green);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.green);
					}
				
				
					incre_num++;
					incre++;
					if(incre<=15)
					{
					System.out.println("no generated is : "+numbers.get(incre_num));
					l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)-1]);
					r1.setText(a[numbers.get(incre_num)-1]);
					r2.setText(b[numbers.get(incre_num)-1]);
					r3.setText(c[numbers.get(incre_num)-1]);
					r4.setText(d[numbers.get(incre_num)-1]);
					}
					else
					{
					JOptionPane.showMessageDialog(f2,new String("Congratulations........!\nU Win the Game.........!"));
					f2.dispose();
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(f2,new String("Oh No...You Lose -" + prize[incre]+" /-Rs."));
					mainform.flag=false;
					l2.setVisible(false);
					l3.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
					r3.setVisible(false);
					r4.setVisible(false);
					l5.setText("Dear. "+background.t.getText());
					l5.setVisible(true);
					l6.setText("U had Won "+ prize[incre-1]+" /-Rs.");
					l6.setVisible(true);
					l7.setText("U have Taken - "+String.valueOf(time.min)+"min. : "+String.valueOf(time.sec)+"sec. Time.");
					l7.setVisible(true);
					
					//f2.dispose();
					if(incre==1)
					{
					L1.setForeground(Color.red);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.red);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.red);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.red);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.red);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.red);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.red);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.red);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.red);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.red);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.red);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.red);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.red);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.red);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.red);
					}	
				}
			}
		}
		else if(r3.isSelected()==true)
		{
			int s=JOptionPane.showConfirmDialog(null,"Do you want to lock this answer?","Confirm - Lock",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
			if(s==0)
			{
				System.out.println("Value r1.get label is :"+r3.getLabel());
				System.out.println("Value k:"+answer[numbers.get(incre_num)-1]);
				if(r3.getLabel().equals(answer[numbers.get(incre_num)-1]))
				{
					JOptionPane.showMessageDialog(f2, "You Won:"+prize[incre]);
					bg.clearSelection();
					if(incre==1)
					{
					L1.setForeground(Color.green);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.green);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.green);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.green);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.green);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.green);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.green);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.green);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.green);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.green);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.green);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.green);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.green);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.green);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.green);
					}
				
				
					incre_num++;
					incre++;
					if(incre<=15)
					{
					System.out.println("no generated is : "+numbers.get(incre_num));
					l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)-1]);
					r1.setText(a[numbers.get(incre_num)-1]);
					r2.setText(b[numbers.get(incre_num)-1]);
					r3.setText(c[numbers.get(incre_num)-1]);
					r4.setText(d[numbers.get(incre_num)-1]);
					}
					else
					{
					JOptionPane.showMessageDialog(f2,new String("Congratulations........!\nU Win the Game.........!"));
					f2.dispose();
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(f2,new String("Oh No...You Lose -" + prize[incre]+" /-Rs."));
					mainform.flag=false;
					l2.setVisible(false);
					l3.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
					r3.setVisible(false);
					r4.setVisible(false);
					l5.setText("Dear. "+background.t.getText());
					l5.setVisible(true);
					l6.setText("U had Won "+ prize[incre-1]+" /-Rs.");
					l6.setVisible(true);
					l7.setText("U have Taken - "+String.valueOf(time.min)+"min. : "+String.valueOf(time.sec)+"sec. Time.");
					l7.setVisible(true);
					//f2.dispose();
					if(incre==1)
					{
					L1.setForeground(Color.red);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.red);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.red);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.red);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.red);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.red);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.red);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.red);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.red);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.red);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.red);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.red);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.red);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.red);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.red);
					}	
				}	
			}
		}
		else if(r4.isSelected()==true)
		{
			int s=JOptionPane.showConfirmDialog(null,"Do you want to lock this answer?","Confirm - Lock",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null);
			if(s==0)
			{
			
				System.out.println("Value r1.get label is :"+r4.getLabel());
				System.out.println("Value k:"+answer[numbers.get(incre_num)-1]);
				if(r4.getLabel().equals(answer[numbers.get(incre_num)-1]))
				{
					JOptionPane.showMessageDialog(f2, "You Won:"+prize[incre]);
					bg.clearSelection();
					if(incre==1)
					{
					L1.setForeground(Color.green);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.green);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.green);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.green);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.green);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.green);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.green);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.green);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.green);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.green);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.green);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.green);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.green);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.green);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.green);
					}
				
				
					incre_num++;
					incre++;
					if(incre<=15)
					{
					System.out.println("no generated is : "+numbers.get(incre_num));
					l2.setText("Q. "+incre+" "+ques[numbers.get(incre_num)-1]);
					r1.setText(a[numbers.get(incre_num)-1]);
					r2.setText(b[numbers.get(incre_num)-1]);
					r3.setText(c[numbers.get(incre_num)-1]);
					r4.setText(d[numbers.get(incre_num)-1]);
					}
					else
					{
					JOptionPane.showMessageDialog(f2,new String("Congratulations........!\nU Win the Game.........!"));
					f2.dispose();
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(f2,new String("Oh No...You Lose -" + prize[incre]+" /-Rs."));
					flag=false;
					l2.setVisible(false);
					l3.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
					r3.setVisible(false);
					r4.setVisible(false);
					l5.setText("Dear. "+background.t.getText());
					l5.setVisible(true);
					l6.setText("U had Won "+ prize[incre-1]+" /-Rs.");
					l6.setVisible(true);
					l7.setText("U have Taken - "+String.valueOf(time.min)+"min. : "+String.valueOf(time.sec)+"sec. Time.");
					l7.setVisible(true);
					//f2.dispose();
					if(incre==1)
					{
					L1.setForeground(Color.red);
					}
					else if(incre==2)
					{
					L2.setForeground(Color.red);
					}
					else if(incre==3)
					{
					L3.setForeground(Color.red);
					}
					else if(incre==4)
					{
					L4.setForeground(Color.red);
					}
					else if(incre==5)
					{
					L5.setForeground(Color.red);
					}
					else if(incre==6)
					{
					L6.setForeground(Color.red);
					}
					else if(incre==7)
					{
					L7.setForeground(Color.red);
					}
					else if(incre==8)
					{
					L8.setForeground(Color.red);
					}
					else if(incre==9)
					{
					L9.setForeground(Color.red);
					}
					else if(incre==10)
					{
					L10.setForeground(Color.red);
					}
					else if(incre==11)
					{
					L11.setForeground(Color.red);
					}
					else if(incre==12)
					{
					L12.setForeground(Color.red);
					}
					else if(incre==13)
					{
					L13.setForeground(Color.red);
					}
					else if(incre==14)
					{
					L14.setForeground(Color.red);
					}
					else if(incre==15)
					{
					L15.setForeground(Color.red);
					}
				}
			}
			
		}	
	
	}

	void read()
	{
		int ix=0;
		
		// data from questions1.txt file
		BufferedReader br[] = new BufferedReader[1];
		String temptemp[][] = new String[1][50];
		try
		{
			System.out.println("in try");
			br[0] = new BufferedReader(new FileReader("F:\\proj\\src\\questions1.txt"));
		} catch (FileNotFoundException fnfe) {System.out.println("file not found");}
		
		
		for (int j = 0; j < 50; j++)
		{
			try
				{
					temptemp[ix][j] = br[ix].readLine();
				} catch (IOException ioe) 
				{
					System.out.println("IOException occured");
				}
		}
		ques = temptemp[0];
		
		// data from a.txt file
		BufferedReader br1[] = new BufferedReader[1];
		String temptemp1[][] = new String[1][50];
		try

		{
			System.out.println("in try mmmmm");
			br1[0] = new BufferedReader(new FileReader("F:\\proj\\src\\a.txt"));
		} catch (FileNotFoundException fnfe) {System.out.println("file not found");}
		
		for (int j = 0; j < 50; j++) 
		{
				try 
				{
					temptemp1[ix][j] = br1[ix].readLine();
				} catch (IOException ioe)
				{
					System.out.println("IOException occured");
				}
			}
		
		a = temptemp1[0];
		
		
		// data from b.txt file
		BufferedReader br2[] = new BufferedReader[1];
		String temptemp2[][] = new String[1][50];
		try

		{
			System.out.println("in try");
			br2[0] = new BufferedReader(new FileReader("F:\\proj\\src\\b.txt"));

		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		}
		
			for (int j = 0; j < 50; j++) {
				try {
					temptemp2[ix][j] = br2[ix].readLine();
				} catch (IOException ioe) {System.out.println("IOException occured");}
			}
		
		b = temptemp2[0];
		
		// data from c.txt file
		BufferedReader br3[] = new BufferedReader[1];
		String temptemp3[][] = new String[1][50];
		try

		{
			System.out.println("in try");
			br3[0] = new BufferedReader(new FileReader("F:\\proj\\src\\c.txt"));

		} catch (FileNotFoundException fnfe) {System.out.println("file not found");}
		
			for (int j = 0; j < 50; j++)
			{
				try {
					temptemp3[ix][j] = br3[ix].readLine();
				} catch (IOException ioe) {System.out.println("IOException occured");}
			}
		
		c = temptemp3[0];
		
		// data from d.txt file
		BufferedReader br4[] = new BufferedReader[1];
		String temptemp4[][] = new String[1][50];
		try

		{
			System.out.println("in try");
			br4[0] = new BufferedReader(new FileReader("F:\\proj\\src\\d.txt"));

		} catch (FileNotFoundException fnfe) {System.out.println("file not found");}
		
			for (int j = 0; j < 50; j++) {
				try {
					temptemp4[ix][j] = br4[ix].readLine();
				} catch (IOException ioe) {System.out.println("IOException occured");}
			}
		
		d = temptemp4[0];
	
		// data from answers.txt file
		BufferedReader br5[] = new BufferedReader[1];
		String temptemp5[][] = new String[1][50];
		try

		{
			System.out.println("in try");
			br5[0] = new BufferedReader(new FileReader("F:\\proj\\src\\answers.txt"));

		} catch (FileNotFoundException fnfe) {System.out.println("file not found");}
		
			for (int j = 0; j < 50; j++) {
				try {
					temptemp5[ix][j] = br5[ix].readLine();
				} catch (IOException ioe) {System.out.println("IOException occured");}
			}
		
		answer = temptemp5[0];
		//end of read method.
	}	
	
}
class time implements Runnable
{
				int time=30;
				static int min=0;
				static int sec=0;
	public void run() 
	{
				
				while(mainform.flag)
				{
					try
					{
						sec++;			
						if(sec==60)
						{
						min++;
						sec=0;
						mainform.l4.setText("TIME - "+String.valueOf(min)+" : "+String.valueOf(sec));
						sec++;
						}
						else
						{
						mainform.l4.setText("TIME - "+String.valueOf(min)+" : "+String.valueOf(sec));
						}
						Thread.sleep(1000);
						if(!mainform.flag.equals(true))break;
					}
					catch(Exception e){}
        			if(min==time)
					{
					JOptionPane.showMessageDialog(mainform.f2, "U r time is over......!\nGame is Finished.......!");
					mainform.f2.dispose();
					break;
					}
				}	
	}
}
