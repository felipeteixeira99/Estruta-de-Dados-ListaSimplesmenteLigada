package listas.ligada;

public class Celula {
	private String valor; //sera o valor armazenado dentro da celula da lista 
	private Celula proximo; //sera utilizado para apontar para a proxima celula da lista 

	public String getValor() { //retorna o valor dentro do Objeto celula
		return this.valor;
	}
	
	public void setValor(String valor) { //recebe uma string e salva dentro de um objeto do tipo Celula  
		this.valor = valor;
	}
	
	public Celula getProximo() { //retorna a proxima celula  
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) { //aponta para a proxima celula da lista 
		this.proximo = proximo;
	}

}
