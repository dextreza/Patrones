package _02_sOlid_Principio_de_abierto_cerrado_ejemplo3;

public interface AltaProductoStrategy {

	//Lo normal es que el m�todo de la estrategia se llame ejecutar, pero
	//que no se llame as� nohace que esto deje de ser un Strategy
	void ejecutar(Producto producto);

}
