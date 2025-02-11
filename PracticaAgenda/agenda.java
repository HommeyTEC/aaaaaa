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



}
