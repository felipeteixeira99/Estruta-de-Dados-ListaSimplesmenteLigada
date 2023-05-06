package testes;
import listas.Lista;
import listas.ligada.ListaSimples;

public class TestarLista {

	public static void main(String[] args) {
		Lista lista = new ListaSimples();
		System.out.println(lista.isempty());
		lista.getAdicionarElemento("Primeiro");
		lista.getAdicionarElemento("Segundo");
		lista.getAdicionarElemento("Terceiro");
		System.out.println(lista.isempty());
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		System.out.println(lista.getElemento(0));
		System.out.println(lista.getElemento(1));
		System.out.println(lista.getElemento(2));
		System.out.println(lista.getElemento(lista.getTamanho()-1));
		System.out.println(lista.isempty());
		System.out.println(lista);
		lista.getRemoverElementoPosicao(3);
		System.out.println(lista);
		System.out.println(lista.getPosicao("Terceiros"));
		lista.getAdicionarElementoPosicao("Novo", 0);
		System.out.println(lista);
		lista.getAdicionarElemento("Quarto");
		System.out.println(lista);
		lista.getRemoverElemento("Quarto");
		System.out.println(lista);
		lista.getRemoverElementoPosicao(2);
		System.out.println(lista);
	
	}
}
