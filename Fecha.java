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
	 if(Mes>=1 && Mes <=12) {
		 if(Dia>=1 && Dia<= diasEnMes(Mes)) {
			 return true;
		 }
	 }
	 return false;
 }
 private boolean esBisiesto() {
	 return(Anio % 4 ==0);
 }
 private int diasEnMes(int Mes) {
	 int[] diasPorMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	 if(Mes == 2 && esBisiesto()) {
		 return 29;
	 }
	 return diasPorMes[Mes];
 }
 public String ToString() {
	 return String.format("%02d-%02d-%d",Dia,Mes,Anio);
 }
public void DiaSiguiente() {
	if(FechaCorrecta()) {
		Dia++;
		if(Dia> diasEnMes(Mes)) {
			Dia=1;
			Mes++;
			if(Mes>12) {
				Mes=1;
				Anio++;
			}
		}
	}
}

	
}

