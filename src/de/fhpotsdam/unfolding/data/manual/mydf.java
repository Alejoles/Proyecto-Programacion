package de.fhpotsdam.unfolding.data.manual;
import acm.program.*;
public class mydf extends ConsoleProgram{
	public class Popo{
		String hola;
		Popo(){
			hola = "";
		}
		public String toString() {
			return hola;
		}
	}
	public void run() {
		Popo p = new Popo();
		println(p);
	}
}
