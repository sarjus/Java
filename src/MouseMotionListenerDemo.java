import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo extends Frame implements MouseMotionListener{
	MouseMotionListenerDemo(){
		//Registering the MouseMotionListener with the event source
		addMouseMotionListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(),10, 10);
		
	}
	public void mouseMoved(MouseEvent e) {
		
		
	}

	public static void main(String[] args) {
		new MouseMotionListenerDemo();

	}

}
