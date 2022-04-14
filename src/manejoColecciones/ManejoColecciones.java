package manejoColecciones;

import java.util.*;

public class ManejoColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		//repite el numero
		miLista.add(3);
		
	//	imprimir(miLista);
		
		//elemento agrgado noi se duplica
		Set miSet =  new HashSet();
		miSet.add("100");
		miSet.add("200");
		miSet.add("300");
		//no repite el numero
		miSet.add("300");
		
		imprimir(miSet);
		
		Map miMap = new HashMap();
		miMap.put("valor1", "Luis");
		miMap.put("valor2", "Erick");
		miMap.put("valor3", "David");
		//elemento duplicado sustituye el valor agregado anteriormente
		miMap.put("valor3", "Eliseo");
		//imprimir todas las llaves
		//imprimir(miMap.keySet());
		//imprimir los valores
		//imprimir(miMap.values());
		System.out.println(miMap.get("valor3"));
	}
	
	public static void imprimir(Collection collection) {
		for(Object elementos:collection) {
			System.out.println("ELEMENTO:"+elementos);
		}
		System.out.println("");
	}

}
