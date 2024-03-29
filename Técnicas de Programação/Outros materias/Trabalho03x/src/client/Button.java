package client;
import java.awt.Color;
import javax.swing.JButton;

public class Button extends JButton 
{
	public JButton newButton(String text, Color color)
	{
		JButton button = new JButton();
		button.setText(text);
		button.setBackground(color);
		button.setAlignmentX(CENTER_ALIGNMENT);
		button.setVisible(true);
		return button;	
	}
}
