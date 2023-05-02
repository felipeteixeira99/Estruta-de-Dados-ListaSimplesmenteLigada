
public class TestarLista {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		System.out.println(lista.isempty());
		System.out.println(lista.getTamanho());
		System.out.println(lista.getInicio());
		lista.getAdicionarElemento("Primeiro");
		lista.getAdicionarElemento("Segundo");
		lista.getAdicionarElemento("Terceiro");
		System.out.println(lista);
		lista.getAdicionarElementoPosicao("Quarto", 0);
		//System.out.println(lista.getTamanho());
		System.out.println(lista);

	}

}
