import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo1 extends JFrame implements ActionListener  {
    JLabel label1, label2, label3, label4, label5;
    JTextField Name;
	JTextField username;
    JPasswordField password;
	JTextField email;
	JTextField phone_no;
    
	Demo1(){
		
		
	//header
	  JPanel header;
	  header=new JPanel();
	  header.setBackground(new Color(0,0,0,25));// upper transparency
	  header.setBounds(0,0,1370,100);
	  JLabel name= new JLabel("Signup");
	  name.setBounds(200,50,400,50);
	  
	//font
	  Font f= new Font("Algerian ",Font.BOLD, 50);
	  name.setForeground(Color.BLACK);
	  name.setFont(f);
	  header.add(name);
	  
	//Signup
     JPanel signup =new JPanel();
	 signup.setLayout(null);
     setSize(1370,730);
     signup.setBounds(370,100,630,600);	
     signup.setBackground(new Color(0,0,0,200));
	 
	 
	 JLabel n= new JLabel("Name");
	  n.setBounds(50,50,400,50);
	 //font for labels
	  Font F= new Font("Algerian ",Font.BOLD, 35);
	  n.setForeground(Color.CYAN);
	  n.setFont(F);
	  signup.add(n);
	 
	 JLabel u= new JLabel("Username");
	  u.setBounds(50,150,400,50);
	 //font for labels
	  Font F2= new Font("Algerian ",Font.BOLD, 35);
	  u.setForeground(Color.CYAN);
	  u.setFont(F2);
	  signup.add(u);
	  
	  JLabel p= new JLabel("Password");
	  p.setBounds(50,250,400,50);
	 //font for labels
	  Font F3= new Font("Algerian ",Font.BOLD, 35);
	  p.setForeground(Color.CYAN);
	  p.setFont(F3);
	  signup.add(p);
	  
	  JLabel e= new JLabel("Email");
	  e.setBounds(50,350,400,50);
	 //font for labels
	  Font F4= new Font("Algerian ",Font.BOLD, 35);
	  e.setForeground(Color.CYAN);
	  e.setFont(F4);
	  signup.add(e);
	  
	  JLabel ph= new JLabel("Phone No.");
	  ph.setBounds(50,450,400,50);
	 //font for labels
	  Font F5= new Font("Algerian ",Font.BOLD, 35);
	  ph.setForeground(Color.CYAN);
	  ph.setFont(F5);
	  signup.add(ph);
	 
	    label1 = new JLabel("Enter Name");
        label2 = new JLabel("Enter Username");
        label3 = new JLabel("Enter Password");
        label4 = new JLabel("Enter Email ID");
        label5 = new JLabel("Enter Phone No");
        label1.setBounds(320, 50, 100, 50);
        label2.setBounds(320, 150, 100, 50);
        label3.setBounds(320, 250, 100, 50);
        label4.setBounds(320, 350, 100, 50);
        label5.setBounds(320, 450, 100, 50);
        signup.add(label1);
        signup.add(label2);
        signup.add(label3);
        signup.add(label4);
        signup.add(label5);
	 
	 
	 Name=new JTextField();
	 Name.setBounds(250,50,300,50);
	 Font f1= new Font("Times New Roman",Font.BOLD, 20);
	 Name.setForeground(Color.BLACK);
	 Name.setFont(f1);
	 Name.setBackground(new Color(210,180,140));
	 signup.add(Name);
	 
	 username=new JTextField();
	 username.setBounds(250,150,300,50);
	 Font f2= new Font("Times New Roman",Font.BOLD, 20);
	 username.setForeground(Color.BLACK);
	 username.setFont(f2);
	 username.setBackground(new Color(210,180,140));
	 signup.add(username);
	 
	 password=new JPasswordField();
	 password.setBackground(new Color(210,180,140));
	 password.setForeground(Color.BLACK);
	 password.setBounds(250,250,300,50);
	 signup.add(password);
	 
	 email=new JTextField();
	 email.setBounds(250,350,300,50);
	 Font f3= new Font("Times New Roman",Font.BOLD, 20);
	 email.setForeground(Color.BLACK);
	 email.setFont(f3);
	 email.setBackground(new Color(210,180,140));
	 signup.add(email);
	 
	 phone_no=new JTextField();
	 phone_no.setBounds(250,450,300,50);
	 Font f4= new Font("Times New Roman",Font.BOLD, 20);
	 phone_no.setForeground(Color.BLACK);
	 phone_no.setFont(f4);
	 phone_no.setBackground(new Color(210,180,140));
	 signup.add(phone_no);
	 
	//Button
	 JButton signup_btn= new JButton("Signup");
	 signup_btn.setBounds(270,530,100,50);
	 signup_btn.setBackground(new Color(160,182,45));
	 signup.add(signup_btn);
	 signup_btn.addActionListener(this); // to show inputs in command prompt
	 
	 

	
	//frame
	 setSize(1370,730);
	 setLayout(null);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);  
     setResizable(false); // fix the size
	 
	//background
	 ImageIcon bg_image=new ImageIcon("signup.jpg");
	 
	 Image img=bg_image.getImage();
	 Image temp_img=img.getScaledInstance(1370,730,Image.SCALE_SMOOTH);
	 bg_image= new ImageIcon(temp_img);
	 JLabel background =new JLabel("",bg_image,JLabel.CENTER);
	 
	background.setBounds(0,0,1370,730);
	background.add(header);
	 background.add(signup);
	 add(background);
	 
	 setVisible(true);
	 
	}
	
	public void actionPerformed(ActionEvent e) {
        System.out.println("Name: " + Name.getText());
        System.out.println("Username: " + username.getText()); // cmd me user details show krne ke liye
        System.out.println("Password: " + password.getPassword());
        System.out.println("Email: " + email.getText());
        System.out.println("Phone Number: " + phone_no.getText());
    }
	
	
	


}

class Signup{
public static void main (String [] args)  
	{
        Demo1 demo1 =new Demo1();
    }
}


