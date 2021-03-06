public class Pilha {
	private int CAPACIDADE = 5; // Tamanho máximo da pilha
	private String dados[] = new String[CAPACIDADE];
	private int topo = -1;

	public int tamanho() {
		return topo + 1;
	}

	public boolean vazia() {
		return tamanho() == 0;
	}

	public void empilha(String p_valor) throws Exception {
		if (tamanho() != CAPACIDADE) {
			topo++;
			dados[topo] = p_valor;
		} else {
			throw new Exception("A pilha está cheia.");
		}
	}

	public String desempilha() throws Exception {
		if (vazia()) {
			throw new Exception("A pilha esta vazia.");

		} else {
			topo--;
			return dados[topo];
		}
	}

	public String retornaTopo() throws Exception {
		if (vazia()) {
			throw new Exception("A pilha esta vazia.");
		} else {
			return dados[topo];
		}
	}

}