
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
			//TODO testar isso ao final do codigo 
			if(posicao > getTamanho() -1) { //Precisa fazer isso pois se eu tentar acessar sem n-1 vai tentar acessar uma celula que nao existe 
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
	public void getRemoverElemento() {
		// TODO remover um elemento da lista 
		
	}

	@Override
	public void getRemoverElementoPosicao(String valor, int posicao) {
		// TODO remover elemento em uma posicao especifica 
		
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
		
		return 0;
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
