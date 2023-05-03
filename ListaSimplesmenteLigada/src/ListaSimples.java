
public class ListaSimples implements Lista {
	
	private Celula primeira; //Primeira celula da lista 
	
	public Celula getInicio() { //retorna a primeira celula da lista 
		return primeira;
	}
	
	public Celula getUltimo() { 
		Celula atual = primeira; //recebe a primeira celula como valor 
		while(atual.getProximo() != null) { //percorre a lista procurando pela a celula que nao esta apontado para nenhuma outra 
			atual = atual.getProximo(); //atualiza o valor da atual com o valor da proxima celula 
		}
		return atual; //retorna a atual
	}

	@Override
	public int getTamanho() {
		if(isempty()) { //se a lista estiver vazia o programa retorna 0
			return 0;
		}
		else {
			Celula atual = primeira;  //uma variavel que recebe a primeira celula como valor 
			int i = 1; //se a lista nao for vazia ela tera pelo menos um elemeto 
			while(atual.getProximo() != null) { //enquanto o valor da proxima celula for diferente de null, o programa vai atualizar a varial atual com o valor da proxima celula
				atual = atual.getProximo(); 
				i++; //se a condicao acima for true entao o i vai ser incrementado com +1 e no final a funcao retorna i
			}
			return i;
		}
	}

	@Override
	public void getAdicionarElemento(String valor) {
		Celula celula = new Celula(); //cria uma nova celula
		celula.setValor(valor); //pala o valor de uma string para essa celula 
		if(isempty()) { 
			primeira = celula; //se a lista estiver vazia, a primiera celula recebe a celuala
		}
		else {
			getUltimo().setProximo(celula); //se nao a a celula apontada pela a ultima celual recebe esse valor
		}
	}

	@Override
	public void getAdicionarElementoPosicao(String valor, int posicao) { 
		if(posicao > getTamanho()) return; //verifica se a posicao e maior que a ultima da lista, em resumo serve para verificar se nao esta tentando acessar uma posicao que ja existe na lista, nao sendo possicel depois adicionar um elemento nessa posicao pois a mesma ja esta ocupada 
		Celula novaCelula = new Celula(); //cria uma nova celula 
		novaCelula.setValor(valor); //Adiciona um valor str nessa nova celula 
		if(posicao == 0) {
			novaCelula.setProximo(primeira); //novaCelula passa a apontar para a atual primeira celula da lista
			primeira = novaCelula; //a atual primeira da lista  celula recebe novaCelula como  nova primeira  da lista

		}
		else {
			Celula anterior = getCelula(posicao -1); //Guardando o valor da celula anterior 
			Celula proxima = anterior.getProximo(); //Guardando o valor da celula que vem depois a anterior 
			anterior.setProximo(novaCelula); //apontado a celula anterior para a nova celula
			novaCelula.setProximo(proxima); //a nova celula esta apontado para a antiga celula da que estava na posicao que a atual esta sendo adicionada
		}	
		
	}
	
	
	private Celula getCelula(int posicao) {
		if(isempty()) { //se a primeira for null nao faz nada 
			return null;
		}
		else { 
			if(posicao > getTamanho()-1) { //Precisa fazer isso pois se eu tentar acessar sem n-1 vai tentar acessar uma celula que nao existe 
				return null;
			}
			else {
				Celula atual = primeira; //atual recebe a primeira celula da lista 
				for(int i = 0; i < posicao; i++) {
					atual  = atual.getProximo(); //vai armazenar o valor da proxima celuala a cada iteracao
				}
				return atual;
			}
		}
	}

	@Override
	public void getRemoverElemento(String valor) {
		if(!isempty()) {  //o codigo so deve ser executado se a lista não estiver vazia 
			Celula elementoParaRemover  = null; //criar uma variavel para armazenar o valor que sera removido da lista
			for(int i = 0; i < getTamanho(); i++) { //o programa irá iterar sobre os elementos da lista para verificar se dentro de suas celulas tem o valor que ela esta buscando, lembrando que esse laço acaba quando o primeiro valor desejado for encontrado. Mesmo que haja outros valores iguais depois
				if(getElemento(i).equals(valor)) { //essa linha faz a verificacao onde se lê o seguinte: valor dentro da celula == o valor passado dentro da funcao ? 
					elementoParaRemover = getCelula(i); //se a condicao acima dor true, entao o programa armazena a celula inteira dentro da variavel elementoParaRemover
					break; //caso encontre o valor o laco já para, com isso o programa não precisa continuar iterando
				}
			}	
			
			if(elementoParaRemover == null) return; //verifica se o elementoParaRemover é null, ou seja vazia, ele será caso o laco acima nao for executado
			
			if(elementoParaRemover == primeira) { //verifica se o elemento que será removido é o primeiro da lista 
				primeira = primeira.getProximo(); //se for, o proximo elemento da atual primeira celula, passa a ser o novo primiero elemento da celula
				return;
			}
			
			Celula elementoAnterior = null; //criando uma variavel para receber o valor da celula anterior ao elemento que será removido
			
			for(int i = 0; i < getTamanho(); i++) { //percorre a lista procurando verificando se o proximo elemento da da celula atual dentro do laco e igual ao elemento anterior
				if(getCelula(i).getProximo() == elementoParaRemover) {
					elementoAnterior = getCelula(i); //se sim, esse valor sera armazenado dentro da variavel local elementoAnterior.
					break; //quando achar, o laco se encerra 
				}
			}
			elementoAnterior.setProximo(elementoParaRemover.getProximo()); //elemento anterior ao que será removido esta recebendo o proximo elemento do elemento que sera removido
		}
		
	}

	@Override
	public void getRemoverElementoPosicao(int posicao) {
		if(posicao < getTamanho()) { //verifica se a posicao existe dentro da lista
			if(posicao == 0) { //verifica se a celula que eu quero remover é a primeira celula
				primeira = primeira.getProximo(); //se for a nova primeira celula passa a ser o proximo elemento da atual primeira celula
			}
			else {
				Celula elementoParaRemover = getCelula(posicao); //guarda o valor da celula que sera removida
				Celula elementoAnteriorAoRemovido = getCelula(posicao -1);	//guarda o valor da celula anterior ao elemento a ser removido
				Celula elementoPosterior = elementoParaRemover.getProximo(); //guarda o valor da celula posterior ao elemento a ser removido
				elementoAnteriorAoRemovido.setProximo(elementoPosterior); //Faz com que o elemento anterior ao removido aponte para o posteior ao removido
			}
		}
	}

	@Override
	public String getElemento(int posicao) {
		//Retorna o elemeto dentro de uma celula de acordo com a sua posicao acessando um metodo privado da classe 
		Celula celula = getCelula(posicao); //variavel celula recebe acessa o metodo getCelula(n)        
		if(celula != null) {  //verifica se a celula nao esta vazia se sim retorna o valor que tem dentro dessa celula
			return celula.getValor();
		}
		else { //se a celula for == null, a funcao nao retorna nada 
			return null;
		}
	}

	@Override
	public int getPosicao(String valor) { 
		// TODO Retornar a posicao do elemento
		for(int i = 0; i < getTamanho(); i++) {//itera sobre a lista verificando em qual posicao ele vai encontrar o elemento desejado 
			if(getElemento(i).equals(valor)) { //quando encontrar vai retornar o i, que indica a posicao do elemento
				return i;
			}
		}
		return -1; //indica que o valor nao foi encontrado na lista
	}

	@Override
	public boolean isempty() {
		return primeira == null; //verifica se a lista esta vazia retornando true ou false 
	}

	@Override
	public void getLimparLista() {
		primeira = null;  //ao deixar o valor de primeira como null - a lista perde o apontamento para as demais 
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < getTamanho(); i++) {
			sb.append(getElemento(i));
			sb.append(" [");
			sb.append(i);
			sb.append("] ");
		}
		return sb.toString();
	}
}
