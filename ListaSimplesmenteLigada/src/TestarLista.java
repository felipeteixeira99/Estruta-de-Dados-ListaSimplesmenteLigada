
public class TestarLista {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		System.out.println(lista.estaVazia());
		lista.adicionarElemento("Primeiro");
		lista.adicionarElemento("Segundo");
		lista.adicionarElemento("Terceiro");
		System.out.println(lista.estaVazia());
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		System.out.println(lista.getElemento(0));
		System.out.println(lista.getElemento(1));
		System.out.println(lista.getElemento(2));
		System.out.println(lista.getElemento(lista.getTamanho()-1));
		System.out.println(lista.estaVazia());
		System.out.println(lista);
		lista.removerElementoPosicao(3);
		System.out.println(lista);
		System.out.println(lista.getPosicao("Terceiros"));
		lista.adicionarElementoPosicao("Novo", 0);
		System.out.println(lista);
		lista.adicionarElemento("Quarto");
		System.out.println(lista);
		lista.removerElemento("Quarto");
		System.out.println(lista);
		lista.removerElementoPosicao(2);
		System.out.println(lista);
	}
}
