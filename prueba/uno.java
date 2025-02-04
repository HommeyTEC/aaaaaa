package prueba;

public class uno {
	private String Modelo;
	private String Marca;
	private int precio;
	
	public uno(){
		
	}
	public uno(String mar, String mod, int pre) {
	Marca=mar;
	precio=pre;
	Modelo = mod;
	}
	
public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
public static void main(String[] args) {
	
}
}
