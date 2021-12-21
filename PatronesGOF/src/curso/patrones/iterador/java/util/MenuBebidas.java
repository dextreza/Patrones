package curso.patrones.iterador.java.util;

import java.util.Hashtable;
import java.util.Iterator;

public class MenuBebidas implements Menu {
	private Hashtable itemsMenu=new Hashtable();
	
	public void a�adir(ItemMenu item){
		itemsMenu.put(item.getNombre(), item);
	}

	public Iterator crearIterador() {
		return itemsMenu.values().iterator();
	}

}
