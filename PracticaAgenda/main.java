package PracticaAgenda;
public class main {
	
public static void main(String[] args) {
	String nombre ="";
	agenda[] Contacto = new agenda[10];
	for(int i=0;i<Contacto.length;i++) {
		Contacto[i].setNombre("*");
	}
	int Opcion=0;
	int A;
	String N="";
	boolean Existe=false;
	do {
    System.out.println("Agenda Telefonica!!");
    System.out.println("----------------------");
    System.out.println("1. Anadir contacto");
    System.out.println("2. Eliminar contacto");
    System.out.println("3. Consultar contacto");
    System.out.println("4. Listar agenda");
    System.out.println("5. Espacios disponibles");
    System.out.println("6. Salir de la agenda");
    System.out.println("-----------------------");
    System.out.println("Selecciona una opcion ");
    switch(Opcion) {
    case 1: 
    	System.out.print("Nombre del contacto: ");
    	nombre=Leer.dato();
    	Registrar(A,nombre);
    	break;
    case 2:
    	EliminarContacto(A);
    	break;
    }
    
    
    
    
    
    
	}while(true);
	
	}
}

