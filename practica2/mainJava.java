package practica2;

public class mainJava {
public static void main(String[] args) {
	System.out.println("Ingresa anio:");
	int A=Leer.datoInt();
	Fecha fecha = new Fecha (D,M,A);
	if(fecha.fechaCorrecta()) {
		System.out.println("La fecha: "+fecha+"Es correcta");
	}else {
		System.out.println("La Fecha: "+fecha+"Es incorrecta");
	}
}
}
