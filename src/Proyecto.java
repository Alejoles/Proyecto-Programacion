import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class Proyecto extends GraphicsProgram{
	private static final long serialVersionUID = 1L;
	
	//CONSTANTES
	private final int TMX = 750;
	private final int TMY = 600;
	//--------
	int espacio[][] = new int [TMX][TMY];
	//--------
	
	public void init() {
		addMouseListeners();
		add(new GLine (100,100,200,200));
		setSize(300,300);
//		mapa();
		
	}
	
	public void mapa() {
		setSize(750,600);
		add(new GImage("/home/acer/Escritorio/WhatsApp Image 2018-04-27 at 12.05.48 PM.jpeg"));
		add(new GLine(207,25,142,119));
		add(new GLine (142,119,120,110));
		add(new GLine (120,110,100,150));
      	add(new GLine(172,77,353,266));
		add(new GLine(353,266,350,280));
		add(new GLine(350,280,300,297));
		add(new GLine(300,297,220,225));
		add(new GLine(300,297,365,390));
		add(new GLine(365,390,545,495));
		add(new GLine(545,495,530,550));
		add(new GLine(530,550,340,440));
		add(new GLine(340,440,270,475));
		add(new GLine(270,475,400,570));
		add(new GLine(400,570,409,480));
		add(new GLine(409,480,498,410));
		add(new GLine(498,410,312,292));
		add(new GLine(270,475,185,460));
		add(new GLine(185,460,98,535));
		add(new GLine(235,468,171,370));
		add(new GLine(171,370,175,315));
		add(new GLine(175,315,143,279));
		add(new GLine(143,279,155,255));
		add(new GLine(155,255,80,200));	
		add(new GLine(230,139,246,124));
		add(new GLine(245,152,275,120));
		add(new GLine(275,120,290,135));//
		add(new GLine(290,135,255,165));
		add(new GLine(290,135,315,155));
//		add(new GLine(315,155,));
//		add(new GLine());
//		add(new GLine());
//		add(new GLine());
//		add(new GLine());
//		add(new GLine());
//		add(new GLine());

			

	}
	public void mouseClicked(MouseEvent e) {
		GOval punto1 = new GOval(5,5);
		punto1.setFilled(true);
		punto1.setColor(Color.red);
		add(punto1, e.getX(),e.getY());
		if(e.getClickCount() == 1) {
			
		}
	}
	public void mousePressed(MouseEvent r) {
		GOval punto2 = new GOval(5,5);
		punto2.setFilled(true);
		punto2.setColor(Color.blue);
		add(punto2, r.getX(),r.getY());
		println(r.getPoint());

	}

}