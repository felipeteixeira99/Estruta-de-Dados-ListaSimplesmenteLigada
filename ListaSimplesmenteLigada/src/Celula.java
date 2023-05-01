
public class Celula {
	private String valor; //sera o valor armazenado dentro da celula da lista 
	private Celula proximo; //sera utilizado para apontar para a proxima celula da lista 
	
	public String getValor() {
		return this.valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public Celula getCelula() {
		return this.proximo;
	}
	
	public void setValor(Celula proximo) {
		this.proximo = proximo;
	}
}
