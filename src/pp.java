import java.awt.Color;
import java.awt.event.*;
import acm.program.*;
import acm.graphics.*;
import javax.swing.*;

//GIMAGE PIXEL

public class pp extends GraphicsProgram implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	public void init() {
		addMouseListeners();
		setSize(300,300);
		GLine aa = new GLine(100,100,200,200);
		add(aa);
		add(new JButton("Calcular otra ruta."), SOUTH);
		addActionListeners();
		
/*		TRATAR DE INTERPRETAR

 		GPoint ab = new GPoint(10,10);
		if(aa.contains(ab) == true) {
			println("true");
		}
*/
	}	
	//------------------------------------------------------
	GLine aprox = new GLine(0,0,0,0);
	private int numClicks = 0;
	private int TM = 0;
	GOval punto1 = new GOval(5,5);
	GOval punto2 = new GOval(5,5);
	GOval engorgio1 = new GOval(TM,TM);
	GOval engorgio2 = new GOval(TM,TM);
	//------------------------------------------------------
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Calcular otra ruta.")) {
		remove(aprox);
		remove(punto1);
		remove(punto2);
		remove(engorgio1);
		remove(engorgio2);
		numClicks = 0;
		}
	}



	public void mouseClicked(MouseEvent e) {
		//Circulos que indican los puntos de inicio y final
		//inicio
				punto1.setFilled(true);
				punto1.setColor(Color.red);
					if(numClicks == 0) {
						add(punto1, e.getX(),e.getY());
						numClicks++;
						aprox.setStartPoint(e.getX(), e.getY());
						add(engorgio1, e.getX(),e.getY());

					}
		//final
					else if(numClicks == 1) {
						punto2.setFilled(true);
						punto2.setColor(Color.blue);
						add(punto2, e.getX(),e.getY());
						numClicks++;
						aprox.setEndPoint(e.getX(), e.getY());
						add(aprox);
						add(engorgio2, e.getX(),e.getY());
					}
					println(engorgio1.getBounds());
					println(engorgio2.getBounds());

//					for(int i = 0; ; i ++) {
//						TM++;
						
//					}
		}

}