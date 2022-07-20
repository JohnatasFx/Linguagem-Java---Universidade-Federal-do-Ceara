package swingEventos;

import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JFrame;

public class Main2 {

	public static void main(String args[]) {
		start();
	}
	
	public static void start(){
		JFrame frame = new JFrame ();
 		 frame.setSize(300, 200);
 		Panel c1 =new Panel();
 		c1 .setLayout(new GridLayout(2,2));
 		
 		ElementsEvents m= new ElementsEvents();
 		c1.add(m.start());
 		
 		frame.add(c1);
  		frame.setVisible(true);
	}
	
}
