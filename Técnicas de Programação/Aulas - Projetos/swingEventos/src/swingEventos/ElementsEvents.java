package swingEventos;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ElementsEvents extends JFrame implements MouseListener {

	JLabel mousePosition;

	public static void main(String args[]) {
		new ElementsEvents().start();

	}

	public JLabel start() {
		mousePosition = new JLabel();
		addMouseListener(this); // listens for own mouse and
		setLayout(new FlowLayout(1));
		add(mousePosition);

		mousePosition.addMouseListener(this);

		return mousePosition;
	}

	public void mouseClicked(MouseEvent e) {
		mousePosition.setText("Mouse clicked at coordinate : [" + e.getX() + "," + e.getY() + "]");
	}

	public void mouseEntered(MouseEvent e) {
		mousePosition.setText("Current mouse Coordinates ");
	}

	public void mouseExited(MouseEvent e) {
		mousePosition.setText("Mouse outside access window");
	}

	public void mousePressed(MouseEvent e) {
		mousePosition.setText("Mouse pressed at coordinates : [" + e.getX() + "," + e.getY() + "]");
	}

	public void mouseReleased(MouseEvent e) {
		mousePosition.setText("Current mouse coordinates : [" + e.getX() + "," + e.getY() + "]");
	}

	public void mouseDragged(MouseEvent e) {
		mousePosition.setText("Mouse dragged at coordinates : [" + e.getX() + "," + e.getY() + "]");
	}

	public void mouseMoved(MouseEvent e) {
		mousePosition.setText("Mouse moved to coordinates : [" + e.getX() + "," + e.getY() + "]");
	}

	public static void piscaImagen() {
		Timer timer = new Timer(1500, null);
		/*
		 * timer.addActionListener(new ActionListener() { // Mesmo código da pergunta
		 * });
		 */
		System.out.println("testet");

		timer.setInitialDelay(100);
		timer.start();
	}
}