package PracticaAgenda;

public class agenda {
private String Nombre;
private String Telefono;


public agenda()
{ }

public agenda(String nombre, String telefono) {
	super();
	Nombre = nombre;
	Telefono = telefono;

}
public String ToString() {
	return "";
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getTelefono() {
    return Telefono;
}

public void setTelefono(String telefono) {
   Telefono=telefono;
}
public static void Registrar(Contacto[] agenda,String nombre) {
	String numero = "";
	boolean contacto_invalido = false;
	boolean Hecho = false;
	do {
		if(AgendaLlena(agenda)) 
			break;
		contacto_invalido= ExisteContacto(agenda,nombre);
		if(contacto_invalido==true) {
			System.out.println("Contacto ya registrado");
			Hecho=true;
			break;
		}
		for(int k=0;k<agenda.lenght;k++) {
			if(agenda[k].getNombre()=="*") {
				System.out.println("Telefono del contacto #"+(k+1)+": ");
				numero=Leer.dato();
				if(numero.lenght()>10) {
					numero=numero.substring(0,10);
				}
			}
		}
		
	}
}


}
