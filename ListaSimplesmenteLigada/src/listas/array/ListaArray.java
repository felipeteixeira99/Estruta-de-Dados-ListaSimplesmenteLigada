package listas.array;

import listas.Lista;

public class ListaArray  implements Lista{

	String[] array = new String[3];
	int posicaoAtual = -1;
	
	@Override
	public int getTamanho() {
		return posicaoAtual + 1;
	}

	@Override
	public void getAdicionarElemento(String valor) {
		posicaoAtual++;
		if(posicaoAtual == array.length) { //se for menor pode gravar 
			dobrarArray();	
		}
		array[posicaoAtual] = valor;
	}
	
	private void dobrarArray() {
		String[] novoArray = new String[array.length * 2]; //dobro do tamanho 
		for(int i = 0; i < array.length; i++) { 
			novoArray[i] = array[i]; //percorre e salva os valores antigos dentro do novo array
		}
		array = novoArray;
	}

	@Override
	public void getAdicionarElementoPosicao(String valor, int posicao) {
		if(getTamanho() == array.length) {
			dobrarArray();
		}
	}

	@Override
	public void getRemoverElemento(String valor) {
		int posicao = getPosicao(valor);
		if(posicao > -1) {
			getRemoverElementoPosicao(posicao);
		}
	}

	@Override
	public void getRemoverElementoPosicao(int posicao) {
		if(posicao == posicaoAtual) {
			posicaoAtual--;
		}
		else {
			for(int i = posicao; i < posicaoAtual; i++) {
				array[i] = array[i+1];
			}

		}
		posicaoAtual--;
		
	}

	@Override
	public String getElemento(int posicao) {
		if(posicao < getTamanho()) {
			return array[posicao];
		}
		return null;
	}

	@Override
	public int getPosicao(String valor) {
		for(int i = 0; i < getTamanho(); i++) {
			if(array[i].equals(valor)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isempty() {
		return getTamanho() == 0;
	}

	@Override
	public void getLimparLista() {
		array = new String[3];
		posicaoAtual = -1;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new  StringBuilder();
		for(int i = 0; i < getTamanho(); i++) {
			sb.append("[");
			sb.append(getElemento(i));
			sb.append("] ");
		}
		return sb.toString();
	}
}
