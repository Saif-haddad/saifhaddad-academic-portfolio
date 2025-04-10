package event_driven_3;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
public class EventMashine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("The Menu");
		frame.setSize(400,1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	
		
		Font font = new Font("Arial",Font.CENTER_BASELINE, 17);
		Font font2 = new Font("Arial",Font.BOLD, 14);
		
		
	    JLabel label = new JLabel("Please choose you ordeer from the current options!!:");
		frame.add(label);
		label.setBounds(20,50, 500, 60);
	    label.setBackground(Color.blue);
	    label.setForeground(Color.RED);
	    label.setFont(font);
	    
	    
		JButton button1 = new JButton("Esspresso");
		frame.add(button1);
		button1.setBounds(120,100, 150,60);
		button1.setFont(font2);
		button1.setBackground(Color.black);
	   

		
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFrame frame2 = new JFrame("your order is Espresso");
				        frame2.setSize(500, 500);
						frame2.setVisible(true);
						frame2.setLayout(null);
				
						JLabel label2 = new JLabel("Do you want Milk???");
						frame2.add(label2);
						label2.setBounds(170, 50, 500, 60);
						label2.setFont(font);
						
				JButton button5 = new JButton("Yes");
				frame2.add(button5);
				button5.setBounds(150, 130, 100, 50);
				button5.setFont(font2);
				

				button5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						System.out.println("Your order is Espresso with Milk");
						
						
					
					}
				});
//				
				JButton button6 = new JButton("NO");
				frame2.add(button6);
				button6.setBounds(250,130, 100, 50);
				button6.setFont(font2);

				button6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						System.out.println("Your order is Espresso without Milk");
						
						
						
					}
				});
				
				JLabel label3 = new JLabel("press press the Enter key to confirm");
				frame2.add(label3);
				label3.setBounds(170,200, 500, 60);
				label3.setFont(font);
				
				JButton button20 = new JButton("confirm");
				frame2.add(button20);
				button20.setBounds(250,330, 100, 50);
				button20.setFont(font2);
				
				button20.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Thank you for palcing your order..........");
						System.out.println("Have a nice day :)");
						
					}
				});
			}
		});
		
		button1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("released");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("pressed");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				 button1.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				 button1.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("clicked");
				
			}
		});
		
		
//		
		JButton button2 = new JButton("Cappuccino");
		frame.add(button2);
		button2.setBounds(120, 200, 150, 60);
		button2.setFont(font2);
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame frame3 = new JFrame("Your order is Cappuccino");
				frame3.setSize(500, 500);
				frame3.setVisible(true);
				frame3.setLayout(null);
				
				JLabel label3 = new JLabel("Do you want Suger??");
				label3.setBounds(170, 50, 500, 60);
				label3.setFont(font);
				frame3.add(label3);
				
				
				JButton button7 = new JButton("Yes");
				frame3.add(button7);
				button7.setBounds(150, 130, 100, 50);
				button7.setFont(font2);
				
				button7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					
						System.out.println("Your order is Cappuccino with Suger");
						
					
						
					}
				});
//				
//						
				JButton button8 = new JButton("no");
				frame3.add(button8);
				button8.setBounds(250,130,100,50);
				button8.setFont(font2);
				
				button8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						System.out.println("Your order is Cappuccino without Suger");
						
					
						
					}
				});
				
				JLabel label4 = new JLabel("press press the Enter key to confirm");
				frame3.add(label4);
				label4.setBounds(170,200, 500, 60);
				label4.setFont(font);
				
				JButton button21 = new JButton("confirm");
				frame3.add(button21);
				button21.setBounds(250,330, 100, 50);
				button21.setFont(font2);
				button21.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Thank you for palcing your order..........");
						System.out.println("Have a nice day :)");
					}
				});
				

			}
		});
//		
		button2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("hii");
				button2.setBackground(Color.GREEN);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				 button2.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				 button2.setForeground(Color.blue);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		
		JButton button3 = new JButton("Hot Chocolate");
		frame.add(button3);
		button3.setBounds(120,300,150,60);
		button3.setFont(font2);
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFrame frame4 = new JFrame("Your order is Hot Chocolate");
				frame4.setSize(500, 500);
				frame4.setVisible(true);
				frame4.setLayout(null);
				
				
				JLabel label4 = new JLabel("Do you want Dark or Milk chocolate??");
				label4.setBounds(170, 50, 500, 60);
				label4.setFont(font);
				frame4.add(label4);
				
				JButton button9 = new JButton("Yes");
				frame4.add(button9);
				button9.setBounds(150, 130, 100, 50);
				button9.setFont(font2);
				
				button9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						System.out.println("Your order is Dark Hot Chocolate ");
					}
				});
				
				
				JButton button10 = new JButton("no");
				frame4.add(button10);
				button10.setBounds(250,130,100,50);
				button10.setFont(font2);
				
				button10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Your order is Milk Hot Chocolate ");
					}
				});
				JLabel label5 = new JLabel("press press the Enter key to confirm");
				frame4.add(label5);
				label5.setBounds(170,200, 500, 60);
				label5.setFont(font);
				
				JButton button22 = new JButton("confirm");
				frame4.add(button22);
				button22.setBounds(250,330, 100, 50);
				button22.setFont(font2);
				button22.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Thank you for palcing your order..........");
						System.out.println("Have a nice day :)");
					}
				});
				
			}
		});
		
		button3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				 button3.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				 button3.setForeground(Color.blue);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		JButton button4 = new JButton("Tea");
		frame.add(button4);
		button4.setBounds(120,380,150, 60);
		button4.setFont(font2);
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame frame5 = new JFrame("Your order is Tea");
				frame5.setSize(500, 500);
				frame5.setVisible(true);
				frame5.setLayout(null);
				
				
				JLabel label4 = new JLabel("Do you want Suger??");
				label4.setBounds(170, 50, 500, 60);
				label4.setFont(font);
				frame5.add(label4);
				
				JButton button11 = new JButton("Yes");
				frame5.add(button11);
				button11.setBounds(150, 130, 100, 50);
				button11.setFont(font2);
				
				button11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						System.out.println("Your order is Tea with Suger");
						
						
					}
				});
				
				JButton button12 = new JButton("no");
				frame5.add(button12);
				button12.setBounds(250,130,100,50);
				button12.setFont(font2);
				
				button12.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						System.out.println("Your order is Tea without Suger");
						
					}
				});
				JLabel label6 = new JLabel("press press the Enter key to confirm");
				frame5.add(label6);
				label6.setBounds(170,200, 500, 60);
				label6.setFont(font);
				
				JButton button23 = new JButton("confirm");
				frame5.add(button23);
				button23.setBounds(250,330, 100, 50);
				button23.setFont(font2);
				button23.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Thank you for palcing your order..........");
						System.out.println("Have a nice day :)");
					}
				});
				
				
			}
		});
		
		button4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				 button4.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				 button4.setForeground(Color.blue);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		

		
	

		
		
	}

}
