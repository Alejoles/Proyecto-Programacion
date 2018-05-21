package Proyecto;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class Proyecto1 extends GraphicsProgram {

public void  run() {
	   //funcion que permite controlar el click del mouse
	   addMouseListeners();
	   
	   setSize(768,672);
	   add(new GImage("/home/acer/Escritorio/WhatsApp Image 2018-04-27 at 12.05.48 PM.jpeg"));
	   
	   /**	Creacion de la matriz: 
	    * 		Tendra 76 posiciones en x dado que la imagen es de 768 pixeles de ancho (cada 10 pixeles es una posicion adicional en la matriz)
	    * 		Tendra 67 posciones en y dado que la imagen es de 672 pixeles de alto (cada 10 pixeles es una posicion adicional en la matriz)
	    * */ 
	
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
		matrizPuntos[19][41] = "199,410";
		matrizPuntos[20][42] = "200,420";
		matrizPuntos[21][43] = "210,430";
		matrizPuntos[22][44] = "220,440";
		matrizPuntos[22][45] = "220,450";
		matrizPuntos[22][46] = "220,460";//cll3
		matrizPuntos[21][46] = "210,460";
		matrizPuntos[20][46] = "200,460";
		matrizPuntos[19][46] = "190,460";
		matrizPuntos[18][46] = "180,460";
		matrizPuntos[17][46] = "170,460";
		matrizPuntos[16][47] = "160,470";
		matrizPuntos[15][48] = "150,480";
		matrizPuntos[14][49] = "140,490";
		matrizPuntos[13][50] = "130,500";
		matrizPuntos[12][51] = "120,510";
		matrizPuntos[12][52] = "120,520";//cll1
		matrizPuntos[13][52] = "130,520";
		matrizPuntos[14][52] = "140,520";
		matrizPuntos[15][53] = "150,530";
		matrizPuntos[16][53] = "160,530";
		matrizPuntos[16][52] = "160,520";
		matrizPuntos[17][52] = "170,520";
		matrizPuntos[17][51] = "170,510";
		matrizPuntos[17][50] = "170,500";
		matrizPuntos[18][50] = "180,500";
		matrizPuntos[18][49] = "180,490";
		matrizPuntos[18][48] = "180,480";
		matrizPuntos[17][47] = "170,470";
		matrizPuntos[17][46] = "170,460";
		matrizPuntos[19][50] = "190,500";
		matrizPuntos[20][51] = "200,510";
		matrizPuntos[21][52] = "210,520";
		matrizPuntos[22][53] = "220,530";
		matrizPuntos[21][54] = "210,540";
		matrizPuntos[20][55] = "200,550";
		matrizPuntos[17][54] = "170,540";
		matrizPuntos[18][54] = "180,540";
		matrizPuntos[19][55] = "190,550";
		matrizPuntos[20][55] = "200,550";
		matrizPuntos[20][56] = "200,560";
		matrizPuntos[21][56] = "210,560";
		matrizPuntos[22][56] = "220,560";
		matrizPuntos[23][55] = "230,550";
		matrizPuntos[24][55] = "240,550";
		matrizPuntos[25][54] = "250,540";
		matrizPuntos[26][53] = "260,530";//continuar
		matrizPuntos[27][54] = "270,540";
		matrizPuntos[28][55] = "280,550";
		matrizPuntos[28][56] = "280,560";
		matrizPuntos[28][57] = "280,570";
		matrizPuntos[27][57] = "270,570";
		matrizPuntos[26][57] = "260,570";
		matrizPuntos[25][57] = "250,570";
		matrizPuntos[25][58] = "250,580";
		matrizPuntos[25][59] = "250,590";
		matrizPuntos[26][59] = "260,590";
		matrizPuntos[27][59] = "270,590";
		matrizPuntos[28][59] = "280,590";
		matrizPuntos[29][59] = "290,590";
		matrizPuntos[30][59] = "300,590";
		matrizPuntos[31][59] = "310,590";
		matrizPuntos[32][59] = "320,590";
		matrizPuntos[33][59] = "330,590";
		matrizPuntos[34][59] = "340,590";
		matrizPuntos[35][59] = "350,590";
		matrizPuntos[36][59] = "360,590";
		matrizPuntos[37][59] = "370,590";
		matrizPuntos[38][59] = "380,590";
		matrizPuntos[39][59] = "390,590";
		matrizPuntos[40][59] = "490,590";//parque
		matrizPuntos[29][57] = "290,570";
		matrizPuntos[30][58] = "300,580";
		matrizPuntos[32][58] = "320,580";
		matrizPuntos[33][57] = "330,570";
		matrizPuntos[33][56] = "330,560";
		matrizPuntos[34][55] = "340,550";
		matrizPuntos[34][54] = "340,540";
		matrizPuntos[34][53] = "340,530";
		matrizPuntos[33][52] = "330,520";
		matrizPuntos[32][51] = "320,510";
		matrizPuntos[31][50] = "310,500";
		matrizPuntos[30][50] = "300,500";
		matrizPuntos[30][51] = "300,510";
		matrizPuntos[29][52] = "290,520";
		matrizPuntos[28][53] = "280,530";
		matrizPuntos[30][49] = "300,490";
		matrizPuntos[29][49] = "290,490";
		matrizPuntos[28][48] = "280,480";
		matrizPuntos[27][47] = "270,470";
		matrizPuntos[26][47] = "260,470";
		matrizPuntos[25][46] = "250,460";
		matrizPuntos[24][46] = "240,460";
		matrizPuntos[25][47] = "250,470";
		matrizPuntos[23][46] = "230,460";
		matrizPuntos[26][48] = "260,480";
		matrizPuntos[25][49] = "250,490";
		matrizPuntos[25][50] = "250,500";
		matrizPuntos[24][50] = "240,500";
		matrizPuntos[31][49] = "310,490";
		matrizPuntos[32][48] = "320,480";
		matrizPuntos[33][47] = "330,470";
		matrizPuntos[34][46] = "340,460";
		matrizPuntos[35][46] = "350,460";
		matrizPuntos[36][47] = "360,470";
		matrizPuntos[36][48] = "360,480";//
		matrizPuntos[37][48] = "370,480";
		matrizPuntos[38][48] = "380,480";
		matrizPuntos[39][48] = "390,480";
		matrizPuntos[39][47] = "390,470";
		matrizPuntos[38][46] = "380,460";
		matrizPuntos[37][45] = "370,450";
		matrizPuntos[36][45] = "360,450";
		matrizPuntos[34][44] = "340,440";
		matrizPuntos[33][44] = "330,440";
		matrizPuntos[32][45] = "320,450";
		matrizPuntos[31][45] = "310,450";
		matrizPuntos[31][46] = "310,460";
		matrizPuntos[30][46] = "300,460";
		matrizPuntos[29][46] = "290,460";
		matrizPuntos[28][47] = "280,470";
		matrizPuntos[27][46] = "270,460";
		matrizPuntos[27][45] = "270,450";
		matrizPuntos[26][44] = "260,440";
		matrizPuntos[26][43] = "260,430";
		matrizPuntos[26][42] = "260,420";
		matrizPuntos[26][41] = "260,410";
		matrizPuntos[26][40] = "265,400";

		matrizPuntos[25][42] = "250,420";
		matrizPuntos[24][42] = "240,420";

		matrizPuntos[36][49] = "360,490";
		matrizPuntos[36][50] = "360,500";
		matrizPuntos[35][51] = "350,510";
		matrizPuntos[35][52] = "350,520";
		matrizPuntos[34][52] = "340,520";
		matrizPuntos[35][45] = "350,450";//cll5 <--

		matrizPuntos[25][60] = "250,600";
		matrizPuntos[24][59] = "240,590";
		matrizPuntos[23][59] = "230,590";
		matrizPuntos[22][59] = "220,590";
		matrizPuntos[25][52] = "250,520";
		matrizPuntos[24][51] = "240,510";//arriba hacia cll5
		matrizPuntos[23][50] = "230,500";
		matrizPuntos[22][49] = "220,490";
		matrizPuntos[21][48] = "210,480";
		matrizPuntos[20][47] = "200,470";


		matrizPuntos[11][52] = "110,520";
		matrizPuntos[10][53] = "100,530";
		matrizPuntos[9][53] = "90,530";
		matrizPuntos[8][53] = "80,530";
		matrizPuntos[7][54] = "70,540";
		matrizPuntos[6][54] = "60,540";
		matrizPuntos[5][55] = "50,550";
		matrizPuntos[4][56] = "40,560";
		matrizPuntos[3][56] = "30,560";
		matrizPuntos[2][57] = "20,570";
		matrizPuntos[1][57] = "10,570";
		matrizPuntos[4][57] = "40,570";
		matrizPuntos[5][58] = "50,580";
		matrizPuntos[5][59] = "50,590";
		matrizPuntos[6][60] = "60,600";
		matrizPuntos[7][61] = "70,610";
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
		matrizPuntos[32][34] = "320,340";
		matrizPuntos[33][34] = "330,340";//cll6a arriba
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
		matrizPuntos[30][22] = "300,220";
		matrizPuntos[31][27] = "310,270";
		matrizPuntos[32][26] = "320,260";
		matrizPuntos[33][25] = "330,250";//interseccion cll9 == abajo
		matrizPuntos[34][26] = "340,260";
		matrizPuntos[35][27] = "350,270";
		matrizPuntos[32][24] = "320,240";
		matrizPuntos[31][23] = "310,230";
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
		matrizPuntos[16][7] = "160,70";
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
		matrizPuntos[10][13] = "100,130";
		matrizPuntos[9][14] = "90,140";
		matrizPuntos[8][15] = "80,150";
		matrizPuntos[7][16] = "70,160";
		matrizPuntos[6][17] = "60,170";
		matrizPuntos[5][17] = "50,170";
		matrizPuntos[4][17] = "40,170";
		matrizPuntos[3][17] = "30,170";
		matrizPuntos[2][17] = "20,170";
		matrizPuntos[1][17] = "10,170";
		matrizPuntos[27][15] = "270,150";
		matrizPuntos[28][14] = "280,140";
		matrizPuntos[29][13] = "290,130";
		matrizPuntos[30][12] = "300,120";
		matrizPuntos[31][12] = "310,120";
		matrizPuntos[32][11] = "320,110";
		matrizPuntos[33][10] = "330,100";
		matrizPuntos[34][10] = "340,100";
		matrizPuntos[33][9] = "330,90";
		matrizPuntos[32][8] = "320,80";
		matrizPuntos[31][7] = "310,70";
		matrizPuntos[30][6] = "300,60";
		matrizPuntos[29][5] = "290,50";
		matrizPuntos[28][4] = "280,40";
		matrizPuntos[27][4] = "270,40";
		matrizPuntos[26][5] = "260,50";
		matrizPuntos[25][6] = "250,60";
		matrizPuntos[27][3] = "270,30";
		matrizPuntos[26][2] = "260,20";
		matrizPuntos[25][1] = "250,10";
		matrizPuntos[35][11] = "350,110";
		matrizPuntos[36][12] = "360,120";
		matrizPuntos[35][13] = "350,130";
		matrizPuntos[34][14] = "340,140";
		matrizPuntos[33][15] = "330,150";
		matrizPuntos[37][13] = "370,130";
		matrizPuntos[38][14] = "380,140";
		matrizPuntos[39][14] = "390,140";
		matrizPuntos[39][13] = "390,130";
		matrizPuntos[39][12] = "390,120";
		matrizPuntos[39][11] = "390,110";
		matrizPuntos[40][11] = "400,110";
		matrizPuntos[41][11] = "410,110";
		matrizPuntos[42][11] = "420,110";
		matrizPuntos[43][11] = "430,110";
		matrizPuntos[44][11] = "440,110";
		matrizPuntos[45][11] = "450,110";
		matrizPuntos[46][11] = "460,110";
		matrizPuntos[46][10] = "460,100";
		matrizPuntos[46][9] = "460,90";
		matrizPuntos[46][8] = "460,80";
		matrizPuntos[46][7] = "460,70";
		matrizPuntos[40][13] = "400,130";
		matrizPuntos[41][13] = "410,130";
		matrizPuntos[42][13] = "420,130";
		matrizPuntos[43][13] = "430,130";
		matrizPuntos[43][12] = "430,120";
		matrizPuntos[39][15] = "390,150";
		matrizPuntos[39][16] = "390,160";
		matrizPuntos[39][17] = "390,170";
		matrizPuntos[39][18] = "390,180";
		matrizPuntos[40][19] = "400,190";
		matrizPuntos[41][19] = "410,190";
		matrizPuntos[42][20] = "420,200";
		matrizPuntos[43][21] = "430,210";
		matrizPuntos[44][21] = "440,210";
		matrizPuntos[45][21] = "450,210";
		matrizPuntos[46][21] = "460,210";
		matrizPuntos[47][21] = "470,210";
		matrizPuntos[48][20] = "480,200";
		matrizPuntos[49][20] = "490,200";
		matrizPuntos[39][18] = "390,180";//al lado de bomberos otra calle
		matrizPuntos[38][18] = "380,180";
		matrizPuntos[37][18] = "370,180";
		matrizPuntos[36][18] = "360,180";
		matrizPuntos[35][19] = "350,190";
		matrizPuntos[34][20] = "340,200";
		matrizPuntos[34][21] = "340,210";
		matrizPuntos[35][22] = "350,220";
		matrizPuntos[35][23] = "350,230";//cll10
		matrizPuntos[35][24] = "350,240";
		matrizPuntos[35][25] = "350,250";
		matrizPuntos[35][26] = "350,260";//cll9
		matrizPuntos[34][28] = "340,280";
		matrizPuntos[33][28] = "330,280";
		matrizPuntos[32][29] = "320,290";
		matrizPuntos[31][29] = "310,290";
		matrizPuntos[32][30] = "320,300";
		matrizPuntos[33][31] = "330,310";//cll8

		matrizPuntos[39][10] = "390,100";
		matrizPuntos[39][9] = "390,90";
		matrizPuntos[38][8] = "380,80";
		matrizPuntos[38][7] = "380,70";
		matrizPuntos[38][6] = "380,60";
		matrizPuntos[38][5] = "380,50";
		matrizPuntos[38][4] = "380,40";
		matrizPuntos[37][3] = "370,30";
		matrizPuntos[37][2] = "370,20";
		matrizPuntos[37][1] = "370,10";
		matrizPuntos[38][1] = "380,10";
		matrizPuntos[39][1] = "390,10";
		matrizPuntos[40][1] = "400,10";
		matrizPuntos[41][1] = "410,10";
		matrizPuntos[42][2] = "420,20";
		matrizPuntos[43][2] = "430,20";
		matrizPuntos[44][3] = "440,30";
		matrizPuntos[45][3] = "450,30";
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
		matrizPuntos[33][17] = "330,170";
		matrizPuntos[32][18] = "320,180";
		matrizPuntos[31][19] = "310,190";
		matrizPuntos[30][20] = "300,200";
		matrizPuntos[34][17] = "340,170";
		matrizPuntos[35][16] = "350,160";
		matrizPuntos[36][15] = "360,150";
		matrizPuntos[37][14] = "370,140";

	
	   //Label calcular
	   GLabel LabelCalcular = new GLabel("Calcular",10,100);
	   //Label que muestra un mensaje en pantalla
	   GLabel labelError = new GLabel("",100,10);

	   //funcion que captura el click sobre el boton calcular
	   LabelCalcular.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent arg0) {
		        
		    	
		    	// Acá entra solo cuando se de click sobre el boton calcular
		    	
		    	//Validamos si ya se ha escogido un punto inicial y un punto final antes de empezar a buscar la ruta
		    	if(puntoInicial==0 || puntofinal==0 )
		    	{
		    		//muestra en pantalla el mensaje
		    		labelError.setLabel("Debe hacer click dos veces para elegir el punto inicial y final respectivamente");
		    		return;
		    	}
		    	
		    	//Toma el punto x en pantalla de la posicion inicial y lo divide en 10  para transformarlo en la posicion X de la matriz de puntos
		    	int xInicial=(int)xi/10;
		    	//Toma el punto y en pantalla de la posicion inicial y lo divide en 10  para transformarlo en la posicion y de la matriz de puntos
		    	int yinicial=(int)yi/10;
		    	//Toma el punto x en pantalla de la posicion final y lo divide en 10  para transformarlo en la posicion X de la matriz de puntos
		    	xFinal=(int)xf/10;
		    	//Toma el punto y en pantalla de la posicion final y lo divide en 10  para transformarlo en la posicion y de la matriz de puntos
		    	yFinal=(int)yf/10;
		    	
		    	
		    	//validamos si el punto inicial existe en la matriz 
		    	if(matrizPuntos[xInicial][yinicial] == null)
		    	{
		    		//si no esta el punto, mira el mas cercano arriba
		    		if(matrizPuntos[xInicial-1][yinicial] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial-1;
		    		}
		    		//si no esta el punto, mira el mas cercano abajo
		    		else if(matrizPuntos[xInicial+1][yinicial] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial+1;
		    		}
		    		//si no esta el punto, mira el mas cercano izquierda
		    		else if(matrizPuntos[xInicial][yinicial-1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			yinicial=yinicial-1;
		    		}
		    		//si no esta el punto, mira el mas cercano derecha
		    		else if(matrizPuntos[xInicial][yinicial+1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			yinicial=yinicial+1;
		    		}
		    		//si no esta el punto, mira el mas cercano izquierda arriba
		    		else if(matrizPuntos[xInicial-1][yinicial-1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial-1;
		    			yinicial=yinicial-1;
		    		}
		    		//si no esta el punto, mira el mas cercano derecha arriba
		    		else if(matrizPuntos[xInicial-1][yinicial+1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial-1;
		    			yinicial=yinicial+1;	
		    		}
		    		//si no esta el punto, mira el mas cercano derecha abajo
		    		else if(matrizPuntos[xInicial+1][yinicial+1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial+1;
		    			yinicial=yinicial+1;
		    		}
		    		//si no esta el punto, mira el mas cercano izquierda abajo
		    		else if(matrizPuntos[xInicial+1][yinicial-1] != null)
		    		{
		    			//cambia la posicion inicial si existe el punto en la matriz
		    			xInicial=xInicial+1;
		    			yinicial=yinicial-1;
		    		}
		    		else
		    		{
		    		//si no encuentra un punto cercano valida arroja el mensaje que el punto inicial es invalido
		    		labelError.setLabel("El punto inicial no es valido "+xi+" "+yi);
		    		return;
		    		}
		    	}
		    	
		    	//se hace la misma validacion anterior pero con el punto final
		    	if(matrizPuntos[xFinal][yFinal] == null)
			    {
		    		if(matrizPuntos[xFinal-1][yFinal] != null)
		    		{
		    			xFinal=xFinal-1;
		    		}
		    		else if(matrizPuntos[xFinal+1][yFinal] != null)
		    		{
		    			xFinal=xFinal+1;
		    		}
		    		else if(matrizPuntos[xFinal][yFinal-1] != null)
		    		{
		    			yFinal=yFinal-1;
		    		}
		    		else if(matrizPuntos[xFinal][yFinal+1] != null)
		    		{
		    			yFinal=yFinal+1;
		    		}
		    		
		    		else if(matrizPuntos[xFinal-1][yFinal-1] != null)
		    		{
		    			xFinal=xFinal-1;
		    			yFinal=yFinal-1;
		    		}
		    		else if(matrizPuntos[xFinal-1][yFinal+1] != null)
		    		{
		    			xFinal=xFinal-1;
		    			yFinal=yFinal+1;
		    		}
		    		else if(matrizPuntos[xFinal+1][yFinal+1] != null)
		    		{
		    			xFinal=xFinal+1;
		    			yFinal=yFinal+1;
		    		}
		    		else if(matrizPuntos[xFinal+1][yFinal-1] != null)
		    		{
		    			xFinal=xFinal+1;
		    			yFinal=yFinal-1;
		    		}
		    		
		    		else
		    		{
		    			labelError.setLabel("El punto final no es valido "+xf+" "+yf);
		    			return;
		    		}
		    	}
		    	
		    	//si se encontraron los dos puntos se imprime que los puntos son validos
		    	labelError.setLabel("Los puntos son validos");

		    	
		    	//empezamos a busscar en el sentido de las manecillas del reloj, se invoca la funcion buscar ruta en cada direccion, esta funcion es recursiva
		    	
		    	//Buscar arriba
		    	buscarRuta(xInicial-1,yinicial);
		    	//Buscar arriba-derecha
		    	if(encontrado==0)
		    		buscarRuta(xInicial-1,yinicial+1);
		    	//Buscar derecha
		    	if(encontrado==0)
		    		buscarRuta(xInicial,yinicial+1);
		    	//Buscar abajo-derecha
		    	if(encontrado==0)
		    		buscarRuta(xInicial+1,yinicial+1);
		    	//Buscar abajo
		    	if(encontrado==0)
		    		buscarRuta(xInicial+1,yinicial);
		    	//Buscar abajo-izquierda
		    	if(encontrado==0)
		    		buscarRuta(xInicial+1,yinicial-1);
		    	//buscar izquierda
		    	if(encontrado==0)
		    		buscarRuta(xInicial,yinicial-1);
		    	//buscar arriba - izquierda
		    	if(encontrado==0)
		    		buscarRuta(xInicial-1,yinicial-1);
		    	
		    	// se recorre el arreglo que guardo los puntos buscados
		    	for(int i=0;i<5092;i++)
	    		   {
		    		   //si en la posicion del arreglo existe algo lo imprime en pantalla
	    			   if(arregloRuta[i]!="" && arregloRuta[i] != null)
	    			   {
	    				   //imprime punto a punto la solucion encontrada
	    				   GOval a =new GOval(
	    						   Integer.parseInt(arregloRuta[i].split(",")[0]),
	    						   Integer.parseInt(arregloRuta[i].split(",")[1])
	    						   		,8,8);
	    				   add(a);
	    			   }
	    			   //sai ya no hay mas puntos termina la impresion
	    			   else  if(arregloRuta[i]==null)
	    			      break;
	    			   
	    		   }
		    		
		    }
		});
	   
	   //agrega a la pantalla el boton label "calcular"
	   add(LabelCalcular);
	   //agrega a la pantalla el boton label que me permite mostrar mensajes en pantalla
	   add(labelError);

}

//funcion recursiva que se llama a si misma para ir buscando la ruta de un punto a otro, hasta encontrar el punto final
public void buscarRuta(int x, int y)
{
	   //valido si ya encontrè el punto final
	   if(x==xFinal && y==yFinal)
	   {
		   encontrado=1;
		   arregloRuta[indiceRuta]=matrizPuntos[x][y];
	   }
	   else
	   {
		   //valido si el punto buscado existe en la matriz
		   if(matrizPuntos[x][y]!="" && matrizPuntos[x][y] != null)
		   {
			   int Nodoyaencontrado=0;
			   //recorro el arreglo de la solcuion, para no agregar puntos repetidos
			   for(int i=0;i<5092;i++)
 		   {
				   //valido el final del arreglo solucion
 			   if(arregloRuta[i]!="" && arregloRuta[i] != null)
 			   {
 				   //si el nodo ya lo habia ingresado en el arreglo solucion rompo la busqueda para que la funcion recursiva busque por otro camino
 				   if(arregloRuta[i]==matrizPuntos[x][y])
 				   {
 					   Nodoyaencontrado=Nodoyaencontrado+1;
 					   return;
 				   }
 			   }
 			   else
 				   break;
 			   
 		   }
			   
			   //solo si es un punto nuevo lo agrego al vector solucion
			   if(Nodoyaencontrado==0)
			   {
				   //agrego el punto al vector solucion
				   arregloRuta[indiceRuta]=matrizPuntos[x][y];
				   //incremento en 1 la posicion del vector solucion para agregar un nuevo punto la proxima vez que la funcion recursiva encuentre un punto candidato
				   indiceRuta=indiceRuta+1;
			   }
		   }
		   else
		   {
			  //si no existe el punto rompo la busqueda para valdiar otro camino 
			  return; 
		   }
		   
	   }
	   
	   
	   //de aqui hacia abajo invoco de manera recursiva (llamado asi mismo de la funcion buscar ruta) hasta encontrar el punto final
	   
	   //Buscar arriba
	   if(encontrado==0)
	   	   buscarRuta(x-1,y);
	   	//Buscar arriba-derecha
		if(encontrado==0)
			buscarRuta(x-1,y+1);
		//Buscar derecha
		if(encontrado==0)
			buscarRuta(x,y+1);
		//Buscar abajo-derecha
		if(encontrado==0)
			buscarRuta(x+1,y+1);
		//Buscar abajo
		if(encontrado==0)
			buscarRuta(x+1,y);
		//Buscar abajo-izquierda
		if(encontrado==0)
			buscarRuta(x+1,y-1);
		//buscar izquierda
		if(encontrado==0)
			buscarRuta(x,y-1);
		//buscar arriba - izquierda
		if(encontrado==0)
			buscarRuta(x-1,y-1);
	
		return;
}


//declaracionde variables globales

//controla la posicion del vector solucion
int indiceRuta=0;
//almacena la posicion  x del punto final
int xFinal=0;
//ALMACENA LA POSICION y del punto final
int yFinal=0;
// flag que almacena cuando ya se haya encontrado la solucion
int encontrado=0;
//Arreglo solucion
String arregloRuta[] = new String[5092];

//matriz de todos los puntos del mapa
String matrizPuntos[][] = new String[76][67];

//valida si se ha agregado un punto inicial
int puntoInicial=0;

//valida si se ha agregado un punto final
int puntofinal=0;

//almacena los pixeles en x y y de la posicion inicial
double xi=0;
double yi=0;

//almacena los pixeles en x y y de la posicion final
double xf=0;
double yf=0;

//captura el evento click sobre el mapa para captrurar las posiciones inicial y final
public void mousePressed(MouseEvent e) {
    
	   //si es e primer click guarda la posicion inicial
	   if(puntoInicial==0)
    {
 	   puntoInicial=1;
 	   xi = e.getX();
 	   yi = e.getY();
    
 	   //pinta en rojo el punto inicial
 	   GOval a =new GOval(xi,yi,8,8);
 	   a.setFilled(true);
 	   a.setFillColor(Color.RED);
 	   add(a);
    }
	   //si por el contrario ya ha guardado la posicion inicial, sigue con la posicion final
    else if(puntofinal==0)
    {
 	   puntofinal=1;
 	   xf = e.getX();
 	   yf = e.getY();
    
 	   //pinta en azul el punto final
 	   GOval af =new GOval(xf,yf,8,8);
 	   af.setFilled(true);
 	   af.setFillColor(Color.BLUE);
 	   add(af);
    }
}
}