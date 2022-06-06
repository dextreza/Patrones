package _05_soliD_Principio_de_inversion_de_dependencias_parte2;

public class ServicioClientes_4 {

	private ClienteDao clienteDao ;
	
	//Esto est� bien si tienes un contenedor (Inyecci�n de dependencias)
	//IoC tambi�n
	//Y ya podemos hacer test doubles
	//Y no estamos acoplados con una implementaci�n concreta de ClienteDao
	public ServicioClientes_4(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	public void altaCliente(Cliente cliente) {
		System.out.println("Validando la direcci�n");
		System.out.println("Buscando una sucursal");
		System.out.println("Asignando un comercial");
		clienteDao.insertar(cliente);		
	}
	
}
