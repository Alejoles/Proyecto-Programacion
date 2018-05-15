import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import acm.program.*;

public class Tareapunto2 extends ConsoleProgram{
	private static final long serialVersionUID = 1L;
	
	public void run() {
		texto();
	}
	
	//------------------------------------------------------------
	int sale = 0, numeros = 0, prom = 0, cont = 0, max = 0, min = 0, i = 0, TM = 0, TM1 = 0, j = 0;
	ArrayList <Integer> alv = new ArrayList <Integer> ();
	ArrayList<Integer> alv1 = new ArrayList<Integer>();
	ArrayList<Integer> alv2 = new ArrayList<Integer>();
	ArrayList<Integer> alvu = new ArrayList<Integer>();
	ArrayList<Integer> alvd = new ArrayList<Integer>();
	ArrayList<Integer> alvi = new ArrayList<Integer>();

	//-------------------------------------------------------------
	public void texto() {
		Scanner file = null;
		try {
		file = new Scanner(new File("/home/acer/Escritorio/Numrs"));
			while(file.hasNext()) {
				numeros = file.nextInt();
				sale = numeros + sale;
				alv.add(cont, numeros);
				cont++;
			}
			println("Los numeros son: "+alv);
			Collections.sort(alv);
			file.close();
			
		}catch (IOException ex){
			println("Puede que el archivo no se encuentre en el sitio\nO este mal escrito, intentelo de nuevo");
		}
		//PROMEDIO---------------------------
		prom = sale / cont;
		println("El promedio es: "+prom);
		//-----------------------------------
		//MAX Y MIN--------------------------
		min = alv.get(0);
		Collections.sort(alv, Collections.reverseOrder());
		max = alv.get(0);
		println("El numero maximo es: "+max +"\nEl numero minimo es: "+min);
		Collections.shuffle(alv);
		//-----------------------------------
		//PARES E IMPARES--------------------
		println("Los numeros impares son: ");
		for(i = 0; i < alv.size(); i++) {
			if(alv.get(i)%2 == 0) {
				continue;
			}
			else {
				println(alv.get(i));
				
			}
		}
		
		//-----------------------------------
		//DIVIR EN 2 ARREGLOS
		ArrayList<Integer> alv1 = new ArrayList<Integer>();
		ArrayList<Integer> alv2 = new ArrayList<Integer>();
		for(i=0;i < (alv.size()/2); i++) {
			alv1.add(i, alv.get(i));
		}
		for(i = 0; i < alv.size()/2;){
		for(j=alv.size()/2; j < alv.size();j++) {
			alv2.add(i, alv.get(j));
			i++;
		}}
		if(alv1.size()%2 == 0)println("Arreglo dividido: "+alv1+ alv2);
		else println("Arreglo impar dividido: "+alv1+alv2);
		//-----------------------------------
		//UNION------------------------------
		alvu.addAll(alv1);
		alvu.addAll(alv2);
		println("la union es: "+alvu);
		//-----------------------------------	
		//DIFERENCIA-------------------------
		alvd.addAll(alv);
		alvd.removeAll(alv2);
		println("La diferencia es: "+alvd);
		//-----------------------------------
		//INTERSECCION-----------------------
		alv1.retainAll(alv2);
		println("La interseccion es: "+ alv1);
		//-----------------------------------
	}	

}
