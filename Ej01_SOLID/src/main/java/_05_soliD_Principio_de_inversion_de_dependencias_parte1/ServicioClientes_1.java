package _05_soliD_Principio_de_inversion_de_dependencias_parte1;

//ServicioClientes es una clase de alto nivel
//Depende de ClienteDao, que es de bajo nivel
//Tiene una relaci�n de uso, no de composici�n
public class ServicioClientes_1 {

	//Crear objetos con new en vez de simple es simpl�n
	//A ver quien hace un test double de esto...
	private ClienteDao clienteDao = new ClienteDao();
	
	public void altaCliente(Cliente cliente) {
		System.out.println("Validando la direcci�n");
		System.out.println("Buscando una sucursal");
		System.out.println("Asignando un comercial");
		clienteDao.insertar(cliente);		
	}
	
}
