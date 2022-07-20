package swingEventos;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;

public class GridLayoutExemplo {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame ();
		frame.setSize(300, 200);
		Panel c1 =new Panel();
		c1 .setLayout(new GridLayout(2,2));
		
		JLabel mousePosition=new JLabel();
		mousePosition.setBackground(Color.black);
		mousePosition.setText("teste");
		c1.add(mousePosition);
		
		
	ElementsEvents m1= new ElementsEvents();
	
	m1.start();
	c1.add(m1.mousePosition);
	
	frame.add(c1);
	frame.setVisible(true);
	m1.piscaImagen();
  }
	
}
