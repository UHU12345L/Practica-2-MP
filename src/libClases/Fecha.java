package libClases;
import java.util.Scanner;
public final class Fecha implements Cloneable, Proceso {
	private int dia;
	private int mes;
	private int anio;
	
	public void setFecha(int d, int m, int a) {
		int dmax, diaMes[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		anio=a;
		if(m<1) {
			m=1;
		}else if(m>12) {
			m=12;
		}
		
		dmax=diaMes[m-1];
		if(m==2 && bisiesto()) {
			dmax++;
		}else if(d>dmax) {
			d=dmax;
		}else if(d<1) {
			d=1;
		}
		dia=d;
		mes=m;
	}
	
	public Fecha(int dia, int mes, int anio) {  
		  setFecha(dia, mes, anio); 
		 } 
		  
		 public Fecha(Fecha f) { 
		  dia=f.dia; 
		  mes=f.mes; 
		  anio=f.anio; 
		 } 
		  
		 public int getDia() { return dia; } 
		 public int getMes() { return mes; } 
		 public int getAnio() { return anio; } 
		 
		 
		 
		 
	public boolean bisiesto() {
		boolean bi=false;
		if(anio%4==0) {
			bi=true;
		}if(anio%100==0 &&anio%400!=0){
			bi=false;
		}
		return bi;
	}
	
	public void ver() {
	    // TODO: completar después
	}

	public boolean equals(Object obj) {
	    // TODO: completar después
	    return false;
	}
	
}

//de cliente atributo fecha de alta cambiar un final porque pone que si se puede modificar
