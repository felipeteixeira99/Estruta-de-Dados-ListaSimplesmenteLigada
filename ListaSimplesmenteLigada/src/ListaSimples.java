
public class ListaSimples implements Lista{
	
	private Celula primeira; //uma variavel do tipo celula que so pode ser usada dentro dessa classe que aponta para a prmeira celula da lista 
	
	public Celula getInicio() { 
		return primeira;
	}
	
	public Celula getUltimo() {
		if(estaVazia()) {
			return null;
		}
		Celula atual = primeira;
		while(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		return atual;
	}
	
	
	@Override
	public int getTamanho() {
		//Percorrendo a lista e verificando se o proximo elemento a atual é diferente de null
		//Caso seja o contador vai ganhar mais um e no final a funcao retorna esse contador 
		if(estaVazia()) {
			return 0; //se essa condicao for true ja vai retornar 0
		}
		else {
			int c = 1; //se o codigo cair nessa condicao significa que pelo menos 1 elemento essa lista tem 
			Celula atual = primeira;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
				c++;
			}
			return c;
		}
	}

	@Override
	public void adicionarElemento(String valor) {
		Celula celula = new Celula(); //cria uma nova celula
		celula.setValor(valor); //passa o valor como elemento dentro dessa celula 
		if(estaVazia()) {
			primeira = celula; //se a lista estiver vazia, essa nova celula sera a primeira celula da lista 
		}
		else {
			getUltimo().setProximo(celula); //se nao essa celula vai ser a proxima celula da ultima celula
		}
	}

	@Override
	public void adicionarElementoPosicao(String valor, int posicao) {
		if(posicao > getTamanho()) return; 
		Celula novaCelula = new Celula(); //criando uma nova celula 
		novaCelula.setValor(valor); // passando valor como elemento dessa celula
		if(posicao == 0) {
			novaCelula.setProximo(primeira); //se for true a novaCelula vai apontar para a atual primeira 
			primeira = novaCelula; //primeira vai receber novaCalula ou seja esta havendo uma troca
		}
		else {
			Celula anterior = getCelula(posicao -1);
			Celula posterior = anterior.getProximo();
			anterior.setProximo(novaCelula);
			novaCelula.setProximo(posterior);
		}
	}

	@Override
	public void removerElemento(String valor) {	
		if(!estaVazia()) { //lista não esta vazia ? 
			Celula elementoParaRemover = null;
			for(int i = 0; i < getTamanho(); i++) {
				if(getElemento(i).equals(valor)) {
					elementoParaRemover = getCelula(i);
					break; //se ja tiver encontrado o elemento ele sai do for e não varre a lista ate o final
			}
		}
			if(elementoParaRemover == null) return; //se o elemento para remover = null a funcao nao retorna nada
			
			if(elementoParaRemover == primeira) {
				primeira = primeira.getProximo(); //se o elemento a remover for igual a primeira elemento o primeiro passa a ser o proximo
				return;
			}
			
			Celula elementoAnterior = null; //elemento anterior inicializado com null
											
			
			for(int i = 0; i < getTamanho(); i++) { //vai iterar na lista e verificar se 
				if(getCelula(i).getProximo() == elementoParaRemover) { // o proximo elemento é = ao elemento a ser removido ? 
					elementoAnterior = getCelula(i); //se sim entao o elemento anterior recebe a celula atual
					break;
				}
			}
			elementoAnterior.setProximo(elementoParaRemover.getProximo()); //elementoAnterior vai apontar para a celula que era apontada pelo o elemento a ser removido
																			//resumidamente o codigo vai pular o elemento que será removi
		}
	}

	@Override
	public void removerElementoPosicao(int posicao) {
		// TODO remover por posicao especifica
		if(posicao < getTamanho()) { //se a posicao for menor do que o tamanho da lista entra na proxima condicao
			if(posicao == 0) { //se posicao a ser removida for a primeira celula
				primeira = primeira.getProximo();//entao a primeira celula passa a ser a proxima celula
			}
			else {
				Celula elementoParaRemover = getCelula(posicao); //elemento a ser removido recebe a celula inteira
				Celula elementoAnteriorAoRemovido = getCelula(posicao - 1); //elemento anterior recebe a celula anterio aquela que será removida
				Celula elementoPosteriorAoRemovido = elementoParaRemover.getProximo(); //elemento que esta sendo apontado pelo o elemento que sera removido Guardando esse elemento na variavel para depois fazer a ligacao novamente
				elementoAnteriorAoRemovido.setProximo(elementoPosteriorAoRemovido); //Fazendo a ligacao pulando o elemento que foi removido criando um novo apontamento
			}
		}
		
	}
	
	
	private Celula getCelula(int posicao) {
		if(estaVazia()) {
			return null;
		}
		else {
			if(posicao > getTamanho() - 1) { //significa que este elemento não existe pois utrapassou as posicoes disponiveis
				return null;
			}
			else {
				Celula atual = primeira;
				for(int i = 0; i < posicao; i++) {
					atual = atual.getProximo();
				}
				return atual;
			}
		}
	}
	

	@Override
	public String getElemento(int posicao) {
		Celula celula = getCelula(posicao);
		if(celula != null) {
			return celula.getValor();
		}
		else {
			return null;
		}	
	}

	@Override
	public int getPosicao(String valor) {
		for(int i = 0; i < getTamanho(); i++) {
			if(getElemento(i).equals(valor)) {
				return i;
			}
		}
		return -1;
	}
	

	@Override
	public boolean estaVazia() { //retorna true se a primeira celula for igual a null
		return primeira == null; 
		}

	@Override
	public void limparLista() { 
		 primeira = null;
		
	}
	
//	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < getTamanho(); i++) {
			sb.append(getElemento(i));
			sb.append(" [");
			sb.append(i);
			sb.append("]   ");
		}
		return sb.toString();
	}
}
