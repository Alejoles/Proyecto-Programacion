import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class popopo extends GraphicsProgram implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	public void init() {
		setSize(600,500);
		addMouseListeners();
		
	}
	
	GOval popo = new GOval(5,5);
	GLine linea = new GLine(0,0,0,0);

	
	public void mouseDragged(MouseEvent e) {
		GOval po =  new GOval(5,5);
		add(po, e.getX(),e.getY());
		linea.setStartPoint(popo.getX(), popo.getY());
		add(linea);
	}
	public void mouseCLicked(MouseEvent e) {
		add(popo, e.getX(),e.getY());
		linea.setEndPoint(popo.getX(),popo.getY());
		add(linea);
	}
	
}