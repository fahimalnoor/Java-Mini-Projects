import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
import java.util.Random;


public class Puzzle extends JFrame/*implements ActionListener*/{

private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;  
private JPanel panel;
private JLabel scoreLabel;
private static int score = 0;

    Puzzle(){  
	
	super("Puzzle By Fahim");
	this.setSize(600 , 500);  
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	panel = new JPanel();
    panel.setLayout(null);  
	
	Color backColor = new Color(63, 204, 162);
	panel.setBackground(backColor);
	
	scoreLabel = new JLabel("Score: ");
	scoreLabel.setBounds(0,1,50,10);
	
	Random rd = new Random();
		
	for(int i=0; i<10; i++){
	int x1 = rd.nextInt(420);
	int y1 = rd.nextInt(340);
	
	
    b1=new JButton("");  
    b1.setBounds(x1,y1,80,60); //20,95
	b1.setBackground(Color.RED);
	
	int x2 = rd.nextInt(420);
	int y2 = rd.nextInt(340);
			
    b2=new JButton("");  
    b2.setBounds(x2,y2,80,60); //130,95
	b2.setBackground(Color.RED);
		
	
	int x3 = rd.nextInt(420);
	int y3 = rd.nextInt(340);
	
    b3=new JButton("");  
    b3.setBounds(x3,y3,80,60); //250,95
	b3.setBackground(Color.RED);
		
	int x4 = rd.nextInt(420);
	int y4 = rd.nextInt(340);
	
    b4=new JButton("");  
    b4.setBounds(x4,y4,80,60); //370,95
	b4.setBackground(Color.RED);
		
	int x5 = rd.nextInt(420);
	int y5 = rd.nextInt(340);
	
    b5=new JButton("");  
    b5.setBounds(x5,y5,80,60); //20,195
	b5.setBackground(Color.RED);
		
	int x6 = rd.nextInt(420);
	int y6 = rd.nextInt(340);
	
    b6=new JButton("");  
    b6.setBounds(x6,y6,80,60); //130,195
	b6.setBackground(Color.RED);
		
	int x7 = rd.nextInt(420);
	int y7 = rd.nextInt(340);
	
    b7=new JButton("");  
    b7.setBounds(x7,y7,80,60);  //250,195
	b7.setBackground(Color.RED);
		
	
	int x8 = rd.nextInt(420);
	int y8 = rd.nextInt(340);
	
    b8=new JButton("");  
    b8.setBounds(x8,y8,80,60); //370,195
	b8.setBackground(Color.RED);

	int x9 = rd.nextInt(420);
	int y9 = rd.nextInt(340);
	
    b9=new JButton("");  
    b9.setBounds(x9,y9,80,60); //130,295
	b9.setBackground(Color.RED);
		
	
	int x10 = rd.nextInt(420);
	int y10 = rd.nextInt(340);
	
	b10 = new JButton("");
	b10.setBounds(x10,y10,80,60); //250,295
	b10.setBackground(Color.RED);
		
	}
	
	panel.add(scoreLabel);
    panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	panel.add(b5);
	panel.add(b6);
	panel.add(b7);
	panel.add(b8);
	panel.add(b9);
	panel.add(b10);
	
	
	this.add(panel);
	this.setVisible(true);
      
	  
	  
	  
    /*b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  
	b10.addActionListener(this);
	*/
   
	

	
	
	
	
}  


/*
public void actionPerformed(ActionEvent ae){
	Color matchColor = new Color(0, 0, 0);
	if(ae.getSource() == b1){
		if(ae.getSource() == b2){
			if(b1.x1==b2.x2 && b1.y1==b2.y2){
				b1.setBackground(matchColor);
				b2.setBackground(matchColor);
				
				score = score + 2;
				
				b1.setVisible(false);
				b2.setVisible(false);
			}
		}
	
	
}
}
*/







public static void main(String[] args) {  
    new Puzzle();  
}  
}  