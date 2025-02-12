package PracticaAgendaa;
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
    case 3:
    ListaContactos(A);
    break;
    case 4:
    	ConsultaContacto(A)
    	break;
    case 5:
    	HuecosLibres(A)
    	break;
    case 6:
    	System.out.println("Saliendo de la agenda");
    	break;
    	default:
    		System.out.println("Error la opcion fuera de rango");
    		break;
    }
    if(Opcion==6) break;
	}while(true);
	}
public static void Registrar(Contacto[]agenda,String nombre) {
	String numero ="";
	boolean contacto_invalido = false;
	boolean Hecho=false;
	do
	{
		if(AgendaLlena(agenda)) break;
		contacto_invalido=ExisteContacto(agenda,nombre);
		if(contacto_invalido==true) {
			System.out.println("Contacto ya registrado");
			Hecho=true;
			break;
		}
		for(int k=0;k<agenda.length;k++) {
			if(agenda[k].getNombre()=="*") {
				System.out.println("Telefono del contacto#"+(k+1)+": ");
				numero=Leer.dato();
				if(numero.length()>10) {
					numero =numero.substring(0,10);
				}
			}
		}
	}
}
}

