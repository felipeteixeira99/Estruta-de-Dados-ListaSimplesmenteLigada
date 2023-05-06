package listas;

public interface Lista {
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
	
	public int getTamanho(); //retorna o tamanho da lista 
	
	public void getAdicionarElemento(String valor); //adicionar um elemento ao final da lista
	
	public void getAdicionarElementoPosicao(String valor, int posicao); //adiciona um elemento em uma posicao especifica
	
	public void getRemoverElemento(String valor); //remove um elemento da lista 

	public void getRemoverElementoPosicao(int posicao); // remove um elemeto da lista de acordo com sua posicao
	
	public String getElemento(int Posicao); //retorna o elemeto da lista de acordo com a sua posicao
	
	public int getPosicao(String valor); //retorna a posicao do elemento, e deve retornar -1 se ele nao existir na lista 
	
	public boolean isempty(); //verifica se a lista esta vazia 
	
	//public boolean estaVazia()//verifica se a lista esta vazia 
	
	public void getLimparLista(); //esvazia a lista

}
