import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
class Page extends JFrame implements ActionListener {
    JLabel background;
	
	
	Page()
	{
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
	 
	 
	 background.setBounds(0,0,1370,730);
	 add(background);
	 
	 
	 setVisible(true);
	 }
	 
	 
	 class HomePage{
  public static void main(String[]args)
  {
	 Page page= new Page();
  }
}
}
	 
	 
	
	
