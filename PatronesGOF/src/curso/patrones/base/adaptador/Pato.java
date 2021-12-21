package curso.patrones.base.adaptador;

public class Pato extends Ave {

	@Override
	public void mostrar() {
		System.out.println("soy un pato");

	}

	@Override
	public void cantar() {
		System.out.println("cua, cua");
		
	}

}
