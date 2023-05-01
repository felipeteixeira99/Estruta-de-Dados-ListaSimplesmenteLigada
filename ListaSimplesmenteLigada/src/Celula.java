
public class Celula {
	private String valor; //armazena o valor dentro da celula 
	private Celula proximo; //faz o apontamento para a proxima celula da lista 
	
	public String getValor() { //Acessando o valor dentro da celula 
		return this.valor;
	}
	
	public void setValor(String valor) { //Modificando o valor dentro da celula 
		this.valor = valor;
	}
	
	public Celula getProximo() { //Acessa a proxima celula
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) { //Modifica o valor a ser armazenado na proxima Celula
		this.proximo = proximo;
	}
}

