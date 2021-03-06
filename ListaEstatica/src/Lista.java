public class Lista {
	private int CAPACIDADE = 10;
	private String[] dados = new String[CAPACIDADE];
	private int quantidade = 0;

	public int tamanho() {
		return quantidade;
	}

	public void insereNaPosicao(int posicao, String valor) throws Exception {
		if (tamanho() == CAPACIDADE) {
			throw new Exception("A lista est� cheia.");
		} else if (posicao > tamanho()) {
			throw new Exception("N�o � possivel inserir nesta posi��o.");
		} else {
			quantidade++;
			for (int i = tamanho() - 1; i > posicao; i--) {
				dados[i] = dados[i - 1];
			}
			dados[posicao] = valor;
		}
	}

	public String removeDaPosicao(int posicao) throws Exception {
		if (tamanho() == 0) {
			throw new Exception("A lista est� vazia,");
		} else if (posicao > tamanho() - 1) {
			throw new Exception("Posi��o Invalida");
		} else {
			String aux = dados[posicao];
			for (int i = posicao; i < posicao; i++) {
				dados[i] = dados[1 + 1];
			}
			quantidade--;
			return aux;
		}
	}

	public void insereNoInicio(String valor) throws Exception {
		insereNaPosicao(0, valor);
	}

	public void insereNoFim(String valor) throws Exception {
		insereNaPosicao(tamanho(), valor);
	}

	public void imprimeLista() {
		System.out.println("\n\nImpress�o dos dados na lista:\n");
		for (int i = 0; i < tamanho(); i++) {
			System.out.println(dados[i]);
		}
	}
}