package curso.patrones.iterador;

public class ItemMenu {
	private String nombre;
	private String descripci�n;
	private double precio;
	private boolean vegetariano;
	
	public ItemMenu() {
	
	}

	public ItemMenu(String nombre, String descripci�n, double precio,
			boolean vegetariano) {
		this.nombre = nombre;
		this.descripci�n = descripci�n;
		this.precio = precio;
		this.vegetariano = vegetariano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	
	@Override
	public String toString() {
		return nombre+"-->"+precio+(vegetariano?"(V)":"")+"\n"+descripci�n+"\n";
	}
	
}
