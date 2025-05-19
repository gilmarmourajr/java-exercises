package listas;

public class ListaIntCrescente {

	private class NO {
		int dado;
		NO prox;
	}
	private NO lista = null;

	public void mostra() {
		System.out.println(" ********* Apresenta Lista *********");
		NO aux = lista;
		while (aux!=null) {
			System.out.print(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println("\n *********************************");
	}
	public void insere(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (lista == null) {
			novo.prox = null;
			lista = novo;
		} else if (novo.dado < lista.dado) {
			novo.prox = lista;
			lista = novo;
		} else {
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado < novo.dado)
					aux = aux.prox;
				else
					achou = true;
			}
			novo.prox = aux.prox;
			aux.prox = novo;
		}
	}

	public boolean remove(int valor) {
		boolean achou = false;
		if (lista != null) {
			// verificar se o primeiro valor é o procurado
			if (lista.dado == valor) {
				lista = lista.prox;
			} else {
				NO aux = lista;
				while (lista != null && !achou) {
					if (aux.prox.dado == valor) {
						achou = true;
					} else {
						aux = aux.prox;
					}
				}

				if (achou) {
					aux.prox = aux.prox.prox;
				} else {
					System.out.println("Valor nao encontrado");
				}
			}
		} else {
			System.out.println("Lista vazia");
		}

		return achou;
	}

}
