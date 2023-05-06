package testes;

import java.util.ArrayList;
import java.util.List;

public class TestarListasJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>(); 
		List<String> lista1 = new ArrayList<String>(); 
		
		lista.add("Primeiro"); 
		lista.add(1, "Segundo");
		lista.remove(0);
		lista.size();
		lista.isEmpty();
		lista.clear();
		lista.get(0);
		lista.addAll(lista1);
		
	}

}
