package practica2;

public class Fecha {
 private int Dia;
 private int Mes;
 private int Anio;
 int fechaCorrecta;
 int fecha;
 public Fecha() {
	 
 }
 public Fecha(int dia,int mes,int anio) {
	 super();
	 Dia = dia;
	 Mes =mes;
	 Anio=anio;
	 
	 
 }
 public boolean FechaCorrecta() {
	 boolean Bien=true;
	 return Bien;
 }
 public String DiaSiguiente() {
	 String FechS="dd/mm/aaaa";
	 return FechS;
 }
public int getDia() {
	return Dia;
}
public int getMes() {
	return Mes;
}
public int getAnio() {
	return Anio;
}

	
}

 

