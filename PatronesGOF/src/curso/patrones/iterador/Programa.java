package curso.patrones.iterador;

public class Programa {
	public static void main(String[] args) {
		MenuDesayunos desayunos=new MenuDesayunos();
		desayunos.a�adir(new ItemMenu("desayuno normal","caf� y bollo",2,true));
		desayunos.a�adir(new ItemMenu("desayuno super","caf�, zumo, huevos y bacon",4,false));
		desayunos.a�adir(new ItemMenu("pulguita","ca�a y pulga",2.50,false));
		
		MenuCenas cenas=new MenuCenas();
		cenas.a�adir(new ItemMenu("ensalada mixta","tomate, lechuga y atun",5,true));
		cenas.a�adir(new ItemMenu("perrito","hot dog con patatas",3,false));
		cenas.a�adir(new ItemMenu("ensalada pasta","pasta, y salsa rosa",4.50,true));
		cenas.a�adir(new ItemMenu("PIZZA","distintos sabores",2,true));
		
		Carta carta=new Carta(desayunos,cenas);
		carta.imprimir();
		
	}
}
