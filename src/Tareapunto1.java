import acm.program.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tareapunto1 extends ConsoleProgram{
	private static final long serialVersionUID = 1L;
	
	public void run() {
		texto();
	}
	
	//-----------------------------
	int cont = 0;
	String txt = "";
	String plural = "";
	ArrayList <String> papa = new ArrayList <String> ();

	//-----------------------------
	
	public void texto() {
		Scanner file = null;
		try {
			file = new Scanner(new File("/home/acer/Escritorio/Comer"));
			while(file.hasNext()) {
                txt = file.next();
				papa.add(cont, txt);
				cont++;
			}
			println(papa);
			file.close();
		}catch (IOException ex){
			println("Puede que el archivo no se encuentre en el sitio\nO este mal escrito, intentelo de nuevo");
		}
		//PALABRAS PLURAL------------
		println("\nLas palabras en plural son: ");
		for(int i = 0; i < papa.size(); i++) {
			plural = papa.get(i);
				if(plural.endsWith("s")||plural.endsWith("S")) {
					println(papa.get(i));
				}
		}
		//---------------------------
		//IMPRIME PANTALLA ORDEN CONTRARIO-----
		println("\nEn orden contrario: ");
		for(int i = papa.size()-1; i > 0 ;i--) {
			print(papa.get(i)+" ");

		}
		//-------------------------------------
		//REMOVIENDO PALABRAS PLURAL-----------
		println("\n\nTexto sin palabras en plural: ");
		for(int i = 0; i < papa.size(); i++) {
			plural = papa.get(i);
				if(plural.endsWith("s")||plural.endsWith("S")) {
					continue;
				}else print(papa.get(i)+" ");
		}		
		//-------------------------------------
		//VERSION EN MAYUSCULAS
		println("\n\nCada palabra plural en mayuscula: ");
		for(int i = 0; i < papa.size(); i++) {
			plural = papa.get(i);
				if(plural.endsWith("s")||plural.endsWith("S")) {
					println(papa.get(i).toUpperCase());
				}
		}
		//-------------------------------------

		//VOCALES QUE SE REPITEN---------------
/*		int a = 0,e=0,i=0,o=0,u=0;
		String vocales = "";
		for(int j = 0;j<papa.size();i++) {
			vocales = papa.get(i);
			for(int l=0;l<vocales.length(); l++) {
				if(vocales.charAt(l)=='a'||vocales.charAt(l)=='A')a++;
				else if(vocales.charAt(l)=='e'||vocales.charAt(l)=='E')e++;
				else if(vocales.charAt(l)=='i'||vocales.charAt(l)=='I')i++;
				else if(vocales.charAt(l)=='o'||vocales.charAt(l)=='O')o++;
				else if(vocales.charAt(l)=='u'||vocales.charAt(l)=='U')u++;
			}
		}println("a="+a+"\n"+"e="+e+"\n"+"i="+i+"\n"+"o="+o+"\n"+"u="+u);
*/		
		//-------------------------------------
		//ELIMINA LAS MAYUS--------------------
		println("\n\nElimina las mayusculas del arreglo");
		for(int j = 0; j < papa.size(); j++) {
			plural = papa.get(j);
				if(plural.endsWith("s")||plural.endsWith("S")) {
					papa.remove(j);
				}
		}println(papa);
		//-------------------------------------
	}
} 