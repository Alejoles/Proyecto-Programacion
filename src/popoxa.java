import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import acm.program.*;

public class popoxa extends ConsoleProgram{
	private static final long serialVersionUID = 1L;
	
	public void run(){
		texto();
//		inters();
		
	}
	//------------------------------------------------------------
	int sale = 0, numeros = 0, prom = 0, cont = 0, max = 0, min = 0, i = 0, TM = 0, TM1 = 0;
	ArrayList <Integer> alv = new ArrayList <Integer> ();
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
		Collections.sort(alv);
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
		List<Integer> alv1 = alv.subList(0, alv.size()/2);
		List<Integer> alv2 = alv.subList(alv.size()/2, alv.size());
		if(alv1.size()%2 == 0)println("Arreglo dividido: "+alv1+ alv2);
		else println("Arreglo impar dividido: "+alv1+alv2);
		//-----------------------------------
	}

	public void union() {
		
	}
	public void difer() {
		
	}
/*	public void inters() {
		alv1.retainAll(alv2);
		println(alv1);
	}
*/
}
