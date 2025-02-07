package practica2;

public class main {
public static void main(String[] args) {
	System.out.println("Ingresa anio:");
	int A=Leer.datoInt();
	System.out.println("Ingresa mes:");
	int M=Leer.datoInt();
	System.out.println("Ingresa dia:");
	int D=Leer.datoInt();
	Fecha fecha = new Fecha (D,M,A);
	if(fecha.FechaCorrecta()){
		System.out.println("La fecha: "+fecha.ToString()+" Es correcta");
	}else {
		System.out.println("La Fecha: "+fecha.ToString()+"Es incorrecta");
	}
	for(int i=0;i<10;i++) {
		fecha.DiaSiguiente();
		System.out.println("Dia Siguiente: "+fecha.ToString());
	}
}
}