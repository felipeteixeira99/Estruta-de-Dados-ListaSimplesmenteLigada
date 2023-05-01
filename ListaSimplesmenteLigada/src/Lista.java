
	//so tem metodos
	//so tem assinatura dos metodos
	//Tem varios elementos
	//Tem inicio 
	//Tem um fim
	//Tem um tamanho 
	//E possivel adicionar elementos
	//E possivel adicionar elementos em posicoes especificas
	//E possivel remover elementos
	//E possivel remover elementos de acordo com a posicao
	//E possivel pegar um elemento de acordo com a posicao
	//E possivel pegar a posicao de acordo com o elemento
	//E possivel saber se a lista esta vazia
	//E possivel esvaziar a lista
public interface Lista {

		public int getTamanho(); //retornar o tamanho da lista
		
		public void adicionarElemento(String celula); //adicionar um elemento na lista
		
		public void adicionarElementoPosicao(String celula, int posicao); //adicionar um elemento por posicao especifica
		
		public void removerElemento(String Celula); //remover um elemento da lista 
		
		public void removerElementoPosicao(int posicao); //remover um elemento por posicao
		
		public String getElemento(int posicao); //retorna um elemento da lista de acordo com a sua posicao
		
		public int getPosicao(String valor); //pega a posicao do elemento e retorna -1 se ele nao existir 
		
		public boolean estaVazia(); //verifica se esta vazia e retorna true se sim e false se nao 
		
		public void limparLista(); //limpa a lista	
}
