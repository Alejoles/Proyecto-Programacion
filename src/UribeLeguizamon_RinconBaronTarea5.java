import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UribeLeguizamon_RinconBaronTarea5 extends GraphicsProgram implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	public void init() {
		setSize(600,500);
		addMouseListeners();
		//--------------------------------------------------------
		add(mapa);
		//--------------------------------------------------------
		add(new JButton("Reset"), SOUTH);
		addActionListeners();
		distancia();
	}
	
	//-----------------------VARIABLES---------------------
	GImage mapa = new GImage("/home/acer/Escritorio/MAP.png");
	GOval punto1 = new GOval(5,5);
	GOval punto2 = new GOval(5,5);
	int click = 0;
	double x,y,x2,y2;
	private	GLine linea;
	private double dist;
	private int[][] pixelArray = mapa.getPixelArray();
	//-----------------------------------------------------
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Reset")) {
			removeAll();
		}
	}
	
	public void mousePressed(MouseEvent e) {
		GOval punto1 = new GOval(5,5);
		linea = new GLine(e.getX(),e.getY(),e.getX(),e.getY());
		add(punto1,e.getX(),e.getY());
		add(linea);
		x = e.getX();
		y = e.getY();
		

	}
	public void mouseDragged(MouseEvent e) {
		linea.setEndPoint(e.getX(), e.getY());
		x2 = linea.getX();
		y2 = linea.getY();
	}
	public void mouseReleased(MouseEvent e) {
		GOval punto2 = new GOval(5,5);
		add(punto2, linea.getEndPoint());
	}
	
	public void distancia() {
		
	}
}
