import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
class Demo extends JFrame implements ActionListener {
    JLabel background,label1, label2;
	JPanel login,header;
    JTextField username;
    JPasswordField password;
    JButton signup;
	JButton login_btn;
	
  Demo()
  {
	//header
	  JPanel header;
	  header=new JPanel();
	  header.setBackground(new Color(0,0,0,25));// upper transparency
	  header.setBounds(0,0,1370,100);
	  JLabel name= new JLabel("Login");
	  name.setBounds(200,50,400,50);
	 //font
	  Font f= new Font("Algerian ",Font.BOLD, 50);
	  name.setForeground(Color.BLACK);
	  name.setFont(f);
	  header.add(name);
	  
	//login 
     JPanel login =new JPanel();
	 login.setLayout(null);
     setSize(400,350);
     login.setBounds(480,200,400,350);	
     login.setBackground(Color.BLACK);
	 
	 
	 label1 = new JLabel("Enter Username");
     label2 = new JLabel("Enter Password");
	 label1.setBounds(400, 50, 100, 50);
     label2.setBounds(400, 150, 100, 50);
	 login.add(label1);
     login.add(label2);
	 
	 
	 username=new JTextField();
	 username.setBounds(50,50,300,50);
	 
	 Font f1= new Font("Times New Roman",Font.BOLD, 20);
	 username.setForeground(Color.BLACK);
	 username.setFont(f1);
	 username.setBackground(new Color(210,180,140));
	 login.add(username);
	 
	 password=new JPasswordField();
	 password.setBackground(new Color(210,180,140));
	 password.setForeground(Color.BLACK);
	 password.setBounds(50,150,300,50);
	 login.add(password);
	 
	 JButton signup= new JButton("Login");
	 signup.setBounds(30,250,100,50);
	 signup.setBackground(new Color(160,182,45));
	 login.add(signup);
	 signup.addActionListener(this); // to show user name and password in command prompt
	 
	 JButton login_btn= new JButton("Sign Up");
	 login_btn.setBounds(270,250,100,50);
	 login_btn.setBackground(new Color(160,182,45));
	 login.add(login_btn);
	 login_btn.addActionListener(this); // to show user name and password in command prompt
     
     
	 
	//frame
	 setSize(1370,730);
	 setLayout(null);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);  
      setResizable(false); // fix the size
	 
	//background
	 ImageIcon bg_image=new ImageIcon("logo.jpg");
	 
	 Image img=bg_image.getImage();
	 Image temp_img=img.getScaledInstance(1370,730,Image.SCALE_SMOOTH);
	 bg_image= new ImageIcon(temp_img);
	 JLabel background =new JLabel("",bg_image,JLabel.CENTER);
	 
	 background.add(login);
	 background.add(header);
	 background.setBounds(0,0,1370,730);
	 add(background);
	 
	 
	 setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) 
  {
	    System.out.println(username.getText()); // cmd me user details show krne ke liye
        System.out.println(password .getPassword());
  }
	
}
  
  class LoginForm{
  public static void main(String[]args)
  {
	 Demo demo= new Demo();
  }
}
  
  
  
