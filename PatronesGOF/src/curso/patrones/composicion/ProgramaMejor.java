package curso.patrones.composicion;

import java.util.Arrays;
import java.util.List;

public class ProgramaMejor {
	public static void main(String[] args) {
		
		MenuComponente raiz=new MenuRama("carta del restaurante");
		
		
		MenuComponente desayunos=new MenuRama("desayunos");
		desayunos.a�adir(new ItemMenu("desayuno normal","caf� y bollo",2,true));
		desayunos.a�adir(new ItemMenu("desayuno super","caf�, zumo, huevos y bacon",4,false));
		desayunos.a�adir(new ItemMenu("pulguita","ca�a y pulga",2.50,false));
		
		MenuComponente cenas=new MenuRama("cenas");
		cenas.a�adir(new ItemMenu("ensalada mixta","tomate, lechuga y atun",5,true));
		cenas.a�adir(new ItemMenu("perrito","hot dog con patatas",3,false));
		cenas.a�adir(new ItemMenu("ensalada pasta","pasta, y salsa rosa",4.50,true));
		cenas.a�adir(new ItemMenu("PIZZA","distintos sabores",2,true));
		
		MenuComponente bebidas=new MenuRama("bebidas");
		bebidas.a�adir(new ItemMenu("orujo","de hierbas",1,true));
		bebidas.a�adir(new ItemMenu("pacharan","de endrinas",1.20,true));
		bebidas.a�adir(new ItemMenu("co�ac","magno",1.50,true));
		
		desayunos.a�adir(bebidas);
		cenas.a�adir(bebidas);
		
		raiz.a�adir(desayunos);
		raiz.a�adir(cenas);
		
		raiz.imprimir();
		
	}
}
