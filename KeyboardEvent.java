import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyboardEvent extends JPanel implements KeyListener{
	String text = "";
	KeyboardEvent(){
		this.addKeyListener(this);
		this.setFocusable(true);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("SansSerif", Font.BOLD,25));
		g.setColor(Color.BLUE);
		g.drawString(("Type something: "+text), 0, 100);
	}
	
	public void keyTyped(KeyEvent e) {
		text += Character.toString(e.getKeyChar());
		repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}