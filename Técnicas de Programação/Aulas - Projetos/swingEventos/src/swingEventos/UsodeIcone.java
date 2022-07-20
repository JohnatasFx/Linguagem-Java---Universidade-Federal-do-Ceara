package swingEventos;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class UsodeIcone extends JFrame implements MouseListener {
JLabel Sair;
public UsodeIcone(){
  super ("Uso de Icone como Botao");
  Container tela = getContentPane();
  setLayout(null);
  setSize(140, 160);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Sair = new JLabel();   
  Sair.setIcon(new ImageIcon(getClass().getResource("sol.png"))); 
  Sair.setBounds(30, 30, 64, 64);  
  Sair.addMouseListener(this);
  tela.add(Sair);  
  }
 public void mouseClicked(MouseEvent evt) {   
      if (evt.getSource() == Sair)    
	  System.exit(0);                      
 } 
    public static void main(String args[]) {
    UsodeIcone UI = new UsodeIcone();
	UI.setVisible(true);
    }
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("dfdfdfd");
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}