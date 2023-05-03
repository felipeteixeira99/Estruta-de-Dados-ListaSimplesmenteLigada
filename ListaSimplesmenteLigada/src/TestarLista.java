
public class TestarLista {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
//		System.out.println(lista.isempty());
//		System.out.println(lista.getTamanho());
//		System.out.println(lista.getInicio());
//		lista.getAdicionarElemento("Primeiro");
//		lista.getAdicionarElemento("Segundo");
//		lista.getAdicionarElemento("Terceiro");
//		System.out.println(lista);
//		lista.getAdicionarElementoPosicao("Quarto", 1);
//		System.out.println(lista);
//		lista.getRemoverElemento("Terceiro");
//		System.out.println(lista);
//		lista.getRemoverElementoPosicao(1);
//		//System.out.println(lista.getTamanho());
//		System.out.println(lista);
//		System.out.println(lista.getElemento(1));
//		lista.getAdicionarElemento("Teste");
//		System.out.println(lista);
//		System.out.println(lista.getPosicao("Teste"));
		
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
