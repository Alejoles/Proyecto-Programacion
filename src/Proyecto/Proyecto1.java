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
	private void mapa (){
		setSize(768,672);
		add(new GImage("/home/acer/Escritorio/WhatsApp Image 2018-04-27 at 12.05.48 PM.jpeg"));
		String matrizPuntos [][] = new String [76][67];
		matrizPuntos[13][11] = "139,119";
		matrizPuntos[15][10] = "152,101";
		matrizPuntos[17][14] = "173,149";
		matrizPuntos[19][16] = "195,169";
		matrizPuntos[21][17] = "215,185"; 
		matrizPuntos[22][20] = "232,199";
		matrizPuntos[20][32] = "200,320";
		for (int x=1;x<76;x++){
			for (int y=1;y<67;y++){
				if(matrizPuntos[x][y]!=""&& matrizPuntos[x][y]!=null){
					GOval a  =new GOval(
							Integer.parseInt(matrizPuntos[x][y].split(",")[0]), 
							Integer.parseInt(matrizPuntos[x][y].split(",")[1])
									,8,8); 
							add (a);
							
				}
			}
		}
	}
}