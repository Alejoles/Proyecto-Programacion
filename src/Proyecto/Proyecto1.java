package Proyecto;

import acm.graphics.*;

import acm.program.*;

import java.awt.*;

import java.awt.event.*;


public class Proyecto1 extends GraphicsProgram{

	private static final long serialVersionUID = 1L;
	public void run (){
		mapa();
		
	}
	//----------------------------------------------MAPA---------------------------------------------------
	private void mapa (){
		setSize(768,672);
		add(new GImage("/home/acer/Escritorio/WhatsApp Image 2018-04-27 at 12.05.48 PM.jpeg"));
		String matrizPuntos [][] = new String [76][67];
		matrizPuntos[16][37] = "169,370";
		matrizPuntos[16][36] = "168,360";
		matrizPuntos[16][35] = "169,350";
		matrizPuntos[16][34] = "169,340";
		matrizPuntos[16][33] = "169,330";
		matrizPuntos[16][32] = "169,320";
		matrizPuntos[16][31] = "163,310";
		matrizPuntos[16][30] = "160,300";
		matrizPuntos[15][29] = "153,290";
		matrizPuntos[14][28] = "145,280";
		matrizPuntos[14][27] = "145,270";
		matrizPuntos[14][26] = "145,260";
		matrizPuntos[14][25] = "140,250";
		matrizPuntos[13][24] = "130,240";
		matrizPuntos[12][23] = "120,230";
		matrizPuntos[11][22] = "110,220";
		matrizPuntos[10][21] = "100,210";
		matrizPuntos[9][20] = "90,200";
		matrizPuntos[8][19] = "80,190";
		matrizPuntos[17][38] = "172,380";
		matrizPuntos[17][39] = "177,390";
		matrizPuntos[18][40] = "185,400";
		matrizPuntos[18][41] = "187,410";
		matrizPuntos[19][41] = "199,410";//interseccion cll6 con cll3
		matrizPuntos[21][41] = "210,410";
		matrizPuntos[22][40] = "220,400";
		matrizPuntos[23][40] = "230,400";
		matrizPuntos[24][40] = "240,400";
		matrizPuntos[25][40] = "250,400";
		matrizPuntos[26][39] = "260,390";
		matrizPuntos[27][39] = "270,390";
		matrizPuntos[28][38] = "280,380";//interseccion crr6 cll3b
		matrizPuntos[29][37] = "290,370";
		matrizPuntos[30][36] = "300,360";
		matrizPuntos[31][35] = "310,350";
		matrizPuntos[32][34] = "320,340";//interseccion cll6a arriba
		matrizPuntos[32][33] = "320,330";
		matrizPuntos[31][32] = "310,320";
		matrizPuntos[31][31] = "310,310";
		matrizPuntos[30][30] = "300,300";
		matrizPuntos[30][29] = "300,290";


		for (int x=1;x<76;x++){
			for (int y=1;y<67;y++){
				if(matrizPuntos[x][y]!=""&& matrizPuntos[x][y]!=null){
					GOval a  =new GOval(
							Integer.parseInt(matrizPuntos[x][y].split(",")[0]), 
							Integer.parseInt(matrizPuntos[x][y].split(",")[1]),8,8); 
							add (a);
							
				}
			}
		}
	}
}