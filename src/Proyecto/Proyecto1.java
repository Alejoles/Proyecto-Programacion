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
		matrizPuntos[30][29] = "300,290";//interseccion cll7
		matrizPuntos[29][29] = "290,290";
		matrizPuntos[28][28] = "280,280";
		matrizPuntos[27][28] = "270,280";
		matrizPuntos[26][27] = "260,270";
		matrizPuntos[25][26] = "250,260";
		matrizPuntos[24][25] = "240,250";
		matrizPuntos[23][24] = "230,240";
		matrizPuntos[22][23] = "220,230";
		matrizPuntos[23][22] = "230,220";
		matrizPuntos[24][21] = "240,210";
		matrizPuntos[23][20] = "230,200";
		matrizPuntos[22][19] = "220,190";
		matrizPuntos[21][18] = "210,180";
		matrizPuntos[20][17] = "200,170";
		matrizPuntos[19][16] = "190,160";
		matrizPuntos[18][15] = "180,150";
		matrizPuntos[25][22] = "250,220";
		matrizPuntos[26][23] = "260,230";
		matrizPuntos[27][22] = "270,220";
		matrizPuntos[27][24] = "270,240";
		matrizPuntos[28][25] = "280,250";
		matrizPuntos[29][26] = "290,260";
		matrizPuntos[30][27] = "300,270";
		matrizPuntos[31][28] = "310,280";//interseccion 3rutas
		matrizPuntos[28][24] = "280,240";
		matrizPuntos[29][23] = "290,230";
		matrizPuntos[30][22] = "300,220";//interseccion cll9 == arriba
		matrizPuntos[31][27] = "310,270";
		matrizPuntos[32][26] = "320,260";
		matrizPuntos[33][25] = "330,250";//interseccion cll9 == abajo
		matrizPuntos[29][20] = "290,200";
		matrizPuntos[28][19] = "280,190";
		matrizPuntos[30][21] = "300,210";
		matrizPuntos[27][18] = "270,180";
		matrizPuntos[26][19] = "260,190";
		matrizPuntos[25][20] = "250,200";
		matrizPuntos[26][17] = "260,170";
		matrizPuntos[25][16] = "250,160";
		matrizPuntos[24][15] = "240,150";
		matrizPuntos[23][14] = "230,140";
		matrizPuntos[23][13] = "230,130";
		matrizPuntos[22][13] = "220,130";
		matrizPuntos[21][12] = "210,120";
		matrizPuntos[20][11] = "200,110";
		matrizPuntos[19][10] = "190,100";
		matrizPuntos[26][16] = "260,160";
		matrizPuntos[18][9] = "180,90";
		matrizPuntos[17][8] = "170,80";
		matrizPuntos[16][7] = "160,70";//interseccion izqueirda arriba
		matrizPuntos[17][6] = "170,60";
		matrizPuntos[18][5] = "180,50";
		matrizPuntos[19][4] = "190,40";
		matrizPuntos[20][3] = "200,30";
		matrizPuntos[16][8] = "160,80";
		matrizPuntos[15][9] = "150,90";
		matrizPuntos[15][10] = "150,100";
		matrizPuntos[14][11] = "140,110";
		matrizPuntos[13][11] = "130,110";
		matrizPuntos[12][11] = "120,110";
		matrizPuntos[11][11] = "110,110";
		matrizPuntos[11][12] = "110,120";

		matrizPuntos[27][15] = "270,150";
		matrizPuntos[28][14] = "280,140";
		matrizPuntos[29][13] = "290,130";
		matrizPuntos[30][12] = "300,120";//sigue hacia cll11 subiendo
		matrizPuntos[28][12] = "280,120";
		matrizPuntos[27][12] = "270,120";
		matrizPuntos[26][13] = "260,130";
		matrizPuntos[25][14] = "250,140";
		matrizPuntos[30][14] = "300,140";
		matrizPuntos[31][15] = "310,150";
		matrizPuntos[30][16] = "300,160";
		matrizPuntos[29][17] = "290,170";
		matrizPuntos[28][18] = "280,180";
		matrizPuntos[32][16] = "320,160";
		matrizPuntos[33][17] = "330,170";//interseccion bomberos

		
		
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