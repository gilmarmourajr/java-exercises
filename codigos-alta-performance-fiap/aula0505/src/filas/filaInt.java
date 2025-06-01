package filas;

public class filaInt {
    private class NO {
        int dado;
        NO prox;
    }

    private NO ini, fim;

    public void init() {
        ini = fim = null;
    }

    public boolean isEmpty() {
        return (ini == null && fim == null);
    }

    public void enqueue(int elem) {
        NO novo = new NO();
        novo.dado = elem;
        novo.prox = null;
        
        if(isEmpty()) {
            ini = novo;
        } else {
            fim.prox = novo;
        }

        fim = novo;
    }

    public String menor() {
        if (isEmpty()) {
            return "Fila vazia";
        }

        NO aux = ini;
        NO menor = ini;

        while(aux.prox != null) {
            if(aux.prox.dado < menor.dado) {
                menor = aux.prox;
            }
            aux = aux.prox;
        }

        return "O menor dado é " + menor.dado;
    }
}
